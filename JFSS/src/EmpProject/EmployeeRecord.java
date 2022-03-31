package EmpProject;

public class EmployeeRecord {
	Integer EmpID;
	String EmpName;
	String Designation;
	Float Salary;
	
	
	EmployeeRecord(){ //Constructor - No Argument
	}
	
	EmployeeRecord(int ID,String Name,String Dsgn,Float Sal) //Constructor - 4 Argument
	{
    this.EmpID=ID;
    this.EmpName=Name;
    this.Designation=Dsgn;
    this.Salary=Sal;   
	System.out.println("Emp ID: "+EmpID+"\n"+"Emp Name: "+EmpName+"\n"+"Designation: "+Designation+"\n"+"Salary: "+Salary);
	System.out.println();
	}
	EmployeeRecord(int ID,String Name,String Dsgn) //Constructor - 3 Argument
	{
    this.EmpID=ID;
    this.EmpName=Name;
    this.Designation=Dsgn;
    
	System.out.println("Emp ID: "+EmpID+"\n"+"Emp Name: "+EmpName+"\n"+"Designation: "+Designation);
	System.out.println();
	}

	@Override
	public String toString() {
		return "EmployeeRecord [EmpID=" + EmpID + ", EmpName=" + EmpName + ", Designation=" + Designation + ", Salary="
				+ Salary + "]";
	}

}


