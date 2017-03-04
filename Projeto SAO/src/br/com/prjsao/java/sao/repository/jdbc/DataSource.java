/*
 * Classe provedora para o banco de dados
 */
package br.com.cidacastello.java.sao.repository.jdbc;

import br.com.cidacastello.java.sao.repository.exception.DataBaseException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Cida
 */
public class DataSource {

    public static final String DRIVER;
    public static final String URL;
    public static final String USER;
    public static final String PASSWORD;
    //valores ainda deverão ser definidos

    static {
        DRIVER = "com.mysql.jdbc.Driver";
        URL = "jdbc:mysql://localhost:3306/mydbsao";
        USER = "sao-dbuser";
        PASSWORD = "saodbuser";
    }

    private DataSource() {
        super();
    }

    public static Connection getConnection() throws DataBaseException {

        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException cause) {
            throw new DataBaseException("Problemas ao conectar com o banco de dados", cause);
        } catch (ClassNotFoundException cause) {
            throw new DataBaseException("Problemas ao carregar o Driver", cause);
        } catch (Throwable cause) {
            throw new DataBaseException(cause);
        }
    }

    public static void close(Connection connection) throws DataBaseException {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException cause) {
            throw new DataBaseException("Problemas ao fechar conexão", cause);
        }
    }
}
