package br.com.cidacastello.java.sao.colony;

/**
 * CLASSE PORCENTAGEM
 * 
 * @author Guilherme
 */
public class Porcentagem {
    
    double sh; // Salario homem
    double cm; // Custo do material
    double kft; // Custo de cada aresta
    double tft; // Tempo de troca da ferramenta
    double ctu; // Custos tempos passivos
    double sm;  // Salário maquina
    
    /**
     * CONSTRUTOR CRIA UM OBJETO DO TIPO PORCENTAGEM INICIALIZANDO SEUS PARÂMETROS COM OS DA FORMIGA
     * 
     * @param formiga - PARÂMETROS INICIALIZADOS COM BASE EM UMA FORMIGA
     */
    public Porcentagem(Formiga formiga) {
        this.sh = formiga.sh;
        this.cm = formiga.cm;
        this.kft = formiga.kft;
        this.tft = formiga.ctu;
        this.sm = formiga.sm;
    }
  
}
