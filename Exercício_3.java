package ex;

import java.util.Scanner;

public class Exerc�cio_3 {
	
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		double x,y;
		
		System.out.print("Digite o valor do seu sal�rio: ");
		x=entrada.nextDouble();
		if(x>=0.00 && x<=1000.00){
			y=(x+(x/100*15));
			System.out.println("Sal�rio corrigido: "+y+" R$\n"
					+"Percentual de aumento: 15%");}
		else if(x>=1000.01 && x<=2500.00){
			y=(x+(x/100*7));
			System.out.println("Sal�rio corrigido: "+y+" R$\n"
					+"Percentual de aumento: 7%");}
		else if(x>=2500.01){
			System.out.println("Sal�rio corrigido: "+x+" R$\n"
					+"Percentual de aumento: 0%");}
		else{
			System.out.printf("Valor inv�lido.");
		}
		
	}

}
