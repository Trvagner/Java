package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		//ContaCorrente[] contas = new ContaCorrente[5];
		Conta[] referencias= new Conta[5];
		
		
		ContaCorrente cc1 = new ContaCorrente(10, 45);
		ContaCorrente cc2 = new ContaCorrente(10, 52);
		ContaPoupanca cc3 = new ContaPoupanca(10, 55);
		
		referencias[0]= cc1;
		referencias[1]= cc2;
		referencias[2]= cc3;
		
		//System.out.println(cc2.getNumero());
		System.out.println(referencias[1].getNumero());
		
		Conta ref = referencias[1];
		//ContaPoupanca ref = (ContaPoupanca) contas[1];//type cast
		
		System.out.println(ref.getNumero());
		
	}
}
