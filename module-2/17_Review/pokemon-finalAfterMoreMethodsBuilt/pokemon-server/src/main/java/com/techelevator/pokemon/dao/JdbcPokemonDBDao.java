package com.techelevator.pokemon.dao;

import com.techelevator.pokemon.model.Pokemon;
import com.techelevator.pokemon.model.PokemonDetail;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcPokemonDBDao implements PokemonDBDao{

    private JdbcTemplate jdbcTemplate;
    public JdbcPokemonDBDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public PokemonDetail savePokemon(PokemonDetail detail) {
        String sql = "INSERT INTO pokemon (id, name, url, base_experience, height, is_default, weight)" +
                " VALUES(?, ?, ?, ?, ?, ?, ?) RETURNING pokemon_id";

        Pokemon[] pokemons = detail.getForms();
        String name = pokemons[0].getName();
        String url = pokemons[0].getUrl();
        int id = pokemons[0].getId();
        System.out.println(url);

        int dbId = jdbcTemplate.queryForObject(sql, Integer.class, id,
                name, url, detail.getBaseExperience(), detail.getHeight(), detail.isDefault(),
                detail.getWeight());

        detail.setId(dbId);
        detail.setForms(pokemons);
        return detail;
    }
}
