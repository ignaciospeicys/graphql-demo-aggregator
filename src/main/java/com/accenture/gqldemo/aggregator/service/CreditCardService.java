package com.accenture.gqldemo.aggregator.service;

import com.accenture.gqldemo.aggregator.dto.CreditCard;
import com.accenture.gqldemo.aggregator.dto.response.CreditCardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CreditCardService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${host.credit-cards}")
    String serviceUrl;

    public List<CreditCard> findAllByClientId(Integer id) {
        String url = String.format(serviceUrl, id);
        CreditCardResponse response = restTemplate.getForObject(url, CreditCardResponse.class);
        return response.getCreditCards();
    }
}
