package br.com.Grupo07.db.dao;

// Importa pacotes de servicos e contrutores.
import br.com.Grupo07.construtor.produto.Marca;
import br.com.Grupo07.construtor.produto.Modelo;
import br.com.Grupo07.construtor.produto.Produto;
import br.com.Grupo07.servicos.ServicosEstoque;
import java.io.IOException;

// Importa pacotes para conexao.
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe que faz comandos na tabela do estoque para banco de dados.
 *
 * @author Grupo 07
 */
public class DaoEstoque {

    // Variavel que recebe quantidade.
    private int quantidade;
    // Recebe conexao.
    private static Connection con = null;

    // Funcao para conectar.
    public void Conectar() throws SQLException {

        // Objeto recebe metodo de conexao.
        con = Conexao.getConexao();

    }

    // Funcao para desconectar.
    public void Desconectar() throws SQLException {

        // Objeto recebe metodo cancelar conexao.
        con.close();

    }

    /**
     * Funcao que diminui quantidade de produto.
     *
     * @param id do produto.
     * @param quantidade para diminuir.
     * @throws SQLException
     */
    public void diminuirQuantidadeProduto(int id, int quantidade) throws SQLException, IOException {

        // Conecta.
        Conectar();

        // Declara objeto com os comandos de servico do estoque.
        ServicosEstoque comandoProduto = new ServicosEstoque();

        // Pega produto pelo metodo getProduto com id.
        Produto produto = comandoProduto.getProduto(id);

        // Variavel que recebe quantidade atual do produto.
        int quantidadeAnterior = produto.getQuantidade();

        // Faz o calculo de quantidade anterior - quantidade desejada.
        int resultadoQ = quantidadeAnterior - quantidade;

        // Comando SQL.
        String slq = "UPDATE produto SET quantidade = ? WHERE id_produto = ?";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setInt(1, resultadoQ);
        stmt.setInt(2, id);

        // Executa.
        stmt.execute();

    }

    /**
     * Funcao que verifica quantidade do produto.
     *
     * @param id de produto.
     * @param quantidade para verificacao.
     * @return true se maior que a em estoque e false se for aceita.
     * @throws SQLException
     */
    public boolean verificarQuantidade(int id, int quantidade) throws SQLException {

        // Conecta.
        Conectar();

        // Comando SQL.
        String slq = "SELECT quantidade FROM produto WHERE "
                + "id_produto = ? ";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setInt(1, id);

        // Executa e recebe dados.
        ResultSet result = stmt.executeQuery();

        // Variavel que ira receber quantidade no banco.
        int quantidadeBanco = 0;

        // Loop com resultado.
        while (result.next()) {

            // recebe quantidade do banco.
            quantidadeBanco = result.getInt("quantidade");

        }

        // Verifica se quantidade eh maior que no banco.
        if (quantidadeBanco < quantidade) {

            // Mantem quantidade.
            setQuantidade(quantidadeBanco);

            return true;

        // Se nao diminui.   
        } else {

            // Diminui quantidade.
            setQuantidade(quantidadeBanco - quantidade);

            return false;

        }

    }

    // Get e Set de quantidade.
    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Funcao que verifica existencia do produto.
     *
     * @param produto
     * @param marca
     * @param modelo
     * @return true se for existente e false se nao.
     * @throws SQLException
     */
    public boolean verificarExistenciaProduto(Produto produto, Marca marca, Modelo modelo) throws SQLException {

        int cont = 0;

        // Conecta.
        Conectar();

        // Comando SQL.
        String slq = "SELECT * FROM produto "
                + "INNER JOIN marca "
                + "ON produto.id_marca = marca.id_marca "
                + "INNER JOIN modelo "
                + "ON produto.id_modelo = modelo.id_modelo "
                + "WHERE "
                + "modelo = ? "
                + "AND marca = ? "
                + "AND cor = ? "
                + "AND genero = ? "
                + "AND tamanho = ? "
                + "AND ativo = ?";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setString(1, modelo.getModelo());
        stmt.setString(2, marca.getMarca());
        stmt.setString(3, produto.getCor());
        stmt.setString(4, produto.getGeneros());
        stmt.setInt(5, produto.getTamanho());
        stmt.setBoolean(6, true);

        // Executa e recebe resultado.
        ResultSet result = stmt.executeQuery();

        // Retorna true se existir
        while (result.next()) {

            if (cont == 2) {

                return true;

            }

        }

        // Retorna false se nao.
        return false;

    }

}
