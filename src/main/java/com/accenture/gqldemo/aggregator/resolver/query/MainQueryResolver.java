package com.accenture.gqldemo.aggregator.resolver.query;

import com.accenture.gqldemo.aggregator.dto.Client;
import com.accenture.gqldemo.aggregator.service.ClientInformationService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private ClientInformationService clientInformationService;

    public Client clientById(Integer id) {
        return clientInformationService.getClientInfoById(id);
    }

}
