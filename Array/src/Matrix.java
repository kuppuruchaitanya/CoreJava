  import java.util.*; 
public class Matrix 
{
	public static void main (String args[])
	{ 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter the number of rows and columns:"); 
    int r=sc.nextInt(); 
    int c=sc.nextInt(); 
    int a[][]=new int[r][c]; 
    
    int b[][]=new int[r][c]; 
    int sum=0,max=0,x=0,y=0; 
    int i,j; 
    System.out.println("Enter the matrix elements"); 
    for(i=0;i<r;i++) 
    
    for(j=0;j<c;j++) 
    a[i][j]=sc.nextInt();   
    
    for(i=0;i<r;i++) 
    {
        for(j=0;j<c;j++) 
    {
        sum=0;
        if((i-1)>=0 && (j-1)>=0 && (i-1)<r &&(j-1)<c) 
        sum=sum+a[i-1][j-1];
        if((i-1)>=0 && j>=0 && (i-1)<r &&j<c)
        sum=sum+a[i-1][j];
        if((i-1)>=0 && j>=0 && (i-1)<r &&(j+1)<c) 
        sum=sum+a[i-1][j+1];
        if((i)>=0 && (j-1)>=0 && (i)<r &&(j-1)<c)
        sum=sum+a[i][j-1];
        if((i)>=0 && (j)>=0 && (i)<r &&(j)<c)
        sum=sum+a[i][j];
        if((i)>=0 && (j+1)>=0 && (i)<r &&(j+1)<c) 
        sum=sum+a[i][j+1]; 
        if((i+1)>=0 && (j-1)>=0 && (i+1)<r &&(j-1)<c)
        sum=sum+a[i+1][j-1];
        if((i+1)>=0 && (j)>=0 && (i+1)<r &&(j)<c) 
        sum=sum+a[i+1][j];
        if((i+1)>=0 && (j+1)>=0 && (i+1)<r &&(j+1)<c)
        sum=sum+a[i+1][j+1];
        if(sum>max)
        {
            max=sum;
            x=i+1;
            y=j+1;
            } 
} 
} 
System.out.println("Result: x:"+x+" "+"y:"+y+" "+max); 
} }

