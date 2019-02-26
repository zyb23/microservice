package me.zyb.springcloudcomponent.providerdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyingbin
 */
@RestController
public class TestController {
	@Value("${remark.env}")
	String env;

	@RequestMapping(value = "/hi")
	public String hi(String name){
		return "Hi " + name + ", you are enter into " + env;
	}
}
