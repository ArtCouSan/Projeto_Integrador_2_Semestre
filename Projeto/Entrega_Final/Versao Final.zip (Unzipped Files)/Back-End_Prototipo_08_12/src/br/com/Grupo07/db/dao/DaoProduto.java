package br.com.Grupo07.db.dao;

// Importa pacote com o construtor do produto.
import br.com.Grupo07.construtor.produto.Marca;
import br.com.Grupo07.construtor.produto.Modelo;
import br.com.Grupo07.construtor.produto.Produto;

// Importa pacotes com manipuladores de arquivo e imagem.
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

// Importa pacotes com comandos SQL.
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

/**
 * Classe que faz comandos nas tabelas do produto para banco de dados.
 *
 * @author Grupo 07
 */
public class DaoProduto {

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
     * Funcao que insere marca e retorna seu id.
     *
     * @param marca
     * @return id de marca.
     * @throws SQLException
     * @throws FileNotFoundException
     */
    public int inserirMarca(Marca marca) throws SQLException, FileNotFoundException {

        // Inicializa variavel de id.
        int id = 0;

        // Comando SQl.
        String sql = "INSERT INTO marca "
                + "(marca) "
                + "VALUES ( ?)";

        PreparedStatement stmt = con.prepareStatement(sql);

        // Insercoes.
        stmt.setString(1, marca.getMarca());

        // Executa.
        stmt.execute();

        // Comando para retornar maior id de dados.
        sql = "SELECT MAX(id_marca) FROM marca";

        // Executa pergunta.
        stmt = con.prepareStatement(sql);

        ResultSet resultado = stmt.executeQuery();

        // Loop para inserir id.
        while (resultado.next()) {

            id = resultado.getInt("MAX(id_marca)");

        }

        return id;

    }

    /**
     * Funcao que insere modelo e retorna seu id.
     *
     * @param modelo
     * @return id de marca.
     * @throws SQLException
     * @throws FileNotFoundException
     */
    public int inserirModelo(Modelo modelo) throws SQLException, FileNotFoundException {

        // Inicializa variavel de id.
        int id = 0;

        // Comando SQl.
        String sql = "INSERT INTO modelo "
                + "(modelo) "
                + "VALUES ( ?)";

        PreparedStatement stmt = con.prepareStatement(sql);

        // Insercoes.
        stmt.setString(1, modelo.getModelo());

        // Executa.
        stmt.execute();

        // Comando para retornar maior id de dados.
        sql = "SELECT MAX(id_modelo) FROM modelo";

        // Executa pergunta.
        stmt = con.prepareStatement(sql);

        ResultSet resultado = stmt.executeQuery();

        // Loop para inserir id.
        while (resultado.next()) {

            id = resultado.getInt("MAX(id_modelo)");

        }

        return id;

    }

    /**
     * Funcao que insere produto.
     *
     * @param produto para insercao.
     * @param id_marca para insercao.
     * @param id_modelo para insercao.
     * @throws SQLException
     * @throws FileNotFoundException
     */
    public void inserir(Produto produto, int id_marca, int id_modelo) throws SQLException, FileNotFoundException {

        // Comando SQl.
        String slq = "INSERT INTO produto "
                + "(id_modelo, id_marca, cor, genero, preco, quantidade, tamanho, ativo, imagem) "
                + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setInt(1, id_modelo);
        stmt.setInt(2, id_marca);
        stmt.setString(3, produto.getCor());
        stmt.setString(4, produto.getGeneros());
        stmt.setDouble(5, produto.getPreco());
        stmt.setInt(6, produto.getQuantidade());
        stmt.setInt(7, produto.getTamanho());
        stmt.setBoolean(8, produto.isProdutoAtivo());

        // Conversao para InputStream.
        File arquivo = new File(produto.getImagem());
        long tamanho = arquivo.length();
        InputStream imagem = new FileInputStream(produto.getImagem());

        stmt.setBlob(9, imagem, tamanho);

        // Executa.
        stmt.execute();

        // Fecha conexao.
        con.close();

    }

