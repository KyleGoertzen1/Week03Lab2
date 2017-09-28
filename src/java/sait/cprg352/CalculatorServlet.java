/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import business.CalcBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 729347
 */
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //getServletContext().getRequestDispatcher("/WEB-INF/legacyJSP.jsp").forward(request, response);
        CalcBean cb = new CalcBean();
        
        String firstNum = request.getParameter("first");
        String secondNum = request.getParameter("second");
        String operand = request.getParameter("operation");
        
        cb.setFirstNumber(firstNum);
        cb.setSecondNumber(secondNum);
        
        if(operand != null){
            char operationType = operand.charAt(0);
            System.out.println(operationType);

            if(operationType == '+'){
                cb.setAnswer((Integer.parseInt(firstNum) + Integer.parseInt(secondNum)));
            }

            System.out.println(cb.answer);
            int answer = cb.getAnswer();
            request.setAttribute("answer", answer);
        }
        
        if(operand != null){
            char operationType = operand.charAt(0);
            System.out.println(operationType);

            if(operationType == '-'){
                cb.setAnswer((Integer.parseInt(firstNum) - Integer.parseInt(secondNum)));
            }

            System.out.println(cb.answer);
            int answer = cb.getAnswer();
            request.setAttribute("answer", answer);
        }
        
        if(operand != null){
            char operationType = operand.charAt(0);
            System.out.println(operationType);

            if(operationType == '*'){
                cb.setAnswer((Integer.parseInt(firstNum) * Integer.parseInt(secondNum)));
            }

            System.out.println(cb.answer);
            int answer = cb.getAnswer();
            request.setAttribute("answer", answer);
        }
        
        if(operand != null){
            char operationType = operand.charAt(0);
            System.out.println(operationType);

            if(operationType == '%'){
                cb.setAnswer((Integer.parseInt(firstNum) % Integer.parseInt(secondNum)));
            }

            System.out.println(cb.answer);
            int answer = cb.getAnswer();
            request.setAttribute("answer", answer);
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/legacyJSP.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //getServletContext().getRequestDispatcher("/WEB-INF/legacyJSP.jsp").forward(request, response);
    }
}
