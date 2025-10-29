package com.prueba_tecnica.prueba_fredy.service;

import com.prueba_tecnica.prueba_fredy.entity.Card;

public interface CardService {
    Card findById(Integer id);
    Card save(Card card);
    Card update(Card card);
    void delete(Integer id);
}
