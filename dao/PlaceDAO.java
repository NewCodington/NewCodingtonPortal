package codingtonportal.model.dao;

import java.sql.SQLException;
import java.sql.Statement;

import codingtonportal.model.domain.Place;
import codingtonportal.model.inter.dao.IPlace;

public class PlaceDAO {
	
	public void insertevent(Place place)   {  
		 DbConnection conex= new DbConnection(); 
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("INSERT INTO place VALUES (" +
		 		+place.getIdPlace()+"," +
		 		"'"+place.getName()+"'," +
		 		"'"+place.getRegion()+"'," +
		 		"'"+place.getImage()+"'," +
		 		"'"+place.getAddress()+"',"+
		 		"'"+place.getDescription()+"',)"); 
		//JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		 estatuto.close();  
		 conex.desconectar();    
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  
		 } 
	
	
	 public void deleteplace(Place place)   {  
		 DbConnection conex= new DbConnection(); 
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("DELETE FROM place WHERE idplace="+place.getIdPlace()+";");		 
		 //JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		 estatuto.close();  
		 conex.desconectar();    
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  
		 } 

}
