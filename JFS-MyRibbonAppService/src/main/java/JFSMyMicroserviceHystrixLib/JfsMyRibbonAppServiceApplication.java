package JFSMyMicroserviceHystrixLib;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JfsMyRibbonAppServiceApplication {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/app")
	private String getPortNumber()
	{
		return port;
	}

	public static void main(String[] args) {
		SpringApplication.run(JfsMyRibbonAppServiceApplication.class, args);
	}

}
