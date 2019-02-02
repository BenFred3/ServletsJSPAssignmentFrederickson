package controller;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MadLibConverter;

/**
 * Servlet implementation class getMadLibServlet
 */
@WebServlet("/getMadLibServlet")
public class getMadLibServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getMadLibServlet() 
    {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String userColor = request.getParameter("userColor");
		String userSuperlative = request.getParameter("userSuperlative");
		String userFirstAdj = request.getParameter("userFirstAdj");
		String userPluralBodyPart = request.getParameter("userPluralBodyPart");
		String userBodyPart = request.getParameter("userBodyPart");
		String userNoun = request.getParameter("userNoun");
		String userPluralAnimal = request.getParameter("userPluralAnimal");
		String userSecondAdj = request.getParameter("userSecondAdj");
		String userThirdAdj = request.getParameter("userThirdAdj");
		String userFourthAdj = request.getParameter("userFourthAdj");
		
		MadLibConverter createdMadLibStory = new MadLibConverter(userColor, userSuperlative, userFirstAdj, userPluralBodyPart,
				userBodyPart, userNoun, userPluralAnimal, userSecondAdj, userThirdAdj, userFourthAdj);
		
		request.setAttribute("createdMadLib", createdMadLibStory);
		
		getServletContext().getRequestDispatcher("/index2.jsp").forward(request, response);
	}

}
