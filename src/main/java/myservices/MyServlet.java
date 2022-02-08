package myservices;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    private static String index = "/WEB-INF/view/index.jsp";

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher(index).forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> MyServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Data</h1>");
        out.println("Name: " + req.getParameter("Name") + "<br>");
        out.println("Age: " + req.getParameter("Age") + "<br>");
        out.println("<a href='/page'>Go back!</a>");
        out.println("</body>");
        out.println("</html>");
        //req.getRequestDispatcher(index).forward(req, resp);
    }
}
