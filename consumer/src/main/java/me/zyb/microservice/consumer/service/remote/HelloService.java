package me.zyb.microservice.consumer.service.remote;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhangyingbin
 */
@FeignClient(value = "provider")
public interface HelloService {

	@RequestMapping(value = "/helloService/hi")
	public JSONObject sayHi(@RequestParam String name);
}
