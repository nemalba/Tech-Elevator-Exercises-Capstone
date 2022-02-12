package com.techelevator.pokemon.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techelevator.pokemon.model.Pokemon;
import com.techelevator.pokemon.model.PokemonDetail;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RestPokemonService implements PokemonService{

    private RestTemplate restTemplate = new RestTemplate();
    private final String API_URL = "https://pokeapi.co/api/v2/pokemon";

    @Override
    public List<Pokemon> getAllPokemon() {

//        Pokemon[] pokemons = restTemplate.getForObject(API_URL, Pokemon[].class);
        // because pokeapi needs us to access the results node, we are going to use ObjectMapper
        String result = restTemplate.getForObject(API_URL, String.class);  // get results as a String
        ObjectMapper mapper = new ObjectMapper(); // this gives the ability to walk through nodes in JSON

        List<Pokemon> pokemons = new ArrayList<>();
        try {
            JsonNode jsonNode = mapper.readTree(result);
            JsonNode root = jsonNode.path("results");  // giving me access to the node called results

            for (int i = 0; i < root.size(); i++){ // loop through the array called results in the json
                Pokemon temp = new Pokemon();
                String url = root.path(i).path("url").asText();
                temp.setUrl(url);
                temp.setName(root.path(i).path("name").asText());
                temp.setId(i + 1);
                pokemons.add(temp);
            }

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return pokemons;
    }

    @Override
    public PokemonDetail getDetailById(int id){
        PokemonDetail pokemonDetail = restTemplate.getForObject(API_URL + "/"  + id, PokemonDetail.class);
        return pokemonDetail;
    }
}
