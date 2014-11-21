package codingtonportal.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/*import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;*/

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.Statement;

/*import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import codingtonportal.model.domain.Event;*/
import codingtonportal.model.domain.Place;
//import codingtonportal.model.services.EventServiceImpl;
import codingtonportal.model.services.PlaceServiceImpl;
import codingtonportal.utils.FERSDataConnection;
import codingtonportal.utils.ImageConversion;



/**
 * Servlet implementation class SigninServlet
 */
@WebServlet(description = "Servlet for Regist Place", urlPatterns = { "/RegistPlaceServlet" })
public class RegistPlaceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistPlaceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		RequestDispatcher dispatcher=request.getRequestDispatcher("/registPlace.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		
		Place place=new Place();
		PlaceServiceImpl  placeService = new PlaceServiceImpl();
		ImageConversion img = new ImageConversion();
	
		
	    
		place.setName(request.getParameter("placeName"));		
		place.setDescription(request.getParameter("description"));		
		place.setRegion(request.getParameter("region"));	
		/**Imagen cambiar*/
		InputStream in = null;
		
		try {
			in = img.insertImage(request, response);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		

 
		//place.setImage(request.getParameter("image"));		
		//place.setAddress(request.getParameter("address"));
		//place.setTypePlace(Integer.parseInt(request.getParameter("typePlace")));
		
		//Falta incluir la fecha y el tiempo que dura
	
		if(true){
			HttpSession session=request.getSession();
			try {
				session.setAttribute("IMAGEN", img.ShowImage());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				RequestDispatcher dispatcher=request.getRequestDispatcher("imagen.jsp");//"/registPlace.jsp?msg=Evento creado con éxito");
				dispatcher.forward(request, response);

		}else{
			RequestDispatcher dispatcher=request.getRequestDispatcher("/registPlace.jsp?msg=Incorrect");
			dispatcher.forward(request, response);
		}
	}

}
