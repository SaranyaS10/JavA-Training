package JFSFeignServiceImpl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(value="feigndemo",url="http://localhost:8080/user")
public interface FeignInterface {
	
	@GetMapping("/name")
	String getName();
	
	@GetMapping("/location")
	String getLocation();

}
