package conta.model;
//Definição da classe ContaCorrente que estende a classe Conta.
public class ContaCorrente extends Conta {

 // Declaração do atributo privado "limite" do tipo float.
 private float limite;

 // Construtor da classe ContaCorrente que recebe vários parâmetros para inicializar os atributos da conta.
 public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
     // Chamada ao construtor da classe base (Conta) usando a palavra-chave super.
     super(numero, agencia, tipo, titular, saldo);
     // Inicialização do atributo "limite" com o valor passado como parâmetro.
     this.limite = limite;
 }

 // Método getter para obter o valor do atributo "limite".
 public float getLimite() {
     return limite;
 }

 // Método setter para definir o valor do atributo "limite".
 public void setLimite(float limite) {
     this.limite = limite;
 }

 // Implementação do método "sacar" da classe base (Conta).
 @Override
 public boolean sacar(float valor) {
     // Verifica se o saldo atual somado ao limite de crédito é menor do que o valor a ser sacado.
     if (this.getSaldo() + this.getLimite() < valor) {
         System.out.println("\nSaldo Insuficiente!");
         return false; // Retorna falso indicando que o saque não foi realizado.
     }
     
     // Caso o saldo seja suficiente, subtrai o valor do saldo.
     this.setSaldo(this.getSaldo() - valor);
     return true; // Retorna verdadeiro indicando que o saque foi realizado com sucesso.
 }
 
 // Implementação do método "visualizar" para exibir informações da conta corrente.
 @Override
 public void visualizar() {
     // Chama o método visualizar da classe base (Conta) para exibir informações básicas da conta.
     super.visualizar();
     // Exibe o limite de crédito da conta corrente.
     System.out.println("Limite de Crédito: " + this.limite);
 }
}


	