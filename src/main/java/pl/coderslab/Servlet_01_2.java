package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet012")
public class Servlet_01_2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String language = req.getParameter("language");
        resp.getWriter().append("ciasteczko ustawione: " + language);
        Cookie cookie = new Cookie("language", language);
        cookie.setMaxAge(3600);
        resp.addCookie(cookie);

    }
}
