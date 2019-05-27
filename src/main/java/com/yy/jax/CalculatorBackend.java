package com.yy.jax;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet("/CalculatorBackend")
public class CalculatorBackend extends HttpServlet {

    String operation;
    double num1, num2, result;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();

        operation = req.getParameter("operation");
        num1 = Double.parseDouble(req.getParameter("num1"));
        num2 = Double.parseDouble(req.getParameter("num2"));

        Calculate();

        out.println(result);
    }


    public void Calculate ()
    {
        switch(operation)
        {
            case "Addition":
                result = num1 + num2;
                break;
            case "Subtraction":
                result = num1 - num2;
                break;
            case "Multiplication":
                result = num1 * num2;
                break;
            case "Division":
                result = num1 / num2;
                break;
        }
    }
}
