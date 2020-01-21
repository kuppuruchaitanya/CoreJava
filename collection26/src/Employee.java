
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparator<Employee>   
{
    private String first_name;        
	private String last_name;
	private long mobile_number;
	private String email_id;
	private String address;
	
	
	
	public Employee() {
		super();
	}

	public Employee(String first_name, String last_name, long mobile_number, String email_id, String address) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile_number = mobile_number;
		this.email_id = email_id;
		this.address = address;
	}

	public String getFirst_name() {          
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public long getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.first_name.compareTo(o2.first_name);
	}
	
	
	
}