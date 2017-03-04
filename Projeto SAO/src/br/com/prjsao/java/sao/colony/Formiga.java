package br.com.cidacastello.java.sao.colony;

import br.com.cidacastello.java.sao.domain.model.Maquina;
import br.com.cidacastello.java.sao.domain.model.Operacao;
import br.com.cidacastello.java.sao.domain.model.Peca;

/**
 * CLASSE FORMIGA
 * 
 * @author Edinilson
 */
public class Formiga {

    Peca pecaExtraMC[], pecaExtraPE[]; // Vetores de peças
    Maquina maquina[]; // Vetor de máquinas
    Operacao operacao[], auxOperacao[]; // Vetor de operações
    public final double PI = 3.14159;
    double sh; // Salario homem
    double cm; // Custo do material
    double kft;// Custo de cada aresta
    double tft; // Tempo de troca da ferramenta
    double ctu; // Custos tempos passivos
    double sm; // Salário maquina
    double pesoW; // Peso de cada solução
    double probabilidade; // Probabilidade de cada solução
    double vcmc; // Velocidade de minimo custo
    double vcmcLim; 
    double vcmXp; 
    double kpVcmc, kpVcmcLim, kpVcmXp; 
    double tpVcmc, tpVcmcLim, tpVcmXp;       
    double d; // Diametro da peça
    double lf; // Percuros de avanço
    double f; //  Avanço
    double k; //  Constante do material
    double x; //  Coeficiente de Taylor
    double mc; // Margem de contribuição
    double tx; // Taxas
    Porcentagem stPercParametros = new Porcentagem(this);
    Fixos stFixo = new Fixos(this);
    MinimoPermitido stMinimoPermitido = new MinimoPermitido(this);
    Estado stInicial, stMelhor, stSucessor = new Estado(this);
    Estado[] stAtual = new Estado[Colonia.k];
    Estado[] formiga = new Estado[Colonia.m];

    /**
     * CONSTRUTOR CRIA UMA FORMIGA
     * 
     * @param peca - PASSA UMA PEÇA
     * @param maquina - PASSA UMA MÁQUINA
     * @param operacao - PASSA UMA OPERAÇÃO
     */
    public Formiga(Peca peca[], Maquina maquina[], Operacao operacao[]) {
        this.pecaExtraMC = peca;
        this.pecaExtraPE = peca;
        this.maquina = maquina;
        this.operacao = operacao;
        this.inicializadorDeEstados();
    }
    
    /*
     * INICIALIZA TODAS AS INSTÂNCIAS DOS VETORES
     */
    private void inicializadorDeEstados() {
        for (int i = 0, j = 0; i < Colonia.k && j < Colonia.m; i++, j++) {
            this.stAtual[i] = new Estado(this);
            this.formiga[j] = new Estado(this);
        }   
    }
    
    /**
     * CALCULA A QUANTIDADE MÁXIMA DE PEÇAS POSSÍVEIS PARA O TEMPO
     * DISPONÍVEL (OCIOSIDADE) DA MÁQUINA
     * 
     * @param op - VETOR DE OPERAÇÃO
     */
    public void calcularQtdeMaximaPeca(Operacao op[]) {
        this.auxOperacao = op;
        int qtdeMax;
        for (int i = 0; i < auxOperacao.length; i++) {
            qtdeMax = (int) (operacao[i].getMaquina().getOciosidade_gargalo() / operacao[i].getTempoOcupacaoMaquinaPeca());
            if (auxOperacao[i].getPeca().getQuantidade() >= qtdeMax) 
                auxOperacao[i].getPeca().setQuantidade(qtdeMax);
        }
    }
    
    /**
     * CALCULA A VELOCIDADE DE MÍNIMO CUSTO
     * 
     * @param K
     * @param SH
     * @param SM
     * @param x
     * @param Kft
     * @param Tft
     * @return A VELOCIDADE DE MÍNIMO CUSTO
     */
    public double calculaVcmc(double K, double SH, double SM, double x, double Kft, double Tft){
        double Vcmc;
        Vcmc = Math.pow(((K * (SH + SM)) / (60 * (x - 1) * (Kft + ((SH + SM) / 60) * Tft))) , (1 / x));
        
        return Vcmc;

    }
    
    /**
     * CALCULA VCMCLIM
     * 
     * @param K
     * @param SH
     * @param SM
     * @param x
     * @param Kft
     * @return  O CÁLCULO DE VCMCLIM
     */
    public double calculaVcmcLim(double K, double SH, double SM, double x, double Kft){
        double VcmcLim;
        VcmcLim = Math.pow((K * (SH + SM)) / (60 * (x - 1) * (Kft)), (1 / x));

        return VcmcLim;
    }

    /**
     * CALCULA VCMCXP
     * 
     * @param K
     * @param x
     * @param Tft
     * @return O CÁLCULO DE VCMCXP
     */
    public double calculaVcmXp(double K, double x, double Tft){
        double VcmXp;
        VcmXp = Math.pow((K / ((x - 1) * Tft)), (1 / x));

        return VcmXp;

    }    

    /**
     * CALCULA O TEMPO DE CORTE
     * 
     * @param lf
     * @param d
     * @param f
     * @param Vc
     * @return O TEMPO DE CORTE
     */
    public double calculaTempoCorte(double lf, double d, double f, double Vc){
        double tc;
        tc = (lf * this.PI * d) / (1000 * f * Vc);

        return tc;
    }
    
    /**
     * CALCULA A VIDA DA FERRAMENTA
     * 
     * @param K
     * @param Vc
     * @param x
     * @return O TEMPO DE VIDA DA FERRAMENTA
     */
    public double calculaVidaFerramenta(double K, double Vc, double x){
        double Vida;
        Vida =  Math.pow(K * Vc,(-x));

        return Vida;
    }

    /**
     * CALCULA O CUSTO TOTAL KP
     * 
     * @param sh
     * @param cm
     * @param kft
     * @param tft
     * @param ctu
     * @param sm
     * @param Vc
     * @return O CUSTO TOTAL KP
     */
    public double calculaCustoTotalKp(double sh, double cm, double kft, double tft, double ctu, double sm, double Vc){
        double kp;
        double tc;
        double vida;
        tc = calculaTempoCorte(stFixo.lf, stFixo.d, stFixo.f, Vc);
        vida = calculaVidaFerramenta(stFixo.k, Vc, stFixo.x);
        kp = (ctu + cm) + (tc / 60 * (sh + sm)) + ((tc / vida) * (kft + tft / 60 * (sh + sm)));

        return kp;

    }

    /**
     * CALCULA O PREÇO DE VENDA TP
     * 
     * @param kp
     * @param mc
     * @param tx
     * @return O PREÇO DE VENDA DE TP
     */
    public double calculaPrecoVendaTp(double kp, double mc, double tx){
        double Tp;
        Tp = kp / ((1 - mc / 100) * (1 - tx / 100));

        return Tp;

    }
 
    /**
     * CALCULA A VARIAÇÃO DE PARÂMETRO
     * 
     * @param parametro
     * @param porcentagem
     * @return A VARIAÇÃO DE PARÂMETRO
     */
    public double variacaoParametro(double parametro, double porcentagem){
        double valorMinimo, valorMaximo;
        valorMinimo = parametro * (1 - (porcentagem / 100));
        valorMaximo = parametro * (1 + (porcentagem / 100));

        return 0;
    }

}
