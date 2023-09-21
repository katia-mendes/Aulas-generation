package Matrizes;
import java.util.Scanner;
public class Matrizes {
	public static void main(String[] args) {
		        // Declaração e inicialização de uma matriz 3x3
		        int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		        int A = 0; // Variável para armazenar a soma dos elementos da diagonal principal
		        int B = 0; // Variável para armazenar a soma dos elementos da diagonal secundária

		        System.out.println("\nElementos da Diagonal Principal: ");
		        // Loop para percorrer as linhas da matriz
		        for (int i = 0; i < matriz.length; i++) {
		            // Imprime o elemento da diagonal principal
		            System.out.print(matriz[i][i] + " ");
		            // Soma o elemento da diagonal principal à variável A
		            A += matriz[i][i];
		        }
		        System.out.println("\nElementos da Diagonal Secundária: ");
		        // Loop para percorrer as linhas da matriz novamente
		        for (int i = 0; i < matriz.length; i++) {
		            // Imprime o elemento da diagonal secundária
		            System.out.print(matriz[i][2 - i] + " ");
		            // Soma o elemento da diagonal secundária à variável B
		            B += matriz[i][2 - i];
		        }

		        // Imprime a soma dos elementos da diagonal principal
		        System.out.println("\nSoma dos Elementos da Diagonal Principal: " + A);

		        // Imprime a soma dos elementos da diagonal secundária
		        System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + B);
		    }
		}
