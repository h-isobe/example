//練習問題12-2 EL式
package ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FruitServlet4
 */
@WebServlet("/FruitServlet4")
public class FruitServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Fruit f = new Fruit("いちご", 700);
		ServletContext application = this.getServletContext();
		application.setAttribute("fruit", f);
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/ex/fruit4.jsp");
		d.forward(request, response);
	}

}
