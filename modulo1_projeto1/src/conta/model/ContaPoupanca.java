package conta.model;
	// Definição da classe ContaPoupanca que estende a classe Conta.
	public class ContaPoupanca extends Conta {

	    // Declaração do atributo privado "aniversario" do tipo int.
	    private int aniversario;

	    // Construtor da classe ContaPoupanca que recebe vários parâmetros para inicializar os atributos da conta.
	    public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
	        // Chamada ao construtor da classe base (Conta) usando a palavra-chave super.
	        super(numero, agencia, tipo, titular, saldo);
	        // Inicialização do atributo "aniversario" com o valor passado como parâmetro.
	        this.aniversario = aniversario;
	    }

	    // Método getter para obter o valor do atributo "aniversario".
	    public int getAniversario() {
	        return aniversario;
	    }

	    // Método setter para definir o valor do atributo "aniversario".
	    public void setAniversario(int aniversario) {
	        this.aniversario = aniversario;
	    }
	    
	    // Implementação do método "visualizar" para exibir informações da conta poupança.
	    @Override
	    public void visualizar() {
	        // Chama o método visualizar da classe base (Conta) para exibir informações básicas da conta.
	        super.visualizar();
	        // Exibe o aniversário da conta poupança com formatação de cores.
	        System.out.println("Aniversário da conta: " + this.aniversario);
	    }
	}


