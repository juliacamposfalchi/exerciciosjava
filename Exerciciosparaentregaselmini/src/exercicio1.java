import java.util.Scanner;

// Exerc�cio 1: Escreva um programa em Java que leia inicialmente as dimens�es da matriz (n�mero 
//de linhas e n�mero de colunas) e, em seguida, fa�a o preenchimento da matriz com valores inteiros 
//fornecidos pelo usu�rio. Ap�s o preenchimento da matriz dever� ser lido via teclado um valor X e 
//o seu programa dever� fazer a busca desse valor na matriz. Se o valor for encontrado dever� ser 
//impresso no v�deo a sua localiza��o (n�mero da linha e n�mero da coluna). Caso o valor n�o esteja 
//na matriz dever� ser impresso no v�deo a mensagem: �X n�o se encontra na matriz�. 
public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int x,y,w;
		
		System.out.println("Determine um n�mero inteiro para ser o n�mero de linhas da matriz:");
		x = teclado.nextInt();
		
		System.out.println("Determine um n�mero inteiro para ser o n�mero de colunas da matriz: ");
		y = teclado.nextInt();
		
		int[][] z = new int [x][y];
		
		System.out.println("Por favor, digite um n�mero inteiro para a posi��o de cada canto da matriz!");
		
		for(int i = 0; i < x ; i++) {
			for(int j = 0; j < y ; j++) {
			System.out.println("Para a linha:" + (i + 1) + "  para a coluna: " + (j + 1));
				z [i][j]= teclado.nextInt();
			}
				
		} for(int i = 0; i < x ; i++) {
			for(int j = 0; j < y ; j++) {
			System.out.print(z[i][j] + "  ");
			
		
		
	} System.out.println();

} System.out.println("Qual n�mero dentro da matriz voc� quer a posi��o:");
	w = teclado.nextInt();
	boolean check = true;
	for(int i = 0; i < x ; i++) { 
		for(int j = 0; j < y ; j++) 
		{ if (w == z[i][j]) { System.out.println("A posi��o �:" + i + ","+ j);
		check = false;}
		}
			
	}
if (check == true) { System.out.println("Valor n�o encontrado na matriz");}
}
}
