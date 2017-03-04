package br.com.cidacastello.java.sao.colony;

/**
 * CLASSE ESTADO
 *
 * @author Guilherme
 */
public class Estado {

    double sh; // Salario homem
    double cm; // Custo do material
    double kft; // Custo de cada aresta
    double tft; // Tempo de troca da ferramenta
    double ctu; // Custos tempos passivos
    double sm;  // Salário maquina
    double pesoW; // Peso de cada solução
    double probabilidade; // Probabilidade de cada solução
    double vcmc; // Velocidade de mínimo custo
    double vcmcLim;
    double vcmXp;
    double kpVcmc;
    double kpVcmcLim;
    double kpVcmXp;
    double tpVcmc;
    double tpVcmcLim;
    double tpVcmXp;

    /**
     * CONSTRUTOR CRIA UM ESTADO
     * 
     * @param formiga - INICIALIZA OS VALORES DE ESTADO COM BASE NA FORMIGA
     */
    public Estado(Formiga formiga) {
        this.sh = formiga.sh; // Salario homem
        this.cm = formiga.cm; // Custo do material
        this.kft = formiga.kft; // Custo de cada aresta
        this.tft = formiga.tft; // Tempo de troca da ferramenta
        this.ctu = formiga.ctu; // Custos tempos passivos
        this.sm = formiga.sm;  // Salário maquina
        this.pesoW = formiga.pesoW;// Peso de cada solução
        this.probabilidade = formiga.probabilidade; // Probabilidade de cada solução
        this.vcmc = formiga.vcmc; // Velocidade de minimo custo
        this.vcmcLim = formiga.vcmcLim;	
        this.vcmXp = formiga.vcmXp;
        this.kpVcmc = formiga.kpVcmc;
        this.kpVcmcLim = formiga.kpVcmcLim;
        this.kpVcmXp = formiga.kpVcmXp;
        this.tpVcmc = formiga.tpVcmc;
        this.tpVcmcLim = formiga.tpVcmcLim;
        this.tpVcmXp = formiga.tpVcmXp;
    }

}
