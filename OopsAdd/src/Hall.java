import java.util.ArrayList;
import java.util.List;

public class Hall {
    
	private String name;
	private int costPerDay;
	private List<Eventtype> eventTypeList= new ArrayList<Eventtype>();
	
	public Hall() {
		super();
	}

	List<Integer> noOfEvents= new ArrayList<Integer>();
	
    public Hall(String name, int costPerDay) {
		super();
		this.name = name;
		this.costPerDay = costPerDay;
	}
     
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(int costPerDay) {
		this.costPerDay = costPerDay;
	}

	public List<Eventtype> getEventtypeList() {
		return eventTypeList;
	}

	public void setEventtypeList(List<Eventtype> eventtypeList) {
		this.eventTypeList = eventtypeList;
	}

	void addToNoOfEvents(int n)
    {
    	noOfEvents.add(n);
    }
    
    void addToEventtypeList(Eventtype eventtype)
    {
    	eventTypeList.add(eventtype);
    }
   
    private List<Hall> hallList=new ArrayList<Hall>();
    void addToHallList(Hall hall)
	{
		hallList.add(hall);
	}
    
   public void checkEvent(String event)
    {
    	int i=0,j=0,k=0;
    	Eventtype ep= new Eventtype();

    	for (Eventtype eventType : eventTypeList) {
    		if(noOfEvents.get(j)==k)
    		{
    			k=0;
    			j++;
    		}
			if(eventType.getName().equals(event))
			{
				
				System.out.println(hallList.get(j).getName());
				i++;
			}
			k=k+1;
		}
    	if(i==0)
    	{
    		System.out.println("No halls are available for the event type");
    	}
    
}
}