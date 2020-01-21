import java.util.*;
import java.text.*;
import java.io.*;
class Main
{
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String m,n,o,p,q,r;
		System.out.println("Enter Date1");
        System.out.println("Enter day");
        m=sc.nextLine();
        int a=Integer.parseInt(m);
        System.out.println("Enter month");
        n=sc.nextLine();
        int b=Integer.parseInt(n);
        System.out.println("Enter year");
        o=sc.nextLine();
        String f=m+" "+n+" "+o;
        System.out.println("Enter Date2");
        System.out.println("Enter day");
        p=sc.nextLine();
        int c=Integer.parseInt(p);
        System.out.println("Enter month");
        q=sc.nextLine();
        int d=Integer.parseInt(q);
        System.out.println("Enter year");
        r=sc.nextLine();
        String g=p+" "+q+" "+r;
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