import java.util.ArrayList;
import java.util.List;

public class Eventtype {

    private String name;
	private List<Hall> hallList=new ArrayList<Hall>();
	
	public Eventtype() {
		super();
	}

	public Eventtype(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void addToHallList(Hall hall)
	{
		hallList.add(hall);
	}
	public List copyNoOfevents()
	{
		return hallList;
	}
	} 