package br.com.Grupo07.construtor.cliente;

import javax.swing.Icon;
/**
 * Classe de Endereco.
 *
 * @author Grupo 07.
 */
public class DadosPessoais {

    // Declara atributos.
    private int ID_DadosPessoais;
    private String Nome;
    private String CPF;
    private String Genero;
    private String DataNascimento;
    private String Imagem;
    private Icon ImagemAlterar;

    // Get e Set do id de dados pessoais.
    public int getID_DadosPessoais() {
        return ID_DadosPessoais;
    }
    public void setID_DadosPessoais(int ID_DadosPessoais) {
        this.ID_DadosPessoais = ID_DadosPessoais;
    }

    // Get e Set da imagem no painel alterar.
    public Icon getImagemAlterar() {
        return ImagemAlterar;
    }
    public void setImagemAlterar(Icon ImagemAlterar) {
        this.ImagemAlterar = ImagemAlterar;
    }

    // Get e Set do caminho da imagem no inserir.
    public String getImagem() {
        return Imagem;
    }
    public void setImagem(String Imagem) {
        this.Imagem = Imagem;
    }

    // Get e Set do nome do cliente.
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    // Get e Set do cpf do cliente.
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    // Get e Set do genero do cliente.
    public String getGenero() {
        return Genero;
    }
     public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    // Get e Set da data de nascimento do cliente.
    public String getDataNascimento() {
        return DataNascimento;
    }
    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
