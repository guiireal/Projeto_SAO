package br.com.cidacastello.java.sao.domain.model;

/**
 * CLASSE VELOCIDADE DE CORTE
 * 
 * @author Cida
 */
public class VelocidadeDeCorte {

    private double vcmc; // Velocidade de minimo custo
    private double vcmXp; // Velocidade maxima produ‹o
    private double vcmLim; // Mínimo custo limite

    public void calcularVcmc(Peca peca, Custo custo) {
        vcmc = Math.pow(((peca.getK() * (custo.getSh() + custo.getSm())) / (60 * (peca.getX() - 1) * (custo.getKft() + 
                       ((custo.getSh() + custo.getSm()) / 60) * custo.getTft()))), (1 / peca.getX()));
    }

    public void calcularVcmXp(Peca peca, Custo custo) {
        vcmXp = Math.pow((peca.getK() / ((peca.getX() - 1) * custo.getTft())), (1 / peca.getX()));
    }

    public void calcularVcmLim(Peca peca, Custo custo) {
        vcmLim = Math.pow(((peca.getK() * (custo.getSh() + custo.getSm())) / (60 * (peca.getX() - 1) * (custo.getKft()))), (1 / peca.getX()));
    }

    public double getVcmc() {
        return vcmc;
    }

    public double getVcmXp() {
        return vcmXp;
    }

    public double getVcmLim() {
        return vcmLim;
    }
    
}
