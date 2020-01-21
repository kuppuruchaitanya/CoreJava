import java.util.Date;
import java.text.SimpleDateFormat;
public class TicketBooking {
	private String customer;
	private Double price;
	private Date bookingTime;
	private String stageEventShow;
	public TicketBooking(){}
	public TicketBooking(String customer, Double price, Date bookingTime, String stageEventShow) {
		this.customer = customer;
		this.price = price;
		this.bookingTime = bookingTime;
		this.stageEventShow = stageEventShow;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(Date bookingTime) {
		this.bookingTime = bookingTime;
	}
	public String getStageEventShow() {
		return stageEventShow;
	}
	public void setStageEventShow(String stageEventShow) {
		this.stageEventShow = stageEventShow;
	}
   
   public String JSON(TicketBooking ticketBooking)
    {
		SimpleDateFormat formatter= new SimpleDateFormat("dd/mm/yyyy");
		return "{\r\n\"customer\" : \""+ticketBooking.customer+"\",\r\n\"price\" : "+ticketBooking.price+",\r\n\"bookingTime\" : \""+formatter.format(ticketBooking.bookingTime)+"\",\r\n\"stageEventShow\" : \""+ticketBooking.stageEventShow+"\"\r\n}";                   
	}
	
    public String CSV(TicketBooking ticketBooking)
	{
		SimpleDateFormat formatter= new SimpleDateFormat("dd/mm/yyyy");
		return ticketBooking.customer+","+ticketBooking.price+","+formatter.format(ticketBooking.bookingTime)+","+ticketBooking.stageEventShow;
	}
}
