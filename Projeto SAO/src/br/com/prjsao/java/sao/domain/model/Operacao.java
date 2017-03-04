package br.com.cidacastello.java.sao.domain.model;

/**
 * CLASSE QUE REPRESENTA UMA OPERAÇÃO: (ENVOLVE MÁQUINA-PEÇA-FERRAMENTA)
 *
 * @author Cida
 */
public class Operacao extends Entidade<Integer> {

    private Maquina maquina;
    private Peca peca;
    private double tempoOcupacaoMaquinaPeca;
    private double tempoTotalOperacao;
    private String descricao;  //por exemplo P1M1 => peça 1 Maquina 1

    /**
     * CONSTRUTOR CRIA UMA OPERAÇÃO E PASSA O CONSTRUTOR PAI DA CLASSE "Entidade"
     */
    public Operacao() {
        super();
    }

    /*
     * GETTERS E SETTERS
     */
    public Maquina getMaquina() {
        return maquina;
    }

    public double getTempoTotalOperacao() {
        return tempoTotalOperacao;
    }

    public void setTempoTotalOperacao(double tempoTotalOperacao) {
        this.tempoTotalOperacao = tempoTotalOperacao;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public double getTempoOcupacaoMaquinaPeca() {
        return tempoOcupacaoMaquinaPeca;
    }

    public void setTempoOcupacaoMaquinaPeca(double tempoOcupacaoMaquinaPeca) {
        this.tempoOcupacaoMaquinaPeca = tempoOcupacaoMaquinaPeca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Operacao{" + "maquina=" + maquina + ", peca=" + peca + ", tempoOcupacaoMaquinaPeca=" + tempoOcupacaoMaquinaPeca + '}';
    }

}
