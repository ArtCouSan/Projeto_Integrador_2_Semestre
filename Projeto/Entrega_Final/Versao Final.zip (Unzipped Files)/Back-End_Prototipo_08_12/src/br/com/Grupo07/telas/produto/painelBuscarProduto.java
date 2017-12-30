package br.com.Grupo07.telas.produto;

// Importa pacotes com construtores.
import br.com.Grupo07.construtor.produto.Marca;
import br.com.Grupo07.construtor.produto.Modelo;
import br.com.Grupo07.construtor.produto.Produto;

// Importa pacote com servicos.
import br.com.Grupo07.servicos.ServicosProduto;

// Importa pacote com modificadores de imagem.
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

// Importa pacote com manipuladores de sql.
import java.sql.SQLException;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Painel de busca do produto.
 *
 * @author Grupo 07
 */
public class painelBuscarProduto extends javax.swing.JPanel {

    public painelBuscarProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBuscarProduto = new javax.swing.JPanel() {
            private Image image;
            {
                try {
                    image = ImageIO.read(new File("src/br/com/Grupo07/Imagens/fundo3.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        botaoBuscarProduto = new javax.swing.JLabel();
        buscarProduto = new javax.swing.JLabel();
        textoBuscarProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable() ;
        botaoExcluir = new javax.swing.JLabel();

        painelBuscarProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        painelBuscarProduto.setPreferredSize(new java.awt.Dimension(10, 459));

        botaoBuscarProduto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botaoBuscarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/botao buscar.png"))); // NOI18N
        botaoBuscarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoBuscarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoBuscarProdutoMouseClicked(evt);
            }
        });

        buscarProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscarProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarProduto.setText("BUSCAR PRODUTO:");

        textoBuscarProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoBuscarProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tabelaProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Cor", "Genero", "Tamanho", "Preco", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProduto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaProduto.getTableHeader().setReorderingAllowed(false);
        tabelaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProduto);

        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/botao excluir.png"))); // NOI18N
        botaoExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoExcluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelBuscarProdutoLayout = new javax.swing.GroupLayout(painelBuscarProduto);
        painelBuscarProduto.setLayout(painelBuscarProdutoLayout);
        painelBuscarProdutoLayout.setHorizontalGroup(
            painelBuscarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBuscarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscarProdutoLayout.createSequentialGroup()
                        .addComponent(buscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(textoBuscarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoBuscarProduto)
                        .addGap(24, 24, 24))
                    .addGroup(painelBuscarProdutoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscarProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoExcluir)
                .addContainerGap())
        );
        painelBuscarProdutoLayout.setVerticalGroup(
            painelBuscarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBuscarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBuscarProdutoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(botaoBuscarProduto))
                    .addGroup(painelBuscarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoExcluir)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBuscarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBuscarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botao de buscar.
     *
     * @param evt
     */
    private void botaoBuscarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoBuscarProdutoMouseClicked

