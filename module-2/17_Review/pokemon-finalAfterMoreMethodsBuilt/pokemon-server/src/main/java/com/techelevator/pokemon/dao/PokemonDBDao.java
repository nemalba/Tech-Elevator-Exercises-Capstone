package com.techelevator.pokemon.dao;

import com.techelevator.pokemon.model.PokemonDetail;

public interface PokemonDBDao {

    //create new Pokemon in Db
    PokemonDetail savePokemon(PokemonDetail detail);


}
