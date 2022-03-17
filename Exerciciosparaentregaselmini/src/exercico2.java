import java.util.Random;

/*Escreva um programa em Java que preencha uma matriz quadrada de ordem 4 com 
valores inteiros aleatórios (gerados a partir da classe Random) e, em seguida, faça a impressão dos 
elementos no formato de uma tabela (impressão como apresentado durante as aulas). Após a 
impressão o seu programa deverá trocar os elementos armazenados no triângulo superior da matriz 
com os elementos armazenados no triângulo inferior. Imprima novamente a matriz no vídeo para 
conferência. Veja o exemplo abaixo indicando como a troca dos elementos deverá ser realizada. */

public class exercico2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int aux;

		int[][] z = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int na = random.nextInt(101);
				z[i][j] = na;
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(z[i][j] + "  ");
			}
			System.out.println();
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				if (i != j) {
					aux = z[i][j];
					z[i][j] = z[j][i];
					 z[j][i]= aux;
				}
			}

		}
		System.out.println();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(z[i][j] + "  ");
			}
			System.out.println();
		}
	}

}