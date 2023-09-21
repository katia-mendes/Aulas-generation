package conta.repository;
import conta.model.Conta;

	public interface ContaRepository {
	    void criarConta(Conta conta);
	    Conta obterContaPorId(int id);
	    void atualizarConta(Conta conta);
	    void excluirConta(int id);
	}


