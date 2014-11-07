package codingtonportal.model.dao;

import java.sql.SQLException;
import java.sql.Statement;

import codingtonportal.model.domain.Place;
import codingtonportal.model.domain.User;
import codingtonportal.model.inter.dao.IUser;


public class UserDAO {

	public void insertevent(User user)   {  
		 DbConnection conex= new DbConnection(); 
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("INSERT INTO users VALUES (" +
		 		+user.getIdUser()+"," +
		 		"'"+user.getFirstName()+"'," +
		 		"'"+user.getLastName()+"'," +
		 		"'"+user.getDni()+"'," +
		 		"'"+user.getEmail()+"',"+
		 		"'"+user.getPhoneNumber()+"',"+
		 		"'"+user.getAddress()+"',"+
		 		"'"+user.getUsername()+
		 		"'"+user.getPassword()+
		 		"'"+user.isAdmin()+"')"); 
		//JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		 estatuto.close();  
		 conex.desconectar();    
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  
		 } 
	
	
	 public void deleteplace(User user)   {  
		 DbConnection conex= new DbConnection(); 
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("DELETE FROM users WHERE idplace="+user.getIdUser()+";");		 
		 //JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		 estatuto.close();  
		 conex.desconectar();    
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  
		 } 
	
}
