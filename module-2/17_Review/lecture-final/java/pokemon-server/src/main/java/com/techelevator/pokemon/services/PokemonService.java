package com.techelevator.pokemon.services;

import com.techelevator.pokemon.model.Pokemon;
import com.techelevator.pokemon.model.PokemonDetail;

import java.util.List;

public interface PokemonService {

    // abstract method declarations go here
    List<Pokemon> getAllPokemon();  // returns all pokemon from the api

    PokemonDetail getDetailById(int id);
}
