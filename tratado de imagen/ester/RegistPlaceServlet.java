package codingtonportal.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import codingtonportal.model.domain.Place;
import codingtonportal.model.domain.TypePlace;
import codingtonportal.model.services.PlaceServiceImpl;
import codingtonportal.utils.ImageConversion;
import codingtonportal.model.services.TypePlaceServiceImpl;



/**
 * Servlet implementation class SigninServlet
 */
@WebServlet(description = "Servlet for Regist Place", urlPatterns = { "/registerPlace" })
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
		HttpSession session = request.getSession();
		ArrayList<TypePlace> listTypePlace = null;
		TypePlaceServiceImpl typePlaceService=new TypePlaceServiceImpl();
		
		if(session.getAttribute("Error")!= null && !session.getAttribute("Error").toString().equals(""))
		{
			response.sendRedirect("registerPlace.jsp");
		}
		else
		{
			if(session.getAttribute("ViewSuccess")!= null && session.getAttribute("ViewSuccess").toString().equals("YES")){
				session.setAttribute("Error", null);
				
				response.sendRedirect("admin");
			}
			else {
				session.setAttribute("Error", null);
				session.setAttribute("Success", null);
				
				try {
					listTypePlace = typePlaceService.viewTypePlace();
					
					session.setAttribute("LISTTYPEPLACE", listTypePlace);
					response.sendRedirect("registerPlace.jsp");
					
				} catch (NamingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}				
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		HttpSession session = request.getSession();
		
		Place place=new Place();
		PlaceServiceImpl  placeService = new PlaceServiceImpl();
		
	
		try {
			place.setName(request.getParameter("placeName"));
			place.setDescription(request.getParameter("description"));
			//place.setImage(request.getParameter("image"));
			/*ImageConversion hol = new ImageConversion();
			InputStream in = null;
			Blob imagen;
			try {
				in = hol.insertImage(request, response);			
				imagen = hol.ShowImage();
				//System.out.println(" hola   "+ imagen);
				place.setImage(imagen);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			place.setAddress(request.getParameter("address"));
			place.setTypePlace(Integer.parseInt(request.getParameter("typePlace")));
			
			if(placeService.insertPlace(place) > 0){
				session.setAttribute("Success", "Successfully Place created ");
				session.setAttribute("ViewSuccess", "YES");
			}else{
				session.setAttribute("Error", "Incorrect Place values");
			}
			
			response.sendRedirect("registerPlace");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
