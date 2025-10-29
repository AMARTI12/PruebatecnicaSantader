package com.prueba_tecnica.prueba_fredy.entity;

import jakarta.persistence.*;

@Entity
@Table(name="cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique=true, length=16, nullable=false)
    private Long cardNumber;

    @Column(length=200, nullable=false)
    private String cardName;

    @Column(length=7, nullable=false)
    private String cardExpireDate;

    @Column(length=10, nullable=false)
    private String status;

    @Column(length=10, nullable=false)
    private Long cash;

    public Card() {
    }

    public Card(Integer id, Long cardNumber, String cardName, String cardExpireDate, String status, Long cash) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.cardExpireDate = cardExpireDate;
        this.status = status;
        this.cash = cash;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardExpireDate() {
        return cardExpireDate;
    }

    public void setCardExpireDate(String cardExpireDate) {
        this.cardExpireDate = cardExpireDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCash() {
        return cash;
    }

    public void setCash(Long cash) {
        this.cash = cash;
    }
}
