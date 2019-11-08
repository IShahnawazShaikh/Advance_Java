package beans;
import java.util.Date;
public class Person {
	private int id; 
	private String name; 
	private String address; 
	private Date dateOfBirth;
	public Person() {}
	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ",address=" + address + ",  dateOfBirth=" + dateOfBirth + "]"; 
	}
	public Person(int id, String name, String address, Date dateOfBirth) {
		super();
		System.out.println("constructor");
		this.id = id;
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
