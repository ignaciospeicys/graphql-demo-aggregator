package com.accenture.gqldemo.aggregator.dto.response;

import com.accenture.gqldemo.aggregator.dto.CreditCard;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CreditCardResponse {

    @JsonProperty("credit_cards")
    List<CreditCard> creditCards;

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }
}
