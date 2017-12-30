package br.com.Grupo07.construtor.cliente;
/**
 * Classe de Contato.
 *
 * @author Grupo 07.
 */
public class Contato {

    // Declara atributos.
    private int ID_Contato;
    private String Email;
    private String Telefone;
    private String DD_Telefone;
    private String Celular;
    private String DD_Celular;
    
    // Get e Set do id de contato.
    public int getID_Contato() {
        return ID_Contato;
    }
    public void setID_Contato(int ID_Contato) {
        this.ID_Contato = ID_Contato;
    }
    
    // Get e Set do dd de telefone do cliente.
    public String getDD_Telefone() {
        return DD_Telefone;
    }
    public void setDD_Telefone(String DD_Telefone) {
        this.DD_Telefone = DD_Telefone;
    }

    // Get e Set do dd de celular do cliente.
    public String getDD_Celular() {
        return DD_Celular;
    }
    public void setDD_Celular(String DD_Celular) {
        this.DD_Celular = DD_Celular;
    }

    // Get e Set do email do cliente.
    public String getEmail() {
        return Email;
    }
     public void setEmail(String Email) {
        this.Email = Email;
    }

    // Get e Set do telefone do cliente.
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    // Get e Set do celular do cliente.
    public String getCelular() {
        return Celular;
    }
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

}
