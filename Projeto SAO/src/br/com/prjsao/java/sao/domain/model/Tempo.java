package br.com.cidacastello.java.sao.domain.model;

/**
 * CLASSE DE TEMPO
 *
 * @author Cida
 */
public class Tempo {

    private double tc; // tempo de corte
    private double vidaFerramenta;

    public void calcularTc(Peca peca, VelocidadeDeCorte vc, Custo custo) {
        tc = (peca.getLf() * Math.PI * peca.getD()) / (1000 * peca.getF() * vc.getVcmc());
    }

    public void calcularVidaFerramenta(Peca peca, VelocidadeDeCorte vc, Custo custo) {
        vidaFerramenta = peca.getK() * Math.pow(vc.getVcmc(), (-peca.getX()));
    }

    public double getTc() {
        return tc;
    }

    public double getVidaFerramenta() {
        return vidaFerramenta;
    }
    
}
