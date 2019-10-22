package me.zyb.springcloudcomponent.oauthserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author zhangyingbin
 */
@Slf4j
@EnableAuthorizationServer
@SpringBootApplication
public class OauthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthServerApplication.class, args);
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
