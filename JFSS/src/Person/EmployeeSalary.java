package Person;

public class EmployeeSalary extends EmployeeDetails{
	
	   public void unit()	
	    {
	        Emp_ID = 100;
	        Emp_Name = "Saranya";
	        Salary=30000;
	        Dept = "IT";
	        Location = "Chennai";
	    }

	    public void calc()
	    {
	    	HRA = Salary * 0.1f;
	    	DA = Salary * 0.2f;
	    	IT = Salary * 0.1f;
	    	GP = Salary +HRA + DA - IT ;
	        
	    }
	    public void display()
	    {
	    	System.out.println();
	        System.out.println("--------Salary Slip--------\n");
	        System.out.println("Employee number="+Emp_ID);
	        System.out.println("Employee Name="+Emp_Name);
	        System.out.println("Department="+Dept);
	        System.out.println("Basic pay="+Salary);        
	        System.out.println("Housing Rent Allowance="+HRA);    
	        System.out.println("Dearness Allowance="+DA);
	        System.out.println("Income Tax="+IT);
	        System.out.println("Gross pay="+GP);
	    }
	   
}
	    