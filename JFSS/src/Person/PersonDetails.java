package Person;

import EmpProject.*;
public class PersonDetails {
	  int SNo;
	  String Pname;
	  String MobNo;
	  String EmailID;
	  String Occupation;
	  char Gender;
	
public static void persondata() {
	
		    int SNo=100;
			String Pname="Joseph";
			String Occupation="Chennai";
			String EmailID="600040";
			String MobNo="8976766890";
			char Gender='M';
			System.out.println("Person Records");
			System.out.println("SNo: "+SNo);
			System.out.println("Pname: "+Pname);
			System.out.println("Occupation: "+Occupation);
			System.out.println("EmailID: "+EmailID);
			System.out.println("MobNo: "+MobNo);
			System.out.println("Gender: "+Gender);
			System.out.println(" -----------------------"); 
			
			}
		public static void main(String args[]){
		  
		//  EmpMthds obj=new EmpMthds();
		  EmpMthds.evenodd();
		  persondata();
	  }
}
