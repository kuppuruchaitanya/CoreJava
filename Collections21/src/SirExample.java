import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
 
public class SirExample
{      
	public static void main(String[] args) 
	{
        
        String[] strwords = {"Hello","How","are","you","doing","How","do","you","do"};
        
        System.out.println("Original array: "+ Arrays.toString(strwords));
        LinkedHashSet<String> lhSetColors =new LinkedHashSet<String>(Arrays.asList(strwords));
        
        String[] newArray = lhSetColors.toArray(new String[ lhSetColors.size() ]);
        
        System.out.println("Array after removing duplicates: " + Arrays.toString(newArray));
 
    }
}