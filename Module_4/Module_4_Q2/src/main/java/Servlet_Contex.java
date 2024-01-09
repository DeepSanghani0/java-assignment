import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet_Contex extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    // Get the ServletContext object
    ServletContext context = getServletContext();

    // Get the value of the initialization parameter
    String database = context.getInitParameter("database");

    // Write the value to the response
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<h1>The database is: " + database + "</h1>");
  }
}
