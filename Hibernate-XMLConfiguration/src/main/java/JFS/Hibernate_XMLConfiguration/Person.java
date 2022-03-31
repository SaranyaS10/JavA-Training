package JFS.Hibernate_XMLConfiguration;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Person {
	@Id
	private int pid;
	private String pname;
//@OneToMany(mappedBy = "person")
	//private List<Laptop> laptop=new ArrayList<Laptop>();
	
	
	public Person(int pid, String pname, List<Laptop> laptop) {
		super();
		this.pid = pid;
		this.pname = pname;
	//	this.laptop = laptop;
	}
	public Person() {
		super();
		
	}
	public Person(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + "]";
	}
	
//	public List<Laptop> getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(List<Laptop> laptop) {
//		this.laptop = laptop;
//	}
	
	

}
