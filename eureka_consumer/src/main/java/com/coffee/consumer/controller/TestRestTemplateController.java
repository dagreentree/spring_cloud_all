package com.coffee.consumer.controller;

import com.coffee.entity.Person;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @Auther: coffe
 * @Date: 2021/1/23 21:57
 * @Description: com.coffee.consumer.controller
 * @version: 1.0
 */
@RestController
public class TestRestTemplateController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test1")
    public String test1(){
        String url ="http://eureka-provider/getHi";
        String respStr = restTemplate.getForObject(url, String.class);
        return respStr;
    }

    @GetMapping("/testMap")
    public Map<String,Object> testMap(){
        String url ="http://eureka-provider/getMap";
        ResponseEntity<Map> forEntity = restTemplate.getForEntity(url, Map.class);
        return forEntity.getBody();
    }

    @GetMapping("/testPerson")
    public Person testPerson(){
        String url ="http://eureka-provider/getPerson";
        ResponseEntity<Person> entity = restTemplate.getForEntity(url, Person.class);
        System.out.println("respStr: "  + ToStringBuilder.reflectionToString(entity.getBody() ));
        return entity.getBody();
    }
}
