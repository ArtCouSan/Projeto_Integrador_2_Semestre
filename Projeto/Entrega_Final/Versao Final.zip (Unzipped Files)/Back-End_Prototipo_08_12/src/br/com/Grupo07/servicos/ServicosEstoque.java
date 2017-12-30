package br.com.Grupo07.servicos;

// Importa o pacote com os comados para banco de dados do estoque.
import br.com.Grupo07.construtor.cliente.Cliente;
import br.com.Grupo07.construtor.produto.Marca;
import br.com.Grupo07.construtor.produto.Modelo;
import br.com.Grupo07.db.dao.DaoProduto;
import br.com.Grupo07.db.dao.DaoVenda;
import br.com.Grupo07.db.dao.DaoEstoque;

// Importa os pacotes os construtores do estoque.
import br.com.Grupo07.construtor.produto.Produto;

// Importa os pacote com manipulacao de arquivos e imagens.
import java.io.FileNotFoundException;
import java.io.IOException;

// Importa o pacote com os comandos SQL.
import java.sql.SQLException;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe com os servicos para estqoe.
 *
 * @author Grupo 07
 */
public class ServicosEstoque {

    // Declara objetos com metodos dos daos
    @SuppressWarnings("FieldMayBeFinal")
    private DaoProduto comando = new DaoProduto();
    @SuppressWarnings("FieldMayBeFinal")
    private DaoVenda comando02 = new DaoVenda();
    @SuppressWarnings("FieldMayBeFinal")
    private DaoEstoque comando03 = new DaoEstoque();

    // Declara lista de produtos.
    public ArrayList<Produto> listaProdutos = new ArrayList<>();

    /**
     * Funcao que retira produto do estoque.
     *
     * @param id do produto.
     * @param quantidade do quantidade.
     * @return produto.
     * @throws SQLException
     * @throws IOException
     */
    public Produto retirarProdutoEstoque(int id, int quantidade) throws SQLException, IOException {

        // Conecta.
        comando02.Conectar();

        // Pega produto.
        Produto resultadoProduto = getProduto(id);

        // Retorna produto.
        return resultadoProduto;

    }

    /**
     * Funcao que pega produto.
     *
     * @param id
     * @return produto
     * @throws SQLException
     * @throws IOException
     */
    public Produto getProduto(int id) throws SQLException, IOException {

        // Conecta.
        comando.Conectar();

        // Pega produto.
        ArrayList<Produto> produto = comando.procurar(" ", id, false);

        // Verifica se tem resultado.
        if (produto == null) {

            JOptionPane.showMessageDialog(null, "Produto nao existe", "Erro", JOptionPane.ERROR);

        }

        // Retorna produto.
        return produto.get(0);

    }

    /**
     * Funcao que diminui quantidade do produto.
     *
     * @param id do produto.
     * @param quantidade do produto.
     * @throws SQLException
     * @throws IOException
     */
    public void diminuirQuantidadeProduto(int id, int quantidade) throws SQLException, IOException {

        // Conecta.
        comando.Conectar();

        // Objeto com metodo de diminuir quantidade.
        comando03.diminuirQuantidadeProduto(id, quantidade);

    }

    /**
     * Funcao que insere na lista de itens.
     *
     * @param idProduto pega id do produto
     * @param quantidade pega quantidade do produto
     * @param preco pega preco. do produto
     * @param id da venda.
     * @throws SQLException
     * @throws FileNotFoundException
     */
    public void inserirLista(int idProduto, int quantidade, float preco, int id) throws SQLException, FileNotFoundException {

        // Chama metodo que inseri na lista
        comando02.inserirLista(idProduto, quantidade, preco, id);

    }

    /**
     * Funcao que pega id de lista.
     *
     * @return id da lista.
     * @throws SQLException
     * @throws FileNotFoundException
     */
    public int iDVenda() throws SQLException, FileNotFoundException {

        // Conecta.
        comando.Conectar();

        // Metodo que pega o id da lista.
        int maiorIdVenda = comando02.maiorIdVenda();

        // Retorna o id da lista.
        return maiorIdVenda;

    }

    /**
     * Funcao que verifica posse do produto.
     *
     * @param produto
     * @param marca
     * @param modelo
     * @return true se existir e false se nao.
     * @throws SQLException
     */
    public boolean getPosseProduto(Produto produto, Marca marca, Modelo modelo) throws SQLException {

        // Conecta.
        comando.Conectar();

        // Variavel recebe metodo de verificacao.
        boolean existe = comando03.verificarExistenciaProduto(produto, marca, modelo);

        // Se existir.
        if (existe) {

            return true;

        }

        // Se nao.
        return false;

    }

    /**
     * Funcao que verifica quantidade.
     *
     * @param id do produto.
     * @param quantidade do produto.
     * @return true se a quantidade for maior que em estoque e false se
     * aceitavel.
     * @throws SQLException
     */
    public boolean verificarQuantidade(int id, int quantidade) throws SQLException {

        // Conecta.
        comando.Conectar();

        //Variavel recebe metodo de verificacao.
        boolean quantideMaior = comando03.verificarQuantidade(id, quantidade);

        // Se a quantidade for maior.
        if (quantideMaior) {

            return true;

        }

        // Se a quantidade for menor.
        return false;

    }

    /**
     * Funcao que retorna quantidade em estoque.
     *
     * @return quantidade
     */
    public int getQuantidade() {

        return comando03.getQuantidade();

    }

    /**
     * Funcao que pega desconto do cliente.
     *
     * @param cpf
     * @return o desconto
     * @throws java.sql.SQLException
     * @throws java.io.IOException
     */
    public int getDesc(String cpf) throws SQLException, IOException {
        
        // Instancia objeto com cliente.
        ServicosCliente cliente = new ServicosCliente();

        // Pega cliente.
        Cliente obter = cliente.obterCliente(cpf);

        // Declara variavel.
        int quantiaG;
        
        // Retorna quantia gasta.
        return  quantiaG = comando02.getDesc(obter.getID_Cliente());

    }

}
