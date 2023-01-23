package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {
	
	//Array[] colchetes com dados, associados a um tipo de variável

	public static void main(String[] args) {
		
		int[] idades = new int[5]; // inicializa o array com valores padrão// no caso do tipo int=0;
		
//		idades[0]=29;
//		idades[1]=39;
//		idades[2]=49;
//		idades[3]=19;
//		idades[4]=69;
//		
//		int idade1 = idades[3]; 
//		
//		System.out.println(idade1);
//		
//		System.out.println(idades.length);
		
		for(int i =0; i < idades.length; i++) {
			idades[i] = i*i;
		}
		

		for(int i =0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		// Forma literal...direta de se escrever o array de primitivo
		
		int[] refs = {1,2,3,4,5};
		
		refs[2]=6;
		
		System.out.println(refs[0]);
	}

}
