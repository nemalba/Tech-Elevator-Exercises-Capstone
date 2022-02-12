package com.techelevator.pokemon.controller;

import com.techelevator.pokemon.dao.PokemonDBDao;
import com.techelevator.pokemon.model.PokemonDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("isAuthenticated()")
public class PokemonDBController {

    @Autowired
    PokemonDBDao dao;

    @PostMapping("/pokemon")
    public PokemonDetail savePokemonDetailToDB(@RequestBody PokemonDetail detail){
        System.out.println("here we are!");
        return dao.savePokemon(detail);
    }

}
