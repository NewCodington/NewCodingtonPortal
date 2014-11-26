package codingtonportal.utils;




import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import codingtonportal.model.domain.Place;
import codingtonportal.model.services.PlaceServiceImpl;


public class ImageConversion {
    /**
     * @throws ClassNotFoundException 
     * @throws NamingException 
	 * 
	 */

	public InputStream insertImage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, NamingException {        
        DiskFileItemFactory factory = new DiskFileItemFactory();            
        ServletFileUpload sfu  = new ServletFileUpload(factory);
        PlaceServiceImpl  placeService = new PlaceServiceImpl();
        
        if (!ServletFileUpload.isMultipartContent(request)) {
            System.out.println("sorry. No file uploaded");
        }
        
        List<FileItem> items = null;
        try {

			items = sfu.parseRequest(request);
		} catch (FileUploadException e1) {
			// TODO Auto-generated catch block			
			e1.printStackTrace();
		}
       
        InputStream input = null;
		FERSDataConnection conex= new FERSDataConnection();

		try {
			for (FileItem fileItem : items){
				
	            if (fileItem.isFormField()) {
	                 
	                // Regular form fields like Submit button, etc
	                String fieldName = fileItem.getFieldName();
	                String fieldValue = fileItem.getString();
	            } else {
	                 
	                // File Item
	               String fieldName = fileItem.getFieldName();
	                String fileName = fileItem.getName();
	                String contentType = fileItem.getContentType();
	                 
	                // Here you can get the file item as InputStream
	                // and do further processing on the file.
	                input = fileItem.getInputStream();
	            }
			  
			}
			 // parse request
			System.out.print("d");

            /*FileItem file = (FileItem) (items.get(3));
            String Name2 = items.get(2).getName();
            String Name3 = items.get(3).getName();*/
            
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try{
			
			PreparedStatement statementSQL = conex.getConnection().prepareStatement	("insert into codington.prueba_ester (imagen) values (?);");			
			statementSQL.setBlob(1, input);			
			statementSQL.executeUpdate();
			statementSQL.close();
			
		}catch(SQLException e){		
		}
		return input;
				
	}	
	

	public Blob  ShowImage() throws IOException, ClassNotFoundException, NamingException{
	
	FERSDataConnection conex= new FERSDataConnection();	
	Blob imBlob = null;	
    PlaceServiceImpl  placeService = new PlaceServiceImpl();
	try{			
		Statement sentencia = (conex.getConnection()).createStatement();
		ResultSet outdata= sentencia.executeQuery("select imagen from codington.prueba_ester");
		
		if (outdata.next()){
		
			Place  places = new Place();
			imBlob=outdata.getBlob("imagen");
			places.setImage(outdata.getBlob("imagen"));				
			
		}
		
		System.out.println("Soy Image fea: \n"+	imBlob);
	
	}catch(SQLException e){		
		System.out.println("Ai mai ay problemas\n" + e);
		//return null;
	}	

	return imBlob;
}

}
