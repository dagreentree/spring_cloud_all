package com.coffee.consumer.service.impl;

import com.coffee.consumer.service.ITestFeignService;
import com.coffee.entity.Person;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Map;

/**
 * @Auther: coffe
 * @Date: 2021/1/24 17:33
 * @Description: com.coffee.consumer.service.impl
 * @version: 1.0
 */
@Service
public class TestFeignFallBackService implements ITestFeignService {
    @Override
    public String testString() {
        return "testString熔断了";
    }

    @Override
    public Map<String, Object> getMap() {
        return Collections.singletonMap("getMap","熔断了");
    }

    @Override
    public Person getPerson() {
        return new Person("熔断了");
    }
}
