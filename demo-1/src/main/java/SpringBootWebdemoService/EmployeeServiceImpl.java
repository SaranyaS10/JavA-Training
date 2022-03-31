package SpringBootWebdemoService;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import SpringBootWebdemoModel.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	

		 private Set<Employee> employeees=new HashSet<Employee>();
		 
		@Override
		public void add(Employee employeee) {
			employeees.add(employeee);	
		}

		@Override
		public Set<Employee> employees() {
			return employeees;
		}

	}
