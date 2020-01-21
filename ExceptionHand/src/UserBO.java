public class UserBO {
    
	public UserBO()                    
	{
	}
	
	static void validate(User u) throws Exception          
	{
		int numCount=0;
		String n= u.getPassword();
		for(int i=0;i<n.length();i++)                      
		{
			if(n.charAt(i)>='0' && n.charAt(i)<='9')
			{
				numCount++;
			}
		}
		
		if(numCount==0)                                  
		{
			throw new WeakPasswordException("Your password is weak");
		}
	}

}