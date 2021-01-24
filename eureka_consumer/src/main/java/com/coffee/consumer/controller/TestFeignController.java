package com.coffee.consumer.controller;

import com.coffee.consumer.service.ITestFeignService;
import com.coffee.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Auther: coffe
 * @Date: 2021/1/24 17:21
 * @Description: com.coffee.consumer.controller
 * @version: 1.0
 */
@RestController
public class TestFeignController {
    @Autowired
    private ITestFeignService ITestFeignService;

    @GetMapping("/getHiFeign")
    public String testString(){
        return ITestFeignService.testString();
    }

    /**
     * 返回Map
     * @return
     */
    @GetMapping("/getMapFeign")
    public Map<String,Object> getMap(){
        return ITestFeignService.getMap();
    }

    /**
     * 返回实体类
     * @return
     */
    @GetMapping("/getPersonFeign")
    public Person getPerson(){
        return ITestFeignService.getPerson();
    }
}
