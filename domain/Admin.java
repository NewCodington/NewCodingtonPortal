package codingtonportal.model.domain;

public class Admin extends User {

	
	//Atributos
	private int adminId;
	private String userName;
	private String password;
	private String confirmPassword;

	
	
	//Constructor
	Admin()
	{
		this.adminId=0;
		this.userName=null;
		this.password=null;
		this.confirmPassword=null;
		
	}
	
	//Constructor con parametros
	Admin(Admin admin)
	{
		this.adminId=admin.getVisitorId();
		this.userName=admin.getUserName();
		this.password=admin.getPassword();
		this.confirmPassword=admin.getConfirmPassword();
				
	}

	
	
	
	//GETTERS AND SETTERS
	public int getVisitorId() {
		return adminId;
	}

	public void setVisitorId(int visitorId) {
		this.adminId = visitorId;
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
