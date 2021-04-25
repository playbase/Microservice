package com.javatpoint.microservices.limitsservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope ;
import com.javatpoint.microservices.limitsservice.bean.LimitConfiguration;

@RestController
@RefreshScope
public class LimitsConfigurationController 
{
@Autowired	
private Configuration configuration;

@Autowired
private LimitConfiguration limitConfiguration;

@GetMapping("/limits")
public LimitConfiguration retriveLimitsFromConfig()
    {
        limitConfiguration.setMaximum(configuration.getMaximum());
        limitConfiguration.setMinimum(configuration.getMinimum());
        return limitConfiguration;
    }
}