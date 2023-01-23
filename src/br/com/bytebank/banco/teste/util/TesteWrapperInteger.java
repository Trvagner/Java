package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		int[] idades = new int[5];//primitivo
		String[] nomes = new String[5];//referencias
		
		int idade = 29;//Integer**transforma primitivo em objeto, referencia
		
		//Integer idadeRef = new Integer(29);
		Integer idadeRef = Integer.valueOf(29);//metodo cria objeto a partir do primitivo
		
		
		int valor = idadeRef.intValue();//unboxing da referencia retorna o primitivo
		String s = args[0]; //"10"
		//Integer numero = Integer.valueOf(s);//parseInt...transforma string em inteiro
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		
		
		List <Integer>numeros = new ArrayList<Integer>();
		numeros.add(29);//Autoboxing

	}

}
