package br.com.cidacastello.java.sao.domain.exception;

/**
 * CLASSE PARA TRATAMENTO DE EXCESSÕES DE MÁQUINAS
 * 
 * @author Cida
 */
public class MaquinaException extends Exception {

    /**
     * ERRO DE MÁQUINA (INFORMA O ERRO ATRAVÉS DE UMA STRING)
     * 
     * @param message - MENSAGEM A SER EXIBIDA PELA EXCEPTION
     */
    public MaquinaException(String message) {
        super(message);
    }

    /**
     * ERRO DE MÁQUINA (INFORMA SUA CAUSA)
     * 
     * @param cause - MENSAGEM DE CAUSA A SER EXIBIDA PELA EXCEPTION
     */
    public MaquinaException(Throwable cause) {
        super(cause);
    }

    /**
     * ERRO DE MÁQUINA (INFORMA UMA MENSAGEM E SUA CAUSA)
     * 
     * @param message - MENSAGEM A SER EXIBIDA PELA EXCEPTION
     * @param cause - MENSAGEM DE CAUSA A SER EXIBIDA PELA EXCEPTION
     */
    public MaquinaException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
