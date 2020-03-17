package me.zyb.microservice.consumer.controller;

import me.zyb.microservice.consumer.service.remote.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyingbin
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private HelloService helloService;

	@RequestMapping(value = "/hi")
	public Object sayHi(String name) {
		return helloService.sayHi(name);
	}
}
