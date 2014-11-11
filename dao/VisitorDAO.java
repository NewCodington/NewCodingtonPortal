package codingtonportal.model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import codingtonportal.model.domain.Visitor;
import codingtonportal.model.inter.dao.IVisitor;





public class VisitorDAO implements IVisitor {

	public void insertvisitor(Visitor visitor)   {  
		 ConnectionDB conex= new ConnectionDB(); 
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("INSERT INTO users VALUES (" +
		 		+visitor.getIdUser()+"," +
		 		"'"+visitor.getFirstName()+"'," +
		 		"'"+visitor.getLastName()+"'," +
		 		"'"+visitor.getDni()+"'," +
		 		"'"+visitor.getEmail()+"',"+
		 		"'"+visitor.getPhoneNumber()+"',"+
		 		"'"+visitor.getAddress()+"',"+
		 		"'"+visitor.getUserName()+
		 		"'"+visitor.getPassword()+
		 		"'"+visitor.isAdmin()+"')"); 
		//JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		 estatuto.close();  
		 conex.closeConnection();    
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  
		 } 
	
	
	


	public void loginvisitor(String Username, String Password) {
		ConnectionDB conex= new ConnectionDB(); 
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("SELECT Username, Password FROM Users WHERE Username= "+Username+ " AND Password="+Password+";"); 
		//JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 		 estatuto.close();  
		 conex.closeConnection();    
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  
		
		
	}


	public void deletevisitor(Visitor visitor) {
	
		ConnectionDB conex= new ConnectionDB(); 
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("DELETE FROM users WHERE idUser="+visitor.getIdUser()+";");		 
		 //JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		 estatuto.close();  
		 conex.closeConnection();    
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  	
	}



	public void updateinformation(Visitor visitor) {
	
		ConnectionDB conex= new ConnectionDB(); 
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("UPDATE FROM users SET (" 
		 		+"First_name="+visitor.getFirstName()+"'," 
		 		+"Last_name="+visitor.getLastName()+"', " 
		 		+"DNI="+visitor.getDni()+"'," 
		 		+"Email="+visitor.getEmail()+"'," 
		 		+"Phone_number="+visitor.getPhoneNumber()+"'," 
		 		+"Address="+visitor.getAddress()+"'," 
		 		+"Password="+visitor.getPassword()+") WHERE idUser="+visitor.getIdUser()+";");	
		 		
		 //JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		 estatuto.close();  
		 conex.closeConnection();    
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  	
		
		
		
	}



	public void updatepassword(Visitor visitor) {
		ConnectionDB conex= new ConnectionDB(); 
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("UPDATE FROM users SET (" 
			 		+"Password="+visitor.getPassword()+") WHERE idUser="+visitor.getIdUser()+";");	
		 //JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		 estatuto.close();  
		 conex.closeConnection();    
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  	
		
		
	}



	public void registerevent(int IdUser, int IdEvent) {
		ConnectionDB conex= new ConnectionDB(); 
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("INSERT INTO  EventRegistration VALUES (" +
		 		+IdUser+"," +
		 		"'"+IdEvent+";')"); 
		//JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		 estatuto.close();  
		 conex.closeConnection();    
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  
		
	}



	public void unregisterevent(int IdUser, int IdEvent) {
		ConnectionDB conex= new ConnectionDB(); 
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("DELETE FROM  EventRegistration  WHERE IdUser= "+IdUser+ " AND IdEvent="+IdEvent+";"); 
		//JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		 estatuto.close();  
		 conex.closeConnection();    
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  
		
	}


	
	public void searchevent(String Search) {
		ConnectionDB conex= new ConnectionDB(); 
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("SELECT * FROM event  WHERE Name LIKE '%'" + Search + "'%' ;"); 
		//JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		 estatuto.close();  
		 conex.closeConnection();   
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  
		
		
	}



	public void viewevent() {
		ConnectionDB conex= new ConnectionDB(); 
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("SELECT * FROM event  ;"); 
		//JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		 estatuto.close();  
		 conex.closeConnection();   
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  
		
		
	}

	
}
