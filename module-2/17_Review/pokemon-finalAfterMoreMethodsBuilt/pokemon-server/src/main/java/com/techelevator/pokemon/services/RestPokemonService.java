package com.techelevator.pokemon.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techelevator.pokemon.model.Pokemon;
import com.techelevator.pokemon.model.PokemonDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RestPokemonService implements PokeService{

    RestTemplate rt = new RestTemplate();
    private final String API_URL = "https://pokeapi.co/api/v2/pokemon/";


    @Override
    public List<Pokemon> getPokemon()  {
        String response = rt.getForObject(API_URL, String.class);
        ObjectMapper mapper = new ObjectMapper();
        List<Pokemon> pokeList = new ArrayList<>();
        try {
            JsonNode jsonNode = mapper.readTree(response);
            JsonNode root = jsonNode.path("results");
            for (int i = 0; i < root.size(); i++){
                int id = i + 1;
                String name = root.path(i).path("name").asText();
                String url = root.path(i).path("url").asText();
                Pokemon temp = new Pokemon();
                temp.setId(id);
                temp.setName(name);
                temp.setUrl(url);
                pokeList.add(temp);
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return pokeList;
    }

    @Override
    public PokemonDetail getPokemonDetailByName(String name) {
        PokemonDetail pokemonDetail = rt.getForObject(API_URL + name, PokemonDetail.class);
        return pokemonDetail;
    }


    @Override
    public PokemonDetail getPokemonDetailById(int id) {
        PokemonDetail pokemonDetail = rt.getForObject(API_URL + id, PokemonDetail.class);
        Pokemon[] pokemons = pokemonDetail.getForms();
        pokemons[0].setId(id);
        pokemonDetail.setForms(pokemons);
        return pokemonDetail;
    }
}
