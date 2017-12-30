package br.com.Grupo07.servicos;

// Importa o pacote com os comados para banco de dados do cliente.
import br.com.Grupo07.db.dao.DaoCliente;

// Importa os pacotes os construtores do cliente.
import br.com.Grupo07.construtor.cliente.Cliente;
import br.com.Grupo07.construtor.cliente.Contato;
import br.com.Grupo07.construtor.cliente.DadosPessoais;
import br.com.Grupo07.construtor.cliente.Endereco;

// Importa os pacote com manipulacao de arquivos e imagens.
import java.io.FileNotFoundException;
import java.io.IOException;

// Importa o pacote com os comandos sql.
import java.sql.SQLException;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe com os servicos para cliente.
 *
 * @author Grupo 07
 */
public class ServicosCliente {

    // Inicializa objeto com os metodos do banco de clientes.
    @SuppressWarnings("FieldMayBeFinal")
    private static DaoCliente comando = new DaoCliente();

    /**
     * Funcao que cadastra cliente.
     * @param dados do cliente.
     * @param endereco do cliente.
     * @param contato do cliente.
     * @throws FileNotFoundException 
     */
    public static void cadastrarCliente(DadosPessoais dados, Endereco endereco, Contato contato) throws FileNotFoundException {

        // Verifica erro no banco.
        try {

            // Conecta.
            comando.Conectar();

            // Insere dados, endereco e contato do cliente recebendo id dos mesmos.
            int id_DadosPessoais = comando.inserirDadosPessoais(dados);

            int id_Contato = comando.inserirContato(contato);

            int id_Endereco = comando.inserirEndereco(endereco);

            // Insere cliente com os id's.
            comando.inserirCliente(id_DadosPessoais, id_Endereco, id_Contato);

        } catch (SQLException ex) {

           // Mensagem.
           JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados", "Erro", JOptionPane.ERROR);

        }

    }

    /**
     * Funcao que procura dados dos clientes.
     * @param procura pelo cpf ou nome.
     * @param id se for pelo id do cliente.
     * @param escolha se for pelo nome e cpf ou pelo id.
     * @return lista de dados.
     * @throws IOException 
     */
    public static ArrayList<DadosPessoais> procurarDadosCliente(String procura, int id, boolean escolha) throws IOException {

        // Declara lista para receber.
        ArrayList<DadosPessoais> listaResultado = new ArrayList<>();

        // Verifica erro no banco.
        try {

            // Conecta.
            comando.Conectar();

            // Lista recebe resultado do metodo.
            listaResultado = comando.procurarDados(procura, id, escolha);

        // Mensagem.    
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados", "Erro", JOptionPane.ERROR);

        }

        // Retorna lista de resultados.
        return listaResultado;

    }

    /**
     * Funcao que procura tabela primaria dos clientes.
     * @param id do cliente.
     * @param escolha pelo id de dados ou da tabela primaria.
     * @return lista de clientes.
     * @throws IOException 
     */
    public static ArrayList<Cliente> procurarCliente(int id, boolean escolha) throws IOException {

        // Declara lista de clientes.
        ArrayList<Cliente> listaResultado = new ArrayList<>();

        // Verifica erro no banco.
        try {

            // Conecta.
            comando.Conectar();

            // Lista recebe resultado do metodo.
            listaResultado = comando.procurarCliente(id, escolha);

        // Mensagem.     
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados", "Erro", JOptionPane.ERROR);

        }

        // Retorna lista de resultados.
        return listaResultado;

    }

    /**
     * Funcao que procura endero do cliente.
     * @param id procura pelo id.
     * @return
     * @throws IOException 
     */
    public static ArrayList<Endereco> procurarEndereco(int id) throws IOException {

        // Declara lista de resultado dos enderecos.
        ArrayList<Endereco> listaResultado = new ArrayList<>();

        // Verifica erro no banco.
        try {

            // Conecta.
            comando.Conectar();

            // Lista recebe resultado do metodo.
            listaResultado = comando.procurarEndereco(id);

        // Mensagem.    
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados", "Erro", JOptionPane.ERROR);

        }

        // Retorna lista de resultados.
        return listaResultado;

    }

