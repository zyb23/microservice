package me.zyb.springcloudcomponent.consumerfeign.service.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhangyingbin
 */
@FeignClient(value = "provider-demo")
public interface HelloService {

	/**
	 * Say hello
	 * @param name  名字
	 * @return  String
	 */
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	public String hi(@RequestParam(value = "name") String name);
}
