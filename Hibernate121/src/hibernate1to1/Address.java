package hibernate1to1;

public class Address {  
private int addressId;  
private String addressLine1,city,state,country;  
private int pincode;  
private Employe employee;  
//setters and getters 
public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
}
public String getAddressLine1() {
	return addressLine1;
}
public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public Employe getEmployee() {
	return employee;
}
public void setEmployee(Employe employee) {
	this.employee = employee;
}



}  