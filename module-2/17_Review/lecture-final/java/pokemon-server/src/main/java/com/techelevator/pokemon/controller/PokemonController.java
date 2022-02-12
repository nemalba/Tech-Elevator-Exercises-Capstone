package com.techelevator.pokemon.controller;

import com.techelevator.pokemon.model.Pokemon;
import com.techelevator.pokemon.model.PokemonDetail;
import com.techelevator.pokemon.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@PreAuthorize("isAuthenticated()")
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping("/pokemon")
    public List<Pokemon> getAllPokemon(){
        return pokemonService.getAllPokemon();
    }

    @GetMapping("/pokemonDetail/{id}")
    public PokemonDetail getPokemonDetailById(@PathVariable int id, Principal principal){
        System.out.println("User logged in: " +principal.getName());
        return pokemonService.getDetailById(id);
    }
}
