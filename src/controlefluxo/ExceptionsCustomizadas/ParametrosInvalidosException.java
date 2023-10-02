package controlefluxo.ExceptionsCustomizadas;

/**
 *
 * @author J.Emanuel
 */
public class ParametrosInvalidosException extends  Exception{

    public ParametrosInvalidosException() {
    }

    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
