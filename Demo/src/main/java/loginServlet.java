import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("init() invoked");
	}
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			System.out.println("service() invoked");
			String userName = req.getParameter("uname");
			String password = req.getParameter("password");
			System.out.println(userName +" : " +password);
			resp.getWriter().print("Welcome  ! "+userName);
			if("Aditya".equals(userName) && "12345".equals(password)) {
				req.getRequestDispatcher("/home.html").forward(req, resp);
			}else {
				req.setAttribute("msg", "Invalid user credentil please try again..");
				req.getRequestDispatcher("/jsp/index.jsp").forward(req, resp);
			}
		}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doPost() invoked");
		String userName = req.getParameter("uname");
		String password = req.getParameter("password");
		System.out.println(userName +" : " +password);
		resp.getWriter().print("Welcome  ! "+userName);
	}
	@Override
	public void destroy() {
		System.out.println("destroy() invoked");
	}
}
