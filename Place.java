package codingtonportal.model.domain;

public class Place {
	
	//Atribute	
	private int idPlace;
	private String name;
	private String description;
	private String zone;
	private String image;
	private String address; 
	
	//Constructor
	Place(){
		this.idPlace=0;
		this.name=null;
		this.description=null;
	    this.zone=null;
		this.image=null;
		this.address=null;
	}
	
	

	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getIdPlace() {
		return idPlace;
	}

	public void setIdPlace(int idPlace) {
		this.idPlace = idPlace;
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

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
