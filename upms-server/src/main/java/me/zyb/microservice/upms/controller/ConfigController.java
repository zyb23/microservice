package me.zyb.microservice.upms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyingbin
 */
@Slf4j
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {
	@Value("${remark.env}")
	private String env;
	@Value("${druid}")
	private String druid;
	@Value("${log}")
	private String log2;

	@RequestMapping("/test")
	public String test(){
		return env + druid + log2;
	}
}
