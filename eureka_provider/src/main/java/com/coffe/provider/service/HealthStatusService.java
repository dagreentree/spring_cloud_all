package com.coffe.provider.service;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Service;

/**
 * @Auther: coffe
 * @Date: 2021/1/23 20:57
 * @Description: com.coffe.client.service
 * @version: 1.0
 */
@Service
public class HealthStatusService implements HealthIndicator {
    private Boolean status = true;

    @Override
    public Health health() {
        if(status)
            return new Health.Builder().up().build();
        return new Health.Builder().down().build();
    }

    public String getStatus() {
        return status.toString();
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
