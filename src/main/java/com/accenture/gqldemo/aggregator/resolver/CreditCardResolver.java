package com.accenture.gqldemo.aggregator.resolver;

import com.accenture.gqldemo.aggregator.dto.Client;
import com.accenture.gqldemo.aggregator.dto.CreditCard;
import com.accenture.gqldemo.aggregator.service.CreditCardService;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CreditCardResolver implements GraphQLResolver<Client> {

    @Autowired
    private CreditCardService creditCardService;

    List<CreditCard> creditCards(Client client) {
        Integer clientId = client.getId();
        List<CreditCard> creditCards = creditCardService.findAllByClientId(clientId);
        return creditCards;
    }
}
