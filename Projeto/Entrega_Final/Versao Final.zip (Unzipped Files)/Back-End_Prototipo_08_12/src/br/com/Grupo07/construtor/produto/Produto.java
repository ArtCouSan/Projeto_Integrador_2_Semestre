package br.com.Grupo07.construtor.produto;

import javax.swing.Icon;
/**
 * Classe que junta todas as informacoes do produto.
 *
 * @author Grupo 07
 */
public class Produto {

    // Declara atributos.
    private int ID;
    private int ID_Modelo;
    private int ID_Marca;
    private String Cor;
    private String Generos;
    private float Preco;
    private int Quantidade;
    private int Tamanho;
    private String imagem;
    private Icon img;
    private boolean ProdutoAtivo;

    // Get e Set do id do modelo.
    public int getID_Modelo() {
        return ID_Modelo;
    }
    public void setID_Modelo(int ID_Modelo) {
        this.ID_Modelo = ID_Modelo;
    }

    // Get e Set do id de marca.
    public int getID_Marca() {
        return ID_Marca;
    }
    public void setID_Marca(int ID_Marca) {
        this.ID_Marca = ID_Marca;
    }
    
    // Get e Set do caminho de imagem.
    public String getImagem() {
        return imagem;
    }
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    // Get e Set da imagem para o painel alterar.
    public Icon getImg() {
        return img;
    }
    public void setImg(Icon img) {
        this.img = img;
    }
    
    // Get e Set do id do produto.
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    // Get e Set da cor do produto.
    public String getCor() {
        return Cor;
    }
    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    // Get e Set do genero do produto.
    public String getGeneros() {
        return Generos;
    }
    public void setGeneros(String Generos) {
        this.Generos = Generos;
    }

    // Get e Set do preco do produto.
    public float getPreco() {
        return Preco;
    }
    public void setPreco(float Preco) {
        this.Preco = Preco;
    }

    // Get e Set da quantidade do produto.
    public int getQuantidade() {
        return Quantidade;
    }
    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    // Get e Set do tamanho do produto.
    public int getTamanho() {
        return Tamanho;
    }
    public void setTamanho(int Tamanho) {
        this.Tamanho = Tamanho;
    }

    // Get e Set do produto que diz se eh ativo ou nao.
    public boolean isProdutoAtivo() {
        return ProdutoAtivo;
    }
    public void setProdutoAtivo(boolean ProdutoAtivo) {
        this.ProdutoAtivo = ProdutoAtivo;
    }

}
