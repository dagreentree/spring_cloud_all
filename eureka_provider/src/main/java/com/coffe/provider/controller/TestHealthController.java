package com.coffe.provider.controller;

import com.coffe.provider.service.HealthStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: coffe
 * @Date: 2021/1/23 21:02
 * @Description: com.coffe.client
 * @version: 1.0
 */
@RestController
public class TestHealthController {

    @Autowired
    private HealthStatusService healthStatusSrv;

    @GetMapping("/health")
    public String health(@RequestParam("status") Boolean status) {
        healthStatusSrv.setStatus(status);
        return healthStatusSrv.getStatus();
    }
}
