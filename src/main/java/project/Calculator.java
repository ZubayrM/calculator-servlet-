package project;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.regex.Pattern;


//@WebServlet("/")
public class Calculator extends HttpServlet {

    private Pattern minus = Pattern.compile("\\d+\\s\\u002D\\s\\d+");
    private Pattern plus = Pattern.compile("\\d+\\s\\u002B\\s\\d+");
    private Pattern divide = Pattern.compile("\\d+\\s\\u002F\\s\\d+");
    private Pattern multiply = Pattern.compile("\\d+\\s\\u002A\\s\\d+");

    private String numbers = "";

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("myText", numbers);
        req.getRequestDispatcher("calculator.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        req.setCharacterEncoding("UTF-8");
        String button = req.getParameter("button");

        switch (button){
            case "C":
                numbers = "";
                break;
            case "delete":
                numbers = numbers.substring(0, numbers.length() > 0 ? numbers.length()-1 : 0);
                break;
            case "+\u002F-":
                numbers = numbers.startsWith("-") ? numbers.substring(1) : "-".concat(numbers);
            case "=":

                numbers = numbers.replace(",", ".");
                String[] s = numbers.split("\\s");

                if (s.length > 3){
                    throw new IOException();
                }

                double numOne = Double.parseDouble(s[0]);
                double numTwo = Double.parseDouble(s[2]);
                double result = getResultArithmetic(numOne, numTwo);
                numbers = String.valueOf(result);
                numbers = numbers.replace(".", ",");
                break;

            default:
                numbers += button;
        }


        req.setAttribute("myText", numbers);
        req.getRequestDispatcher("calculator.jsp").forward(req, resp);


    }

    private double getResultArithmetic(double numOne, double numTwo ) {
        double result = 0;
        if (minus.matcher(numbers).find()){
            result = (numOne - numTwo);
        }
        else if (plus.matcher(numbers).find()){
            result = (numOne + numTwo);
        }
        else if (divide.matcher(numbers).find()){
            result = (numOne / numTwo);
        }
        else if (multiply.matcher(numbers).find()){
            result = (numOne* numTwo);
        }
        return result;
    }
}
