import java.util.Scanner;

public class Main1
{
 public static void main(String[] args) 
 {
    int [] seat=new int[100];
	int count=0,temp=0;
    	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of seats to be booked:");
	int number=sc.nextInt();
	try
	  {
	    for(int i=0;i<number;i++)
		  {
			System.out.println("Enter the seat number "+(i+1));
			seat[i]=sc.nextInt();
			if(seat[i]>100||seat[i]<=0)
	    		  {
	    			count++;
	    			temp=seat[i]-1;
	    			throw new ArrayIndexOutOfBoundsException();
	    		
	    		  }
	    	  }
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	     {
	    	System.out.println(e+": "+temp);
	     }
	  
	if(count==0)
	 {
	   System.out.println("The seats booked are:");
	    
	  for(int i=0;i<number;i++)
    	     {	
	    	System.out.println(seat[i]);	
    	      }
	 }
     }
 }
