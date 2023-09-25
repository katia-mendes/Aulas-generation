package exercicioOptionaleException;
//Exceção personalizada para cliente não encontrado
public class ClienteNaoEncontradoException extends Exception {
 public ClienteNaoEncontradoException(String mensagem) {
     super(mensagem);
 }
}
