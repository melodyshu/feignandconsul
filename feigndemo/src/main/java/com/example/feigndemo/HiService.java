package com.example.feigndemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HiService {
    @Resource
    private ConsulClientFeign consulClientFeign;

    public String sayHi(String name){
        return consulClientFeign.sayHiFromConsulClient(name);
    }
}
