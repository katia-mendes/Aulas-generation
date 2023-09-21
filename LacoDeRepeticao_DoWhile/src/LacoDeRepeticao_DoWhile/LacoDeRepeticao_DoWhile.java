package LacoDeRepeticao_DoWhile;
import java.util.Scanner;
public class LacoDeRepeticao_DoWhile {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
						//Declara as variáveis
						int inicio;
						int soma = 0;
						
						do {
							System.out.print("Digite um número: ");
							inicio = leia.nextInt();
				            // Verifica se o inicio é positiva antes de somá-la
							if(inicio > 0) {
								soma += inicio;
							}
						}
						while(inicio != 0);// Continua até que seja digitado 0
						System.out.print("A soma dos números positivos é: " + soma);
						leia.close();//Fechamento do Scanner
		    }
		}

/*loop Do_While é "faça-enquanto", o que significa que ele executa o bloco de código pelo menos uma vez
 e depois verifica a condição de continuação.*/