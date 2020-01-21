import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {

  InputStreamReader in= new InputStreamReader(System.in);
  BufferedReader brr= new BufferedReader(in);
  List<Address> add= new ArrayList<Address>();
  List<Contact> cont= new ArrayList<Contact>();
  System.out.println("Enter the number of contact-address pair:");
  int n= Integer.parseInt(brr.readLine());
 
 
  for(int i=0;i<n;i++)
  {
  System.out.println("Enter the address "+(i+1)+":");
  String s=brr.readLine();
  String a[]=s.split(",");
  Address x= new Address(a[1],a[0],a[2],a[3],Integer.parseInt(a[4]));
  add.add(x);
 
  System.out.println("Enter the contact "+(i+1)+":");
  String s1= brr.readLine();
  String b[]=s1.split(",");
  Contact t= new Contact(Integer.parseInt(b[0]),Integer.parseInt(b[1]),Integer.parseInt(b[2]),b[3]);
  cont.add(t);
  }
 
  System.out.println("Enter the mobile of the contact to be searched:");
  int r= Integer.parseInt(brr.readLine());
  int i=0;
  int check=0;
  for (Contact contact : cont) {
    if(contact.getMobile()==r||contact.getAlternateNumber()==r||contact.getLandline()==r)
{
System.out.println("Contact-Address "+(i+1));
System.out.println(cont.get(i).toString());
System.out.println(add.get(i).toString());
i++;
check++;
}
}
  if(check==0)
  {
  System.out.println("No contact with mobile "+r+" found");
  }
}
}
