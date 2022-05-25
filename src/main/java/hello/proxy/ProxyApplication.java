package hello.proxy;

import hello.proxy.config.AppV1Config;
import hello.proxy.config.AppV2Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * base component scan package == app
 * app config는 따로 import로 지정해줌
 */
@Import({AppV2Config.class, AppV1Config.class})
@SpringBootApplication(scanBasePackages = "hello.proxy.app") //주의

public class ProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyApplication.class, args);
	}

}
