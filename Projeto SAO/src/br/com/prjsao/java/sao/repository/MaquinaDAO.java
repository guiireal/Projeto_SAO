/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cidacastello.java.sao.repository;

import br.com.cidacastello.java.sao.domain.exception.MaquinaException;
import br.com.cidacastello.java.sao.domain.model.Maquina;
import java.util.Set;

/**
 *
 * @author Cida
 */
public interface MaquinaDAO {
    
    void inserir(Maquina maquina) throws MaquinaException;
    
    void atualizar(Maquina maquina) throws MaquinaException;
    
    void apagar(Maquina maquina) throws MaquinaException;
    
    void apagar(Integer id) throws MaquinaException;
    
    void apagarTudo() throws MaquinaException;
    
    Set<Maquina> selecionar() throws MaquinaException;
    
}
