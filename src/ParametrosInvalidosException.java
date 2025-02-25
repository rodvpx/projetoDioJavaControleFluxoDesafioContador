
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);  // Passando a mensagem para a classe pai (Exception)
    }
}