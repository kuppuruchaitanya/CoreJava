class ICICI implements BankTransfers
{

	@Override
	public String encrypt(String a) {
		char ch[]= a.toCharArray();
		String s="";
		for(int i=0;i<ch.length;i++)
		{
			int n= (int) ch[i];
			n=n+1;
			char c= (char)n;
			s= s+c+"1";
		}
		return s;
	}

	@Override
	public String decrypt(String a) {
		char ch[]=a.toCharArray();
		String s="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='1')
			{
				continue;
			}
			int x= (int) ch[i];
			x=x-1;
			char c= (char)x;
			s=s+c;
		}
		return s;
	}
	
}

