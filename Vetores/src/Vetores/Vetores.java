package Vetores;
import java.util.Scanner;
public class Vetores {

		    public static void main(String[] args) {
		        // Declarando o vetor e inicializando com valores
		        int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		        int numero;
		        
		        // Cria um objeto Scanner para ler a entrada do usuário
		        Scanner leia = new Scanner(System.in);
		        System.out.print("Digite o número que você deseja encontrar: ");
		        numero = leia.nextInt();
		        
		        // Inicializa a variável de índice fora do loop
		        int i;
		        
		        // Percorre o vetor para encontrar o número
		        for (i = 0; i < vetor.length; i++) {
		            if (numero == vetor[i]) {
		                System.out.println("O número " + numero + " está localizado na posição: " + (i + 1));
		                break; // Sai do loop se encontrar o número
		            }
		        }
		        
		        // Se o loop terminar e não encontrar o número, exibe uma mensagem de erro
		        if (i == vetor.length) {
		            System.out.println("O número " + numero + " não foi encontrado!");
		        }
		        
		        leia.close();// Fecha o Scanner
		    }
		}
