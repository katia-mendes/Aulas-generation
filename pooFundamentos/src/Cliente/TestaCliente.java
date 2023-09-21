package Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		        // Instanciando dois objetos da classe Cliente
		        Cliente cliente1 = new Cliente("Hoseok", 29, "Rua A, 123", "hoseok@gmail.com", "123-456-789");
		        Cliente cliente2 = new Cliente("Namjoon", 29, "Rua B, 456", "namjoon@yahoo.com", "987-654-321");

		        // Exibindo informações dos clientes
		        System.out.println("Dados do Cliente 1:");
		        cliente1.visualizar(); // Chamando o método visualizar para exibir os dados do cliente1

		        System.out.println("\nDados do Cliente 2:");
		        cliente2.visualizar(); // Chamando o método visualizar para exibir os dados do cliente2
		    }
		}


