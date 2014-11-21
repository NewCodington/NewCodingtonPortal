package codingtonportal.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;

import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import codingtonportal.model.domain.Place;


public class ImageConversion {
    /**
     * @throws ClassNotFoundException 
	 * 
	 */

	public InputStream insertImage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException {        
        //PrintWriter out = response.getWriter();
         DiskFileItemFactory factory = new DiskFileItemFactory();            
        ServletFileUpload sfu  = new ServletFileUpload(factory);
        
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
       
        InputStream input = null;
		FERSDataConnection conex= new FERSDataConnection();
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
			PreparedStatement statementSQL = conex.getConnection().prepareStatement
					("insert into codington.prueba_ester values (?,?,?);");
			statementSQL.setString(1, "name");
			statementSQL.setBlob(2, input);
			statementSQL.setInt(3, 41);
			statementSQL.executeUpdate();
			statementSQL.close();
			
		}catch(SQLException e){		
		}
		return input;
				
	}	
//	public String getPath() throws UnsupportedEncodingException{
//	    URL r = getClass().getResource("/");
//		String decoded = URLDecoder.decode(r.getFile(), "UTF-8");
//		if(decoded.startsWith("/"))decoded = decoded.replaceFirst("/", "");
//		File f = new File(decoded, "org/config/myApp.properties");
//		f.getPath();
//		System.out.println((new StringBuilder("getPath ")).append(f.getPath()).toString());
//		return f.getPath();    
//		}
	
public Blob ShowImage() throws IOException, ClassNotFoundException{
	
	FERSDataConnection conex= new FERSDataConnection(); 
	ArrayList <Place> selection = new ArrayList <Place>();
	Blob imBlob = null;
	try{			
		Statement sentencia = (conex.getConnection()).createStatement();
		ResultSet outdata= sentencia.executeQuery("select imagen from codington.prueba_ester");			
		while (outdata.next()){
			Place  places = new Place();
			imBlob=outdata.getBlob("imagen");
			places.setImage(outdata.getBlob("imagen"));				
			selection.add(places);
		}
		for (Place element : selection)
			System.out.println("Soy Image fea: \n"+	element.getImage());
	
	}catch(SQLException e){		
		System.out.println("Ai mai ay problemas\n" + e);
		return null;
	}	

	return imBlob;
}

}
       
            		

            
            
            
            
           /* 
            
            if (! ServletFileUpload.isMultipartContent(request)) {
                System.out.println("sorry. No file uploaded");
                //return;
            }

            // parse request
            List<FileItem> items = sfu.parseRequest(request);        

            // get uploaded file
            FileItem file = (FileItem) items.get(2);
                        
            // Connect to Oracle
            
            PreparedStatement statementSQL = conex.getConnection().prepareStatement	("insert into codington.prueba_ester values (?,?,?);");
        	statementSQL.setString(1, "Hola");
            // size must be converted to int otherwise it results in error
			statementSQL.setBinaryStream(2, file.getInputStream(), (int) file.getSize());
			statementSQL.setInt(3, 42);
			statementSQL.executeUpdate();		
            
            conex.close();
            out.println("Proto Added Successfully. <p> <a href='listphotos'>List Photos </a>");
        }
        catch(Exception ex) {
            out.println( "Error --> " + ex.getMessage());
            System.out.println(ex);
        }
        }
}*/