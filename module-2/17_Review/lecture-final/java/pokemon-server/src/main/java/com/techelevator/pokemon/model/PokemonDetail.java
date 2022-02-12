package com.techelevator.pokemon.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PokemonDetail {

    private int id;
    @JsonProperty("base_experience")  // allows us to map the field base_experience from JSON to this property
    private int baseExperience;
    private int height;
    private int weight;
    @JsonProperty("is_default")
    private boolean isDefault;
    // name is in database but not part of the JSON

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }
}
