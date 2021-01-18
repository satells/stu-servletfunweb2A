package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.model.Banco;
import br.com.alura.gerenciador.model.Empresa;

@WebServlet(urlPatterns = "/listaEmpresas")
public class ListaEmpresas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	Banco banco = new Banco();
	List<Empresa> empresas = banco.getEmpresas();
	request.setAttribute("empresas", empresas);

	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/paginas/listaEmpresas.jsp");
	dispatcher.forward(request, response);

    }
}