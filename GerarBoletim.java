package Escolar;

import java.util.Scanner;

public class GerarBoletim {
	
	public static void main (String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Dados dos alunos
		String dados;
		
		//Saber a quantidade de alunos que serão gerados
		int quantidade;
		
		
		//Criar objeto array. Instanciar. Sem construtor.
		
		System.out.println("Total de alunos:");
		quantidade = in.nextInt();
		
		//Número de objetos criados. Contém todos os objetos.
		//Criando objeto e índice.
		
		
		Boletim boletim []= new Boletim[quantidade];
		
		//Criando um for para automatizar a criação de alunos.
		
		in.nextLine();
		
		for(int x = 0; x < quantidade; x++) {
			
			boletim [x] = new Boletim();
			
			System.out.println("Nome");
			dados = in.nextLine();
			
			boletim[x].setNome(dados);
			
			System.out.println("Nota do 1 - Bimestre");
			dados = in.nextLine();
			boletim[x].setNota1Bimestre(dados);
			
			System.out.println("Nota do 2 - Bimestre");
			dados = in.nextLine();
			boletim[x].setNota2Bimestre(dados);
			
			System.out.println("Nota do 3 - Bimestre");
			dados = in.nextLine();
			boletim[x].setNota3Bimestre(dados);
			
			System.out.println("Nota do 4 - Bimestre");
			dados = in.nextLine();
			boletim[x].setNota4Bimestre(dados);
			
		}
		
		for(int x = 0; x < quantidade; x++) {
			System.out.println("Boletim: " + boletim[x].getNome());
			System.out.println(" ");
			System.out.println(boletim[x].getNome());
			System.out.println(boletim[x].getNota1Bimestre());
			System.out.println(boletim[x].getNota2Bimestre());
			System.out.println(boletim[x].getNota3Bimestre());
			System.out.println(boletim[x].getNota4Bimestre());
			System.out.println("  ");
		}
	}
}
