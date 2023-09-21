
public class ForExercicio1 {

	public static void main(String[] args) {
		        int numero, contador;
		        Scanner leia = new Scanner(System.in);
		        
		        System.out.println("Digite o primeiro número do intervalo:");
		        numero = leia.nextInt();

		        System.out.println("Digite o segundo número do intervalo:");
		        numero = leia.nextInt();

		        System.out.println("O intervalo é inválido!");
		        numero = leia.nextInt();

		        for (contador = 5; contador <5; contador++) {
		            System.out.println(numero + " x " + contador + " = " + numero * contador);
		        }
		    }
		}

	}

}
