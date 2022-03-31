package JFS.Hibernate_XMLConfiguration;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int sid;
	private int age;
	private String name;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int sid, int age, String name) {
		super();
		this.sid = sid;
		this.age = age;
		this.name = name;
	}


	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", age=" + age + ", name=" + name + "]";
	}
	
	

}
