import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Maths
{
	public static void main(String args[]) throws ParseException
	{
	 Scanner sc =new Scanner(System.in);
	 String day1,month1,year1,day2,month2,year2;
	         System.out.println("Enter Date1");
	 
	         System.out.println("Enter day1");
	 
	         day1=sc.nextLine();
	 
	         int a=Integer.parseInt(day1);
	 
	         System.out.println("Enter month1");
	
	         month1=sc.nextLine();
	 
	         int b=Integer.parseInt(month1);
	
	         System.out.println("Enter year1");
	
	         year1=sc.nextLine();
	
	         String f=day1+" "+month1+" "+year1;
	         System.out.println("Enter Date2");
	        
	                 System.out.println("Enter day2");
	        
	                day2=sc.nextLine();
	         
	                 int c=Integer.parseInt(day2);
	         
	                 System.out.println("Enter month2");
	         
	                 month2=sc.nextLine();
	         
	                 int d=Integer.parseInt(month2);
	         
	                 System.out.println("Enter year2");
	       
	                 year2=sc.nextLine();
	        
	                 String g=day2+" "+month2+" "+year2;
	         
	        
	                 SimpleDateFormat myformat=new SimpleDateFormat("dd MM yyyy");
	         
	                 Date date1=myformat.parse(f);
	       
	                  Date date2=myformat.parse(g);
	         
	                  long diff=date2.getTime()-date1.getTime();
	       
	                  int day=(int)(diff/(3600000*24));
	               
	              if(a<32&&c<32&&b<13&&d<13)
	         
	                  {
	         
	                      if(day==0)
	        
	                      {
	        
	                          System.out.println(day+1+" day");
	         
	                      }
	         
	                      else
	         
	                      {
	        
	                          System.out.println(day+1+" days");
	         
	                      }
	         
	                  }
	         
	                  else
	       
	                  {
	       
	                      System.out.println("Invalid Date");
	      
	                  }
	       
	                  
	              
	       
	             
	              
	        
	             }
	      
	         }
	 
	          
	 
	 
	 
	 

