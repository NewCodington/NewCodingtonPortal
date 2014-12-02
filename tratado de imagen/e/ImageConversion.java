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

	/*public Place insertImage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, NamingException {        
        DiskFileItemFactory factory = new DiskFileItemFactory();            
        ServletFileUpload sfu  = new ServletFileUpload(factory);
        //PlaceServiceImpl  placeService = new PlaceServiceImpl();
        Place place=new Place();     
        InputStream input= null;
  		FERSDataConnection conex= new FERSDataConnection();
  		PreparedStatement statementSQL = null;
        
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
       
  

		try {
			ArrayList<Object> extra = new ArrayList <Object>();
			
			for (FileItem fileItem : items){
				
	            if (fileItem.isFormField()) {
	                 
	                // Regular form fields like Submit button, etc
	                String fieldName = fileItem.getFieldName();
	                String fieldValue = fileItem.getString();
	                extra.add(fieldValue);
	                
	            } else {
	                 
	                // File Item
	               String fieldName = fileItem.getFieldName();
	               String fileName = fileItem.getName();
	               String contentType = fileItem.getContentType();	                
	                // Here you can get the file item as InputStream
	                // and do further processing on the file.
	                input = fileItem.getInputStream();
	                System.out.println(fileItem.getInputStream());
	                
	            }            
			  
			}
			System.out.println(input);		
			place.setName((String) extra.get(0));					
			place.setDescription((String)extra.get(1));	
			place.setImage(input);									
			place.setAddress((String)extra.get(2));
			place.setTypePlace(Integer.parseInt(extra.get(3).toString()));	
			
			 // parse request
			
            /*FileItem file = (FileItem) (items.get(3));
            String Name2 = items.get(2).getName();
            String Name3 = items.get(3).getName();*/
            
	/*	} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//System.out.println(input);
		try{
		

			statementSQL = conex.getConnection().prepareStatement("INSERT INTO codington.aux_image VALUES (?);");
			//statementSQL.setBlob(1, input);	
			statementSQL.setBlob(1, input);
			statementSQL.executeUpdate();
			System.out.println("Inserte"+ input);
			statementSQL.close();
			conex.close();
		
			
		}catch(SQLException e){		
		}
		//place.setImage(this.showImage());
		return place;
				
	}	*/
	
	

	public void insertImage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, NamingException {        
        //PrintWriter out = response.getWriter();
         DiskFileItemFactory factory = new DiskFileItemFactory();            
        ServletFileUpload sfu  = new ServletFileUpload(factory);
        InputStream input = null;
    	FERSDataConnection conex= new FERSDataConnection();
        
        if (!ServletFileUpload.isMultipartContent(request)) {
            System.out.println("sorry. No file uploaded");
            //return;
        }
        List<FileItem> items = null;
        try {

			items = sfu.parseRequest(request);
		} catch (FileUploadException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
       
    
		//String url = request.getParameter("image");

		
	//	File photo = null;
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

			  //if (fileItem.getContentType().indexOf("application/x-zip-compressed") == -1) {
			  //  throw new FileUploadException("Not a process archive");
			  //}
			  
			  
			}
			 // parse request
			System.out.print("d");
            /*FileItem  id = (FileItem) items.get(0);
   //         String photoid =  id.getString();
            
            FileItem title = (FileItem) items.get(1);
            //String   phototitle =  title.getString();

            // get uploaded file
           // FileItem file = (FileItem) items.get(2);
            FileItem file = (FileItem) (items.get(3));
            String Name2 = items.get(2).getName();
            String Name3 = items.get(3).getName();
            
            //Strin
             * g fileName = request.getSession().getServletContext().getRealPath("/")+ "images" + "/" + file.getName();
            String fileName = file.getName();
            OutputStream outputStream = new FileOutputStream(fileName);
            InputStream inputStream = file.getInputStream();
            
            int readBytes = 0;
            
            while ((readBytes = inputStream.read(buffer, 0, 10000)) != -1) {
                    outputStream.write(buffer, 0, readBytes);
            }
            
            
            outputStream.close();
            inputStream.close();
            
            if(file.getName()!= null){
                System.out.println("<td><img width='100' heigth='100' src="+ request.getContextPath() + "/images/"+ file.getName() + "></td>");
        } */
			
            
            //file.write(photo);
            //File temp = photo.createTempFile("temp", ".tmp");
     //System.out.println (temp.getAbsolutePath());
     
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try{
			
			//FileInputStream image = new FileInputStream (photo);
			PreparedStatement statementSQL = conex.getConnection().prepareStatement ("insert into codington.prueba_ester values (?,?,?);");
			statementSQL.setString(1, "porqwue");
			statementSQL.setBlob(2, input);
			statementSQL.setInt(3, 41);
			statementSQL.executeUpdate();
			statementSQL.close();
			conex.close();
			
		}catch(SQLException e){		
		}
				
	}

	public Blob  showImage() throws IOException, ClassNotFoundException, NamingException{
	
	FERSDataConnection conex= new FERSDataConnection();	
	Blob imBlob = null;	

	try{			
		Statement sentencia = (conex.getConnection()).createStatement();
		ResultSet outdata= sentencia.executeQuery("select * from codington.aux_image");
		
		if (outdata.next()){
		

			imBlob= outdata.getBlob(1);
			//places.setImage(outdata.getBlob("imagen"));				
			
		}
		
		System.out.println("Soy Image fea: \n"+	imBlob);
	
	}catch(SQLException e){		
		System.out.println("Ai mai ay problemas\n" + e);
		//return null;
	}	

	return imBlob;
}

}
