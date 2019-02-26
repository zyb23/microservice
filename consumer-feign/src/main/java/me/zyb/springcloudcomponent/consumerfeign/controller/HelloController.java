package me.zyb.springcloudcomponent.consumerfeign.controller;

import me.zyb.springcloudcomponent.consumerfeign.service.remote.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyingbin
 */
@RestController
public class HelloController {
	@Autowired
	private HelloService helloService;

	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	public String sayHi(@RequestParam String name){
		return helloService.hi(name);
	}
}