    /**
     * Funcao que procura contato do cliente.
     * @param id do cliente
     * @return lista de contatos
     * @throws IOException 
     */
    public static ArrayList<Contato> procurarContatoCliente(int id) throws IOException {

        // Declara lista de resultado dos contatos.
        ArrayList<Contato> listaResultado = new ArrayList<>();

        try {

            // Conecta.
            comando.Conectar();
         
            // Lista recebe resultado do metodo.
            listaResultado = comando.procurarContato(id);
          
        } catch (SQLException ex) {

            // Mensagem.  
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados", "Erro", JOptionPane.ERROR);

        }

        // Retorna lista de resultados.
        return listaResultado;

    }

    /**
     * Funcao que verifica posse do cpf no alterar.
     * @param cpf para verificacao.
     * @return true se existente e false se nao.
     * @throws SQLException 
     */
    public static boolean posseDeClienteAlterar(String cpf) throws SQLException {

        // Variavel recebe metodo com verificacao.
        int cont = comando.clienteExistenteAlterar(cpf);

        // Se tiver mais de 2 existentes.
        if (cont == 2) {

            return true;

        }

        // Se nao.
        return false;

    }

    /**
     * Funcao que verifica posse do cpf.
     * @param cpf para verificacao.
     * @return true se existente e false se nao.
     * @throws SQLException 
     */
    public static boolean posseDeCliente(String cpf) throws SQLException {

        // Conecta.
        comando.Conectar();

        // Retorna true se existente e false se nao.
        return comando.clienteExistenteCadastro(cpf);

    }

    /**
     * Funcao que desativa cliente.
     * @param id do cliente para exclusao.
     * @throws SQLException 
     */
    public static void excluirCliente(int id) throws SQLException {

        // Conecta.
        comando.Conectar();

        // Metodo de exclusao.
        comando.excluir(id);

    }

    /**
     * Funcao que altera informacoes do cliente.
     * @param dados do cliente.
     * @param endereo do cliente.
     * @param contato do cliente.
     * @param cliente do cliente.
     * @throws SQLException
     * @throws FileNotFoundException 
     */
    public static void alterarCliente(DadosPessoais dados, Endereco endereo, Contato contato, Cliente cliente) throws SQLException, FileNotFoundException {

        // Verifica se a duplicata no cpf.
        boolean duplicata = posseDeClienteAlterar(dados.getCPF());

        // Se sim.
        if (duplicata) {

            // Pergunta se quer excluir duplicata.
            int decisao = JOptionPane.showConfirmDialog(null, "Cliente ja existente, deseja excluir outro cliente que utiliza o mesmo cpf? ", "Duplicata", JOptionPane.OK_OPTION);

            // Se sim.
            if (decisao == 0) {

                // Conecta.
                comando.Conectar();

                // Metodo de exclusao.
                excluirCliente(cliente.getID_Cliente());

                // Metodos de alteracoes.
                comando.alterarDadosPessoais(dados);
                comando.alterarEndereco(endereo);
                comando.alterarContato(contato);

            } else {

                // Mensagem
                JOptionPane.showMessageDialog(null, "Cancelado insercao", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            }

        // Se nao   
        } else {

            // Conecta.
            comando.Conectar();

            // Metodos de alteracoes.
            comando.alterarDadosPessoais(dados);
            comando.alterarEndereco(endereo);
            comando.alterarContato(contato);

        }

    }

    /**
     * Funcao que obtem informacoes do cliente.
     * @param cpf para busca.
     * @return cliente.
     * @throws SQLException
     * @throws IOException 
     */
    public Cliente obterCliente(String cpf) throws SQLException, IOException {

        // Conecta.
        comando.Conectar();

        // Obetem cliente pelo cpf.
        Cliente resultadoCliente = comando.obterCliente(cpf);

        // Se não tiver resposta.
        if (resultadoCliente == null) {

            // Mensagem
            JOptionPane.showMessageDialog(null, "Cliente nao existe", "Erro", JOptionPane.ERROR);

        }

        // Se sim, retorna.
        return resultadoCliente;

    }

}
