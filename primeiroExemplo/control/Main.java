package br.edu.ifsul.primeiroExemplo.control;

import br.edu.ifsul.primeiroExemplo.model.Carro;
import br.edu.ifsul.primeiroExemplo.model.Conta;
import br.edu.ifsul.primeiroExemplo.model.Funcionario;
import br.edu.ifsul.primeiroExemplo.model.Produto;

public class Main {

    public static void main(String[] args) {
	Produto produto = new Produto();
	    System.out.println(produto);
        System.out.println(produto.getValor());

	Carro carro = new Carro();
        System.out.println(carro);
        System.out.println(carro.getMarca());


        Funcionario funcionario = new Funcionario();
        System.out.println(funcionario);
        System.out.println(funcionario.getSalario());

        Conta conta - new Conta();
        System.out.println(conta);
        System.out.println(conta.getSaldo());

    }
}
