package Person;

import java.util.Scanner;

public class Employees  {

	public static void main(String[] args) {
	
		EmployeeDetails emp1=new EmployeeDetails();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee number=");
		emp1.Emp_ID = sc.nextInt();
		System.out.print("Enter Employee Name=");
		emp1.Emp_Name = sc.next();
		System.out.print("Enter salary=");
		emp1.Salary = sc.nextInt();
	    System.out.print("Enter Department=");
	    emp1.Dept = sc.next();
	    System.out.print("Enter Email_ID =");
	    emp1.Email_ID = sc.next();
	    System.out.print("Enter Phone_No=");
	    emp1.Phone_No = sc.next();
	    System.out.print("Enter Location=");
	    emp1.Location = sc.next();
	    sc.close();
    	System.out.println(emp1);
    
    	
    	int salary=emp1.getSalary();
    	int incre=0;
    	if((salary>=10000)&&(salary<=14000))
    	{
    		incre=(salary*7)/100;
    		salary=salary+incre;
    		emp1.setSalary(salary);
    		 System.out.println("\n Salary is incremented \n");  
    	}
    	else 
    		if ((salary >=15000) && (salary <=20000))
    	{  
    		incre = (salary*12)/100;  
            salary = salary+incre;  
            emp1.setSalary(salary);  
            System.out.println("\n Salary is incremented \n"+"\nIncremented amount is "+incre+"\n"+"Revised salary is "+salary); 
          }
    	else 
    	{  
            System.out.println("\n Salary is not incremented \n");   
        }  
    	EmployeeSalary emps=new EmployeeSalary();
    	emps.unit();
    	emps.calc();
    	emps.display();
    }  
}
 
