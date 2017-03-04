/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cidacastello.java.sao.service.impl;

import br.com.cidacastello.java.sao.domain.exception.MaquinaException;
import br.com.cidacastello.java.sao.domain.model.Maquina;
import br.com.cidacastello.java.sao.repository.MaquinaDAO;
import br.com.cidacastello.java.sao.repository.jdbc.DefaultMaquinaDAO;
import br.com.cidacastello.java.sao.service.MaquinaService;
import java.util.Collection;

/**
 *
 * @author Cida
 */
public class MaquinaManager implements MaquinaService {

    public MaquinaDAO dao;

    public MaquinaManager() {
        super();
        this.dao = new DefaultMaquinaDAO();
    }

    @Override
    public void validar(Maquina maquina) throws MaquinaException {
        maquina.validarDescricao();
    }

    @Override
    public void salvar(Maquina maquina) throws MaquinaException {
        if (maquina.getId() == null) {
            this.dao.inserir(maquina);
        } else {
            this.dao.atualizar(maquina);
        }
    }

    @Override
    public void apagar(Maquina maquina) throws MaquinaException {
        this.dao.apagar(maquina);
    }

    @Override
    public Collection<Maquina> listar() throws MaquinaException {
       return this.dao.selecionar();
    }

    @Override
    public void apagarTudo() throws MaquinaException {
        this.dao.apagarTudo();
    }
}
