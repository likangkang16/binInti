package com.lkk.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.net.URL;

/**
 * @ClassName TestController
 * @Description //TODO
 * @Author lkk
 * Date 2023/03/22/19:38
 * @Version 1.0
 **/
@Controller
@RequestMapping("test")
public class TestController {

    private String urlJson = "http://127.0.0.1:8081/test/json";

    @Autowired
    private RestTemplate restTemplate;


    private HttpEntity objectHttpEntity = new HttpEntity();

    @RequestMapping(value = "/json", method = RequestMethod.POST)
    public void postJson() {
        try {

            ResponseEntity<Object> exchange = restTemplate.exchange(urlJson, HttpMethod.POST, objectHttpEntity,
                    Object.class);
        } catch (Exception r) {
            r.printStackTrace();
        }

    }
}
