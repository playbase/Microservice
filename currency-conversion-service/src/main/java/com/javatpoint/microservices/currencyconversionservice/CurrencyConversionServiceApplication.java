package com.javatpoint.microservices.currencyconversionservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableFeignClients("com.javatpoint.microservices.currencyconversionservice")
@EnableDiscoveryClient
public class CurrencyConversionServiceApplication 
{
public static void main(String[] args) 
{
SpringApplication.run(CurrencyConversionServiceApplication.class, args);
}
}
