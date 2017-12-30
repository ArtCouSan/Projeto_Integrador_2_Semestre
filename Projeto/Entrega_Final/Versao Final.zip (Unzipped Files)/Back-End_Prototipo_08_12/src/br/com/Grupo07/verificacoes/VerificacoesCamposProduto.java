package br.com.Grupo07.verificacoes;

// Importa pacote com o tela do produto.
import br.com.Grupo07.telas.produto.painelProduto;

// Importa pacote com o servico do produto.
import br.com.Grupo07.servicos.ServicosEstoque;

// Importa pacotes com comandos SQL.
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 * Classe que faz verifica campos de produto.
 *
 * @author Grupo 07
 */
public class VerificacoesCamposProduto {

    // Instancia objeto com os campos
    private painelProduto campo = new painelProduto();

    // Instancia cliente para verificacao de posse.
    ServicosEstoque produto = new ServicosEstoque();

    /**
     * Funcao que verifica preenchimento dos campos.
     *
     * @param modelo
     * @param marca
     * @param cor
     * @param genero
     * @param preco
     * @param quantidade
     * @param tamanho
     * @return true se estiver todos os campos preenchidos e false se nao
     * estiver
     * @throws java.sql.SQLException
     */
    public boolean verificarFormularios(String modelo, String marca, String cor, String genero, String preco, String quantidade, String tamanho) throws SQLException {

        // Declara variaveis.
        int quant = 0, tam = 0;
        float pre = 0;

        // Transforma variaveis;
        try {

            quant = Integer.parseInt(quantidade);

            pre = Float.parseFloat(preco);

            tam = Integer.parseInt(tamanho);

        // Verifica se eh numero.    
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Campos numericos incorretos", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

        }
        // Verifica modelo se esta vazio.
        if (modelo.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Preencha o campo modelo, por favor", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

        // Verifica marca se esta vazio.   
        } else if (marca.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha a marca, por favor", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

        // Verifica cor se esta vazio. 
        } else if (cor.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha a cor, por favor", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

        // Verifica genero se esta vazio.      
        } else if (genero.equalsIgnoreCase("Selecione") || genero.equalsIgnoreCase(" ")) {

            JOptionPane.showMessageDialog(null, "Escolha ou preencha o genero, por favor", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

        // Verifica preco se esta vazio.     
        } else if (preco.equalsIgnoreCase(" ")) {

            JOptionPane.showMessageDialog(null, "Preencha o campo preco, por favor", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

        // Verifica quantidade se esta vazio.         
        } else if (quantidade.equalsIgnoreCase(" ")) {

            JOptionPane.showMessageDialog(null, "Preencha o campo quantidade, por favor", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

        // Verifica tamanho se esta vazio.              
        } else if (tamanho.equalsIgnoreCase(" ")) {

            JOptionPane.showMessageDialog(null, "Preencha o campo tamanho, por favor", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

       // Verifica se preco eh negativo.
        } else if (pre <= 0) {

            JOptionPane.showMessageDialog(null, "Preencha o campo preco corretamente, por favor", "Erro", JOptionPane.ERROR_MESSAGE);
            
            return false;

        // Verifica quantidade se eh negativo.        
        } else if (quant <= 0) {

            JOptionPane.showMessageDialog(null, "Preencha o campo quantidade corretamente, por favor", "Erro", JOptionPane.ERROR_MESSAGE);
            
            return false;

        // Verifica tamanho se eh negativo.               
        } else if (tam <= 0) {

            JOptionPane.showMessageDialog(null, "Preencha o campo tamanho corretamente, por favor", "Erro", JOptionPane.ERROR_MESSAGE);
            
            return false;

        // Mensagem de sucesso   
        } else {  
            
            return true;

        }

    }

}