    /**
     * Funcao que altera produto.
     *
     * @param produto para alteracao.
     * @throws SQLException
     * @throws FileNotFoundException
     */
    public void alterar(Produto produto) throws SQLException, FileNotFoundException {

        // Comando SQL.
        String slq = "UPDATE produto SET "
                + " cor = ?"
                + ", genero = ?"
                + ", preco = ?"
                + ", quantidade = ?"
                + ", tamanho = ?"
                + ", imagem = ?"
                + " WHERE id_produto = ? ";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setString(1, produto.getCor());
        stmt.setString(2, produto.getGeneros());
        stmt.setFloat(3, produto.getPreco());
        stmt.setInt(4, produto.getQuantidade());
        stmt.setInt(5, produto.getTamanho());

        // Conversao para InputStream.
        File arquivo = new File(produto.getImagem());
        long tamanho = arquivo.length();
        InputStream imagem = new FileInputStream(produto.getImagem());

        // Insercoes.
        stmt.setBlob(6, imagem, tamanho);
        stmt.setInt(7, produto.getID());

        // Executa.
        stmt.execute();

    }

    /**
     * Funcao que altera marca.
     *
     * @param marca
     * @throws SQLException
     * @throws FileNotFoundException
     */
    public void alterarMarca(Marca marca) throws SQLException, FileNotFoundException {

        // Comando SQL.
        String slq = "UPDATE marca SET "
                + " marca = ? "
                + " WHERE (id_marca = ?) ";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setString(1, marca.getMarca());
        stmt.setInt(2, marca.getID_Marca());

        // Executa.
        stmt.execute();

    }

    /**
     * Funcao que altera modelo.
     *
     * @param modelo
     * @throws SQLException
     * @throws FileNotFoundException
     */
    public void alterarModelo(Modelo modelo) throws SQLException, FileNotFoundException {

        // Comando SQL.
        String slq = "UPDATE modelo SET "
                + " modelo = ?"
                + " WHERE (id_modelo = ?) ";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setString(1, modelo.getModelo());
        stmt.setInt(2, modelo.getID_Modelo());

        // Executa.
        stmt.execute();

    }

    /**
     * Funcao desativa produto.
     *
     * @param id de produto para exclusao.
     * @throws SQLException
     */
    public void excluir(int id) throws SQLException {

        // Comando SQL.
        String slq = "UPDATE produto SET ativo = ? WHERE  id_produto = ?";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setBoolean(1, false);
        stmt.setInt(2, id);

        // Executa.
        stmt.execute();

        // Fecha conexao.
        con.close();

    }

