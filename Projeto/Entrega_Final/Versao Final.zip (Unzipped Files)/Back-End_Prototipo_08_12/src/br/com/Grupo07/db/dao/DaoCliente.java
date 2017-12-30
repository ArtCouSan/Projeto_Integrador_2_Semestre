package br.com.Grupo07.db.dao;

// Importa pacotes com os construtores.
import br.com.Grupo07.construtor.cliente.Cliente;
import br.com.Grupo07.construtor.cliente.Contato;
import br.com.Grupo07.construtor.cliente.DadosPessoais;
import br.com.Grupo07.construtor.cliente.Endereco;

// Importa pacotes de manipulacao de arquivo e imagem.
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// Importa pacotes para manuseio com sql.
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import java.util.ArrayList;

/**
 * Classe que faz comandos nas tabelas do cliente para banco de dados.
 *
 * @author Grupo 07
 */
public class DaoCliente {

    // Obejto vazio para conexao.
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
     * Funcao que recebe classe com dados pessoais do cliente para inserir na tabela dados_cliente.
     * @param dados do cliente.
     * @return id dos dados para inserir na tabela principal de cliente.
     * @throws SQLException
     * @throws FileNotFoundException 
     */
    public int inserirDadosPessoais(DadosPessoais dados) throws SQLException, FileNotFoundException {

        // Comando SQL.
        String sql = "INSERT INTO dados_cliente "
                + "(nome, cpf, genero, data_de_nascimento, imagem) "
                + "VALUES ( ?, ?, ?, ?, ?)";

        PreparedStatement stmt = con.prepareStatement(sql);

        // Insercoes.
        stmt.setString(1, dados.getNome());
        stmt.setString(2, dados.getCPF());
        stmt.setString(3, dados.getGenero());
        stmt.setString(4, dados.getDataNascimento());
        File arquivo = new File(dados.getImagem());
        long tamanho = arquivo.length();
        InputStream imagem = new FileInputStream(dados.getImagem());
        stmt.setBlob(5, imagem, tamanho);

        // Executa.
        stmt.execute();

        // Comando para retornar maior id de dados.
        sql = "SELECT MAX(id_dados) FROM dados_cliente";

        // Executa pergunta.
        stmt = con.prepareStatement(sql);

        ResultSet resultado = stmt.executeQuery();

        // Variavel que recebe id.
        int id = 0;

        // Loop para inserir id.
        while (resultado.next()) {

            id = resultado.getInt("MAX(id_dados)");

        }

        // Retorna.
        return id;

    }

    /**
     * Funcao que recebe classe com endereco do cliente para inserir na tabela endereco.
     * @param endereco do cliente.
     * @return id do endereco para inserir na tabela principal de cliente.
     * @throws SQLException
     * @throws FileNotFoundException 
     */
    public int inserirEndereco(Endereco endereco) throws SQLException, FileNotFoundException {

        // Comando SQL.
        String sql = "INSERT INTO endereco "
                + "(cep, logradouro, bairro, complemento, numero) "
                + "VALUES ( ?, ?, ?, ?, ?)";

        PreparedStatement stmt = con.prepareStatement(sql);

        // Insercoes.
        stmt.setString(1, endereco.getCEP());
        stmt.setString(2, endereco.getLogradouro());
        stmt.setString(3, endereco.getBairro());
        stmt.setString(4, endereco.getComplemento());
        stmt.setString(5, endereco.getNumero());

        // Executa.
        stmt.execute();

        // Comando para retornar maior id de endereco.
        sql = "SELECT MAX(id_endereco) FROM endereco";

        // Executa pergunta.
        stmt = con.prepareStatement(sql);

        ResultSet resultado = stmt.executeQuery();

        // Variavel que recebe id.
        int id = 0;

        // Loop para inserir id.
        while (resultado.next()) {

            id = resultado.getInt("MAX(id_endereco)");

        }

        // Retorna.
        return id;

    }

    /**
     * Funcao que recebe classe com contato do cliente para inserir na tabela contato.
     * @param contato do cliente.
     * @return id do contato para inserir na tabela principal de cliente.
     * @throws SQLException
     * @throws FileNotFoundException 
     */
    public int inserirContato(Contato contato) throws SQLException, FileNotFoundException {

        // Comando SQL.
        String sql = "INSERT INTO contato "
                + "(email, telefone, dd_telefone, celular, dd_celular) "
                + "VALUES ( ?, ?, ?, ?, ?)";

        PreparedStatement stmt = con.prepareStatement(sql);

        // Insercoes.
        stmt.setString(1, contato.getEmail());
        stmt.setString(2, contato.getTelefone());
        stmt.setString(3, contato.getDD_Telefone());
        stmt.setString(4, contato.getCelular());
        stmt.setString(5, contato.getDD_Celular());

        // Executa.
        stmt.execute();

        // Comando para retornar maior id de contato.
        sql = "SELECT MAX(id_contato) FROM contato";

        // Executa pergunta.
        stmt = con.prepareStatement(sql);

        ResultSet resultado = stmt.executeQuery();

        // Variavel que recebe id.
        int id = 0;

        // Loop para inserir id.
        while (resultado.next()) {

            id = resultado.getInt("MAX(id_contato)");

        }

        // Retorna.
        return id;

    }

