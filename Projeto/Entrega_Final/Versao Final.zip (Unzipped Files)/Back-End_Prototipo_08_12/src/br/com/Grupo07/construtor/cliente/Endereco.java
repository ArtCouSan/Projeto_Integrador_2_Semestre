package br.com.Grupo07.construtor.cliente;
/**
 * Classe de Endereco.
 *
 * @author Grupo 07.
 */
public class Endereco {

    // Declara atributos.
    private int ID_Endereco;
    private String CEP;
    private String Logradouro;
    private String Bairro;
    private String Complemento;
    private String Numero;

    // Get e Set do id de endereco.
    public int getID_Endereco() {
        return ID_Endereco;
    }
    public void setID_Endereco(int ID_Endereco) {
        this.ID_Endereco = ID_Endereco;
    }

    // Get e Set do cep.
    public String getCEP() {
        return CEP;
    }
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    // Get e Set do logradouro.
    public String getLogradouro() {
        return Logradouro;
    }
    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    // Get e Set do bairro.
    public String getBairro() {
        return Bairro;
    }
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    // Get e Set do complemento.
    public String getComplemento() {
        return Complemento;
    }
    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }
    
    // Get e Set do numero de casa ou apartamento.
    public String getNumero() {
        return Numero;
    }
    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

}
