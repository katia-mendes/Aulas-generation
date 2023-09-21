package VariáveiseOperadores;
import java.util.Scanner;
public class VariáveiseOperadores {
	public static void main(String[] args) {

	
     // Inicializa e declara as variáveis
	 float salarioMensal, abono, novoSalario; 
	 String mes;
	 Scanner entrada= new Scanner(System.in);
	  
	 // Digite o Salário
	 System.out.println("Digite o Salário:");
     salarioMensal = entrada.nextFloat(); // Leia o salário como um número de ponto flutuante

	  
    //Digite o abono
	System.out.println("Digite o Abono:");
    abono = entrada.nextFloat(); // Leia o abono como um número de ponto flutuante
      
    //Calcular o novo salário
    novoSalario = salarioMensal + abono;
	  
    //Exibir o novo salário
    System.out.println("Você deverá receber " + novoSalario + " este mês.");
    }
}

