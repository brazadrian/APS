package exercicios;

import java.util.Scanner;

public class Cifra_de_cesar {

	public static void main(String[] args) {
		
		// Declara��o de vari�veis
		String mensagem_plana;
		int chave;
		Scanner sc = new Scanner(System.in);		
		String mensagem_codificada = "";
		
		// Entrada de dados
		System.out.print("Digite a frase a ser cifrada: ");
		mensagem_plana = sc.nextLine();
		System.out.print("Digite a chave da cifra: ");
		chave = sc.nextInt();
		
		// Processamento, que percorre toda a String
		for(int i = 0; i < mensagem_plana.length(); i++) {
			
			// Convers�o para inteiro
			int numero = (int) mensagem_plana.charAt(i);
			// Somando o caractere convertido com a chave
			numero += chave;
			// Convers�o para char
			char letra = (char) numero; 
			
			// Somando a letra cifrada na mensagem cifrada
			mensagem_codificada += letra;
		}
		
		// Sa�da de dados
		System.out.println("A mensagem cifrada: " + mensagem_codificada);
		
		sc.close();
	}
}





