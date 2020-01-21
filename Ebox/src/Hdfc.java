class Hdfc implements BankTransfers
{

	@Override
	public String encrypt(String a) {
		char ch[]= a.toCharArray();
		String s="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
			if(i%2==0)
			{
				int n= (int)ch[i];
				n=n+1;
				char c= (char)n;
				s= s+c;
			}
			else
			{
				int n= (int)ch[i];
				n=n-1;
				char c= (char)n;
				s= s+c;
			}
			}
			else
			{
				s=s+' ';
			}
		}
		return s;
	}

	@Override
	public String decrypt(String a) {
		char ch[]=a.toCharArray();
		String s="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
			if(i%2==0)
			{
			int n= (int) ch[i];
			n=n-1;
			char c= (char)n;
			s=s+c;
			}
			else
			{
				int n= (int) ch[i];
				n=n+1;
				char c= (char)n;
				s=s+c;
			}
			}
			else
			{
				s=s+' ';
			}
		}
		return s;
	}	
}