package LacoDeRepeticao_WHILE;
import java.util.Scanner;// Importação necessária para usar a classe Scanner
public class LacoDeRepeticao_WHILE {

		    public static void main(String[] args) {
		        Scanner leia = new Scanner(System.in);  // Prepara o Scanner para ler entrada do teclado

		        int menor21 = 0;   // Variável para contar pessoas com menos de 21 anos
		        int maior50 = 0;   // Variável para contar pessoas com 50 anos ou mais

		        while (true) {  // Inicia um loop infinito
		            System.out.print("Digite uma idade: ");//ou um numero negativo para sair do Loop
		            int idade = leia.nextInt();  // Lê a idade digitada

		            if (idade < 0) {
		                break;  // Se a idade for negativa, sai do loop
		            } else if (idade < 21) {
		                menor21++;  // Incrementa o contador de pessoas com menos de 21 anos
		            } else if (idade >= 50) {
		                maior50++;  // Incrementa o contador de pessoas com 50 anos ou mais
		            }
		        }

		        // Exibe o total de pessoas em cada faixa etária
		        System.out.println("Total de pessoas menores de 21 anos: " + menor21);
		        System.out.println("Total de pessoas maiores de 50 anos: " + maior50);

		        leia.close();  // Fecha o Scanner
		    }
		}
