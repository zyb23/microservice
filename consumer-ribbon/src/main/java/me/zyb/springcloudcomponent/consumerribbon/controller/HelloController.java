package me.zyb.springcloudcomponent.consumerribbon.controller;

import me.zyb.springcloudcomponent.consumerribbon.service.remote.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyingbin
 */
@RestController
public class HelloController {
	@Autowired
	HelloService helloService;

	@RequestMapping(value = "/hi")
	public String hi(@RequestParam String name) {
		return helloService.hi(name);
	}
}
