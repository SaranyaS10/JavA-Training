package CoreJava;

import java.util.Scanner;
import java.util.stream.Stream;

class EmployeeRecord{
	int EmpID;
	String EmpName;
	String Designation;
	String MobNo;
	int Salary;
	String Location;
	EmployeeRecord(){
	}
	
	EmployeeRecord(int ID,String Name,String Dsgn,String Mob,int Sal,String Loc)
	{
    this.EmpID=ID;
    this.EmpName=Name;
    this.Designation=Dsgn;
    this.MobNo=Mob;
    this.Salary=Sal;   
    this.Location=Loc;  
    
	System.out.println("Emp ID: "+EmpID+"\n"+"Emp Name: "+EmpName+"\n"+"Designation: "+Designation+"\n"+"MobNo: "+MobNo+"\n"+"Salary: "+Salary+"\n"+"Location: "+Location);
	System.out.println();
	}
	
	EmployeeRecord(int ID,String Name,String Dsgn,String Mob,int Sal)
	{
		this.EmpID=ID;
	    this.EmpName=Name;
	    this.Designation=Dsgn;
	    this.MobNo=Mob;
	    this.Salary=Sal;   
		System.out.println("Emp ID: "+EmpID+"\n"+"Emp Name: "+EmpName+"\n"+"Designation: "+Designation+"\n"+"MobNo: "+MobNo+"\n"+"Salary: "+Salary);
		System.out.println();

		}
	
	private void displayemp()
	{
	System.out.println("Private Access Modifier");
	System.out.println("Stud ID is " +EmpID+"\n"+"Stud name is "+EmpName+"\n"+"Dept is "+Designation+"\n"+"Total marks "+MobNo);
	}
	public void displayemployee()
	{
	System.out.println("Public Access Modifier");
	System.out.println("Stud ID is " +EmpID+"\n"+"Stud name is "+EmpName+"\n"+"Dept is "+Designation+"\n"+"Total marks "+MobNo);
	displayemp();
	}
public void evenodd(int a) {
if(a%100==0){  
    System.out.println(a+"  is a centuary");  
}else{  
    System.out.println(a+"  is not a centuary");  
}  
}
}
public class Employee {

	public static void main(String args[]){ 
				EmployeeRecord obj1=new EmployeeRecord();
				EmployeeRecord obj2=new EmployeeRecord(2,"Sanjay","Dev","9577769979",25000,"Anna Nagar");
				EmployeeRecord obj3=new EmployeeRecord(3,"Saranya","Tester","9977769979",25000);
				EmployeeRecord obj4=new EmployeeRecord();
				obj2.displayemployee();
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the number");
				int var=s.nextInt();
				obj4.evenodd(var);
				Scanner input = new Scanner(System.in);
			    System.out.print("Enter your name: ");
			    String value = input.next();
			    System.out.println("Using next(): " + value);
			    Scanner in = new Scanner(System.in);
			    System.out.print("Enter your name: ");
			    String v = in.nextLine();
			    System.out.println("Using nextline(): " + v);
			    Scanner sc = new Scanner(System.in);
			    System.out.print("Enter your cgpa: ");
			    double cgpa = sc.nextDouble();
			    System.out.println("Using nextDouble(): " + cgpa);
			 	s.close();
				input.close();	
				String str = "Hello/This is Saranya S/From Chennai.";  
	            Scanner dl = new Scanner(str);  
	            dl.useDelimiter("/"); 
	            while(dl.hasNext()) {
	            System.out.println(dl.next());}
	            System.out.println("Delimiter used: " +dl.delimiter());
	            dl.close();
	          
}
}

