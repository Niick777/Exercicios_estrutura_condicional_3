package ex;

import java.util.Scanner;

public class Exerc�cio_2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		int idade;
		System.out.print("Digite a sua idade: ");
		idade=entrada.nextInt();
		if(idade >= 5 && idade <= 10){
			System.out.printf("Voc� pertence � categoria infantil.");}
		else if(idade>=11 && idade<=17){
			System.out.printf("Voc� pertence � categoria juvenil.");}
		else if(idade>=18){
			System.out.printf("Voc� pertence � categoia adulto.");}
		else{
			System.out.printf("categoria desconhecida.");
		}
	}

}
