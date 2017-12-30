package br.com.Grupo07.construtor.venda;

import br.com.Grupo07.construtor.cliente.Cliente;
import java.util.Date;

/**
 * Classe que junta todas as informacoes do produto.
 *
 * @author Grupo 07
 */
public class Venda {

    // Declara atributos.
    private Date data;
    private Cliente cliente;
    private int ID_lista;
    private int ID_venda;
    private int ID_cliente;
    private String formaPagamento;
    private float valor;
    private int totalQuantidade;
    private boolean VendaAtiva;

    // Get e Set do id da lista.
    public int getID_lista() {
        return ID_lista;
    }
    public void setID_lista(int ID_lista) {
        this.ID_lista = ID_lista;
    }

    // Get e Set do id da venda.
    public int getID_venda() {
        return ID_venda;
    }
    public void setID_venda(int ID_venda) {
        this.ID_venda = ID_venda;
    }

    // Get e Set do id do cliente que fez a venda.
    public int getID_cliente() {
        return ID_cliente;
    }
    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    // Get e Set da quantidade total escolhida.
    public int getTotalQuantidade() {
        return totalQuantidade;
    }
    public void setTotalQuantidade(int totalQuantidade) {
        this.totalQuantidade = totalQuantidade;
    }
    
    // Get e Set da atual situacao do relatorio.
    public boolean isVendaAtiva() {
        return VendaAtiva;
    }
    public void setVendaAtiva(boolean VendaAtiva) {
        this.VendaAtiva = VendaAtiva;
    }

    // Get e Set da data atual.
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Get e Set do valor total.
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

    // Get e Set da forma de pagamento.
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

}
