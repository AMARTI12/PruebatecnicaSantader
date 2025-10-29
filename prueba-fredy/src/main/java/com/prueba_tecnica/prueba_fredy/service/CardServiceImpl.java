package com.prueba_tecnica.prueba_fredy.service;

import com.prueba_tecnica.prueba_fredy.entity.Card;
import com.prueba_tecnica.prueba_fredy.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

@Service
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public Card save(Card card) {
        Card card1 = card;

        //Definimos un numero de producto estatico
        String productNumber = "223344";

        //Se crea un número Random para la tarjeta
        Random random = new Random();
        Integer targetNumberGenerated = random.nextInt(999999999);
        String targetNumber = productNumber + targetNumberGenerated.toString() + "1";
        //Se establece el numero Random
        card1.setCardNumber(Long.valueOf(targetNumber));

        //Definimos la fecha de vencimiento 3 años mas que el actual
        Integer ano = LocalDateTime.now().getYear() + 3;
        String FechaVencimiento = LocalDateTime.now().getMonth().getValue() + "/" + ano;
        card1.setCardExpireDate(FechaVencimiento);

        card1.setStatus("Inactive"); //Aca definimos el estado por defecto inactivo cuando se crea

        card1.setCash(Long.valueOf(0)); //definimos el valor del credito en 0

        return cardRepository.save(card1);
    }

    @Override
    public Card findById(Integer id) {
        return cardRepository.findById(id).get();
    }

    @Override
    public Card update(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public void delete(Integer id) {
        cardRepository.deleteById(id);
    }
}
