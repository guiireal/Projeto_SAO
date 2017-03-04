package br.com.cidacastello.java.sao.domain.model;

import br.com.cidacastello.java.sao.domain.exception.MaquinaException;
import java.util.Objects;

/**
 * CLASSE QUE REPRESENTA UMA MÁQUINA
 * 
 * @author Cida
 */
public class Maquina extends Entidade<Integer> implements Comparable<Maquina>{
    
    private int id; // Identificação da máquina
    private String descricaoDaMaquina; // Descrição da máquina
    private double tempoTotal; // Tempo da jornada de trabalho
    private double ociosidade_gargalo;  // Tempo líquido
    private double tempoTotalOcupacao; // Tempo total de ocupação
    
    private boolean gargalo; //true = maquina gargalo, incluído em 18/08/2015

    /**
     * CONSTRUTOR QUE CRIA E SETA OS VALORES DEFAULT DOS ATRIBUTOS
     */
    public Maquina() {
        super();
        this.ociosidade_gargalo=0;
        this.tempoTotalOcupacao=0;
        this.gargalo=false;
    }
    
    /**
     * METODO QUE SETA A IDENTIFICAÇÃO DA MÁQUINA
     * 
     * @param id NUMERAÇÃO DA MÁQUINA
     */
    public void setIdMaquina(int id) {
        this.id = id;
    }
    
    /**
     * VALIDA A DESCRIÇÃO
     * 
     * @throws MaquinaException - LANÇA UMA EXCESSÃO DO TIPO "MaquinaException" , SE PASSADO UMA DESCRIÇÃO INEXISTENTE
     */
    public void validarDescricao() throws MaquinaException{
        if (getDescricaoDaMaquina() == null){
            throw new MaquinaException("Descrição da Máquina nulo");
        }
        if (getDescricaoDaMaquina().isEmpty()){
            throw new MaquinaException("Por favor, informe a descrição da máquina");
        }
    }
       
    
    /**
     * PEGA A DESCRIÇÃO DA MÁQUINA
     * 
     * @return A DESCRIÇÃO DA MÁQUINA
     */
    public String getDescricaoDaMaquina() {
        return descricaoDaMaquina;
    }

    /**
     * PEGA O TEMPO TOTAL
     * 
     * @return O TEMPO TOTAL
     */
    public double getTempoTotal() {
        return tempoTotal;
    }

    /**
     * MODIFICA A DESCRIÇÃO DA MÁQUINA
     * 
     * @param descricaoDaMaquina - MODIFICA A DESCRIÇÃO DA MÁQUINA
     */
    public void setDescricaoDaMaquina(String descricaoDaMaquina) {
        this.descricaoDaMaquina = descricaoDaMaquina;
    }

    /**
     * MODIFICA O TEMPO TOTAL
     * 
     * @param tempoTotal - MODIFICA O TEMPO TOTAL
     */
    public void setTempoTotal(double tempoTotal) {
        this.tempoTotal = tempoTotal;
        
    }   

    /*
     * GETTERS E SETTERS
     */
    public double getOciosidade_gargalo() {
        return ociosidade_gargalo;
    }

    public void setOciosidade_gargalo(double ociosidade_gargalo) {
        this.ociosidade_gargalo = ociosidade_gargalo;
    }

    public double getTempoTotalOcupacao() {
        return tempoTotalOcupacao;
    }

    public void setTempoTotalOcupacao(double tempoTotalOcupacao) {
        this.tempoTotalOcupacao = tempoTotalOcupacao;
    }

    public boolean isGargalo() {
        return gargalo;
    }

    public void setGargalo(boolean gargalo) {
        this.gargalo = gargalo;
    }
    
    /**
     * RETORNA UMA REPRESENTAÇÃO EM STRING DO OBJETO "Máquina"
     * 
     * @return A DESCRIÇÃO DA MÁQUINA
     */
    @Override
    public String toString() {
        return this.descricaoDaMaquina;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.descricaoDaMaquina);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.tempoTotal) ^ (Double.doubleToLongBits(this.tempoTotal) >>> 32));
        return hash;
    }

    /**
     * VERIFICA SE UMA MÁQUINA É IGUAL A OUTRA
     * 
     * @param obj - MÁQUINA A SER COMPARADA
     * @return VERDADEIRO SE FOREM IGUAIS , FALSO SE FOREM DIFERENTES
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Maquina other = (Maquina) obj;
        if (!Objects.equals(this.descricaoDaMaquina, other.descricaoDaMaquina)) {
            return false;
        }
        return Double.doubleToLongBits(this.tempoTotal) == Double.doubleToLongBits(other.tempoTotal);
    }

    /**
     * COMPARA UMA MÁQUINA COM OUTRA
     * 
     * @param outro - OUTRA MÁQUINA A SER COMPARADA
     * @return A COMPARAÇÃO EM INTEIRO
     */
    @Override
    public int compareTo(Maquina outro) {
        int comp = this.descricaoDaMaquina.compareTo(outro.getDescricaoDaMaquina());
        
        return comp;
    }
    
}
