package br.com.Grupo07.servicos;

// Importa os pacotes os construtores do produto.
import br.com.Grupo07.construtor.produto.Marca;
import br.com.Grupo07.construtor.produto.Modelo;
import br.com.Grupo07.construtor.produto.Produto;

// Importa o pacote com os comados para banco de dados do produto.
import br.com.Grupo07.db.dao.DaoProduto;

// Importa os pacote com manipulacao de arquivos e imagens.
import java.io.FileNotFoundException;
import java.io.IOException;

// Importa o pacote com os comandos SQL.
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Classe com os servicos para produto.
 *
 * @author Grupo 07
 */
public class ServicosProduto {

    // Inicializa objeto com os metodos do banco de produto.
    @SuppressWarnings("FieldMayBeFinal")
    private static DaoProduto comando = new DaoProduto();

    /**
     * Funcao que cadastra funcionario.
     *
     * @param produto
     * @param marca
     * @param modelo
     * @throws FileNotFoundException
     */
    public static void cadastrarProduto(Produto produto, Marca marca, Modelo modelo) throws FileNotFoundException {

        try {

            // Conecta.
            comando.Conectar();

            // Insere dados.
            int id_marca = comando.inserirMarca(marca);

            int id_modelo = comando.inserirModelo(modelo);

            comando.inserir(produto, id_marca, id_modelo);

        } catch (SQLException ex) {

            // Mensagem.
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados", "Erro", JOptionPane.ERROR);

        }

    }

    /**
     * Funcao que procura dados dos produtos.
     *
     * @param procura.
     * @param id se for pelo id do cliente.
     * @param escolha
     * @return lista de produtos.
     * @throws IOException
     */
    public ArrayList<Produto> procurarProduto(String procura, int id, boolean escolha) throws IOException {

        // Declara lista para receber.
        ArrayList<Produto> listaResultado = new ArrayList<>();

        try {

            // Conecta.
            comando.Conectar();

            // Lista recebe resultado do metodo.
            listaResultado = comando.procurar(procura, id, escolha);

            // Mensagem.     
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados", "Erro", JOptionPane.ERROR);

        }

        // Retorna lista de resultados.
        return listaResultado;

    }

    /**
     * Funcao que procura marca dos produtos.
     *
     * @param id se for pelo id de marca.
     * @return lista de produtos.
     * @throws IOException
     */
    public ArrayList<Marca> procurarMarca(int id) throws IOException {

        // Declara lista para receber.
        ArrayList<Marca> listaResultado = new ArrayList<>();

        try {

            // Conecta.
            comando.Conectar();

            // Lista recebe resultado do metodo.
            listaResultado = comando.procurarMarca(id);

            // Mensagem.     
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados", "Erro", JOptionPane.ERROR);

        }

        // Retorna lista de resultados.
        return listaResultado;

    }

    /**
     * Funcao que procura modelo dos produtos.
     *
     * @param id se for pelo id de modelo.
     * @return lista de produtos.
     * @throws IOException
     */
    public ArrayList<Modelo> procurarModelo(int id) throws IOException {

        // Declara lista para receber.
        ArrayList<Modelo> listaResultado = new ArrayList<>();

        try {

            // Conecta.
            comando.Conectar();

            // Lista recebe resultado do metodo.
            listaResultado = comando.procurarModelo(id);

            // Mensagem.     
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados", "Erro", JOptionPane.ERROR);

        }

        // Retorna lista de resultados.
        return listaResultado;

    }

    /**
     * Funcao que desativa produto.
     *
     * @param id
     * @throws SQLException
     */
    public static void excluirProduto(int id) throws SQLException {

        // Conecta.
        comando.Conectar();

        // Metodo de exclusao.
        comando.excluir(id);

    }

    /**
     * Funcao que altera produto.
     *
     * @param produto
     * @param marca
     * @param modelo
     * @throws SQLException
     * @throws FileNotFoundException
     */
    public void alterarProduto(Produto produto, Marca marca, Modelo modelo) throws SQLException, FileNotFoundException {

        ServicosEstoque estoque = new ServicosEstoque();
        
        // Verifica se a duplicata.
        boolean duplicata = estoque.getPosseProduto(produto, marca, modelo);
        
        // Se sim.
        if (duplicata) {

            // Pergunta se quer excluir duplicata.
            int decisao = JOptionPane.showConfirmDialog(null, "Produto ja existente em estoque, deseja alterar sua quantidade e preco? ", "Duplicata", JOptionPane.OK_OPTION);

            // Se sim.
            if (decisao == 0) {

                // Conecta.
                comando.Conectar();

                // Metodo de exclusao.
                excluirProduto(produto.getID());

                // Metodos de alteracoes.
                comando.alterar(produto);
                comando.alterarMarca(marca);
                comando.alterarModelo(modelo);

            } else {

                // Mensagem
                JOptionPane.showMessageDialog(null, "Cancelado insercao", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            }
            
        // Se nao.    
        } else {

            try {
                // Conecta.
                comando.Conectar();   
                
                // Metodos de alteracoes.
                comando.alterar(produto);       
                
                comando.alterarMarca(marca);
                
                comando.alterarModelo(modelo);
                
            } catch (SQLException ex) {

                Logger.getLogger(ServicosProduto.class.getName()).log(Level.SEVERE, null, ex);

            }

        }

    }

}
