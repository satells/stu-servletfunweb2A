package br.com.alura.gerenciador.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {

    private static final List<Empresa> empresas = new ArrayList<Empresa>();
    static {
	empresas.add(new Empresa(1, "Biscoitos Souza Ltda", "Avenida Paulista, 156 - 9� andar"));
	empresas.add(new Empresa(2, "Confec��es Lindinha Ltda", "Avenida Barra Funda, 300"));
	empresas.add(new Empresa(3, "Lojas Casa Nova Ltda", "Avenida Lim�o, 300/301"));
    }

    public void adiciona(Empresa empresa) {
	Banco.empresas.add(empresa);
    }

    public List<Empresa> getEmpresas() {
	return Collections.unmodifiableList(Banco.empresas);
    }

}
