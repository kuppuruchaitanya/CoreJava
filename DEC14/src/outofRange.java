class outofRangeException extends Exception 
{ 
    public outofRangeException(String s) 
    { 
       
        super(s); 
    } 
} 
  
 
public class outofRange
{ 
     
    public static void main(String args[]) 
    { 
        try
        { 
        	int a=11;
           if(a>10){
        	   throw new outofRangeException(" "); 
           }
            
        } 
        catch (outofRangeException oe) 
        { 
            System.out.println("outofRangeException"); 
  
           
          
        } 
    } 
}