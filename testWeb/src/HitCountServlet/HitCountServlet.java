package HitCountServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HitCountServlet
 */
@WebServlet("/HitCountServlet")
public class HitCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HitCountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	PrintWriter out =  response.getWriter();
	response.setContentType("text/html");
	HttpSession session = request.getSession(true);
	Integer count = (Integer) session.getAttribute("hitCount");
	if(count == null) {
		count = new Integer(1);
	}else {
		count++;
	}
	session.setAttribute("hitCount", count);
	out.println(" <h3> You Visited here " + count + " time(s)!</h3>");
	}

}
