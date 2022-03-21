import java.util.Scanner;

// Exercício 1: Escreva um programa em Java que leia inicialmente as dimensões da matriz (número 
//de linhas e número de colunas) e, em seguida, faça o preenchimento da matriz com valores inteiros 
//fornecidos pelo usuário. Após o preenchimento da matriz deverá ser lido via teclado um valor X e 
//o seu programa deverá fazer a busca desse valor na matriz. Se o valor for encontrado deverá ser 
//impresso no vídeo a sua localização (número da linha e número da coluna). Caso o valor não esteja 
//na matriz deverá ser impresso no vídeo a mensagem: “X não se encontra na matriz”. 
public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int x,y,w;
		
		System.out.println("Determine um número inteiro para ser o número de linhas da matriz:");
		x = teclado.nextInt();
		
		System.out.println("Determine um número inteiro para ser o número de colunas da matriz: ");
		y = teclado.nextInt();
		
		int[][] z = new int [x][y];
		
		System.out.println("Por favor, digite um número inteiro para a posição de cada canto da matriz!");
		
		for(int i = 0; i < x ; i++) {
			for(int j = 0; j < y ; j++) {
			System.out.println("Para a linha:" + (i + 1) + "  para a coluna: " + (j + 1));
				z [i][j]= teclado.nextInt();
			}
				
		} for(int i = 0; i < x ; i++) {
			for(int j = 0; j < y ; j++) {
			System.out.print(z[i][j] + "  ");
			
		
		
	} System.out.println();

} System.out.println("Qual número dentro da matriz você quer a posição:");
	w = teclado.nextInt();
	boolean check = true;
	for(int i = 0; i < x ; i++) { 
		for(int j = 0; j < y ; j++) 
		{ if (w == z[i][j]) { System.out.println("A posição é:" + i + ","+ j);
		check = false;}
		}
			
	}
if (check == true) { System.out.println("Valor não encontrado na matriz");}
}
}
