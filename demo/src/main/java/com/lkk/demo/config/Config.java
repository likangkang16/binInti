package com.lkk.demo.config;

import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName Config
 * @Description //TODO
 * @Author lkk
 * Date 2023/03/22/20:00
 * @Version 1.0
 **/
@Configuration
public class Config {

    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }


    @Bean
    public OkHttpClient getOkClient(){
        return  new OkHttpClient();
    }
}
