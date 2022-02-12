package com.techelevator.pokemon.dao;

import com.techelevator.pokemon.model.Pokemon;
import com.techelevator.pokemon.model.PokemonDetail;

public interface PokemonDao {

    PokemonDetail savePokemon(PokemonDetail detail);
}
