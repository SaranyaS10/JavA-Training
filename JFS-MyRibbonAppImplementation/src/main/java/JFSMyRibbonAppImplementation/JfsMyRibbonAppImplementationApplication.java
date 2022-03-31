package JFSMyRibbonAppImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = {"com.netflix.client.config.IClientConfig"})
@RestController
@RibbonClient(name="JFS-MyRibbonAppService",configuration=RibbonConfiguration.class)
public class JfsMyRibbonAppImplementationApplication {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/usingLoad-Balancing")
	public String callService() {
		return restTemplate.getForObject("http://JFS-MyRibbonAppService/app", String.class);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate createRestTemplate() {
		RestTemplate restTemplate=new RestTemplate();
		return restTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(JfsMyRibbonAppImplementationApplication.class, args);
	}

}
