package br.com.cidacastello.java.sao.domain.model;

/**
 * CLASSE DE PREÇO
 * 
 * @author Cida
 */
public class Preco {

    private double kp; // custo variavel por peça
    private double tp; // preço inicial de venda

    public void calcularKp(Custo custo, double tc, double vidaFerramenta) {
        kp = (custo.getCtu() + custo.getCm()) + (tc / 60 * (custo.getSh() + custo.getSm())) + 
             ((tc / vidaFerramenta) * (custo.getKft() + custo.getTft() / 60 * (custo.getSh() + custo.getSm())));
    }

    public void calcularTp(Imposto imposto) {
        tp = this.kp / ((1 - imposto.getMc() / 100) * (1 - imposto.getTx() / 100));
    }

    public double getKp() {
        return kp;
    }

    public double getTp() {
        return tp;
    }
    
}
