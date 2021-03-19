//練習問題9-2 アプリケーションスコープ
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
 * Servlet implementation class FruitSevlet3
 */
@WebServlet("/FruitSevlet3")
public class FruitServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Fruit f = new Fruit("いちご", 700);
		ServletContext application = this.getServletContext();
		application.setAttribute("fruit", f);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/ex/fruit3.jsp");
		dispatcher.forward(request, response);
	}

}
