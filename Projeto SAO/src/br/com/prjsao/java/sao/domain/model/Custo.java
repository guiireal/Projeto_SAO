package br.com.cidacastello.java.sao.domain.model;

/**
 * CLASSE DE CUSTO
 * 
 * @author Cida
 */
public class Custo {
    
    private double sh; // custo salario homem
    private double cm; // custo do material
    private double kft; // custo da aresta
    private double tft; // tempo de troca da ferramenta
    private double ctu; // custos tempo passivo
    private double sm; // custo salario maquina	
    
    /*
     * GETTERS E SETTERS
     */
    public double getSh() {
        return sh;
    }

    public double getCm() {
        return cm;
    }

    public double getKft() {
        return kft;
    }

    public double getTft() {
        return tft;
    }

    public double getCtu() {
        return ctu;
    }

    public double getSm() {
        return sm;
    }

    public void setSh(double sh) {
        this.sh = sh;
    }

    public void setCm(double cm) {
        this.cm = cm;
    }

    public void setKft(double kft) {
        this.kft = kft;
    }

    public void setTft(double tft) {
        this.tft = tft;
    }

    public void setCtu(double ctu) {
        this.ctu = ctu;
    }

    public void setSm(double sm) {
        this.sm = sm;
    }

}