    /**
     * Funcao para inserir na tabela principal de cliente.
     * @param id_Dados para inserir na tabela.
     * @param id_Endereco para inserir na tabela.
     * @param id_Contato para inserir na tabela.
     * @throws SQLException
     * @throws FileNotFoundException 
     */
    public void inserirCliente(int id_Dados, int id_Endereco, int id_Contato) throws SQLException, FileNotFoundException {

        // Comando SQL.
        String slq = "INSERT INTO cliente "
                + "(id_dados, id_endereco, id_contato, ativo) "
                + "VALUES ( ?, ?, ?, ?)";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setInt(1, id_Dados);
        stmt.setInt(2, id_Endereco);
        stmt.setInt(3, id_Contato);
        stmt.setBoolean(4, true);

        // Executa.
        stmt.execute();

    }

    /**
     * Funcao que alterar dados do cliente.
     * @param dados para update.
     * @throws SQLException
     * @throws FileNotFoundException 
     */
    public void alterarDadosPessoais(DadosPessoais dados) throws SQLException, FileNotFoundException {

        // Comando SQL.
        String slq = "UPDATE dados_cliente SET "
                + "nome = ?"
                + ", cpf = ?"
                + ", genero = ?"
                + ", data_de_nascimento = ?"
                + ", imagem = ?"
                + " WHERE (id_dados = ?) ";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setString(1, dados.getNome());
        stmt.setString(2, dados.getCPF());
        stmt.setString(3, dados.getGenero());
        stmt.setString(4, dados.getDataNascimento());
        File arquivo = new File(dados.getImagem());
        long tamanho = arquivo.length();
        InputStream imagem = new FileInputStream(dados.getImagem());
        stmt.setBlob(5, imagem, tamanho);
        stmt.setInt(6, dados.getID_DadosPessoais());
        
        // Executa.
        stmt.execute();

    }

    /**
     * Funcao que alterar endereco do cliente.
     * @param endereco para alteracao.
     * @throws SQLException
     * @throws FileNotFoundException 
     */
    public void alterarEndereco(Endereco endereco) throws SQLException, FileNotFoundException {

        // Comando SQL.
        String slq = "UPDATE endereco SET "
                + " logradouro = ?"
                + ", bairro = ?"
                + ", numero = ?"
                + ", complemento = ?"
                + ", cep = ?"
                + " WHERE (id_endereco = ?) ";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setString(1, endereco.getLogradouro());
        stmt.setString(2, endereco.getBairro());
        stmt.setString(3, endereco.getNumero());
        stmt.setString(4, endereco.getComplemento());
        stmt.setString(5, endereco.getCEP());
        stmt.setInt(6, endereco.getID_Endereco());

        // Executa.
        stmt.execute();

    }

    /**
     * Funcao que alterar contato do cliente.
     * @param contato para alteracao.
     * @throws SQLException
     * @throws FileNotFoundException 
     */
    public void alterarContato(Contato contato) throws SQLException, FileNotFoundException {

        // Comando SQL.
        String slq = "UPDATE contato SET "
                + " email = ?"
                + ", telefone = ?"
                + ", celular = ?"
                + ", dd_telefone = ?"
                + ", dd_celular = ?"
                + " WHERE (id_contato = ?) ";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setString(1, contato.getEmail());
        stmt.setString(2, contato.getTelefone());
        stmt.setString(3, contato.getCelular());
        stmt.setString(4, contato.getDD_Telefone());
        stmt.setString(5, contato.getDD_Celular());
        stmt.setInt(6, contato.getID_Contato());

        // Executa.
        stmt.execute();

        // Fecha conexao.
        con.close();

    }

    /**
     * Funcao que exclui cliente.
     * @param id para identificar cliente.
     * @throws SQLException 
     */
    public void excluir(int id) throws SQLException {

        // Comando SQL.
        String slq = "UPDATE cliente SET ativo = ? WHERE  id_cliente = ?";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setBoolean(1, false);
        stmt.setInt(2, id);

        // Executa.
        stmt.execute();

    }

