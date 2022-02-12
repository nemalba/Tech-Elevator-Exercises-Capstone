package com.techelevator.pokemon.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PokemonDetail {
    private int id;
    @JsonProperty("base_experience")
    private int baseExperience;
    private int height;
    @JsonProperty("is_default")
    private boolean isDefault;
    private int weight;
    private Pokemon[] forms;
    private String sprites;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pokemon[] getForms() {
        return forms;
    }

    public void setForms(Pokemon[] forms) {
        this.forms = forms;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }
}
