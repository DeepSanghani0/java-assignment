import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class StudentServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

        
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String gender = request.getParameter("gender");
        String password = request.getParameter("password");

        request.setAttribute("fname",fname);
        request.setAttribute("lname", lname);
        request.setAttribute("email", email);
        request.setAttribute("mobile", mobile);
        request.setAttribute("gender", gender);
        request.setAttribute("password", password);
        
        RequestDispatcher rd = request.getRequestDispatcher("StudentData.jsp");
        rd.forward(request, response);

    }
}
