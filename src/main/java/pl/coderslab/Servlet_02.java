package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/servlet02")
public class Servlet_02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Airport> airports = AirportDao.getList();
//        List<Airport> airports = new ArrayList<>();
//
//        airports.add(new Airport("name1","code1", "time1"));
//        airports.add(new Airport("name2","code2", "time2"));

        req.setAttribute("airports", airports);

        getServletContext().getRequestDispatcher("/airports.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().append(req.getParameter("departureAirport") + " " + req.getParameter("arrivalAirport") +
                " " + req.getParameter("startTime") + " " + req.getParameter("flightLength") + " " +
                req.getParameter("price"));
    }
}
