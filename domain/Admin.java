package codingtonportal.model.domain;

public class Admin extends User {

	
	//Atributos
	private int idAdmin;
	private String userName;
	private String password;
	private String confirmPassword;

	//Constructor
	Admin()
	{
		this.idAdmin = 0;
		this.userName = null;
		this.password = null;
		this.confirmPassword = null;
		
	}
	
	//Constructor con parametros
	Admin(Admin admin)
	{
		this.idAdmin = admin.getIdAdmin();
		this.userName = admin.getUserName();
		this.password = admin.getPassword();
		this.confirmPassword = admin.getConfirmPassword();
	}
	
	//GETTERS AND SETTERS


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

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

}
