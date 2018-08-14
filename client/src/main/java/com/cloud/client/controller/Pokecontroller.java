package com.cloud.client.controller;


import com.cloud.client.Repositories.PokeRepository;
import com.cloud.client.domain.Pokemon;
import com.cloud.client.domain.Result;
import com.cloud.client.utils.ResultUtils;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class Pokecontroller {
    private final Logger logger = LoggerFactory.getLogger(Pokecontroller.class);
    @Autowired
    private PokeRepository pokerepository;

    @GetMapping(value = "/pokemon")
    public List<Pokemon> PokemonList() {
        logger.info("3333333333");
        return pokerepository.findAll();
    }

    @PostMapping(value = "/pokemon")
    public Result<Pokemon> PokemonAdd(@Valid Pokemon pokemon, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtils.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultUtils.success(pokerepository.save(pokemon));
    }

    @GetMapping(value = "/pokemon/{id}")
    public Optional<Pokemon> PokemonFind(@PathVariable("id") Integer id) {
        return pokerepository.findById(id);
    }

    @PutMapping(value = "/pokemon/{id}")
    public Pokemon PokemonUpdate(@PathVariable("id") Integer id, @RequestParam("level") Integer level, @RequestParam("type") String type) {
        Pokemon pokemon = new Pokemon();
        pokemon.setId(id);
        pokemon.setType(type);
        pokemon.setLevel(level);

        return pokerepository.save(pokemon);
    }

    @DeleteMapping(value = "/pokemon/{id}")
    public void PokemonDelete(@PathVariable("id") Integer id) {
        pokerepository.deleteById(id);
    }

    @GetMapping(value = "/pokemon/level/{level}")
    public List<Pokemon> PokemonFindLevel(@PathVariable("level") Integer level) {
        return pokerepository.findByLevel(level);
    }

    @PostMapping(value = "/pokemon/2")
    public void PokeInsert2() {
        Pokemon poke1 = new Pokemon();
        poke1.setType("v");
        poke1.setLevel(15);
        pokerepository.save(poke1);

        Pokemon poke2 = new Pokemon();
        poke2.setType("nnn");
        poke2.setLevel(40);
        pokerepository.save(poke2);
    }
    @GetMapping(value="/add")
    public String Add()
    {
        return "20";
    }
}