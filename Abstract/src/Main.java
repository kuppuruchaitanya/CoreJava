import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Main {
 
 public static void main(String args[])
 {
  Scanner sc= new Scanner(System.in);
  List<Address> add= new ArrayList<Address>();
  Map<String,List<Address>> ct= new HashMap<String,List<Address>>();
  Map<String,Map<String,List<Address>>> st= new HashMap<String, Map<String,List<Address>>>();
  
  System.out.println("Enter the number of address");
  int n= Integer.parseInt(sc.nextLine());
  
  for(int i=0;i<n;i++)
  {
   System.out.println("Enter the address "+(i+1)+" detail");
   String s= sc.nextLine();
   String a[]= s.split(",");
   Address ad= new Address(a[0], a[1], a[2], a[3], Integer.parseInt(a[4]));
   add.add(ad);
   ct.put(a[2], add);
   st.put(a[3], ct);
  }

  
  System.out.println("Enter the state to be searched");
  String sstate= sc.nextLine();
  if(st.containsKey(sstate))
  {
   System.out.println("Enter the city to be searched");
   String scity= sc.nextLine();
   if(ct.containsKey(scity))
   {
	System.out.printf("%-15s%-15s%-15s%-15s%-15s\n","Line 1","Line 2","City","State","Pincode");
    for (Address address : add) {
    	if(address.getCity().equals(scity))
    	{
    		System.out.println(address);	
	    }	
	}
   }
   else
   {
    System.out.println("Searched city not found");
   }
   
  }
  else
  {
   System.out.println("Searched state not found");
  }
 }
}


