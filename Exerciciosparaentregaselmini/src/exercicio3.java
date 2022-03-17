import java.util.Random;
import java.util.Scanner;

/*Exerc�cio 3: Escreva um programa em Java para fazer a corre��o de uma prova contendo 10
 quest�es de m�ltipla escolha (a, b, c, d ou e) de uma turma contendo X alunos (o n�mero de 
alunos dever� ser informado pelo usu�rio da aplica��o). O programa dever� gerar as respostas 
dos alunos de forma aleat�ria e as respostas dever�o ser impressas no v�deo no formato de 
uma tabela (conforme apresentado durante as aulas). Em seguida, o programa dever� ler o 
gabarito da prova (a entrada dever� ser informada pelo usu�rio da aplica��o). O seu programa 
dever� emitir um 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 Diagonal principal 1 5 9 13 2 6 10 14 3 
7 11 15 4 8 12 16 Diagonal principal relat�rio contendo a nota de cada aluno e a sua situa��o 
(aprovado ou reprovado) considerando que a nota para aprova��o dever� ser maior ou igual a 
7.
*/
public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner teclado = new Scanner (System.in);
	int nalunos;
	
	System.out.println("Informe o n�mero de alunos na turma:");
	nalunos = teclado.nextInt();
	
	Random aleatorio= new Random();
	String [] respostas = { "a", "b", "c", "d", "e"};
	String [] [] resposta = new String [nalunos][10];
	
	for (int k = 0; k < nalunos; k++) {
		for (int i = 0; i < 10; i++) { 
			int diferente = aleatorio.nextInt(5);
			resposta [k][i] = respostas [diferente];	
		}
	} 
	System.out.print("           ");
	for (int i = 0; i < nalunos; i++) {
		System.out.print("a" + (i + 1)+ "   ");
	}
	System.out.println();
	for (int i = 0; i < 10; i++) {
		System.out.print("Quest�o "+ (i + 1) + "   ");
		for (int j= 0; j < nalunos; j++) {
			System.out.print(resposta [j][i] + "    ");

		} System.out.println();
	}
	
	String [] gabarito = new String [10]; 
		
	for(int i = 0; i<10; i++) {
		System.out.println("qual o gabarito da quest�o" + (i + 1));
		gabarito [i] = teclado.next();
	} 
	int certo[] = new int[nalunos];
	 for (int i= 0; i < nalunos; i++) {
		 for (int j = 0; j < 10; j++) { 
			 if (gabarito [j] == resposta [i][j]) { 
				 certo [i] = certo [i] + 1;
				 
			 }
		 }
	 }
	 for(int i=0; i< nalunos; i++) {
		 if(certo[i] >= 7) {
			 System.out.println("Aluno " + (i+1) + " Aprovado");
		 } else {	 
			 System.out.println("Aluno " + (i+1) + " Reprovado");
		 }
	 }
}
};
