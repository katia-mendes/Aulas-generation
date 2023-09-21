package conta.repository;
import conta.model.Conta;
	// Declaração da interface ContaRepository.
	public interface ContaRepository {

	    // Operações CRUD para contas bancárias:

	    // Método para procurar uma conta pelo número.
	    public void procurarPorNumero(int numero);

	    // Método para listar todas as contas.
	    public void listarTodas();

	    // Método para cadastrar (adicionar) uma conta ao repositório.
	    public void cadastrar(Conta conta);

	    // Método para atualizar os dados de uma conta no repositório.
	    public void atualizar(Conta conta);

	    // Método para deletar (remover) uma conta do repositório com base no número.
	    public void deletar(int numero);

	    // Operações bancárias:

	    // Método para sacar um valor de uma conta com base no número da conta e no valor a ser sacado.
	    public void sacar(int numero, float valor);

	    // Método para depositar um valor em uma conta com base no número da conta e no valor a ser depositado.
	    public void depositar(int numero, float valor);

	    // Método para transferir um valor de uma conta de origem para uma conta de destino com base nos números das contas e no valor a ser transferido.
	    public void transferir(int numeroOrigem, int numeroDestino, float valor);
	}

