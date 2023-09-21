package calculadora;

public class OperacaoSomar {
	interface Operacao {
	    double calcular(double num1, double num2);
	}

	class Soma implements Operacao {
	    @Override
	    public double calcular(double num1, double num2) {
	        return num1 + num2;
	    }
	}
}

	

	

	

	

	