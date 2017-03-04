/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cidacastello.java.sao.repository.jdbc;

import br.com.cidacastello.java.sao.domain.exception.PecaException;
import br.com.cidacastello.java.sao.domain.model.Peca;
import br.com.cidacastello.java.sao.repository.PecaDAO;
import br.com.cidacastello.java.sao.repository.exception.DataBaseException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Cida
 */
public class DefaultPecaDAO implements PecaDAO{

    public DefaultPecaDAO() {
        super();
    }

    
    @Override
    public void inserir(Peca peca) throws PecaException {
        Connection c = null;
        PreparedStatement query = null;
        String sql = null;
        
        assert (peca != null);
        assert (peca.getId() == null);

        try{
            try{
                sql= "insert into tb_peca(PEC_DESCRICAO, PEC_QUANTIDADE, PEC_DIAMETRO,PEC_PERCURSO,PEC_AVANCO,PEC_MATERIAL, TB_TAYLOR)"
                        + " values (?, ?, ?,?,?,?,?)";
                c = DataSource.getConnection();
                query = c.prepareStatement(sql);
                
                query.setString(1, peca.getDescricao());
                query.setInt(2, peca.getQuantidade());
                query.setDouble(3, peca.getD());
                query.setDouble(4, peca.getLf());
                query.setDouble(5, peca.getF());
                query.setDouble(6, peca.getK());
                query.setDouble(7, peca.getX());
                               
                query.executeUpdate();
            } catch(SQLException cause){
                throw new PecaException("Problema ao inserir Peça", cause);
                
            }finally{
                DataSource.close(c);
            }
        }  catch(DataBaseException cause){
            throw new PecaException(cause);
        }
    }

    @Override
    public void atualizar(Peca peca) throws PecaException {
        Connection c = null;
        PreparedStatement query = null;
        String sql = null;

        assert (peca != null);
        assert (peca.getId() == null);

        try{
            try{

                sql= "update tb_peca SET PEC_DESCRICAO = ?, PEC_QUANTIDADE = ?, PEC_DIAMETRO = ?,"
                        + "PEC_PERCURSO = ?,PEC_AVANCO = ?,PEC_MATERIAL = ?, TB_TAYLOR = ? ";                   
                c = DataSource.getConnection();
                query = c.prepareStatement(sql);
                
                query.setString(1, peca.getDescricao());
                query.setInt(2, peca.getQuantidade());
                query.setDouble(3, peca.getD());
                query.setDouble(4, peca.getLf());
                query.setDouble(5, peca.getF());
                query.setDouble(6, peca.getK());
                query.setDouble(7, peca.getX());
                
                query.executeUpdate();
            } catch(SQLException cause){
                throw new PecaException("Problema ao inserir Peça", cause);
                
            }finally{
                DataSource.close(c);
            }
        }  catch(DataBaseException cause){
            throw new PecaException(cause);
        }
    }
    
    @Override
    public void apagar(Peca peca) throws PecaException {
        if(peca.getId() == null){
          throw new PecaException("Impossível apagar Peça");
        }
        this.apagar(peca.getId());
    }

    @Override
    public void apagar(Integer id) throws PecaException {
        Connection c = null;
        PreparedStatement query = null;
        String sql = null;
       
        try{
            try{
                sql= "DELETE FROM tb_peca WHERE ID_CODPECA = ? ";
                c = DataSource.getConnection();
                query = c.prepareStatement(sql);
                
                query.setInt(1,id);

                query.executeUpdate();

            } catch(SQLException cause){
                throw new PecaException("Problema ao apagar Peça", cause);
                
            }finally{
                DataSource.close(c);
            }
        }  catch(DataBaseException cause){
            throw new PecaException(cause);
        }
    }

}