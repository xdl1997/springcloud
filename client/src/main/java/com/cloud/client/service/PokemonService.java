package com.cloud.client.service;

import com.cloud.client.Repositories.PokeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PokemonService {
    @Autowired
    private PokeRepository pokerepository;
}
