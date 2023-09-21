package calculadora;
// Importações das classes de operações
import calculadora.OperacaoSomar.java
import calculadora.OperacaoSomar.Multiplicacao;
import calculadora.OperacaoSomar.Operacao;
import calculadora.OperacaoSomar.Potenciacao;
import calculadora.OperacaoSomar.Soma;
import calculadora.OperacaoSomar.Subtracao;

public class Calcula {

    // Método para executar uma operação com base na escolha do usuário
    double executarOperacao(int escolha, double num1, double num2) {
        Operacao operacao = null; // Inicializa uma variável de tipo Operacao como nula
        switch (escolha) { // Verifica a escolha do usuário
            case 1:
                operacao = new Soma(); // Cria uma instância da classe Soma
                break;
            case 2:
                operacao = new Subtracao(); // Cria uma instância da classe Subtracao
                break;
            case 3:
                operacao = new Multiplicacao(); // Cria uma instância da classe Multiplicacao
                break;
            case 4:
                operacao = new Divisao(); // Cria uma instância da classe Divisao
                break;
            case 5:
                operacao = new Potenciacao(); // Cria uma instância da classe Potenciacao
                break;
        }
        // Chama o método calcular da operação escolhida e retorna o resultado
        return operacao.calcular(num1, num2);
    }

    // Método para mostrar o resultado
    void mostrarResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }
}
