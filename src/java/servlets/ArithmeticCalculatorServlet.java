package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anmolpreet
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String type = request.getParameter("cal");
        double result = 0;
        double intFirst = 0;
        double intSecond = 0;
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        try {
            if ((first != null && !first.equals("")) && (second != null && !second.equals(""))) {
                intFirst = Double.parseDouble(first);
                intSecond = Double.parseDouble(second);
                switch (type) {
                    case "+":
                        result = intFirst + intSecond;
                        break;
                    case "-":
                        result = intFirst - intSecond;
                        break;
                    case "*":
                        result = intFirst * intSecond;
                        break;
                    case "%":
                        result = intFirst % intSecond;
                        break;
                }
                request.setAttribute("result", result);
            } else {
                request.setAttribute("result", "invalid");
            }
        } catch (Exception e) {
            request.setAttribute("result", "invalid");
        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);

    }

}