    /**
     * Funcao que procura produto.
     *
     * @param procura por modelo, marca, cor ou genero oi id_produto.
     * @param id.
     * @param escolha se for para buscar por procura e id ou somente por id de
     * produto
     * @return Produto.
     * @throws SQLException
     * @throws IOException
     */
    public ArrayList<Produto> procurar(String procura, int id, boolean escolha) throws SQLException, IOException {

        // Lista de dados.
        ArrayList<Produto> listaResultado = new ArrayList<>();

        PreparedStatement stmt = null;  
        
        if (escolha) {
            
            // Comando SQL.
            String slq = "SELECT id_produto, "
                    + "produto.id_modelo, "
                    + "produto.id_marca, "
                    + "cor, "
                    + "genero, "
                    + "preco,  "
                    + "quantidade, "
                    + "tamanho, "
                    + "imagem "
                    + "FROM produto "
                    + "INNER JOIN marca "
                    + "ON marca.id_marca = produto.id_marca "
                    + "INNER JOIN modelo "
                    + "ON modelo.id_modelo = produto.id_modelo "
                    + "WHERE (modelo LIKE ? "
                    + "OR marca LIKE ? "
                    + "OR cor LIKE ? "
                    + "OR genero LIKE ? "
                    + "OR id_produto = ?)"
                    + "AND ATIVO = ?";

            stmt = con.prepareStatement(slq);

            // Insercoes.
            stmt.setString(1, "%" + procura + "%");
            stmt.setString(2, "%" + procura + "%");
            stmt.setString(3, "%" + procura + "%");
            stmt.setString(4, "%" + procura + "%");
            stmt.setInt(5, id);
            stmt.setBoolean(6, true);
            
        } else {

            // Comando SQL.
            String slq = "SELECT * FROM produto WHERE id_produto = ? AND ativo = ?";
            
            stmt = con.prepareStatement(slq);
            
            // Insercoes.
            stmt.setInt(1, id);
            stmt.setBoolean(2, true);

        } 
        
        // Executa e recebe comando.
        try (ResultSet result = stmt.executeQuery()) {

            // Loop de resultado.
            while (result.next()) {
                
                // Objeto que recebe dados.
                Produto produto = new Produto();

                // Recebe dados do banco.
                produto.setID(result.getInt("id_produto"));
                produto.setID_Modelo(result.getInt("id_modelo"));
                produto.setID_Marca(result.getInt("id_marca"));
                produto.setCor(result.getString("cor"));
                produto.setGeneros(result.getString("genero"));
                produto.setPreco(result.getFloat("preco"));
                produto.setQuantidade(result.getInt("quantidade"));
                produto.setTamanho(result.getInt("tamanho"));

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

                // Set na imagem do produto.
                produto.setImg(imagem);

                // Retorna lista.
                listaResultado.add(produto);

            }
            
            // Retorna lista.
            return listaResultado;

        }

    }

    /**
     * Funcao que busca marca pelo id e retorna tipo da marca.
     *
     * @param id
     * @return lista de marca.
     * @throws SQLException
     * @throws IOException
     */
    public ArrayList<Marca> procurarMarca(int id) throws SQLException, IOException {

        // Lista de dados.
        ArrayList<Marca> listaResultado = new ArrayList<>();

        // Comando SQL.
        String slq = "SELECT * "
                + "FROM marca "
                + "WHERE (id_marca = ?)";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setInt(1, id);

        // Executa e recebe comando.
        ResultSet result = stmt.executeQuery();

        try {

            // Loop de resultado.
            while (result.next()) {

                // Objeto que recebe dados.
                Marca marca = new Marca();

                // Recebe dados do banco.
                marca.setID_Marca(result.getInt("id_marca"));
                marca.setMarca(result.getString("marca"));

                // Retorna lista.
                listaResultado.add(marca);

            }

            // Retorna lista.
            return listaResultado;

        } finally {

            // Finazlia conexao.
            result.close();

        }

    }

    /**
     * Funcao que busca modelo pelo id e retorna tipo da modelo.
     *
     * @param id
     * @return lista de modelo.
     * @throws SQLException
     * @throws IOException
     */
    public ArrayList<Modelo> procurarModelo(int id) throws SQLException, IOException {

        // Lista de dados.
        ArrayList<Modelo> listaResultado = new ArrayList<>();

        // Comando SQL.
        String slq = "SELECT * "
                + "FROM modelo "
                + "WHERE (id_modelo = ?)";

        PreparedStatement stmt = con.prepareStatement(slq);

        // Insercoes.
        stmt.setInt(1, id);

        // Executa e recebe comando.
        ResultSet result = stmt.executeQuery();

        try {

            // Loop de resultado.
            while (result.next()) {

                // Objeto que recebe dados.
                Modelo modelo = new Modelo();

                // Recebe dados do banco.
                modelo.setID_Modelo(result.getInt("id_modelo"));
                modelo.setModelo(result.getString("modelo"));

                // Retorna lista.
                listaResultado.add(modelo);

            }

            // Retorna lista.
            return listaResultado;

        } finally {

            // Finazlia conexao.
            result.close();

        }

    }

}
