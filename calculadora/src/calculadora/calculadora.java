package calculadora;
import java.util.Scanner;

public class calculadora {

		    public static void main(String[] args) {

		        // Cria um objeto Scanner para ler a entrada 
		        Scanner scanner = new Scanner(System.in);

		        // Entra em um loop infinito para manter o programa em execução até que o usuário escolha sair.
		        while (true) {
		            // Exibe um menu de opções para o usuário.
		            System.out.println("Escolha uma operação:");
		            System.out.println("1 - Soma");
		            System.out.println("2 - Subtração");
		            System.out.println("3 - Multiplicação");
		            System.out.println("4 - Divisão");
		            System.out.println("5 - Potenciação");
		            System.out.println("6 - Sair");

		            // Lê a escolha do usuário.
		            int escolha = scanner.nextInt();

		            // Verifica se o usuário escolheu sair (opção 6).
		            if (escolha == 6) {
		                System.out.println("Finalizando!"); // Exibe uma mensagem de encerramento.
		                break; // Sai do loop.
		            }

		            // Verifica se a escolha do usuário está fora do intervalo de 1 a 5.
		            if (escolha < 1 || escolha > 5) {
		                System.out.println("Escolha uma opção válida!"); // Exibe uma mensagem de erro.
		                continue; // Volta ao início do loop para pedir uma nova escolha.
		            }

		            // Digite os números para a operação:
		            System.out.println("Digite o primeiro número:");
		            double num1 = scanner.nextDouble();
		            System.out.println("Digite o segundo número:");
		            double num2 = scanner.nextDouble();

		            // Cria um objeto da classe "Calculadora" para realizar a operação.
		            Calculadora calculadora = new Calculadora();

		            try {
		                // Chama o método "executarOperacao" da calculadora para realizar a operação escolhida.
		                double resultado = calculadora.executarOperacao(escolha, num1, num2);
		                // Chama o método "mostrarResultado" da calculadora para exibir o resultado.
		                calculadora.mostrarResultado(resultado);
		            } catch (ArithmeticException e) {
		                // Em caso de erro (por exemplo, divisão por zero), exibe uma mensagem de erro.
		                System.out.println("Erro: " + e.getMessage());
		            }
		        }

		        // Fecha o Scanner p
		        scanner.close();
		    }
		}


	