        // Verifica se texto esta vazio.
        if (!textoBuscarProduto.getText().isEmpty()) {

            try {

                buscaProduto();

            } catch (IOException ex) {

                // Mensagem.
                JOptionPane.showMessageDialog(null, "Erro na imagem", "Erro", JOptionPane.ERROR_MESSAGE);

            }

        } else {

            // Instancia obeto com a tabela vazia.
            DefaultTableModel modelo = (DefaultTableModel) tabelaProduto.getModel();

            // Limpa linhas.
            modelo.setRowCount(0);

            // Apresenta mensagem
            JOptionPane.showMessageDialog(null, "Sem conteudo", "Erro", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_botaoBuscarProdutoMouseClicked

    /**
     * Quando clicado uma linha
     *
     * @param evt
     */
    private void tabelaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutoMouseClicked

        // Pega evento.
        if (evt.getClickCount() == 2) {

            // Variavel recebe linha selecionada.
            int linha = tabelaProduto.getSelectedRow();

            // Se nao tiver linha.
            if (linha == -1) {

                // Mensagem.
                JOptionPane.showMessageDialog(null, "Sem resultado de busca", "Erro", JOptionPane.ERROR_MESSAGE);

                // Se tiver linha.    
            } else {

                try {

                    // Variavel recebe id do produto.
                    String ID = tabelaProduto.getValueAt(linha, 0).toString();

                    // Variavel recebe id para int.
                    int idI = Integer.parseInt(ID);

                    // Declara objetos com  metodos de servico.
                    ServicosProduto servicos = new ServicosProduto();

                    // Declara painel de alteracao e apresentacao.
                    painelAlterar produtoSelecionado = new painelAlterar();

                    // Remove tudo do painel atual.
                    painelBuscarProduto.removeAll();

                    // Adiciona painel a tela.
                    painelBuscarProduto.add(produtoSelecionado);

                    // Escolhe tamanho do painel.
                    produtoSelecionado.setSize(painelBuscarProduto.getWidth(), painelBuscarProduto.getHeight());

                    // Deixa painel visivel.
                    produtoSelecionado.setVisible(true);

                    // Remasteriza painel.
                    produtoSelecionado.validate();

                    // Variavel recebe produto. 
                    ArrayList<Produto> produto = servicos.procurarProduto(" ", idI, true);

                    // Preenche painel de alterar com os dados.
                    produtoSelecionado.apresentacaoIDEstoque.setText(ID);
                    produtoSelecionado.textoCor.setText(produto.get(0).getCor());
                    produtoSelecionado.comboGenero.setSelectedItem(produto.get(0).getGeneros());
                    String pre = Float.toString(produto.get(0).getPreco());
                    produtoSelecionado.textoPreco.setText(pre);
                    String quant = Integer.toString(produto.get(0).getQuantidade());
                    produtoSelecionado.textoQuantidade.setText(quant);
                    String tam = Integer.toString(produto.get(0).getTamanho());
                    produtoSelecionado.textoTamanho.setText(tam);
                    produtoSelecionado.imagemProduto.setIcon(produto.get(0).getImg());

                    // Variavel recebe produto. 
                    ArrayList<Modelo> modelo = servicos.procurarModelo(produto.get(0).getID_Modelo());

                    // Preenche painel de alterar modelo.
                    produtoSelecionado.textoModelo.setText(modelo.get(0).getModelo());

                    // Variavel recebe produto. 
                    ArrayList<Marca> marca = servicos.procurarMarca(produto.get(0).getID_Marca());

                    // Preenche painel de alterar marca.
                    produtoSelecionado.textoMarca.setText(marca.get(0).getMarca());

                } catch (IOException ex) {

                    // Mensagem.
                    JOptionPane.showMessageDialog(null, "Erro na busca", "Erro", JOptionPane.ERROR);

                }

            }

        }

    }//GEN-LAST:event_tabelaProdutoMouseClicked

    /**
     * Botao de desativar cliente.
     *
     * @param evt
     */
    private void botaoExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoExcluirMouseClicked

        // Variavel recebe linha selecionada.
        int linha = tabelaProduto.getSelectedRow();

        // Se nao tiver linha selecionada.
        if (linha == -1) {

            JOptionPane.showMessageDialog(null, "Sem resultado de busca", "Erro", JOptionPane.ERROR_MESSAGE);

            // Se tiver linha selecionada.     
        } else {

            // Pede confirmacao para desativacao.
            int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja excluir mesmo?", "Erro", JOptionPane.ERROR_MESSAGE);

            // Se sim.
            if (confirmacao == 0) {

                // Recebe id da tabela.
                String ID = tabelaProduto.getValueAt(linha, 0).toString();

                // Passa para int.
                int id = Integer.parseInt(ID);

                try {

                    // Exclui produto.
                    ServicosProduto.excluirProduto(id);

                    // Instancia obeto com a tabela vazia.
                    DefaultTableModel modelo = (DefaultTableModel) tabelaProduto.getModel();

                    // Limpa linhas.
                    modelo.setRowCount(0);

                } catch (SQLException ex) {

                    // Mensagem.
                    JOptionPane.showMessageDialog(null, "Erro na exclusao", "Erro", JOptionPane.ERROR);

                }

                // Se nao, cancela.    
            } else {

                // Mensagem.
                JOptionPane.showMessageDialog(null, "Cancelado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            }

        }

    }//GEN-LAST:event_botaoExcluirMouseClicked

    /**
     * Funcao que busca produto.
     *
     * @throws java.io.IOException
     */
    public void buscaProduto() throws IOException {

        // Declara objetos com  metodos de servico.
        ServicosProduto servicos = new ServicosProduto();

        // Lista recebe dados do produto pelo ...
        ArrayList<Produto> resultado = null;

        // Lista recebe marca do produto pelo ...
        ArrayList<Marca> marca = null;

        // Lista recebe modelo do produto pelo ...
        ArrayList<Modelo> modelo = null;

        try {

            resultado = servicos.procurarProduto(textoBuscarProduto.getText(), 0, true);

        } catch (IOException ex) {

            // Mensagem.
            JOptionPane.showMessageDialog(null, "Sem conteudo", "Erro", JOptionPane.ERROR_MESSAGE);

        }

        // Nova tabela para preencher.
        DefaultTableModel model = (DefaultTableModel) tabelaProduto.getModel();

        // Zera linhas.
        model.setRowCount(0);

        // Se nao tiver resultado.
        if (resultado == null || resultado.size() <= 0) {

            // Mensagem.
            JOptionPane.showMessageDialog(null, "Sem conteudo", "Erro", JOptionPane.ERROR_MESSAGE);

            return;

        }

        // Pega tamanho da lista.
        int size = resultado.size();

        // Loop com a lista.
        for (int i = 0; i < size; i++) {

            // Pega produto da posicao do i.
            Produto produto = resultado.get(i);

            // Preenche contato com o metodo de procura com o id de marca.
            marca = servicos.procurarMarca(produto.getID_Marca());

            // Preenche contato com o metodo de procura com o id de modelo.
            modelo = servicos.procurarModelo(produto.getID_Modelo());

            // Se a lista nao estiver vazia.
            if (produto != null) {

                // Preenche colunas com informacoes.
                Object[] row = new Object[8];

                row[0] = produto.getID();

                row[1] = marca.get(0).getMarca();

                row[2] = modelo.get(0).getModelo();

                row[3] = produto.getCor();

                row[4] = produto.getGeneros();

                row[5] = produto.getTamanho();

                row[6] = produto.getPreco();

                row[7] = produto.getQuantidade();

                // Insere linha.
                model.addRow(row);

                // Se nao tiver resultado.    
            } else {

                // Mensagem.
                JOptionPane.showMessageDialog(null, "Sem resultado de busca", "Erro", JOptionPane.ERROR_MESSAGE);

                return;

            }

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botaoBuscarProduto;
    private javax.swing.JLabel botaoExcluir;
    private javax.swing.JLabel buscarProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelBuscarProduto;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField textoBuscarProduto;
    // End of variables declaration//GEN-END:variables
}
