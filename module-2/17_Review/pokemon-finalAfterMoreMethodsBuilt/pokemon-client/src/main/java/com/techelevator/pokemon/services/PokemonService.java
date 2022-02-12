package com.techelevator.pokemon.services;

import com.techelevator.pokemon.model.Pokemon;
import com.techelevator.pokemon.model.PokemonDetail;
import org.springframework.http.*;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PokemonService {

    private String baseUrl;
    private RestTemplate restTemplate = new RestTemplate();
    private String authToken;

    public PokemonService(String url){
        baseUrl = url;
    }

    public void setAuthToken(String authToken){
         this.authToken = authToken;
    }

    public List<Pokemon> getAllPokemons(){
        List<Pokemon> pokemons = null;
        HttpEntity<Void> entity = makeAuthEntity();
        ResponseEntity<Pokemon[]> response = restTemplate.exchange(baseUrl + "pokemon",
                HttpMethod.GET, entity, Pokemon[].class);
        pokemons = new ArrayList<>(Arrays.asList(response.getBody()));
        return pokemons;
    }

    public PokemonDetail getPokemonDetailById(int id){
        PokemonDetail pDetail = null;
        ResponseEntity<PokemonDetail> response = restTemplate.exchange(baseUrl + "pokemonDetail/" + id ,
                HttpMethod.GET, makeAuthEntity(), PokemonDetail.class);
        pDetail = response.getBody();
        return pDetail;
    }

    public PokemonDetail savePokemonToDB(PokemonDetail detail){
        PokemonDetail returnDetail = null;
        System.out.println(detail.getId());
        try {
            returnDetail = restTemplate.postForObject(baseUrl + "pokemon", makePokeDetailEntity(detail),
                    PokemonDetail.class);
            System.out.println("Saved!");
        } catch (RestClientResponseException | ResourceAccessException e) {
            System.out.println(e.getMessage());
        }

            return returnDetail;
    }

    private HttpEntity<PokemonDetail> makePokeDetailEntity(PokemonDetail detail) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(authToken);
        return new HttpEntity<>(detail, headers);
    }


    public HttpEntity<Void> makeAuthEntity(){
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(authToken);
        return new HttpEntity<>(headers);
    }
}
