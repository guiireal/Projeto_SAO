package br.com.cidacastello.java.sao.domain.model;

/**
 * CLASSE PEÇA
 * 
 * @author Cida
 */
public class Peca extends Entidade<Integer> {

    private int idPeca;
    private String descricao;
    private int quantidade;
    private double margemContribuicao;
    private int prazoEntrega;  // Dias
    double totalMargemContribuicao;

    public double getTotalMargemContribuicao() {
        this.totalMargemContribuicao = this.quantidade * this.margemContribuicao;
        return totalMargemContribuicao;
    }

    public void setTotalMargemContribuicao(double totalMargemContribuicao) {
        this.totalMargemContribuicao = totalMargemContribuicao;
    }
    private double d; // diametro  
    private double lf; // percurso do avanco
    private double f; // avanco
    private double k; // constante material
    private double x; // constante de Taylor

    public int getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(int idPeca) {
        this.idPeca = idPeca;
    }

    public Peca() {
        super();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getD() {
        return d;
    }

    public double getLf() {
        return lf;
    }

    public double getF() {
        return f;
    }

    public double getK() {
        return k;
    }

    public double getX() {
        return x;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setLf(double lf) {
        this.lf = lf;
    }

    public void setF(double f) {
        this.f = f;
    }

    public void setK(double k) {
        this.k = k;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getMargemContribuicao() {
        return margemContribuicao;
    }

    public void setMargemContribuicao(double margemContribuicao) {
        this.margemContribuicao = margemContribuicao;
    }

    public int getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(int prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    @Override
    public String toString() {
        return "Peca{" + "descricao=" + descricao + ", quantidade=" + quantidade + '}';
    }

}
