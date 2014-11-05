package codingtonportal.model.domain;

public class Visitor extends User {
	
	//Atributos
	private int visitorId;
	private String userName;
	private String password;
	private String confirmPassword;
	
	
	//Constructor
	Visitor()
	{
		this.visitorId=0;
		this.userName=null;
		this.password=null;
		this.confirmPassword=null;
		
	}
	
	//Constructor con parametros
	Visitor(Visitor visitor)
	{
		this.visitorId=visitor.getVisitorId();
		this.userName=visitor.getUserName();
		this.password=visitor.getPassword();
		this.confirmPassword=visitor.getConfirmPassword();
				
	}

	
	
	
	//GETTERS AND SETTERS
	public int getVisitorId() {
		return visitorId;
	}

	public void setVisitorId(int visitorId) {
		this.visitorId = visitorId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
