package ex;

import java.util.Scanner;

public class Exercício_5 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		int mat;
		float w,x,y,z,media;
		System.out.print("Digite o número da sua matrícula: ");
		mat=entrada.nextInt();
		System.out.print("Digite a primeira nota: ");
		w=entrada.nextFloat();
		System.out.print("Digite a segunda nota: ");
		x=entrada.nextFloat();
		System.out.print("Digite a terceira nota: ");
		y=entrada.nextFloat();
		System.out.print("Digite a quarta nota: ");
		z=entrada.nextFloat();
		media=(w+x+y+z)/4;
		if(media>=7.00){
			System.out.println("Matrícula: "+mat+" \n"
					+ "Média final: "+media+" \n"
					+"Aluno aprovado.");}
		else if(media>=3.5 && media<=7.0){
			System.out.println("Matrícula: "+mat+" \n"
					+ "Média final: "+media+" \n"
					+"Aluno em recuperação.");}
		else if(media<=3.5){
			System.out.println("Matrícula: "+mat+" \n"
					+ "Média final: "+media+" \n"
					+"Aluno reprovado.");}
		else{
			System.out.printf("Erro.");
		}
	}

}
