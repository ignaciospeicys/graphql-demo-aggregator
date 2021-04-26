package com.accenture.gqldemo.aggregator.resolver;

import com.accenture.gqldemo.aggregator.dto.Client;
import com.accenture.gqldemo.aggregator.dto.SavingsAccount;
import com.accenture.gqldemo.aggregator.service.SavingsAccountService;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SavingsAccountResolver implements GraphQLResolver<Client> {

    @Autowired
    private SavingsAccountService savingsAccountService;

    public SavingsAccount savingsAccount(Client client) {
        Integer clientId = client.getId();
        return savingsAccountService.findByClientId(clientId);
    }
}
