package CriandoRpg;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {

		int op1, op2;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o nome do jogador ");
		
		Player p1 = new Player(500, 4, 10, 15, 5, 1.5);
		p1.nome = ler.nextLine();
		p1.visivel();
		p1.mostrarStatus();
		
		Player cpu = new Player(500, 4, 10, 15, 5, 2.0 );
		cpu.nome = "CPU";

		System.out.println("     Habilidades");
		System.out.println("=======================");
		System.out.println("|  ESCOLHA UMA OP��O: |");
		System.out.println("|  1) Ataque F�sico   |");
		System.out.println("|  2) Magia           |");
		System.out.println("|  3) Cr�tico         |");
		System.out.println("=======================");

		op1 = ler.nextInt();

		switch(op1) {
		case 1:{
			System.out.println("    Ataque F�sico");
			
			System.out.println("=======================");
			System.out.println("|  1) Santouryuu      |");
			System.out.println("=======================");

		} break;
		
		
			
		case 2:{
			System.out.println("	   Magias");
			
			System.out.println("=======================");
			System.out.println("|  1) Blizzard        |");
			System.out.println("=======================");


		} break;
		
		
		
		case 3:{
			System.out.println("      Cr�tico ");

			
			System.out.println("=======================");
			System.out.println("| 1) Bakuhatsu        |");
			System.out.println("=======================");

		} break;
			
			
			
		}
	}

}
