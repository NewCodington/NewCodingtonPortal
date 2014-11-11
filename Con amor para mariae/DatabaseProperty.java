package codingtonportal.utils.classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DatabaseProperty extends Property {

	@Override
	public String getProperty(String property) throws IOException {
		Properties p = new Properties();    
		InputStream input = null;
		
		input = new FileInputStream("./src/codingtonportal/utils/files/conexion.properties");         
		
		// Se carga el archivo de propiedades        
		p.load(input);         
		
		// Se obtiene la propiedad y se devuelve              
		return p.getProperty(property);
	}

}
