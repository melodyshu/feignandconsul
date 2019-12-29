package com.example.feigndemo;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "consul-provider",fallback = HiHystrix.class)
public interface ConsulClientFeign {
    @GetMapping("/hi")
    String sayHiFromConsulClient(@RequestParam(value = "name") String name);
}
