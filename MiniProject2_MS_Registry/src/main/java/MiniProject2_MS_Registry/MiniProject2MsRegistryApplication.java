package MiniProject2_MS_Registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MiniProject2MsRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniProject2MsRegistryApplication.class, args);
	}

}
