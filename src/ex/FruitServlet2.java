//練習問題8-2
package ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FruitServlet2
 */
@WebServlet("/FruitServlet2")
public class FruitServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Fruit f = new Fruit("いちご", 700);
		HttpSession session = request.getSession();
		session.setAttribute("fruit", f);
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/ex/fruit2.jsp");
		d.forward(request, response);
	}

}
