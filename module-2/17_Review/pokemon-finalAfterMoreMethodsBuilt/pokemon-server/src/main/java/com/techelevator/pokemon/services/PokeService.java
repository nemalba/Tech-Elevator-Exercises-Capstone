package com.techelevator.pokemon.services;

import com.techelevator.pokemon.model.Pokemon;
import com.techelevator.pokemon.model.PokemonDetail;

import java.util.List;

public interface PokeService {

    List<Pokemon> getPokemon();
    PokemonDetail getPokemonDetailByName(String name);

    PokemonDetail getPokemonDetailById(int id);


}
