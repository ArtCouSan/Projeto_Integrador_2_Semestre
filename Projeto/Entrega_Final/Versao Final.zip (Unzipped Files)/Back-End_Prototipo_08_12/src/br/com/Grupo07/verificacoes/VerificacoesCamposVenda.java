package br.com.Grupo07.verificacoes;

// Importa pacote com o servico do produto.
import br.com.Grupo07.servicos.ServicosEstoque;

// Importa pacotes com comandos SQL.
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 * Classe que faz verifica campos de venda.
 *
 * @author Grupo 07
 */
public class VerificacoesCamposVenda {

    /**
     * Funcao que verifica botao adicionar.
     * @param idS
     * @param quantidadeS
     * @return true se estive tudo okay.
     * @throws SQLException 
     */
    public boolean VerificacoesCamposVendaAdicionar(String idS, String quantidadeS) throws SQLException {

        ServicosEstoque estoque = new ServicosEstoque();

        int id = 0, quantidade = 0;

        try {

            id = Integer.parseInt(idS);

            quantidade = Integer.parseInt(quantidadeS);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Campos id do produto ou quantidade incorretos", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

        }

        // Verifica se produto esta vazio.
        if (idS.equalsIgnoreCase(" ")) {

            JOptionPane.showMessageDialog(null, "Campo produto vazio", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

        // Verifica se quantidade esta correta.    
        } else if (quantidade <= 0) {

            JOptionPane.showMessageDialog(null, "Quantidade Incorreta - negativo", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

        // Verifica se quantidade esta vazio. 
        } else if (quantidadeS.equalsIgnoreCase(" ")) {

            JOptionPane.showMessageDialog(null, "Campo quantidade vazio", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

        // Verifica se quantidade do produto eh aceita.
        } else if (estoque.verificarQuantidade(id, quantidade)) {

            // Recebe quantidade.
            int quantidadeEstoque = estoque.getQuantidade();

            // Apresenta quantidade.
            JOptionPane.showMessageDialog(null, "Quantidade maior que em estoque - Atualmente tem " + quantidadeEstoque, "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

        // Se estiver tudo okay.   
        } else {

            return true;

        }

    }

}
