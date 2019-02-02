package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MadLibConverter;

/**
 * Servlet implementation class getMadLibServlet2
 */
@WebServlet("/getMadLibServlet2")
public class getMadLibServlet2 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getMadLibServlet2() 
    {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// By looking at the assignment I thought this was the way to pass the attribute created in the first jsp..
		// But after trying many different methods I couldn't get this to work correctly after getting it again so I gave up..
		// And displayed the first madLib on index.jsp. If there is a better way to do it please let me know.
		//String createdMadLibStory = (String) request.getAttribute("createdMadLib");
		
		String userFifthAdj = request.getParameter("userFifthAdj");
		String userSecondNoun = request.getParameter("userSecondNoun");
		String userAnimal = request.getParameter("userAnimal");
		String userNoise = request.getParameter("userNoise");
		
		MadLibConverter createdMadLibStory2 = new MadLibConverter(userFifthAdj, userSecondNoun, userAnimal, userNoise);
		
		
		request.setAttribute("createdMadLib2", createdMadLibStory2);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
