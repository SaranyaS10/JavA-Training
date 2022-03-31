package SpringBootWebdemoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import SpringBootWebdemoModel.Employee;
import SpringBootWebdemoService.EmployeeService;



@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeeService;
	
	@GetMapping("/")
	public String add(Model model)
	{
		model.addAttribute("employeee",new Employee());
		return "add";	
	}
	@GetMapping("/save")
	public String save(@ModelAttribute("employeee") Employee employeee)
	{
		employeeeService.add(employeee);
		return "list";
	}
}
