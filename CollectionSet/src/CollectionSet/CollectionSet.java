package CollectionSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet {
	public static void main(String[] args) {
		        // Criei um Scanner para obter entrada 
		        Scanner scanner = new Scanner(System.in);

		        // Criei um Set para guardar os valores 
		        Set<Integer> integerSet = new HashSet<>();

		        // Usuário digite 10 valores inteiros não repetidos
		        System.out.println("Digite 10 valores inteiros não repetidos:");
		      
		        //loop for que vai de 0 a 9 (ou seja, 10 iterações no total).
                 for (int i = 0; i < 10; i++) {
		            int valor; // Declarei uma variável inteira chamada "valor" para armazenar o número

		                System.out.print("Valor " + (i + 1) + ": ");
		                valor = scanner.nextInt();  // Aguardando o valor inteiro e armazenando-o na variável "valor".

		            // Adicione o valor ao conjunto
		            integerSet.add(valor);
		        }

		        // Usei o Iterator para percorrer e mostrar os elementos do conjunto
		        Iterator<Integer> iterator = integerSet.iterator();
		        System.out.println("\nElementos da Collection Set:");

		        while (iterator.hasNext()) {
		            System.out.println(iterator.next());
		        }
	}
}
