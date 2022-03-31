package EmpProject;

public class EmpMthds
{
	public EmpMthds()
	{}
	EmpMthds(EmployeeRecord obj2)
	{
		System.out.println("EMP ID is " +obj2.EmpID+"\n"+"STUD Name is "+obj2.EmpName+"\n"+"Desgn is "+obj2.Designation);
		}	
			public static void displayemp(EmployeeRecord obj2)
			{
			System.out.println("Public Access Modifier");
			System.out.println("Emp ID: " +obj2.EmpID+"\n"+"Emp Name : "+obj2.EmpName+"\n"+"Desgn: "+obj2.Designation+"\n"+"Salary: "+obj2.Salary);
			}
			public static void evenodd() {
				Integer a=2000;
				if(a%100==0){  
					System.out.println(" From Another Package"); 
				    System.out.println(a+"  is a centuary");  
				}else{  
				    System.out.println(a+"  is not a centuary");  
				}  
				System.out.println(" -----------------------"); 
				}
				}
	

