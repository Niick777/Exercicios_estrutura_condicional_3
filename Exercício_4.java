package ex;

import java.util.Scanner;

public class Exerc�cio_4 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		int x,y,z;
		System.out.print("Digite o primeiro valor: ");
		x=entrada.nextInt();
		System.out.print("Digite o segundo valor: ");
		y=entrada.nextInt();
		System.out.print("Digite o terceiro valor: ");
		z=entrada.nextInt();
		if(x==y && x==z && z==y){
			System.out.printf("Tri�ngulo equil�tero.");}
		else if(x==y || y==z || y==z || x==z || z==x || y==z){
			System.out.printf("Tri�ngulo is�sceles.");}
		else{
			System.out.printf("Tri�ngulo escaleno.");
		}
	}

}
