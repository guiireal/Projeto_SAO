package br.com.cidacastello.java.sao.domain.exception;

/**
 * CLASSE PARA TRATAMENTO DE EXCESSÕES DE PEÇAS
 * 
 * @author Cida
 */
public class PecaException extends Exception {

    public PecaException(String message) {
        super(message);
    }

    public PecaException(Throwable cause) {
        super(cause);
    }

    public PecaException(String message, Throwable cause) {
        super(message, cause);
    }
}
