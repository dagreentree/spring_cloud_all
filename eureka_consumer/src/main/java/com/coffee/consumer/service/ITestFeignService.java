package com.coffee.consumer.service;

import com.coffee.consumer.service.impl.TestFeignFallBackService;
import com.coffee.entity.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @Auther: coffe
 * @Date: 2021/1/24 17:11
 * @Description: com.coffee.consumer.service
 * @version: 1.0
 */
@FeignClient(name = "eureka-provider",fallback = TestFeignFallBackService.class)
public interface ITestFeignService {
    @GetMapping("/getHi")
    public String testString();

    /**
     * 返回Map
     * @return
     */
    @GetMapping("/getMap")
    public Map<String,Object> getMap();

    /**
     * 返回实体类
     * @return
     */
    @GetMapping("/getPerson")
    public Person getPerson();
}
