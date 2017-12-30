package br.com.Grupo07.telas.venda;

// Importa pacote de servicos.
import br.com.Grupo07.servicos.ServicosEstoque;
import br.com.Grupo07.servicos.ServicosCliente;
import br.com.Grupo07.servicos.ServicosRelatorio;
import br.com.Grupo07.servicos.ServicosProduto;

// Importa pacotes de contrutores.
import br.com.Grupo07.construtor.cliente.Cliente;
import br.com.Grupo07.construtor.produto.Modelo;
import br.com.Grupo07.construtor.produto.Produto;
import br.com.Grupo07.construtor.venda.Venda;

// Importa pacote de verificacao.
import br.com.Grupo07.verificacoes.VerificacoesCamposVenda;

// Importa pacotes para manipulação de imagem e arquivos.
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;

// Importa pacote de manipulacao de SQL.
import java.sql.SQLException;

// Importa pacote de manipulacao de data.
import java.util.Date;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Classe com o painel de operacao de venda.
 *
 * @author Grupo 07
 */
public class painelOperacaoVenda extends javax.swing.JPanel {

    // Declara objeto para receber comandos de estoque.
    private static final ServicosEstoque comando = new ServicosEstoque();

    // Declara listas de armazenamento provisorio.
    List<Produto> listaProdutos = new ArrayList<>();
    List<Integer> listaQuantidade = new ArrayList<>();
    int cont = 0;

