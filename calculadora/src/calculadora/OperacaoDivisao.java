package calculadora;

import calculadora.OperacaoSomar.Operacao;

public class OperacaoDivisao {
	    @Override
	    public double calcular(double num1, double num2) {
	        if (num2 != 0) {
	            return num1 / num2;
	        } else {
	            throw new ArithmeticException("Divisão por zero não é permitida!");
	        }
	    }
	}
