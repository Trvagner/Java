package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura";//object literal
		
		String outra = nome.replace("A", "a");//uma mudança gera uma nova string
		
		nome.toLowerCase();//todos minusculas
		
		nome.toUpperCase();//todas maíusculas
		
		System.out.println(nome);
		System.out.println(outra);

	}

}
