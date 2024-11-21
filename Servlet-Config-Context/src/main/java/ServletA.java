import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletA  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletConfig servletConfig = getServletConfig();
		System.out.println(servletConfig);
		ServletContext servletContext = getServletContext();
		System.out.println(servletContext);
		
		String initParameter = servletContext.getInitParameter("app_name");
		System.out.println(initParameter);
		String initParameter2 = servletConfig.getInitParameter("website_name");
		System.out.println(initParameter2);
		
		int rup_doller = Integer.parseInt(getInitParameter("rupee_in_one_doller"));
		System.out.println(rup_doller*70);
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("Servlet A ");




	}  

}
