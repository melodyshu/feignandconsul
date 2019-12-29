package com.example.feigndemo;

import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements ConsulClientFeign {
    @Override
    public String sayHiFromConsulClient(String name) {
        return "hi,"+name+",发生了熔断...";
    }
}
