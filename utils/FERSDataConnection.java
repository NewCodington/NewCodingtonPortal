/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codingtonportal.model.utils;
import java.sql.*;

/*import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;*/

/**
 *
 * @author 
 */

public class FERSDataConnection{
     // las variables hay que cambiarlas
    private String url= "jdbc:oracle:thin:@localhost:1521:xe";  
    private String user= "system";
    private String pass="791988";
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getUser (){
		return user;
	}
	
	public void setUser (String user){
		this.user= user;
	}
	
	public String getPass (){
		return pass;
	}
	
	public void setPass(String pass){
		this.pass=pass;
	}
    
  public Connection Conectar(){
      Connection link = null;
      try{
          //Cargamos el driver que está en libraries mysql y establecemos la conexión.
          Class.forName("oracle.jdbc.driver.OracleDriver");
          link = DriverManager.getConnection(this.url, this.user, this.pass);
          /*if (link != null) JOptionPane.showMessageDialog(null, "Conexión exitosa");  
          else JOptionPane.showMessageDialog(null, "Conexión fallida\n");*/
          // JOptionPane sería cambiarlos en a interfaz.
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex);
      }
      return link;
  }
    
}
