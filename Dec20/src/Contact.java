public class Contact {
private int mobile;
private int alternateNumber;
private int landline;
private String email;

public Contact() {
  super();
}
public Contact(int mobile, int alternateNumber, int landline, String email) {
  super();
  this.mobile = mobile;
  this.alternateNumber = alternateNumber;
  this.landline = landline;
  this.email = email;
}
public int getMobile() {
  return this.mobile;
}
public void setMobile(int mobile) {
  this.mobile = mobile;
}
public int getAlternateNumber() {
  return this.alternateNumber;
}
public void setAlternateNumber(int alternateNumber) {
  this.alternateNumber = alternateNumber;
}
public int getLandline() {
  return this.landline;
}
public void setLandline(int landline) {
  this.landline = landline;
}
public String getEmail() {
  return this.email;
}
public void setEmail(String email) {
  this.email = email;
}
@Override
public String toString() {
  return "Mobile:" + mobile + "\nAlternate Mobile:" + alternateNumber + "\nLandline:" + landline
    + "\nEmail:" + email;
}


}