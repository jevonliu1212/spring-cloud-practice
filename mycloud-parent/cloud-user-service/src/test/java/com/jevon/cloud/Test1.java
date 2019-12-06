//package com.jevon.cloud;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class Test1 {
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Test
//    public void token_password() {
//        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
//        params.add("grant_type", "password");
//        params.add("username", "jevon");
//        params.add("password", "111111");
//        params.add("scope", "scope1 scope2");
//        String response = restTemplate.withBasicAuth("clientId", "clientSecret").
//                postForObject("/oauth/token", params, String.class);
//        System.out.println("response====="+response);
//    }
//}
