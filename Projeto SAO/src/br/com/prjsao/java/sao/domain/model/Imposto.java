package br.com.cidacastello.java.sao.domain.model;

/**
 * CLASSE DE IMPOSTO
 * 
 * @author Cida
 */
public class Imposto {

    private double mc; // margem de contribui‹o
    private double tx; // taxas de impostos
    
    /*
     * GETTERS E SETTERS
     */
    public double getMc() {
        return mc;
    }

    public double getTx() {
        return tx;
    }

    public void setMc(double mc) {
        this.mc = mc;
    }

    public void setTx(double tx) {
        this.tx = tx;
    }
    
}
