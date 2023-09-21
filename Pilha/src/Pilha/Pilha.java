package Pilha;
import java.util.Stack;// Importa a classe Stack da biblioteca Java para criar uma pilha.
import java.util.Scanner;

public class Pilha {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);// Cria um objeto Scanner para ler entradas 
		        Stack<String> pilhaDeLivros = new Stack<>();// Cria uma pilha de livros usando a classe Stack
		        
		        int opcao;
		        do {
		            // Exibe o menu de opções para o usuário.
		            System.out.println("\nMenu:");
		            System.out.println("1: Adicionar um novo livro na pilha");
		            System.out.println("2: Listar todos os livros na pilha");
		            System.out.println("3: Retirar um livro da pilha");
		            System.out.println("0: Sair do programa");
		            System.out.print("Escolha uma opção: ");
		            opcao = scanner.nextInt();// Lê a opção escolhida pelo usuário.
		            scanner.nextLine(); // Limpar a entrada
		            
		            switch (opcao) {
		                case 1:
		                    System.out.print("Digite o nome do livro: ");
		                    String nomeLivro = scanner.nextLine();// Lê o nome do livro
		                    pilhaDeLivros.push(nomeLivro); // Adiciona o livro à pilha usando o método push.
		                    System.out.println("Livro adicionado!");
		                    break;
		                case 2:
		                    System.out.println("Livros da pilha:");
		                     for (String livro : pilhaDeLivros) {
		                            System.out.println(livro); // Lista todos os livros da pilha.
		                        }
		                    break;
		                case 3:
		                	if (pilhaDeLivros.isEmpty()) {
		                     String livroRetirado = pilhaDeLivros.pop(); // Retira o livro da pilha usando o método pop.
		                     System.out.println("Livro retirado: " + livroRetirado);
		                	} else {
		                        System.out.println("A pilha está vazia!");
		                	}
		                    break;
		                case 0:
		                    System.out.println("Programa finalizado!");
		                    break;
		                default:
		                    System.out.println("Opção inválida. Tente novamente!");
		            }
		        } while (opcao != 0);// Continua executando o loop até que o usuário escolha a opção 0 para sair.
		    }
		}


		
		           


      
  


