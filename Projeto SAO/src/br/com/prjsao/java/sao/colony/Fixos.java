package br.com.cidacastello.java.sao.colony;

/**
 * CLASSE FIXOS
 * 
 * @author Edinilson
 * @update Guilherme
 */
public class Fixos {
    
    double d; // Diâmetro da peça
    double lf; // Percursos de avanço
    double f; // Avanço
    double k; // Constante do material
    double x; // Coeficiente de Taylor
    double mc; // Margem de contribuição
    double tx; // Taxas
    
    /**
     * CONSTRUTOR CRIA UM OBJETO FIXO
     * 
     * @param formiga - COPIA OS VALORES DA FORMIGA PARA O OBJETO "Fixos"
     */
    public Fixos(Formiga formiga){
        this.d = formiga.d; 
        this.lf = formiga.lf;
        this.f = formiga.f;
        this.k = formiga.k; 
        this.x = formiga.x;
        this.mc = formiga.mc; 
        this.tx = formiga.tx;   
    }
    
}
