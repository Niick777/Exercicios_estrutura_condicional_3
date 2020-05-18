package ex;

import java.util.Scanner;

public class Exercício_1 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.print("Digite um número: ");
		num = entrada.nextInt();
		if(num>=20 && num <=90) {
			System.out.printf("Seu número está entre 20 e 90.");
		}
		else{	
			System.out.printf("Seu número não está entre 20 e 90.");
		}
	
			
	}

}
