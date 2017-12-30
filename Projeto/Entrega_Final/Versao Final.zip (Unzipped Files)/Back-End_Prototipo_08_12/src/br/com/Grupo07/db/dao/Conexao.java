package br.com.Grupo07.db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Classe que conecta com o banco de dados.
 *
 * @author Grupo 07
 */
public class Conexao {

    // Variavel que recebe conexao.
    public static Connection connection = null;

    /**
     * Funcao que conecta com o banco de dados se nao estiver conectado.
     *
     * @return conexao
     * @throws java.sql.SQLException
     */
    public static Connection getConexao() throws SQLException {

        if (connection == null || connection.isClosed()) {

            String dbURL = "jdbc:mysql://127.0.0.1:3311/loja";

            Properties properties = new Properties();
            properties.put("user", "root");
            properties.put("password", "root");

            connection = DriverManager.getConnection(dbURL, properties);
        }

        return connection;
        
    }

}
