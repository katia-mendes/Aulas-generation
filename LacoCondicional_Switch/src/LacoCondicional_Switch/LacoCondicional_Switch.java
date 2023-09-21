package LacoCondicional_Switch;
import java.util.Scanner;
public class LacoCondicional_Switch {

	public static void main(String[] args) {
		// Inicializa e declara as variáveis
        int codigoDoProduto;
        double preco = 0.0; // Inicializa o preço com 0.0
        String produto = ""; 
		int quantidade;

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Menu");
        System.out.println("Digite 1 para Cachorro Quente");
        System.out.println("Digite 2 para X-Salada");
        System.out.println("Digite 3 para X-Bacon");
        System.out.println("Digite 4 para Bauru");
        System.out.println("Digite 5 para Refrigerante");
        System.out.println("Digite 6 para Suco de laranja");
        System.out.println("");

        System.out.println("\nDigite o código do seu pedido: ");
        codigoDoProduto = leia.nextInt();
        System.out.println("\nDigite a quantidade do seu pedido: ");
        quantidade = leia.nextInt();
		
		switch(codigoDoProduto) {
		case 1:
            produto = "Cachorro Quente";
            preco = 10.00;
            break;
        case 2:
            produto = "X-Salada";
            preco = 15.00;
            break;
        case 3:
            produto = "X-Bacon";
            preco = 18.00;
            break;
        case 4:
            produto = "Bauru";
            preco = 12.00;
            break;
        case 5:
            produto = "Refrigerante";
            preco = 8.00;
            break;
        case 6:
            produto = "Suco de laranja";
            preco = 13.00;
            break;
        default:
            System.out.println("Opção inválida!");
    }

    if (!produto.isEmpty()) { // Verifica se o nome do produto foi definido
        double total = preco * quantidade; // Calcula o total
        System.out.println("\nSeu pedido de " + produto + " vai custar R$: " + total);
    }
}
}