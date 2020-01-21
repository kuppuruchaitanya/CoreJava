import java.util.List;

public class ExportBooking {
    
	public void exportJSON(List<TicketBooking> bookings)
	{
		int i=bookings.size();
		//System.out.println(i);
		TicketBooking t= new TicketBooking();
		for (TicketBooking ticketBooking : bookings)
		{
			System.out.print(t.JSON(ticketBooking));
			i--;
			if(i>0)
			{
				System.out.println(",");
			}
		    
		}
	}
	public void exportCSV(List<TicketBooking> bookings)
	{
		TicketBooking t= new TicketBooking();
		for (TicketBooking ticketBooking : bookings) {
			System.out.println(t.CSV(ticketBooking));
		}
		
	}
}