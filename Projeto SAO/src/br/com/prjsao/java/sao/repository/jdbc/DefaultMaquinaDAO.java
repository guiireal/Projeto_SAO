package br.com.cidacastello.java.sao.repository.jdbc;

import br.com.cidacastello.java.sao.domain.exception.MaquinaException;
import br.com.cidacastello.java.sao.domain.model.Maquina;
import br.com.cidacastello.java.sao.repository.MaquinaDAO;
import br.com.cidacastello.java.sao.repository.exception.DataBaseException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cida
 */
public class DefaultMaquinaDAO implements MaquinaDAO {

    public DefaultMaquinaDAO() {
        super();
    }

    @Override
    public void inserir(Maquina maquina) throws MaquinaException {
        Connection c = null;
        PreparedStatement query = null;
        String sql = null;

        // assert (maquina != null);
        // assert (maquina.getId() == null);

        try {
            try {
                sql = "INSERT INTO tb_maquina(MQ_DESCRICAO, MQ_TEMPOTOTAL) VALUES(?,?) ";
                c = DataSource.getConnection();
                query = c.prepareStatement(sql);

                query.setString(1, maquina.getDescricaoDaMaquina());
                query.setDouble(2, maquina.getTempoTotal());

                query.executeUpdate();
            } catch (SQLException cause) {
                throw new MaquinaException("Problema ao inserir Máquina", cause);

            } finally {
                DataSource.close(c);
            }
        } catch (DataBaseException cause) {
            throw new MaquinaException(cause);
        }
    }

    @Override
    public void atualizar(Maquina maquina) throws MaquinaException {
        Connection c = null;
        PreparedStatement query;
        String sql;

        assert (maquina != null);
        assert (maquina.getId() == null);

        try {
            try {
                sql = "UPDATE tb_maquina SET MQ_DESCRICAO = ?, MQ_TEMPOTOTAL = ? WHERE ID_CODMAQ = ? ";
                c = DataSource.getConnection();
                query = c.prepareStatement(sql);

                query.setString(1, maquina.getDescricaoDaMaquina());
                query.setDouble(2, maquina.getTempoTotal());
                query.setInt(3, maquina.getId());

                query.executeUpdate();
            } catch (SQLException cause) {
                throw new MaquinaException("Problema ao atualizar Máquina", cause);

            } finally {
                DataSource.close(c);
            }
        } catch (DataBaseException cause) {
            throw new MaquinaException(cause);
        }
    }

    @Override
    public void apagar(Maquina maquina) throws MaquinaException {
        if (maquina.getId() == null) {
            throw new MaquinaException("Impossível apagar Máquina");
        }

        this.apagar(maquina.getId());
    }

    @Override
    public void apagar(Integer id) throws MaquinaException {

        Connection c = null;
        PreparedStatement query = null;
        String sql = null;

        try {
            try {
                sql = "DELETE FROM tb_maquina WHERE ID_CODMAQ = ?";

                c = DataSource.getConnection();
                query = c.prepareStatement(sql);

                query.setInt(1, id);

                query.executeUpdate();

            } catch (SQLException cause) {
                throw new MaquinaException("Problema ao apagar Máquina", cause);

            } finally {
                DataSource.close(c);
            }
        } catch (DataBaseException cause) {
            throw new MaquinaException(cause);
        }
    }
    @Override
    public void apagarTudo() {
        Connection c = null;
        PreparedStatement query = null;
        String sql = "DELETE FROM tb_maquina";
            try {
                c = DataSource.getConnection();
                query = c.prepareStatement(sql);

                query.executeUpdate();

            }  catch (DataBaseException | SQLException ex) {
            Logger.getLogger(DefaultMaquinaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }

    public int pegarUltimoID() throws MaquinaException {
        Connection c = null;
        PreparedStatement query = null;
        String sql = null;

        int ultimoID = 0;

        try {
            try {
                sql = "SELECT MAX(ID_CODMAQ) from tb_maquina";
                c = DataSource.getConnection();
                query = c.prepareStatement(sql);

                ResultSet result = query.executeQuery();

                while (result.next()) {
                    ultimoID = result.getInt(1);
                }
            } catch (SQLException cause) {
                throw new MaquinaException("Problema ao pegar último ID tabela Máquina", cause);
            } finally {
                DataSource.close(c);
            }
        } catch (DataBaseException cause) {
            throw new MaquinaException(cause);
        }

        return ultimoID;

    }

    @Override
    public Set<Maquina> selecionar() throws MaquinaException {

        final Set<Maquina> maquinas;
        Connection c = null;
        PreparedStatement query = null;
        String sql = null;
        
        try{
            maquinas = new TreeSet<Maquina>();
            sql = "SELECT ID_CODMAQ, MQ_DESCRICAO, MQ_TEMPOTOTAL FROM tb_maquina";
            try{
                c = DataSource.getConnection();
                query = c.prepareStatement(sql);
                
                ResultSet results = query.executeQuery();
                
                Maquina maquina = null;
                
                while(results.next()){
                    maquina = new Maquina();
                    maquina.setId(results.getInt("id_codmaq"));
                    maquina.setDescricaoDaMaquina(results.getString("mq_descricao"));
                    maquina.setTempoTotal(results.getDouble("mq_tempototal"));
                    
                    maquinas.add(maquina);
                }
                return maquinas;
            } catch(SQLException cause){
                throw  new MaquinaException("Problema ao consultar maquinas", cause);
            } finally{
                DataSource.close(c);
            } 
        }catch(DataBaseException cause){
                throw  new MaquinaException(cause);
            }

    }
    /*
     public selecionar() throws MaquinaException{
        
      
        
     Connection c = null;
     PreparedStatement query = null;
        
     try{
     maquinas = new TreeSet<Maquina>;
     String sql = "SELECT ID_CODMAQ, MQ_DESCRICAO, MQ_TEMPOTOTAL FROM tb_maquina WHERE ID_CODMAQ=?";
     try{
     c = DataSource.getConnection();
     query = c.prepareStatement(sql);
                
     query.setInt(1, maquina.getId());
                
     ResultSet results = query.executeQuery();
                
     Maquina maquina = null;
                
     while(results.next()){
     maquina = new Maquina();
                    
                    
     }
     }
     }
        
     }
     */
}
