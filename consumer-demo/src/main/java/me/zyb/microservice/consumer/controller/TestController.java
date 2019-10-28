package me.zyb.microservice.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangyingbin
 */
@Slf4j
@RestController
public class TestController {
	@Autowired
	LoadBalancerClient loadBalancerClient;

	@GetMapping("/test")
	public String test(){
		ServiceInstance serviceInstance = loadBalancerClient.choose("upms-server");
		String url = serviceInstance.getUri() + "/hello?name=zhangsan";
		RestTemplate  restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(url, String.class);
		return "{\"invoke\":\"" + url + "\",\"return\":\"" + result + "\"}";
	}
}