    /**
     * Funcao que retorna dados pessoais do cliente.
     * @param procura para buscar nome ou cpf.
     * @param id de dados
     * @param escolha para opcao de buscar: true se for para buscar por cpf e nome e false se for pelo id_dados.
     * @return dados pessoais preenchidos.
     * @throws SQLException
     * @throws IOException 
     */
    public ArrayList<DadosPessoais> procurarDados(String procura, int id, boolean escolha) throws SQLException, IOException {

        // Lista de dados pessoais.
        ArrayList<DadosPessoais> listaResultado = new ArrayList<>();

        // Inicializa comando.
        String slq = " ";

        PreparedStatement stmt = null;

        // Se for para buscar pelo nome ou pelo cpf.
        if (escolha) {

            // Comando SQL.
            slq = "SELECT * FROM DADOS_CLIENTE INNER JOIN CLIENTE ON CLIENTE.ID_DADOS = DADOS_CLIENTE.ID_DADOS"
                    + " WHERE (nome LIKE ? OR CPF LIKE ?) AND ATIVO = ?";

            stmt = con.prepareStatement(slq);

            // Insercoes.
            stmt.setString(1, "%" + procura + "%");
            stmt.setString(2, "%" + procura + "%");
            stmt.setBoolean(3, true);

        // Se for buscar pelo id de dados.    
        } else {

            // Comando SQL.
            slq = "SELECT * FROM dados_cliente WHERE id_dados = ?";

            stmt = con.prepareStatement(slq);
            
            // Insercoes.
            stmt.setInt(1, id);

        }

        // Executa e recebe comando.
        try (ResultSet result = stmt.executeQuery()) {

            // Loop de resultado.
            while (result.next()) {

                // Objeto que recebe dados pessoais.
                DadosPessoais dados = new DadosPessoais();

                // Recebe dados do banco.
                dados.setID_DadosPessoais(result.getInt("id_dados"));
                dados.setNome(result.getString("nome"));
                dados.setGenero(result.getString("genero"));
                dados.setDataNascimento(result.getString("data_de_nascimento"));
                dados.setCPF(result.getString("cpf"));

                // Recebe imagem.
                BufferedImage im = ImageIO.read(result.getBinaryStream("imagem"));

                // Imagem modificada.
                BufferedImage resizedImage = new BufferedImage(161, 158, BufferedImage.TYPE_INT_RGB);

                // Imagem criada.
                Graphics2D g = resizedImage.createGraphics();

                // Scale.
                float xScale = (float) 161 / im.getWidth();

                // Scale.
                float yScale = (float) 158 / im.getHeight();

                // Redenriza scale.
                AffineTransform at = AffineTransform.getScaleInstance(xScale, yScale);

                // Junta padroes.
                g.drawRenderedImage(im, at);

                g.dispose();

                // Passa para um imageIcon.
                ImageIcon imagem = new ImageIcon(resizedImage);

                // Set na imagem do cliente.
                dados.setImagemAlterar(imagem);

                // Adiciona dados a lista.
                listaResultado.add(dados);

            }

            // Retorna lista.
            return listaResultado;

        }

    }

    /**
     * Funcao que busca tabela primaria de cliente.
     * @param id do cliente ou de daods para procurar
     * @param escolha para se for por id de cliente ou de dados.
     * @return lista de clientes.
     * @throws SQLException
     * @throws IOException 
     */
    public ArrayList<Cliente> procurarCliente(int id, boolean escolha) throws SQLException, IOException {

        // Cria lista de clientes.
        ArrayList<Cliente> listaResultado = new ArrayList<>();

        // Comando SQL.
        String slq = " ";

        // Se a escolha for por id_dados.
        if (escolha) {

            slq = "SELECT * FROM cliente WHERE id_dados = ? AND ATIVO = ?";

        // Se a escolha for por id_cliente.    
        } else {

            slq = "SELECT * FROM cliente WHERE id_cliente = ? AND ATIVO = ?";

        }

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setInt(1, id);
        stmt.setBoolean(2, true);

        // Recebe e executa pergunta.
        try (ResultSet result = stmt.executeQuery()) {

            // Loop com resultados.
            while (result.next()) {

                // Cria cliente.
                Cliente cliente = new Cliente();

                // Insere informacoes.
                cliente.setID_Contato(result.getInt("id_contato"));
                cliente.setID_Cliente(result.getInt("id_cliente"));
                cliente.setID_Endereco(result.getInt("id_endereco"));
                cliente.setID_DadosPessoais(result.getInt("id_dados"));

                // Insere na lista.
                listaResultado.add(cliente);

            }

            // Retorna lista.
            return listaResultado;

        }

    }

