import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in); // Criei um Scanner para ler entradas 
		        // Criei uma fila de clientes usando LinkedList da interface Queue.
		        Queue<String> filaDeClientes = new LinkedList<>();
		        
		        int opcao;
		        do {
		            System.out.println("\nMenu:");
		            System.out.println("1: Adicionar um novo Cliente na fila");
		            System.out.println("2: Listar todos os Clientes na fila");
		            System.out.println("3: Retirar um cliente da fila");
		            System.out.println("0: Sair ");
		            System.out.print("Escolha uma opção: ");
		            opcao = scanner.nextInt(); // Lê a opção escolhida
		            scanner.nextLine(); // Limpa a entrada.
		            
		            switch (opcao) {
		                case 1:
		                    System.out.print("Digite o nome do cliente: ");
		                    String nomeCliente = scanner.nextLine(); // Lê o nome do cliente.
		                    filaDeClientes.offer(nomeCliente); // Adiciona o cliente à fila usando o método offer.
		                    System.out.println("Cliente adicionado!");
		                    break;
		                case 2:
		                	System.out.println("Clientes na fila:");
		                    for (String cliente : filaDeClientes) {
		                    System.out.println(cliente); // Lista todos os clientes na fila.
		                    }
		                    break;
		                case 3:
		                    if (filaDeClientes.isEmpty()) {
		                        System.out.println("A fila está vazia!");
		                    } else {
		                        String clienteChamado = filaDeClientes.poll(); // Retira o cliente da fila usando o método poll.
		                        System.out.println("Cliente chamado: " + clienteChamado);
		                    }
		                    break;
		                case 0:
		                    System.out.println("Programa finalizado!");
		                    break;
		                default:
		                    System.out.println("Opção inválida. Tente novamente.");
		            }
		        } while (opcao != 0); // Continua executando o loop até que o usuário escolha a opção 0 para sair.
		        
		}

	}
	
	

	              
	    

