package JFSFeignService1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ServiceControllerFeign {

	@GetMapping("/name")
	public String getName() {
		return "Name: Saranya";
	}
	@GetMapping("/location")
	public String getLocation() {
		return "Location: Chennai";
	}
}


