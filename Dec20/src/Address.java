public class Address {
   
  private String addressLine2;
  private String addressLine1;
  private String city;
  private String state;
  private int pinCode;

  public Address() {
  super();
}
public Address(String addressLine2, String addressLine1, String city, String state, int zipCode) {
  super();
  this.addressLine2 = addressLine2;
  this.addressLine1 = addressLine1;
  this.city = city;
  this.state = state;
  this.pinCode = zipCode;
}
public String getAddressLine2() {
  return addressLine2;
}
public void setAddressLine2(String addressLine2) {
  this.addressLine2 = addressLine2;
}
public String getAddressLine1() {
  return addressLine1;
}
public void setAddressLine1(String addressLine1) {
  this.addressLine1 = addressLine1;
}
public String getCity() {
  return this.city;
}
public void setCity(String city) {
  this.city = city;
}
public String getState() {
  return this.state;
}
public void setState(String state) {
  this.state = state;
}
public int getPinCode() {
  return this.pinCode;
}
public void setPinCode(int pinCode) {
  this.pinCode = pinCode;
}
@Override
public String toString() {
  return "Address Line1:" + addressLine1 + "\nAddress Line2:" + addressLine2 + "\nCity:" + city
    + "\nState:" + state + "\nPincode:" + pinCode ;
}
   
}

