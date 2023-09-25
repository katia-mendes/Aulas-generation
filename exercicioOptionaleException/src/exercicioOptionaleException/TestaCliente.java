package exercicioOptionaleException;

public class TestaCliente {

	    public static void main(String[] args) throws IdadeInvalidaException {
	        // Instanciando dois objetos da classe Cliente
	        Cliente cliente1 = new Cliente("Katia", 29, "Rua A, 123", "katia@gmail.com", "123-456-789");
	        Cliente cliente2 = new Cliente("Hoseok", 29, "Rua B, 456", "hoseok@yahoo.com", "987-654-321");

	        // Exibindo informações dos clientes
	        System.out.println("Dados do Cliente 1:");
	        cliente1.visualizar(); // Chamando o método visualizar para exibir os dados do cliente1

	        System.out.println("\nDados do Cliente 2:");
	        cliente2.visualizar(); // Chamando o método visualizar para exibir os dados do cliente2

	        // Exemplo de uso de Optional para verificar se o cliente tem mais de 18 anos
	        verificarMaioridade(cliente1);
	        verificarMaioridade(cliente2);

	        // Exemplo de exceção - Idade inválida
	        Cliente cliente3 = new Cliente("Pedro", -5, "Rua C, 789", "pedro@gmail.com", "111-222-333");
	        verificarMaioridade(cliente3);
	    }

	    // Método para verificar a maioridade do cliente usando Optional
	    public static void verificarMaioridade(Cliente cliente) throws IdadeInvalidaException {
	        // Verifica se o cliente não é nulo
	        if (cliente == null) {
	           throw new ClienteNaoEncontradoException("Cliente não encontrado.");
	        }

	        // Verifica se a idade é válida
	        if (cliente.getIdade() < 18) {
	            throw new IdadeInvalidaException("Idade inválida para o cliente: " + cliente.getNome());
	        }

	        System.out.println(cliente.getNome() + " é maior de idade.");
	    }
	}