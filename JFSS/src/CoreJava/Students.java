package CoreJava;

class StudentRecord{
	int sid;
	String name;
	String dept;
	int totmarks;
public void displaystudprofile()
{
System.out.println("Stud ID is " +sid+"\n"+"Stud name is "+name+"\n"+"Dept is "+dept+"\n"+"Total marks "+totmarks);
}
}

public class Students {

	public static void main(String args[]){ 
		StudentRecord obj1=new StudentRecord();
		StudentRecord obj2=new StudentRecord();
		StudentRecord obj3=new StudentRecord();
		System.out.println("Stud Record 1:");
		obj1.sid=100;
		obj1.name="Saranya S";
		obj1.dept="BCA";
		obj1.totmarks=330;
		obj1.displaystudprofile();
		System.out.println("Stud Record 2:");
		obj2.sid=101;
		obj2.name="Akshaya D";
		obj2.dept="IT";
		obj2.totmarks=350;
		obj2.displaystudprofile();
		System.out.println("Stud Record 3:");
		obj3.sid=102;
		obj3.name="Nivedha S";
		obj3.dept="IT";
		obj3.totmarks=380;		
		obj3.displaystudprofile();
	}
}
