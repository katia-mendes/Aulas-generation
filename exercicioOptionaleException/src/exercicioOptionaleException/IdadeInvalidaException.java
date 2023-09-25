package exercicioOptionaleException;
import java.util.Optional;
// Exceção personalizada para idade inválida
public class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}
	
