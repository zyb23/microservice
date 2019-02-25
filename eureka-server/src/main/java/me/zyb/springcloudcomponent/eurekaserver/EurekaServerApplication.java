package me.zyb.springcloudcomponent.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhangyingbin
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
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
        System.out.println(fozu);
    }
}
