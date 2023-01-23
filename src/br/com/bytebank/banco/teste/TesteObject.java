package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
	//	System.out.println("x");
	//	System.out.println(3);
	//	System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(222,333);
		ContaPoupanca cp = new ContaPoupanca(12, 150);
		
		//System.out.println(cc.toString()); Objeto da classe Object, devolve informação e pode ser sobreecrito
		System.out.println(cc);
		//System.out.println(cp.toString());
		System.out.println(cp);

	}

}
