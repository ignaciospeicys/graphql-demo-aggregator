package com.accenture.gqldemo.aggregator.service;

import com.accenture.gqldemo.aggregator.dto.SavingsAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SavingsAccountService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${host.savings-service}")
    String serviceUrl;

    public SavingsAccount findByClientId(Integer id) {
        String url = String.format(serviceUrl, id);
        return restTemplate.getForObject(url, SavingsAccount.class);
    }
}
