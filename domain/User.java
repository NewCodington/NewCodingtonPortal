package codingtonportal.model.domain;

public class User {
	
	//Atributos
	private int IdUser;
	private String firstName;
	private String lastName;
	private String dni;
	private String email;
	private String phoneNumber;
	private String address;
	private String username;
	private String password;
	private boolean admin;
	
	
	//Constructor
	User()
	{
		
		this.IdUser=0;
		this.firstName=null;
		this.lastName=null;
		this.dni=null;
		this.email=null;
		this.phoneNumber=null;
		this.address=null;
		this.username=null;
		this.password=null;
		this.admin=true;
	}
	//Constructor con parametros
	User(User user)
	{
		this.IdUser=user.getIdUser();
		this.firstName=user.getFirstName();
		this.lastName=user.getLastName();
		this.dni=user.getDni();
		this.email=user.getEmail();
		this.phoneNumber=user.getPhoneNumber();
		this.address=user.getAddress();
		this.username=user.getUsername();	
		this.password=user.getPassword();
		this.admin=user.isAdmin();
	}
	
	
	//GETTERS AND SETTERS
	
	
	public String getFirstName() {
		return firstName;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public int getIdUser() {
		return IdUser;
	}
	public void setIdUser(int idUser) {
		IdUser = idUser;
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
