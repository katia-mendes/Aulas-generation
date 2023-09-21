package conta.controller;
import java.util.ArrayList;
import conta.model.Conta;
import conta.repository.ContaRepository;

	public class ContaController implements ContaRepository {

	    // Declaração de uma lista para armazenar as contas bancárias.
	    private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	    int numero = 0;

	    // Método para procurar uma conta pelo número.
	    @Override
	    public void procurarPorNumero(int numero) {
	        var conta = buscarNaCollection(numero);

	        if (conta != null)
	            conta.visualizar();
	        else
	            System.out.println("\nA conta número: " + numero + " não foi encontrada!");
	    }

	    // Método para listar todas as contas.
	    @Override
	    public void listarTodas() {
	        for (var conta : listaContas) {
	            conta.visualizar();
	        }
	    }

	    // Método para cadastrar (adicionar) uma conta ao repositório.
	    @Override
	    public void cadastrar(Conta conta) {
	        listaContas.add(conta);
	        System.out.println("\nA Conta número: " + conta.getNumero() + " foi criada com sucesso!");
	    }

	    // Método para atualizar os dados de uma conta no repositório.
	    @Override
	    public void atualizar(Conta conta) {
	        var buscaConta = buscarNaCollection(conta.getNumero());

	        if (buscaConta != null) {
	            listaContas.set(listaContas.indexOf(buscaConta), conta);
	            System.out.println("\nA conta número: " + conta.getNumero() + " foi atualizada com sucesso!");
	        } else
	            System.out.println("\nA conta número: " + conta.getNumero() + " não foi encontrada!");
	    }

	    // Método para deletar (remover) uma conta do repositório com base no número.
	    @Override
	    public void deletar(int numero) {
	        var conta = buscarNaCollection(numero);

	        if (conta != null) {
	            if (listaContas.remove(conta) == true)
	                System.out.println("\nA Conta número: " + numero + " foi deletada com sucesso!");
	        } else
	            System.out.println("\nA Conta número: " + numero + " não foi encontrada!");
	    }

	    // Método para sacar um valor de uma conta com base no número da conta e no valor a ser sacado.
	    @Override
	    public void sacar(int numero, float valor) {
	        var conta = buscarNaCollection(numero);

	        if (conta != null) {
	            if (conta.sacar(valor) == true)
	                System.out.println("\nO Saque na Conta numero: " + numero + " foi efetuado com sucesso!");
	        } else
	            System.out.println("\nA Conta numero: " + numero + " não foi encontrada!");
	    }

	    // Método para depositar um valor em uma conta com base no número da conta e no valor a ser depositado.
	    @Override
	    public void depositar(int numero, float valor) {
	        var conta = buscarNaCollection(numero);

	        if (conta != null) {
	            conta.depositar(valor);
	            System.out.println("\nO Depósito na Conta Numero: " + numero + " foi efetuado com sucesso!");
	        } else
	            System.out.println("\nA Conta numero: " + numero + " não foi encontrada ou a Conta destino não é uma Conta Corrente!");
	    }

	    // Método para transferir um valor de uma conta de origem para uma conta de destino com base nos números das contas e no valor a ser transferido.
	    @Override
	    public void transferir(int numeroOrigem, int numeroDestino, float valor) {
	        var contaOrigem = buscarNaCollection(numeroOrigem);
	        var contaDestino = buscarNaCollection(numeroDestino);

	        if (contaOrigem.sacar(valor) == true) {
	            contaDestino.depositar(valor);
	            System.out.println("\nA Transferência foi efetuada com sucesso!");
	        } else
	            System.out.println("\nA Conta de Origem e/ou Destino não foram encontradas!");
	    }

	    // Método para gerar números de conta sequencialmente.
	    public int gerarNumero() {
	        return ++numero;
	    }

	    // Método para buscar uma conta na coleção com base no número.
	    public Conta buscarNaCollection(int numero) {
	        for (var conta : listaContas) {
	            if (conta.getNumero() == numero) {
	                return conta;
	            }
	        }
	        return null;
	    }

	    // Método para retornar o tipo de uma conta com base no número.
	    public int retornaTipo(int numero) {
	        for (var conta : listaContas) {
	            if (conta.getNumero() == numero) {
	                return conta.getTipo();
	            }
	        }
	        return 0;
	    }
	}


