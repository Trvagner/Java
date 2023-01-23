package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>() ;//Colocar <> bloqueia para que o tipo específico declarado seja permitido
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		
		System.out.println("Tamanho: " + lista.size());
		//estando <Conta> não necessita do Cast(Conta)
		Conta ref = (Conta)lista.get(0); // Cast(Conta)=> Torna a referencia generica mais especifica
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("----------");
		
		//for(Object oRef : lista) {
			//System.out.println(oRef); // seria usado sem <Conta>
		
		//busca somente a posiçao, pode ser escrito dessa maneira
		//mais compacto
		// conhecido como foreach
		for(Conta conta : lista) {
			System.out.println(conta);// com uso do <Conta>
		}
		

	}

}