    /**
     * Funcao que busca contato de cliente.
     * @param id de cliente para busca
     * @return lista de contatos.
     * @throws SQLException
     * @throws IOException 
     */
    public ArrayList<Contato> procurarContato(int id) throws SQLException, IOException {

        // Cria lista de contatos.
        ArrayList<Contato> listaResultado = new ArrayList<>();

        // Comando SQL.
        String slq = "SELECT * FROM contato WHERE id_contato = ?";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setInt(1, id);

        // Executa e verifiica resultado.
        try (ResultSet result = stmt.executeQuery()) {

            // Loop com os resultados.
            while (result.next()) {

                // Cria contato.
                Contato contato = new Contato();

                // Preenche contato.
                contato.setTelefone(result.getString("telefone"));
                contato.setCelular(result.getString("celular"));
                contato.setDD_Telefone(result.getString("dd_telefone"));
                contato.setDD_Celular(result.getString("dd_celular"));
                contato.setEmail(result.getString("email"));

                // Insere contato a lista.
                listaResultado.add(contato);

            }

            // Retorna lista.
            return listaResultado;

        }

    }

    /**
     * Funcao que busca endereco de cliente.
     * @param id do endereco para busca.
     * @return lista de enderecos.
     * @throws SQLException
     * @throws IOException 
     */
    public ArrayList<Endereco> procurarEndereco(int id) throws SQLException, IOException {

        // Cria lista de enderecos.
        ArrayList<Endereco> listaResultado = new ArrayList<>();

        // Comando SQL.
        String slq = "SELECT * FROM endereco WHERE id_endereco = ?";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setInt(1, id);

        // Executa e verifica resultado.
        try (ResultSet result = stmt.executeQuery()) {

            // Loop de resultados.
            while (result.next()) {

                // Cria endereco.
                Endereco endereco = new Endereco();

                // Preenche endereco.
                endereco.setBairro(result.getString("bairro"));
                endereco.setNumero(result.getString("numero"));
                endereco.setLogradouro(result.getString("logradouro"));
                endereco.setCEP(result.getString("cep"));
                endereco.setComplemento(result.getString("complemento"));

                // Insere na lista.
                listaResultado.add(endereco);

            }

            // Retorna lista de enderecos.
            return listaResultado;

        }

    }

    /**
     * Funcao que obtem cliente unicamente pelo cpf.
     * @param procura pelo cpf.
     * @return cliente.
     * @throws SQLException
     * @throws IOException 
     */
    public Cliente obterCliente(String procura) throws SQLException, IOException {

        // Comando
        String slq = "SELECT ID_CLIENTE FROM DADOS_CLIENTE INNER JOIN CLIENTE"
                + " ON CLIENTE.ID_DADOS = DADOS_CLIENTE.ID_DADOS WHERE CPF = ? AND ATIVO = ?";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setString(1, procura);
        stmt.setBoolean(2, true);

        // Executa e recebe resultado.
        ResultSet result = stmt.executeQuery();

        // Cria cliente.
        Cliente cliente = new Cliente();

        // Loop do resultado.
        while (result.next()) {

            // Preenche com id.
            cliente.setID_Cliente(result.getInt("id_cliente"));

            // Retorna cliente.
            return cliente;

        }

        // Possivel erro.
        return null;

    }

    /**
     * Funcao que verifica existencia de cliente no cadastro.
     * @param cpf para verificar se existe cliente com esse cpf.
     * @return true se existente e false se nao.
     * @throws SQLException 
     */
    public boolean clienteExistenteCadastro(String cpf) throws SQLException {

        // Comando SQL.
        String slq = "SELECT CPF FROM DADOS_CLIENTE INNER JOIN CLIENTE"
                + " ON CLIENTE.ID_DADOS = DADOS_CLIENTE.ID_DADOS WHERE CPF = ? AND ATIVO = ?";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setString(1, cpf);
        stmt.setBoolean(2, true);

        // Executa e recebe resultado.
        ResultSet result = stmt.executeQuery();

        // Loop com resultado.
        if (result.next()) {

            // Se existir.
            return true;

        } else {

            // Se nao existir.
            return false;

        }

    }

    /**
     * Funcao que verifica se dados do cliente existem para alteracao.
     * @param cpf para identificar dados do cliente.
     * @return contador com resultado.
     * @throws SQLException 
     */
    public int clienteExistenteAlterar(String cpf) throws SQLException {

        // Inicia contador de eistencia.
        int cont = 0;

        // Comando SQl.
        String slq = "SELECT CPF FROM DADOS_CLIENTE INNER JOIN CLIENTE"
                + " ON CLIENTE.ID_DADOS = DADOS_CLIENTE.ID_DADOS WHERE CPF = ? AND ATIVO = ?";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes
        stmt.setString(1, cpf);
        stmt.setBoolean(2, true);

        // Executa e verifica resultado.
        ResultSet result = stmt.executeQuery();

        // Loop de resultado.
        while (result.next()) {

            // Acrescenta se existente.
            cont++;

        }

        // Retorna contador.
        return cont;

    }

}
