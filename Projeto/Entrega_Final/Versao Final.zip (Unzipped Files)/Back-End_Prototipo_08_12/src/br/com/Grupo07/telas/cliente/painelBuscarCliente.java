package br.com.Grupo07.telas.cliente;

// Importa pacotes com construtores.
import br.com.Grupo07.construtor.cliente.Cliente;
import br.com.Grupo07.construtor.cliente.Contato;
import br.com.Grupo07.construtor.cliente.DadosPessoais;
import br.com.Grupo07.construtor.cliente.Endereco;

// Importa pacote com servicos.
import br.com.Grupo07.servicos.ServicosCliente;

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
 * Painel de busca do cliente.
 *
 * @author Grupo 07
 */
public class painelBuscarCliente extends javax.swing.JPanel {

    public painelBuscarCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBuscarCliente = new javax.swing.JPanel() {
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
        botaoBuscar = new javax.swing.JLabel();
        buscarCliente = new javax.swing.JLabel();
        textoBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        botaoExcluir = new javax.swing.JLabel();

        painelBuscarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        painelBuscarCliente.setPreferredSize(new java.awt.Dimension(10, 459));

        botaoBuscar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botaoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/botao buscar.png"))); // NOI18N
        botaoBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoBuscarMouseClicked(evt);
            }
        });

        buscarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarCliente.setText("BUSCAR CLIENTE:");

        textoBusca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoBusca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tabelaCliente.setAutoCreateRowSorter(true);
        tabelaCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Genero", "Telefone", "Celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCliente.setGridColor(new java.awt.Color(0, 0, 0));
        tabelaCliente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaCliente.getTableHeader().setReorderingAllowed(false);
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCliente);

        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/botao excluir.png"))); // NOI18N
        botaoExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoExcluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelBuscarClienteLayout = new javax.swing.GroupLayout(painelBuscarCliente);
        painelBuscarCliente.setLayout(painelBuscarClienteLayout);
        painelBuscarClienteLayout.setHorizontalGroup(
            painelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBuscarClienteLayout.createSequentialGroup()
                        .addComponent(buscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoBuscar)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscarClienteLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscarClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoExcluir)))
                .addGap(24, 24, 24))
        );
        painelBuscarClienteLayout.setVerticalGroup(
            painelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscarClienteLayout.createSequentialGroup()
                        .addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(painelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(botaoExcluir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botao de buscar.
     *
     * @param evt
     */
    private void botaoBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoBuscarMouseClicked

        // Verifica se texto esta vazio.
        if (!textoBusca.getText().isEmpty()) {

            try {

                // Funcao de busca.
                buscaClinte();

            } catch (IOException ex) {

                // Mensagem.
                JOptionPane.showMessageDialog(null, "Sem conteudo", "Erro", JOptionPane.ERROR_MESSAGE);

            }

        } else {

            // Instancia obeto com a tabela vazia.
            DefaultTableModel modelo = (DefaultTableModel) tabelaCliente.getModel();

            // Limpa linhas.
            modelo.setRowCount(0);

            // Apresenta mensagem
            JOptionPane.showMessageDialog(null, "Sem conteudo", "Erro", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_botaoBuscarMouseClicked

    /**
     * Quando clicado uma linha
     *
     * @param evt
     */
    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked

        // Pega evento.
        if (evt.getClickCount() == 2) {

            // Variavel recebe linha selecionada.
            int linha = tabelaCliente.getSelectedRow();

            // Se nao tiver linha.
            if (linha == -1) {

                // Mensagem.
                JOptionPane.showMessageDialog(null, "Sem resultado de busca", "Erro", JOptionPane.ERROR_MESSAGE);

                // Se tiver linha.    
            } else {

                try {

                    // Variavel recebe id do cliente.
                    String ID = tabelaCliente.getValueAt(linha, 0).toString();

                    // Variavel recebe id para int.
                    int id = Integer.parseInt(ID);

                    // Variavel recebe cliente. 
                    ArrayList<Cliente> cliente = ServicosCliente.procurarCliente(id, false);

                    // Declara painel de alteracao e apresentacao.
                    painelAlterar clienteSelecionado = new painelAlterar();

                    // Remove tudo do painel atual.
                    painelBuscarCliente.removeAll();

                    // Adiciona painel a tela.
                    painelBuscarCliente.add(clienteSelecionado);

                    // Escolhe tamanho do painel.
                    clienteSelecionado.setSize(painelBuscarCliente.getWidth(), painelBuscarCliente.getHeight());

                    // Deixa painel visivel.
                    clienteSelecionado.setVisible(true);

                    // Remasteriza painel.
                    clienteSelecionado.validate();

                    // Lista de dados do cliente recebe metodo de procura.
                    ArrayList<DadosPessoais> dados = ServicosCliente.procurarDadosCliente(" ", cliente.get(0).getID_DadosPessoais(), false);

                    // Preenche painel de alterar com os dados.
                    clienteSelecionado.textoNome.setText(dados.get(0).getNome());
                    clienteSelecionado.textoCPF.setText(dados.get(0).getCPF());
                    clienteSelecionado.comboGenero.setSelectedItem(dados.get(0).getGenero());
                    clienteSelecionado.textoDataDeNascimento.setText(dados.get(0).getDataNascimento());
                    clienteSelecionado.imagemCliente.setIcon(dados.get(0).getImagemAlterar());

                    // Lista de endereco do cliente recebe metodo de procura.
                    ArrayList<Endereco> endereco = ServicosCliente.procurarEndereco(cliente.get(0).getID_Endereco());

                    // Preenche painel de alterar com o endereco.
                    clienteSelecionado.textoEnderecoLogradouro.setText(endereco.get(0).getLogradouro());
                    clienteSelecionado.textoBairro.setText(endereco.get(0).getBairro());
                    clienteSelecionado.textoComplemento.setText(endereco.get(0).getComplemento());
                    clienteSelecionado.textoNumero.setText(endereco.get(0).getNumero());
                    clienteSelecionado.textoCEP.setText(endereco.get(0).getCEP());

                    // Lista de contato do cliente recebe metodo de procura.
                    ArrayList<Contato> contato = ServicosCliente.procurarContatoCliente(cliente.get(0).getID_Contato());

                    // Preenche painel de alterar com o contato.
                    clienteSelecionado.textoEmail.setText(contato.get(0).getEmail());
                    clienteSelecionado.textoTelefone.setText(contato.get(0).getTelefone());
                    clienteSelecionado.textoCelular.setText(contato.get(0).getCelular());
                    clienteSelecionado.textoDD_Celular.setText(contato.get(0).getDD_Celular());
                    clienteSelecionado.textoDD_Telefone.setText(contato.get(0).getDD_Telefone());
                    clienteSelecionado.textoEmail.setText(contato.get(0).getEmail());

                    // Preenche painel de alterar com o id.
                    clienteSelecionado.textoID_Cliente.setText(ID);

                } catch (IOException ex) {

                    // Mensagem.
                    JOptionPane.showMessageDialog(null, "Erro na busca", "Erro", JOptionPane.ERROR);

                }

            }

        }

    }//GEN-LAST:event_tabelaClienteMouseClicked

    /**
     * Botao de desativar cliente.
     *
     * @param evt
     */
    private void botaoExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoExcluirMouseClicked

        // Variavel recebe linha selecionada.
        int linha = tabelaCliente.getSelectedRow();

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
                String ID = tabelaCliente.getValueAt(linha, 0).toString();

                // Passa para int.
                int id = Integer.parseInt(ID);

                try {

                    // Exclui cliente.
                    ServicosCliente.excluirCliente(id);

                    // Instancia obeto com a tabela vazia.
                    DefaultTableModel modelo = (DefaultTableModel) tabelaCliente.getModel();

                    // Limpa linhas.
                    modelo.setRowCount(0);

                    // Mensagem.
                    JOptionPane.showMessageDialog(null, "Excluido", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                } catch (SQLException ex) {

                    // Mensagem.
                    JOptionPane.showMessageDialog(null, "Erro na busca", "Erro", JOptionPane.ERROR);

                }

                // Se nao, cancela.
            } else {

                // Mensagem.
                JOptionPane.showMessageDialog(null, "Cancelado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            }

        }


    }//GEN-LAST:event_botaoExcluirMouseClicked

    /**
     * Funcao que busca cliente.
     *
     * @throws IOException
     */
    public void buscaClinte() throws IOException {

        // Lista recebe dados do cliente pelo seu cpf ou nome.
        ArrayList<DadosPessoais> resultado = ServicosCliente.procurarDadosCliente(textoBusca.getText(), 0, true);

        // Nova tabela para preencher.
        DefaultTableModel modelo = (DefaultTableModel) tabelaCliente.getModel();

        // Zera linhas.
        modelo.setRowCount(0);

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

            // Pega dados da posicao do i.
            DadosPessoais dados = resultado.get(i);

            // Procura cliente pelos seu id de dados e preenche lista.
            ArrayList<Cliente> cliente = ServicosCliente.procurarCliente(resultado.get(i).getID_DadosPessoais(), true);

            // Inicaliza lista com contatos.
            ArrayList<Contato> contato = null;

            // Se a lista nao estiver vazia.
            if (cliente != null) {

                // Preenche contato com o metodo de procura com o id de contato.
                contato = ServicosCliente.procurarContatoCliente(cliente.get(0).getID_Contato());

                // Se tiver resultado.
                if (contato != null) {

                    // Preenche colunas com informacoes.
                    Object[] row = new Object[6];

                    row[0] = cliente.get(0).getID_Cliente();

                    row[1] = dados.getNome();

                    row[2] = dados.getCPF();

                    row[3] = dados.getGenero();

                    row[4] = contato.get(0).getTelefone();

                    row[5] = contato.get(0).getCelular();

                    // Insere linha.
                    modelo.addRow(row);

                }

                // Se nao tiver resultado.    
            } else {

                // Mensagem.
                JOptionPane.showMessageDialog(null, "Sem resultado de busca", "Erro", JOptionPane.ERROR_MESSAGE);

                return;

            }

        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botaoBuscar;
    private javax.swing.JLabel botaoExcluir;
    private javax.swing.JLabel buscarCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelBuscarCliente;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField textoBusca;
    // End of variables declaration//GEN-END:variables
}
