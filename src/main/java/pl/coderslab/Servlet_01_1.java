package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/Servlet011")
public class Servlet_01_1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> lang = new HashMap<>();
        lang.put("en", "Hello");
        lang.put("pl", "Cześć");
        lang.put("de", "Ehre");
        lang.put("es", "Hola");
        lang.put("fr", "Bienvenue");

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        String form = "<form method=\"post\" action=\"/Homework_04_war_exploded/Servlet011\">\n" +
                "    <label for=\"languageId\">Wybierz jezyk:</label>\n" +
                "    <select id=\"languageId\" name=\"language\">\n" +
                "        <option value=\"en\">en</option>\n" +
                "        <option value=\"pl\">pl</option>\n" +
                "        <option value=\"de\">de</option>\n" +
                "        <option value=\"es\">es</option>\n" +
                "        <option value=\"fr\">fr</option>\n" +
                "    </select>\n" +
                "    <button type=\"submit\">send</button>\n" +
                "</form>";

        resp.getWriter().append(form);
        Cookie[] cookies = req.getCookies();
        String cookieName = "language";

        for (Cookie cookie : cookies) {
            if (cookieName.equals(cookie.getName())) {
                resp.getWriter().append(lang.get(cookie.getValue()));
                return;
            } else {
                resp.getWriter().append(lang.get("pl"));
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        getServletContext().getRequestDispatcher("/Servlet012")
                .forward(req,resp);

    }
}
