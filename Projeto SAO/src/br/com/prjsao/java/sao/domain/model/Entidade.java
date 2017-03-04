package br.com.cidacastello.java.sao.domain.model;

/**
 * CLASSE ENTIDADE
 * 
 * @author Cida
 * @param <PK> - CHAVE PRIMÁRIA
 */
public class Entidade<PK> {

    private PK id;

    /*
     * GETTERS E SETTERS
     */
    public Entidade() {
        super();
    }

    public PK getId() {
        return id;
    }

    public void setId(PK id) {
        this.id = id;
    }
    
}