    public painelOperacaoVenda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        painelOperacaoVenda = new javax.swing.JPanel() {
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
        labelProduto = new javax.swing.JLabel();
        labelCPFCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDeProdutos = new javax.swing.JTable();
        botaoFinalizarCompra = new javax.swing.JLabel();
        botaoDesconto = new javax.swing.JLabel();
        labelQuantidade = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        formasDePagamento = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        checarVista = new javax.swing.JCheckBox();
        checarCartao = new javax.swing.JCheckBox();
        botaoAdicionar = new javax.swing.JLabel();
        textoProduto = new javax.swing.JFormattedTextField();
        textoQuantidade = new javax.swing.JFormattedTextField();
        textoCPF = new javax.swing.JFormattedTextField();
        textoTotal = new javax.swing.JLabel();
        botaoRemover = new javax.swing.JLabel();
        botaoCalculadora = new javax.swing.JLabel();

        painelOperacaoVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        painelOperacaoVenda.setMinimumSize(new java.awt.Dimension(600, 500));
        painelOperacaoVenda.setPreferredSize(new java.awt.Dimension(600, 500));

        labelProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelProduto.setText("Produto:");

        labelCPFCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCPFCliente.setText("CPF do Cliente:");
        labelCPFCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tabelaDeProdutos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabelaDeProdutos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabelaDeProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Modelo", "Preço", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaDeProdutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaDeProdutos);

        botaoFinalizarCompra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoFinalizarCompra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botaoFinalizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/botao finalizar.png"))); // NOI18N
        botaoFinalizarCompra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botaoFinalizarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoFinalizarCompraMouseClicked(evt);
            }
        });

        botaoDesconto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoDesconto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botaoDesconto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/botao desconto.png"))); // NOI18N
        botaoDesconto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botaoDesconto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDescontoMouseClicked(evt);
            }
        });

        labelQuantidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelQuantidade.setText("Quantidade:");

        labelTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTotal.setText("TOTAL");

        formasDePagamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        formasDePagamento.setText("Formas de Pagamento");

        buttonGroup1.add(checarVista);
        checarVista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checarVista.setText("À vista");
        checarVista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        buttonGroup1.add(checarCartao);
        checarCartao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checarCartao.setText("Cartão");
        checarCartao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botaoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/botao adicionar.png"))); // NOI18N
        botaoAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAdicionarMouseClicked(evt);
            }
        });

        textoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        textoProduto.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        textoProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        textoQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        textoQuantidade.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        textoQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        try {
            textoCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoCPF.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        textoCPF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textoTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        botaoRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/botao remover.png"))); // NOI18N
        botaoRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoRemoverMouseClicked(evt);
            }
        });

        botaoCalculadora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoCalculadora.setText("Calculadora");
        botaoCalculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCalculadoraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelOperacaoVendaLayout = new javax.swing.GroupLayout(painelOperacaoVenda);
        painelOperacaoVenda.setLayout(painelOperacaoVendaLayout);
        painelOperacaoVendaLayout.setHorizontalGroup(
            painelOperacaoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOperacaoVendaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(painelOperacaoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelOperacaoVendaLayout.createSequentialGroup()
                        .addComponent(labelCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelOperacaoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelOperacaoVendaLayout.createSequentialGroup()
                        .addGroup(painelOperacaoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(labelProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelOperacaoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelOperacaoVendaLayout.createSequentialGroup()
                                .addComponent(botaoRemover)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(painelOperacaoVendaLayout.createSequentialGroup()
                                .addGroup(painelOperacaoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoProduto)
                                    .addComponent(textoQuantidade))
                                .addGap(54, 54, 54))
                            .addGroup(painelOperacaoVendaLayout.createSequentialGroup()
                                .addComponent(botaoAdicionar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(painelOperacaoVendaLayout.createSequentialGroup()
                        .addGroup(painelOperacaoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelOperacaoVendaLayout.createSequentialGroup()
                                .addGap(0, 5, Short.MAX_VALUE)
                                .addComponent(botaoDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoFinalizarCompra))
                            .addGroup(painelOperacaoVendaLayout.createSequentialGroup()
                                .addGroup(painelOperacaoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(formasDePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelOperacaoVendaLayout.createSequentialGroup()
                                        .addComponent(checarVista)
                                        .addGap(18, 18, 18)
                                        .addComponent(checarCartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separador))
                            .addGroup(painelOperacaoVendaLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(painelOperacaoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelOperacaoVendaLayout.createSequentialGroup()
                                        .addComponent(labelTotal)
                                        .addGap(27, 27, 27)
                                        .addComponent(textoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        painelOperacaoVendaLayout.setVerticalGroup(
            painelOperacaoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOperacaoVendaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(painelOperacaoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCPFCliente)
                    .addComponent(textoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelOperacaoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelOperacaoVendaLayout.createSequentialGroup()
                        .addGroup(painelOperacaoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelOperacaoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelOperacaoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(formasDePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelOperacaoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checarVista)
                            .addComponent(checarCartao))
                        .addGap(18, 18, 18)
                        .addGroup(painelOperacaoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addComponent(botaoCalculadora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelOperacaoVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoFinalizarCompra)
                            .addComponent(botaoDesconto)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelOperacaoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelOperacaoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 440, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botao de adicionar.
     *
     * @param evt
     */
    private void botaoAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAdicionarMouseClicked

        // Instacia objeto para recebe metodos de verificacao.
        VerificacoesCamposVenda verificacoes = new VerificacoesCamposVenda();

        // Instacia objeto para recebe metodos de estoque.
        ServicosEstoque estoque = new ServicosEstoque();

        // Instacia objeto para recebe metodos de produto.
        ServicosProduto prod = new ServicosProduto();

        // Declara variaveis para receber resultado das verificacoes.
        boolean verificado = false, verificarSomatorio = false;

        int verificarExistencia = 0;

        try {

            // Verificacao de campos ao adicionar.
            verificado = verificacoes.VerificacoesCamposVendaAdicionar(textoProduto.getText(), textoQuantidade.getText());

        } catch (SQLException ex) {

            // Mensagem.
            JOptionPane.showMessageDialog(null, "Erro ao excluir", "Erro", JOptionPane.ERROR);

        }

        // Se estiver tudo okay.
        if (verificado) {

            // Passa variaveis id e quantidade para int.
            int idProduto = Integer.parseInt(textoProduto.getText());
            int quantidadeProduto = Integer.parseInt(textoQuantidade.getText());

            try {

                // Verifica se a lista esta vazia.
                if (!listaProdutos.isEmpty()) {

                    // Loop com o tamanho da lista.
                    for (int i = 0; i <= listaProdutos.size(); i++) {

                        // Verifica se produto eh existente na tabela.
                        if (verificarExistencia == listaProdutos.size()) {

                            // Retira produto do esqtoque.
                            listaProdutos.add(estoque.retirarProdutoEstoque(idProduto, quantidadeProduto));

                            break;

                            // Se ele ja for existente na tabela.   
                        } else if (idProduto == listaProdutos.get(i).getID()) {

                            // Pega quantidade pedida.
                            int quantidade = listaQuantidade.get(i);

                            // Verifica quantidade.
                            boolean verificarQuantidade = estoque.verificarQuantidade(idProduto, quantidade + quantidadeProduto);

                            if (verificarQuantidade) {

                                // Mensagem.
                                JOptionPane.showMessageDialog(null, "Quantidade acima");

                            } else {

                                // Soma quantidades.
                                listaQuantidade.set(i, quantidade + quantidadeProduto);

                                int quantidadeEstoque = estoque.getQuantidade();

                                // Apresenta.
                                JOptionPane.showMessageDialog(null, "Quantidade atual em estoque: " + quantidadeEstoque, "Aviso", JOptionPane.INFORMATION_MESSAGE);

                                // Se foi somado os precos nao precisa inserir quantidade na tabela.
                                verificarSomatorio = true;

                            }

                            break;

                        } else {

                            // Se nao for existente.
                            verificarExistencia++;

                        }

                    }

                    //  Se a lista estiver vazia, insere direto.
                } else {

                    listaProdutos.add(estoque.retirarProdutoEstoque(idProduto, quantidadeProduto));

                }

            } catch (SQLException | IOException ex) {

                // Mensagem.
                JOptionPane.showMessageDialog(null, "Erro", "Erro", JOptionPane.ERROR);

            }

            // Se nao existir na tabela, adiciona quantidade a novo produto.
            if (verificarSomatorio == false) {

                listaQuantidade.add(quantidadeProduto);

            }

            // Cria novo modelo da tabela.
            DefaultTableModel model = (DefaultTableModel) tabelaDeProdutos.getModel();

            // Volta para primeira linha.
            model.setRowCount(0);

            // Loop na tabela.
            for (int i = 0; i < listaProdutos.size(); i++) {

                try {

                    // Pega as quantidades e os id's.
                    Produto produto = listaProdutos.get(i);
                    int quantidade = listaQuantidade.get(i);

                    // Pega modelo
                    ArrayList<Modelo> modelo = prod.procurarModelo(produto.getID_Modelo());

                    // Insere nas linhas enquanto tiver produto.
                    if (produto != null) {

                        Object[] row = new Object[4];

                        row[0] = produto.getID();

                        row[1] = modelo.get(0).getModelo();

                        row[2] = produto.getPreco();

                        row[3] = quantidade;

                        model.addRow(row);

                    }

                } catch (IOException ex) {

                    // Mensagem.
                    JOptionPane.showMessageDialog(null, "Erro", "Erro", JOptionPane.ERROR);

                }

            }

            // Atualiza preco apresentado.
            atualizaPrecoFinal();

            // Limpa campos.
            textoProduto.setText("");
            textoQuantidade.setText("");

        }

    }//GEN-LAST:event_botaoAdicionarMouseClicked

    /**
     * Botao de remover.
     *
     * @param evt
     */
    private void botaoRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRemoverMouseClicked

        // Instacia objeto que recebe servicos de estoque.
        ServicosEstoque estoque = new ServicosEstoque();

        // Se tabela nao estiver vazia.
        if (tabelaDeProdutos.getRowCount() != 0) {

            // Pega linha.
            DefaultTableModel linha = (DefaultTableModel) tabelaDeProdutos.getModel();

            // Inicializa objeto.
            Produto produtoR = null;

            try {

                // Pega id do produto.
                produtoR = estoque.getProduto(Integer.parseInt(tabelaDeProdutos.getValueAt(tabelaDeProdutos.getSelectedRow(), 0).toString()));

            } catch (SQLException | IOException ex) {

                // Mensagem.
                JOptionPane.showMessageDialog(null, "Erro", "Erro", JOptionPane.ERROR);

            }

            // Pega a quantidade.
            int quantidade = Integer.parseInt(tabelaDeProdutos.getValueAt(tabelaDeProdutos.getSelectedRow(), 3).toString());

            // Remove da lista.
            listaProdutos.remove(tabelaDeProdutos.getSelectedRow());
            listaQuantidade.remove(tabelaDeProdutos.getSelectedRow());

            // Remove da tabela.
            linha.removeRow(tabelaDeProdutos.getSelectedRow());
            tabelaDeProdutos.setModel(linha);

            // Atualiza preco.
            atualizaPrecoFinal();

            // Se a lista estiver vazia.    
        } else {

            JOptionPane.showMessageDialog(null, "Lista vazia");

        }


    }//GEN-LAST:event_botaoRemoverMouseClicked

    /**
     * Botao de finazalizar venda.
     *
     * @param evt
     */
    private void botaoFinalizarCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFinalizarCompraMouseClicked

        // Instacia objeto que recebe estoque.
        ServicosEstoque estoque = new ServicosEstoque();

        // Se tabela nao estiver vazia.
        if (tabelaDeProdutos.getRowCount() != 0) {

            // Insere confirmacao para insercao.
            int confirmar = JOptionPane.showConfirmDialog(null, "Confirmacao", "Deseja prosseguir?", JOptionPane.OK_OPTION);

            // Se confirmar.
            if (confirmar == 0) {

                try {

                    // Instancia objeto de venda.
                    Venda venda = new Venda();

                    // Pega data de hoje.
                    Date hoje = new Date();

                    // Preenche informacoes da venda.
                    venda.isVendaAtiva();
                    venda.setData(hoje);

                    // Declara variaveis.
                    int quantidadeT, soma = 0;

                    // Soma quantidades.
                    for (int i = 0; i <= tabelaDeProdutos.getRowCount() - 1; i++) {

                        quantidadeT = Integer.parseInt(tabelaDeProdutos.getValueAt(i, 3).toString());

                        soma += quantidadeT;

                    }

                    // Coloca o total de quantidade de itens.
                    venda.setTotalQuantidade(soma);

                    // Verifica opcao de pagamento e insere opcao.
                    if (checarCartao.getText().isEmpty()) {

                        venda.setFormaPagamento("A vista");

                    } else {

                        venda.setFormaPagamento("Cartao");

                    }

                    // Declara obejto com os servicos de cliente. 
                    ServicosCliente servico = new ServicosCliente();

                    // Verifica se CPF foi preeenchido
                    if (!textoCPF.getText().endsWith(" ")) {

                        // Obtem informacoes do cliente.
                        venda.setCliente(servico.obterCliente(textoCPF.getText()));

                    } else {

                        //Declara objeto com cliente.
                        Cliente cliente = new Cliente();

                        //Cria id para cliente nulo.
                        cliente.setID_Cliente(0);

                        // Modifica informacoes.
                        venda.setCliente(cliente);

                    }

                    // Modifica valor total.
                    venda.setValor(Float.parseFloat(textoTotal.getText()));

                    // Instancia objeto com metodos do relatorio.
                    ServicosRelatorio relatorio = new ServicosRelatorio();

                    // Adiciona venda.
                    relatorio.adicionaVenda(venda);

                    // Recebe id da lista.
                    int id_venda = estoque.iDVenda();

                    // Loop na tabela.
                    for (int i = 0; i <= tabelaDeProdutos.getRowCount() - 1; i++) {

                        // Pega id do produto, quantidade e preco.
                        int idProduto = Integer.parseInt(tabelaDeProdutos.getValueAt(i, 0).toString());
                        float preco = Float.parseFloat(tabelaDeProdutos.getValueAt(i, 2).toString());
                        int quantidade = Integer.parseInt(tabelaDeProdutos.getValueAt(i, 3).toString());

                        // Diminui no estoque e insere na lista de itens de venda.
                        estoque.diminuirQuantidadeProduto(idProduto, quantidade);
                        estoque.inserirLista(idProduto, quantidade, preco, id_venda);

                    }

                    // Limpa todos os campos.
                    limparTudo();

                    JOptionPane.showMessageDialog(null, "Finazalizando", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                } catch (SQLException | FileNotFoundException ex) {

                    // Mensagem.
                    JOptionPane.showMessageDialog(null, "Erro", "Erro", JOptionPane.ERROR);

                } catch (IOException ex) {

                    // Mensagem.
                    JOptionPane.showMessageDialog(null, "Erro", "Erro", JOptionPane.ERROR);

                }

                // Mensagem de cancelamento.    
            } else {

                JOptionPane.showMessageDialog(null, "Cancelado, sucesso", "Cancelamento", JOptionPane.OK_OPTION);

            }

        } else {

            JOptionPane.showMessageDialog(null, "Lista vazia");

        }

    }//GEN-LAST:event_botaoFinalizarCompraMouseClicked

    /**
     * Botao de desconto.
     *
     * @param evt
     */
    private void botaoDescontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDescontoMouseClicked

        // Verifica se cpf esta preenchido.
        if (!textoCPF.getText().endsWith(" ")) {

            try {

                // Instancia objeto com estoque.
                ServicosEstoque estoque = new ServicosEstoque();

                // Verifica se cliente existe.
                boolean clienteExiste = ServicosCliente.posseDeCliente(textoCPF.getText());

                if (clienteExiste) {

                    // Recebe metodo de verificacao de lucro.
                    float lucro = estoque.getDesc(textoCPF.getText());

                    // Mensagem que apresenta lucro pelo cliente.
                    JOptionPane.showMessageDialog(null, "Soma total de lucro das compra pelo cliente" + " R$:" + lucro, "Desconto", JOptionPane.INFORMATION_MESSAGE);

                    // Pede senha para gerente.
                    String senha = JOptionPane.showInputDialog("Insira a senha:");

                    // Opcao de cancelamento.
                    if (senha.isEmpty() || senha == null) {

                        // Mensagem.
                        JOptionPane.showMessageDialog(null, "Cancelado", "Cancelamento", JOptionPane.INFORMATION_MESSAGE);

                        // Se a senha for correta e se nao foi dado desconto.    
                    } else if (senha.equalsIgnoreCase("123") && cont == 0) {

                        // Pega desconto.
                        String desconto = null;

                        if (lucro <= 100) {

                            // Chama funcao para pegar porcentagem.
                            String[] opcoes = preencherPorcentagem(5);

                            // Pega desconto.
                            desconto = (String) JOptionPane.showInputDialog(null, "Selecione a porcentagem:", "Desconto", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

                        } else if (lucro > 100 && lucro <= 200) {

                            // Chama funcao para pegar porcentagem.
                            String[] opcoes = preencherPorcentagem(10);

                            // Pega desconto.
                            desconto = (String) JOptionPane.showInputDialog(null, "Selecione a porcentagem:", "Desconto", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

                        } else {

                            // Chama funcao para pegar porcentagem.
                            String[] opcoes = preencherPorcentagem(15);

                            // Pega desconto.
                            desconto = (String) JOptionPane.showInputDialog(null, "Selecione a porcentagem:", "Desconto", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

                        }

                        if (desconto != null) {

                            // Transforma.
                            float desc = Float.parseFloat(desconto) / 100;
                            float totalDes = Float.parseFloat(textoTotal.getText()) * desc;
                            float total = Float.parseFloat(textoTotal.getText()) - totalDes;

                            // Contador de desconto unico.
                            cont++;

                            // Atualiza preco.
                            textoTotal.setText("" + total);

                        }

                    } else {

                        // Mensagem.
                        JOptionPane.showMessageDialog(null, "Senha incorreta ou desconto ja concedido", "Erro", JOptionPane.ERROR_MESSAGE);

                    }

                } else {

                    // Mensagem.
                    JOptionPane.showMessageDialog(this, "Sem cadastro", "Erro", JOptionPane.ERROR_MESSAGE);

                }

            } catch (SQLException | IOException ex) {

                // Mensagem.
                JOptionPane.showMessageDialog(this, "Erro no banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);

            }

        } else {

            // Mensagem.
            JOptionPane.showMessageDialog(this, "CPF nao preenchido", "Erro", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_botaoDescontoMouseClicked

    /**
     * Botao da calculadora.
     *
     * @param evt
     */
    private void botaoCalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCalculadoraMouseClicked

        try {

            Runtime.getRuntime().exec("calc.exe");

        } catch (IOException ex) {

            // Mensagem.
            JOptionPane.showMessageDialog(null, "Erro calculadora", "Erro", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_botaoCalculadoraMouseClicked

    /**
     * Funcao que traz porcentagens
     *
     * @param k
     * @return
     */
    private String[] preencherPorcentagem(int k) {

        // Opcoes.
        String[] opcoes = new String[k];

        // Loop para preencher o array.
        for (int i = 0; i < k; i++) {

            // Ignora primeira posicao
            if (i != 0) {

                // Pega posicao anterior e soma com 1
                int numero = Integer.parseInt(opcoes[i - 1]) + 1;

                // Adiciona.
                opcoes[i] = "" + numero;

            }           
            
            int numero = i +  1;
            
            opcoes[i] = "" + numero;

        }

        // Retorna array.
        return opcoes;

    }

    /**
     * Funcao que atualiza preco apresentado.
     */
    private void atualizaPrecoFinal() {

        float soma = 0;
        float item = 0;

        // Loop na tabela
        for (int i = 0; i <= tabelaDeProdutos.getRowCount() - 1; i++) {

            // Multiplica preco pelo numero de quantidade.
            item = Float.parseFloat(tabelaDeProdutos.getValueAt(i, 2).toString()) * Float.parseFloat(tabelaDeProdutos.getValueAt(i, 3).toString());

            // Soma total.
            soma += item;

        }

        // Apresenta.
        textoTotal.setText("" + soma);

    }

    /**
     * Limpa todas os campos e a tabela.
     */
    private void limparTudo() {

        cont = 0;
        textoCPF.setText(null);
        buttonGroup1.clearSelection();
        textoProduto.setText(" ");
        textoTotal.setText(" ");
        textoQuantidade.setText(" ");
        DefaultTableModel modelo = (DefaultTableModel) tabelaDeProdutos.getModel();
        modelo.setRowCount(0);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botaoAdicionar;
    private javax.swing.JLabel botaoCalculadora;
    private javax.swing.JLabel botaoDesconto;
    private javax.swing.JLabel botaoFinalizarCompra;
    private javax.swing.JLabel botaoRemover;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JCheckBox checarCartao;
    public javax.swing.JCheckBox checarVista;
    private javax.swing.JLabel formasDePagamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCPFCliente;
    private javax.swing.JLabel labelProduto;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JPanel painelOperacaoVenda;
    private javax.swing.JSeparator separador;
    public javax.swing.JTable tabelaDeProdutos;
    public javax.swing.JFormattedTextField textoCPF;
    public javax.swing.JFormattedTextField textoProduto;
    public javax.swing.JFormattedTextField textoQuantidade;
    private javax.swing.JLabel textoTotal;
    // End of variables declaration//GEN-END:variables
}
