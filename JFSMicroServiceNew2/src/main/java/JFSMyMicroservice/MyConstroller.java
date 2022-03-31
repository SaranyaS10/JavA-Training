package JFSMyMicroservice;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class MyConstroller {
	@GetMapping("/product")
	public String product() {
		return "Welcome to Product Homepage";
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate createRestTemplate() {
		RestTemplate restTemplate=new RestTemplate();
		return restTemplate;
	}

}
