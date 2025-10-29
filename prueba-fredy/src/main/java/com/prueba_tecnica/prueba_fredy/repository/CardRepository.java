package com.prueba_tecnica.prueba_fredy.repository;

import com.prueba_tecnica.prueba_fredy.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card,Integer> {
}
