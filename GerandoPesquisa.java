package Pesquisas;

import java.util.Scanner;

public class GerandoPesquisa {
	
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		String informacoes;
		
		String idade;
		
		int totalPalmeiras = 0;
		int maisQue35Palmeiras = 0;
		int totalSaoPaulo = 0;
		int maisQue35SaoPaulo = 0;
		int totalCorinthians = 0;
		int maisQue35Corinthians= 0;
		
		float percentage;
		
		int quantidade;
		
		System.out.println("Pesquisa: Próximo Campeão");
		System.out.println(" ");
		System.out.println("Total de Entrevistados:");
		quantidade = in.nextInt();
		
		Pesquisa pesquisa [] = new Pesquisa[quantidade];
		
		in.nextLine();
		
		for(int x = 0; x < quantidade; x++) {
			pesquisa [x] = new Pesquisa();
			
			System.out.println("Qual o seu nome?");
			informacoes = in.nextLine();
			pesquisa[x].setNome(informacoes); 
			
			System.out.println("Qual a sua idade?");
			idade = in.nextLine();
			pesquisa[x].setIdade(idade);
			
			System.out.println("Em sua opinião, qual será o campeão desse jogo? Palmeiras, São Paulo ou Corinthians?");
			informacoes = in.nextLine();
			pesquisa[x].setEscolha(informacoes);
			System.out.println(" ");

		}
		
		for(int x = 0; x < quantidade; x++) {
			if(pesquisa[x].getEscolha().equals("Palmeiras")) {
				totalPalmeiras += 1;
				int maior = Integer.parseInt(pesquisa[x].getIdade());
				if(maior > 35) {
					maisQue35Palmeiras += 1;
				}
				
			}
			
			if(pesquisa[x].getEscolha().equals("São Paulo")) {
				totalSaoPaulo += 1;
				
				int maior = Integer.parseInt(pesquisa[x].getIdade());
				if(maior > 35) {
					maisQue35SaoPaulo += 1;
				}
			}
			
			if(pesquisa[x].getEscolha().equals("Corinthians")) {
				totalCorinthians += 1;
				int maior = Integer.parseInt(pesquisa[x].getIdade());
				if(maior > 35) {
					maisQue35Corinthians += 1;
				}
			}
			
			
		}
		
		for(int x = 0; x < quantidade; x++) {
			System.out.println("________________________________________");
			System.out.println(" ");
			System.out.println("Relatório da Pesquisa: Próximo Campeão");
			System.out.println(" ");
			System.out.println("Relatório do entrevistado: " + pesquisa[x].getNome());
			System.out.println("Idade:" + pesquisa[x].getIdade());
			System.out.println("Campeão escolhido: " + pesquisa[x].getEscolha());
			System.out.println("________________________________________");
			System.out.println(" ");
			System.out.println("Total de votos para o Palmeiras: " + totalPalmeiras);
			System.out.println("Total de votos para o São Paulo: " + totalSaoPaulo);
			System.out.println("Total de votos para o Corinthians: " + totalCorinthians);
			percentage = (maisQue35Palmeiras * 100/quantidade);
			System.out.println("Percentual de votos de pessoas com mais de 35 anos que votaram no Palmeiras: " + percentage + "%");
			percentage = (maisQue35SaoPaulo * 100/quantidade);
			System.out.println("Percentual de votos de pessoas com mais de 35 anos que votaram no São Paulo: " + percentage + "%");
			percentage = (maisQue35Corinthians * 100/quantidade);
			System.out.println("Percentual de votos de pessoas com mais de 35 anos que votaram no Corinthians: " + percentage + "%");
		}
	}
}
