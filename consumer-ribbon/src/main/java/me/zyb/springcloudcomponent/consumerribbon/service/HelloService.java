package me.zyb.springcloudcomponent.consumerribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangyingbin
 */
@Service
public class HelloService {

	@Autowired
	private RestTemplate restTemplate;

	public String hi(String name) {
		return restTemplate.getForObject("http://provider-demo/hi?name=" + name, String.class);
	}
}
