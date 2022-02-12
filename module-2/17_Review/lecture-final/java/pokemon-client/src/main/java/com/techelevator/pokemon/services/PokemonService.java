package com.techelevator.pokemon.services;

import com.techelevator.pokemon.model.Pokemon;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokemonService {

    RestTemplate restTemplate = new RestTemplate();
    private String url;

    public PokemonService(String url){  // WHY???  Because the AuthentcationService does it this way.
        this.url = url;
    }

    public List<Pokemon> getAllPokemon(String token){
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);
        HttpEntity<Void> entity = new HttpEntity<>(headers);
//        Pokemon[] pokemons = restTemplate.getForObject(url + "/pokemon", Pokemon[].class); Need token!
        ResponseEntity<Pokemon[]> response = restTemplate.exchange(url+ "/pokemon", HttpMethod.GET,
                entity, Pokemon[].class);
        Pokemon[] pokemons = response.getBody();
        return new ArrayList<>(Arrays.asList(pokemons));
    }


}
