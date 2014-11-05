package codingtonportal.model.domain;

public class User {
	
	//Atributos
	private String firstName;
	private String lastName;
	private String dni;
	private String email;
	private String phoneNumber;
	private String address;
	
	//Constructor
	User()
	{
		this.firstName=null;
		this.lastName=null;
		this.dni=null;
		this.email=null;
		this.phoneNumber=null;
		this.address=null;
	}
	//Constructor con parametros
	User(User user)
	{
		this.firstName=user.getFirstName();
		this.lastName=user.getLastName();
		this.dni=user.getDni();
		this.email=user.getEmail();
		this.phoneNumber=user.getPhoneNumber();
		this.address=user.getAddress();
	}
	
	
	//GETTERS AND SETTERS
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
