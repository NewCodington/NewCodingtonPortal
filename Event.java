package codingtonportal.model.domain;

public class Event {

	//Atributos
	private int eventId;
	private String name;
	private String description;
	private String place;
	private String duration;
	private String eventType;
	private int seatsAvailable;
	
	
	//Constructor
	public Event()
	{
		this.eventId=0;
		this.name=null;
		this.description=null;
		this.place=null;
		this.duration=null;
		this.eventType=null;
		this.seatsAvailable=0;
	}

	//Constructor con parametros
	public Event(Event event)
	{
		this.eventId=event.getEventId();
		this.name=event.getName();
		this.description=event.getDescription();
		this.place=event.getPlace();
		this.duration=event.getDuration();
		this.eventType=event.getEventType();
		this.seatsAvailable=event.getSeatsAvailable();
	}
	
	
	
	
	//GETTERS AND SETTERS
	
	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}


}
