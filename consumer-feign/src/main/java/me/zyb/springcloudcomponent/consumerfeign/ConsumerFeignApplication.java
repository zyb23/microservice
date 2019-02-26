package me.zyb.springcloudcomponent.consumerfeign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhangyingbin
 */
@Slf4j
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerFeignApplication.class, args);
		String fozu = "\n"
				+ "                       _ooOoo_                      " + "\n"
				+ "                      o8888888o                     " + "\n"
				+ "                      88\" . \"88                   " + "\n"
				+ "                      (| -_- |)                     " + "\n"
				+ "                      O\\  =  /O                    " + "\n"
				+ "                   ____/`---'\\____                 " + "\n"
				+ "                 .'  \\\\|     |//  `.              " + "\n"
				+ "                /  \\\\|||  :  |||//  \\            " + "\n"
				+ "               /  _||||| -:- |||||-  \\             " + "\n"
				+ "               |   | \\\\\\  -  /// |   |           " + "\n"
				+ "               | \\_|  ''\\---/''  |   |            " + "\n"
				+ "               \\  .-\\__  `-`  ___/-. /            " + "\n"
				+ "         ___    `. .'  /--.--\\  `. . __            " + "\n"
				+ "          .\"\" '<  `.___\\_<|>_/___.'  >'\"\".     " + "\n"
				+ "         | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |      " + "\n"
				+ "         \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /    " + "\n"
				+ "    ======`-.____`-.___\\_____/___.-`____.-'======  " + "\n"
				+ "                   `=---='                          " + "\n"
				+ "    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^  " + "\n"
				+ "             佛祖保佑             永无BUG            " + "\n"
				+ "    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^  " + "\n";
		log.info(fozu);
	}

}
