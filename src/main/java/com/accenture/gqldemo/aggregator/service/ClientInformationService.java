package com.accenture.gqldemo.aggregator.service;

import com.accenture.gqldemo.aggregator.dto.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientInformationService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${host.client-information}")
    String serviceUrl;

    public Client getClientInfoById(Integer id) {
        String url = String.format(serviceUrl, id);
        return restTemplate.getForObject(url, Client.class);
    }
}
