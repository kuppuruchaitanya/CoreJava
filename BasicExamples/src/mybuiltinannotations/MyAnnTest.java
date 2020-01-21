package mybuiltinannotations;

import java.util.ArrayList;
import java.util.List;

public class MyAnnTest 
{
	@MySampleAnn(name="Chaitu",desc="checking Annotations...")
	public void myTestMethod()
	{
		List<String> interests=new <String>ArrayList();
		System.out.println(""+this.getClass().toString());
		interests.add("Reading books");
		interests.add("Listining music");
		interests.forEach(System.out::println);
		
	}

}
