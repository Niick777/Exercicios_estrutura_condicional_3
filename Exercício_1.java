package ex;

import java.util.Scanner;

public class Exerc�cio_1 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.print("Digite um n�mero: ");
		num = entrada.nextInt();
		if(num>=20 && num <=90) {
			System.out.printf("Seu n�mero est� entre 20 e 90.");
		}
		else{	
			System.out.printf("Seu n�mero n�o est� entre 20 e 90.");
		}
	
			
	}

}
