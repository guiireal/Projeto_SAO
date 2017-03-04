/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cidacastello.java.sao.repository;

import br.com.cidacastello.java.sao.domain.exception.PecaException;
import br.com.cidacastello.java.sao.domain.model.Peca;

/**
 *
 * @author Cida
 */
public interface PecaDAO {
    
    void inserir(Peca peca) throws PecaException;
    
    void atualizar(Peca peca) throws PecaException;
    
    void apagar(Peca peca) throws PecaException;
    
    void apagar(Integer id) throws PecaException;
    
  
        
   
    
}
