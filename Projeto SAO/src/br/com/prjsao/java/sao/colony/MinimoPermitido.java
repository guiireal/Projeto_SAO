package br.com.cidacastello.java.sao.colony;

/**
 * CLASSE MÍNIMO PERMITIDO
 * 
 * @author Edinilson
 * @update Guilherme
 */
public class MinimoPermitido {

    double sh; // Salario homem
    double cm; // Custo do material
    double kft; // Custo de cada aresta
    double tft; // Tempo de troca da ferramenta
    double ctu; // Custos tempos passivos
    double sm; // Salário maquina        

    /**
     * CONSTRUTOR INICIALIZA UM OBJETO MÍNIMO PERMITIDO
     * 
     * @param formiga - COPIA OS VALORES DE UMA FORMIGA
     */
    public MinimoPermitido(Formiga formiga){
        this.sh = formiga.sh;
        this.cm = formiga.cm;
        this.kft = formiga.kft;
        this.tft = formiga.tft;
        this.ctu = formiga.ctu;
        this.sm = formiga.sm;
    }

}

