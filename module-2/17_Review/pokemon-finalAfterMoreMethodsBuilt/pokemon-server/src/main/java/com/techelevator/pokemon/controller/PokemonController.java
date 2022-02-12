package com.techelevator.pokemon.controller;

import com.techelevator.pokemon.model.Pokemon;
import com.techelevator.pokemon.model.PokemonDetail;
import com.techelevator.pokemon.services.PokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@PreAuthorize("isAuthenticated()")
public class PokemonController {
    @Autowired
    PokeService service;

    @RequestMapping(path="/pokemon", method = RequestMethod.GET)
    public List<Pokemon> getAllPokemon(){
        return service.getPokemon();
    }


    @GetMapping("/pokemonDetail/{id}")
    public PokemonDetail getPokemonDetailById(@PathVariable int id){
        return service.getPokemonDetailById(id);
    }

    @GetMapping("/pokemonDetail")
    public PokemonDetail getPokemonDetailByName(@RequestParam String name){
        return service.getPokemonDetailByName(name);
    }


}
