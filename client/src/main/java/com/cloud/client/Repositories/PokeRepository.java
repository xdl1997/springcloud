package com.cloud.client.Repositories;

import com.cloud.client.domain.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


public interface PokeRepository extends JpaRepository<Pokemon, Integer> {
    public List<Pokemon> findByLevel(Integer level);
}
