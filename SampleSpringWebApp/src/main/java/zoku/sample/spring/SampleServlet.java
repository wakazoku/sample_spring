package zoku.sample.spring;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/sample")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ApplicationContext app;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init();
		app = new ClassPathXmlApplicationContext("/spring/application-config.xml");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SampleBean samplebean1 = (SampleBean)app.getBean("samplebean1");
		request.setAttribute("samplebean", samplebean1);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String message = request.getParameter("message");
		SampleBean samplebean1 = (SampleBean)app.getBean("samplebean1");
		samplebean1.addMessage(message);
		response.sendRedirect("sample");
	}

}
