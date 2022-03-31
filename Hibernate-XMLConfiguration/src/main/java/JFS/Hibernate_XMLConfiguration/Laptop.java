package JFS.Hibernate_XMLConfiguration;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
    @Id
	private int lid;
	private String brandname;
	private int price;
	
	//@ManyToMany
	//private List<Person> person=new ArrayList<Person>();

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int lid, String brandname, int price) {
		super();
		this.lid = lid;
		this.brandname = brandname;
		this.price = price;
	}
	
	
	public Laptop(int lid, String brandname, int price, List<Person> person) {
		super();
		this.lid = lid;
		this.brandname = brandname;
		this.price = price;
		//this.person = person;
	}
	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brandname=" + brandname + ", price=" + price + "]";
	}
	
//	public List<Person> getPerson() {
//		return person;
//	}
//	public void setPerson(List<Person> person) {
//		this.person = person;
//	}

	
	
	
	
	
}
