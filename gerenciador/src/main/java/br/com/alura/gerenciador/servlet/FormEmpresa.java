package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/formEmpresa")
public class FormEmpresa extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	HttpServletRequestDebug.debugRequest(request);
	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/paginas/formNovaEmpresa.jsp");
	dispatcher.forward(request, response);

    }
}
