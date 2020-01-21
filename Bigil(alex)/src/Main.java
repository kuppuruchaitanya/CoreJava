import java.util.Scanner;
public class Main {
public static void main(String[] args) {
 System.out.println("Enter the travel details");
 Scanner sc= new Scanner(System.in);
 System.out.println("Travel Place");
 String place=sc.next();
 System.out.println("Number of tickets");
 Integer num_tic=sc.nextInt();
 System.out.println("Cost per ticket");
 double cost=sc.nextDouble();
 System.out.println("1)Travel Creditcard\n2)RewardCreditcard");
 System.out.println("Enter credit card type");
 int x=sc.nextInt();
 if(x==1)
 {
  System.out.println("1)International\n2)National");
  System.out.println("Enter travel creditcard type");
  int y=sc.nextInt();
  if(y==1)
  {
   System.out.println("Enter the creditcard number");
   String card_num=sc.next();
   System.out.println("Enter the creditcard holdername");
   String holder_name=sc.next();
   System.out.println("Enter the available amount");
   String balance=sc.next();
   InternationalCard i=new InternationalCard();
   double d=i.calculateAmount(cost,num_tic);
   System.out.println("Hello "+holder_name+", You have to pay Rs"+d);
  }
  else if(y==2)
  {
   System.out.println("Enter the creditcard number");
   String card_num=sc.next();
   System.out.println("Enter the creditcard holdername");
   String holder_name=sc.next();
   System.out.println("Enter the available amount");
   String balance=sc.next();
   CountryCard c=new CountryCard();
   double d=c.calculateAmount(cost,num_tic);
   System.out.println("Hello "+holder_name+", You have to pay Rs"+d);
  }
  else
   System.out.println("Invalid Creditcard");
 }
 else if(x==2)
 {
  System.out.println("Enter the creditcard number");
  String card_num=sc.next();
  System.out.println("Enter the creditcard holdername");
  String holder_name=sc.next();
  System.out.println("Enter the available amount");
  double balance=sc.nextDouble();
  System.out.println("Enter the available rewards");
  RewardsCreditCard r=new RewardsCreditCard();
  r.creditPoints=sc.nextDouble();
  double d=r.calculateAmount(cost, num_tic);
  System.out.println("Hello "+holder_name+", You have to pay Rs"+d);
 }
 else
 {
  System.out.println("Invalid Card Type");
 }
}
}