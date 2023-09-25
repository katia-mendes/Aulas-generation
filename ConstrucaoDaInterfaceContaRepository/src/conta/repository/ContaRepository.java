package conta.repository;
import conta.model.Conta;
import conta.repository.ContaNotFoundException;
import conta.repository.SaldoInsuficienteException;


public interface ContaRepository {
    // adcionei uma exceção ContaNotFoundException se a conta não for encontrada.
    public void procurarPorNumero(int numero) throws ContaNotFoundException;

    // Método para listar todas as contas.
    public void listarTodas();

    // Adicionei uma exceção ContaNotFoundException se a conta não for encontrada.
    public void deletar(int numero) throws ContaNotFoundException;

    // Operações bancárias:

    // Adicionei uma exceção SaldoInsuficienteException se o saldo for insuficiente.
    public void sacar(int numero, float valor)
            throws SaldoInsuficienteException, ContaNotFoundException;

    // Adicionei uma exceção ContaNotFoundException se a conta não for encontrada.
    public void depositar(int numero, float valor) throws ContaNotFoundException;

    // Adicionei uma exceção SaldoInsuficienteException se o saldo for insuficiente.
    // Adicionei exceções ContaNotFoundException se uma das contas não for encontrada.
    public void transferir(int numeroOrigem, int numeroDestino, float valor)
            throws SaldoInsuficienteException, ContaNotFoundException;
}
