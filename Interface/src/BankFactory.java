public class BankFactory
{

    public Icici getIcici() {
		Notification ic= new Icici();
		return (Icici) ic;
	}

	public Hdfc getHdfc() 
	{
		Notification hd= new Hdfc();
		return (Hdfc) hd;
	}
}