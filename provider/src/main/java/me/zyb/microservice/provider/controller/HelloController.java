package me.zyb.microservice.provider.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyingbin
 */
@Slf4j
@RestController
@RequestMapping("/helloService")
public class HelloController {

	@Value("${server.port}")
	private Integer port;

	@RequestMapping("/hi")
	public JSONObject hi(@RequestParam String name) {
		JSONObject object = new JSONObject();
		object.put("xxx", "hi " + name + ", i am provider from port:" + port);
		return object;
	}
}
