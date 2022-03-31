package EmpProject;

import java.util.LinkedList;
import java.util.List;

public class Employee {
  public static void main(String args[]){
	 
	  EmployeeRecord obj1=new EmployeeRecord();
	  obj1.EmpID=1;
	  obj1.EmpName="Rocky";
	  obj1.Designation="Dev";
	  obj1.Salary=30000f;
   EmployeeRecord obj2=new EmployeeRecord(2,"Sanjay","QA",25000f);
	 // EmployeeRecord obj5=new EmployeeRecord(3,"Sanjay","QA");
	EmployeeRecord obj4=new EmployeeRecord(4,"Sanjay","QA");
  EmpMthds obj3=new EmpMthds(obj4);
	  EmpMthds mobj=new EmpMthds();
	 
	  
	  EmployeeRecord[] emparrObj=new EmployeeRecord[3];
	  emparrObj[0]=new EmployeeRecord(2,"Sanjay","QA",25000f);
	  emparrObj[1]=new EmployeeRecord(3,"Sanjay","QA");
	  emparrObj[2]=new EmployeeRecord(5,"Sanjay","QA",25000f);
	  
	  List<EmployeeRecord> arrlist=new LinkedList<EmployeeRecord>();
	  arrlist.add(emparrObj[0]);
	  arrlist.add(emparrObj[1]);
	  arrlist.add(emparrObj[2]);
	  arrlist.add(new EmployeeRecord (6,"Sanjay","QA",25000f));
	  
	  System.out.println("List of elements:");
		for(EmployeeRecord e: arrlist) {
			System.out.println(e);
		}

	  for(int p=0;p<3;p++)
	  {
			obj3.displayemp(emparrObj[p]);	
	  }
	  
	  mobj.evenodd();
//	  obj3.displayemp(obj2); //Object as parameter
	  
	}
}
;