package br.com.Grupo07.servicos;

// Importa os pacotes os construtores do itens de venda.
import br.com.Grupo07.construtor.venda.Carrinho;
import br.com.Grupo07.construtor.venda.Venda;

// Importa o pacote com os comados para banco de dados da venda.
import br.com.Grupo07.db.dao.DaoVenda;

// Importa os pacote com manipulacao de arquivos e imagens.
import java.io.FileNotFoundException;

// Importa o pacote com os comandos sql.
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe com os servicos para relatorio.
 *
 * @author Grupo 07
 */
public class ServicosRelatorio {

    // Declara objeto que recebe metodos daos da venda.
    @SuppressWarnings("FieldMayBeFinal")
    private static DaoVenda comando = new DaoVenda();

    // Declara lista de itens da venda.
    public static List<Venda> listaVendas = new ArrayList<>();

    /**
     * Funcao que retorna lista de venda.
     * @return lista de venda.
     */
    public List<Venda> getVendas() {

        return listaVendas;

    }

    /**
     * Funcao que adiciona venda a lista.
     * @param venda
     * @throws SQLException
     * @throws FileNotFoundException 
     */
    public void adicionaVenda(Venda venda) throws SQLException, FileNotFoundException {

        // Conecta.
        comando.Conectar();

        // Insere.
        comando.inserir(venda);

    }

    /**
     * Funcao que procura venda por data.
     * @param Dinicio
     * @param Afim
     * @return lista de vendas.
     * @throws SQLException 
     */
    public static ArrayList<Venda> procurarVendas(String Dinicio, String Afim) throws SQLException {

        // Conecta.
        comando.Conectar();

        // Lista recebe vendas pelo metodo de procura.
        ArrayList<Venda> listaResultado = comando.procurarVendas(Dinicio, Afim);      
        
        // Retorna lista.
        return listaResultado;

    }

    /**
     * Funcao que procura venda por id
     * @param id
     * @return venda
     * @throws SQLException 
     */
    public static Venda procurarVenda(int id) throws SQLException {

        // Conecta.
        comando.Conectar();

        // Recebe venda por metodo de procura por id.
        Venda listaResultado = comando.procurarVenda(id);

        // Retorna lista.
        return listaResultado;

    }

    /**
     * Funcao que procura lista por id.
     * @param id
     * @return lista de itens.
     * @throws SQLException 
     */
    public static ArrayList<Carrinho> procurarItens(int id) throws SQLException {

        // Conecta.
        comando.Conectar();

        // Lista rece metodo de procura por id.
        ArrayList<Carrinho> listaResultado = comando.procurarItens(id);

        // Retorna lista.
        return listaResultado;

    }

}
