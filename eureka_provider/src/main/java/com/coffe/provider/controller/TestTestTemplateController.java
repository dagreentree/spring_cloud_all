package com.coffe.provider.controller;

import com.coffee.entity.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: coffe
 * @Date: 2021/1/23 23:04
 * @Description: com.coffe.provider.controller
 * @version: 1.0
 */
@RestController
public class TestTestTemplateController {

    @Value("${server.port}")
    private String port;

    /**
     * 返回字符串
     * @return
     */
    @GetMapping("/getHi")
    public String testString() {
        int i = 1/0;
        return "port is " + port;
    }

    /**
     * 返回Map
     * @return
     */
    @GetMapping("/getMap")
    public Map<String,Object> getMap() {
        Map<String,Object> map = new HashMap<>();
        map.put("port",port);
        return map;
    }

    /**
     * 返回实体类
     * @return
     */
    @GetMapping("/getPerson")
    public Person getPerson() {
        Person person = new Person();
        person.setName("xiaoming");
        person.setAge(20);
        return person;
    }
}
