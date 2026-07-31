package com.vmsmma.platformapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class StatusController {

    @GetMapping("/status")
    public Map<String, Object> getStatus() {
        Map<String, Object> response = new LinkedHashMap<>();

        response.put("businessName", "VMS-MMA");
        response.put("technicalName", "vms-mma");
        response.put("serviceName", "vms-mma-platform-api");
        response.put("environment", "dev");
        response.put("region", "ap-south-1");
        response.put("customDomainEnabled", false);
        response.put("status", "UP");
        response.put("timestamp", Instant.now().toString());

        return response;
    }
}
