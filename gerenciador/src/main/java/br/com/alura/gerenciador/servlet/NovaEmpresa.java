package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.model.Banco;
import br.com.alura.gerenciador.model.Empresa;

@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresa extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

	String nome = request.getParameter("nome");
	String endereco = request.getParameter("endereco");

	Empresa empresa = new Empresa(0, nome, endereco);
	Banco banco = new Banco();

	banco.adiciona(empresa);

	PrintWriter writer = response.getWriter();
	response.setContentType("text/html");
	writer.print("<html><body><h1>Cadastrada Empresa</h1><br>nome: " + nome + "<br> Endereço: " + endereco + "</body></html>");
	response.sendRedirect("/gerenciador/listaEmpresas");

    }
}
