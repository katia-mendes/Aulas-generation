package LacoCondicional_IF;
import java.util.Scanner;
public class LacoCondicional_IF {

	public static void main(String[] args) {

        // Inicializa e declara as variáveis
		int A,B,C;
		
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor de A :");
		 A = leia.nextInt();// Leia o A como um número INTeiro.

		 System.out.println("Digite o valor de B :");
		 B = leia.nextInt();

		 System.out.println("Digite o valor de C :");
		 C = leia.nextInt();
		 
		 if( A + B > C) { //Se A+B for maior que C.
			 System.out.println("O valor de A + B é maior que C !");
			 }
		 if( A + B < C) { //Se A+B for menor que C.
			 System.out.println("O valor de A + B é menor que C !");
		 }
		 if (A + B == C) { //Se A + B for igual a C.
			 System.out.println("O valor de A + B é igual a C !");
			 }	 
	}

}
