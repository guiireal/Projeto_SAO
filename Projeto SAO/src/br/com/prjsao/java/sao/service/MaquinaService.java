/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cidacastello.java.sao.service;

import br.com.cidacastello.java.sao.domain.exception.MaquinaException;
import br.com.cidacastello.java.sao.domain.model.Maquina;
import java.util.Collection;

/**
 *
 * @author Cida
 */
public interface MaquinaService {
    
    void validar(Maquina maquina) throws MaquinaException;
    
    void salvar(Maquina maquina) throws MaquinaException;
    
    void apagar(Maquina maquina) throws MaquinaException;
    
    void apagarTudo() throws MaquinaException;
    
    Collection<Maquina> listar() throws MaquinaException;
    
    
    
}
