package br.com.Grupo07.construtor.cliente;
/**
 * Classe que junta todas as informacoes dos cliente.
 *
 * @author Grupo 07
 */
public class Cliente {

    // Declara atributos.
    private int ID_Cliente;
    private int ID_Contato;
    private int ID_DadosPessoais;
    private int ID_Endereco;
    private boolean ClienteAtivo;

    // Get e Set do id do cliente.
    public int getID_Cliente() {
        return ID_Cliente;
    }
    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    // Get e Set do id do contato do cliente.
    public int getID_Contato() {
        return ID_Contato;
    }
    public void setID_Contato(int ID_Contato) {
        this.ID_Contato = ID_Contato;
    }

    // Get e Set do id dos dados pessoais do cliente.
    public int getID_DadosPessoais() {
        return ID_DadosPessoais;
    }
    public void setID_DadosPessoais(int ID_DadosPessoais) {
        this.ID_DadosPessoais = ID_DadosPessoais;
    }

    // Get e Set do id do endereco do cliente.
    public int getID_Endereco() {
        return ID_Endereco;
    }
    public void setID_Endereco(int ID_Endereco) {
        this.ID_Endereco = ID_Endereco;
    }
    
    // Get e Set que diz se cliente esta ativo ou nao.
    public boolean isClienteAtivo() {
        return ClienteAtivo;
    }
    public void setClienteAtivo(boolean ClienteAtivo) {
        this.ClienteAtivo = ClienteAtivo;
    }

}
