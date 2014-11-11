package codingtonportal.model.dao;

import codingtonportal.model.domain.Event;
import codingtonportal.model.domain.Visitor;
import codingtonportal.model.inter.dao.IEvent;
import java.sql.*;

public class EventDAO implements IEvent {
	
	 public void insertevent(Event event)   {  
		 ConnectionDB conex= new ConnectionDB(); 
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("INSERT INTO event VALUES (" +
		 		+event.getEventId()+"," +
		 		"'"+event.getName()+"'," +
		 		"'"+event.getDescription()+"'," +
		 		"'"+event.getPlace()+"'," +
		 		"'"+event.getDuration()+"',"+
		 		"'"+event.getStarttime()+"',"+
		 		"'"+event.getEventType()+"',"+
		 		event.getSeatsAvailable()+")"); 
		//JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		 estatuto.close();  
		 conex.closeConnection();    
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  
		 } 
	
	
	 public void deleteevent(Event event)   {  
		 ConnectionDB conex= new ConnectionDB();  
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("DELETE FROM event WHERE idevent="+event.getEventId()+";");		 
		 //JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		 estatuto.close();  
		 conex.closeConnection();     
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  
		 } 
	 
	 
	 
	 public void updateevent(Event event) {
			
			ConnectionDB conex= new ConnectionDB(); 
			 try {    
			Statement estatuto = conex.getConnection().createStatement();
			 estatuto.executeUpdate("UPDATE FROM event SET (" 
			 		+"Name="+event.getName()+"'," 
			 		+"Description="+event.getDescription()+"', " 
			 		+"Place="+event.getPlace()+"'," 
			 		+"StartTime="+event.getStarttime()+"'," 
			 		+"Duration="+event.getDuration()+"'," 
			 		+"Event_Type="+event.getEventType()+"'," 
			 		+"Seats_available="+event.getSeatsAvailable()+") WHERE IdEvent="+event.getEventId()+";");	
			 		
			 //JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
			 estatuto.close();  
			 conex.closeConnection();    
			 } catch (SQLException e) {         
				 System.out.println(e.getMessage());  
				 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
				 }  	
			
			
			
		}
	 
	
}
