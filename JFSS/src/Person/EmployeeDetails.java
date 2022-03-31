package Person;

public class EmployeeDetails  {
int Emp_ID;
int Salary;
String Emp_Name,Dept,Email_ID,Phone_No,Location;
float  HRA, DA, IT,GP;

public EmployeeDetails() {
	super();
	
}


public EmployeeDetails(int emp_ID, int salary, String emp_Name, String dept) {
	super();
	this.Emp_ID = emp_ID;
	this.Salary = salary;
	this.Emp_Name = emp_Name;
	this.Dept = dept;
}


public int getEmp_ID() {
	return Emp_ID;
}
public void setEmp_ID(int emp_ID) {
	Emp_ID = emp_ID;
}
public String getEmp_Name() {
	return Emp_Name;
}
public void setEmp_Name(String emp_Name) {
	Emp_Name = emp_Name;
}
public String getDept() {
	return Dept;
}
public void setDept(String dept) {
	Dept = dept;
}
public String getEmail_ID() {
	return Email_ID;
}
public void setEmail_ID(String email_ID) {
	Email_ID = email_ID;
}
public String getPhone_No() {
	return Phone_No;
}
public void setPhone_No(String phone_No) {
	Phone_No = phone_No;
}
public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}
public int getSalary() {
	return Salary;
}
public void setSalary(int salary) {
	Salary = salary;
}
public float getHRA() {
	return HRA;
}
public void setHRA(float hRA) {
	HRA = hRA;
}
public float getDA() {
	return DA;
}
public void setDA(float dA) {
	DA = dA;
}
public float getIT() {
	return IT;
}
public void setIT(float iT) {
	IT = iT;
}
public float getGP() {
	return GP;
}
public void setGP(float gP) {
	GP = gP;
}
@Override
public String toString() {
	return "EmployeeDetails [Emp_ID=" + Emp_ID + ", Emp_Name=" + Emp_Name + ", Dept=" + Dept + ", Email_ID=" + Email_ID
			+ ", Phone_No=" + Phone_No + ", Location=" + Location + ", Salary=" + Salary + "]";
}


}