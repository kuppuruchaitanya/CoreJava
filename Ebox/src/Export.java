import java.util.List;

interface Export {
    public String exportJSON(List<TicketBooking> bookings);
	public String exportCSV(List<TicketBooking> bookings);
}
