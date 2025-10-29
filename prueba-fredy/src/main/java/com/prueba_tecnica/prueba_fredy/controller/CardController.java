package com.prueba_tecnica.prueba_fredy.controller;

import com.prueba_tecnica.prueba_fredy.entity.Card;
import com.prueba_tecnica.prueba_fredy.repository.CardRepository;
import com.prueba_tecnica.prueba_fredy.service.CardService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/card")
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping("/number")
    public Card save(@RequestBody Card card) {
        return cardService.save(card);
    }

    @PostMapping("/enroll")
    public Card active(@RequestBody Card card) {
        Card card1 = cardService.findById(card.getId());
        card1.setStatus("Active"); //Definimos el estado de la tarjeta a activo
        return cardService.update(card1);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        cardService.delete(id);
    }
}
