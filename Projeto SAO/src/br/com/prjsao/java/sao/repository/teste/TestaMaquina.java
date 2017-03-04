/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cidacastello.java.sao.repository.teste;

import br.com.cidacastello.java.sao.domain.model.Maquina;
import br.com.cidacastello.java.sao.repository.jdbc.DefaultMaquinaDAO;

/**
 *
 * @author Cida
 */
public class TestaMaquina {
    
    public static void main(String[] args) {
        int idDB;
        DefaultMaquinaDAO dao;
        Maquina maquina;
        
        maquina = new Maquina();
        dao = new DefaultMaquinaDAO();
        
        maquina.setDescricaoDaMaquina("Freza");
        maquina.setTempoTotal(480);
        
        try{
            dao.inserir(maquina);
            idDB = dao.pegarUltimoID();
            System.out.println("Ultimo ID " + idDB);
            
            
        } catch(Exception cause){
            cause.printStackTrace();
        }
        
        System.out.println("OK");
    }
    
}
