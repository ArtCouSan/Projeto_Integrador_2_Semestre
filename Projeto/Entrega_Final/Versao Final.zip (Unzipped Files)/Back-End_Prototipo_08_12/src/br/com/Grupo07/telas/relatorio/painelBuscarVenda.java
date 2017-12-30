package br.com.Grupo07.telas.relatorio;

// Importa pacotes de contrutores.
import br.com.Grupo07.construtor.cliente.DadosPessoais;
import br.com.Grupo07.construtor.venda.Carrinho;
import br.com.Grupo07.construtor.venda.Venda;

// Importa pacote de servicos.
import br.com.Grupo07.servicos.ServicosRelatorio;
import br.com.Grupo07.servicos.ServicosCliente;

// Importa pacote de verificacao.
import br.com.Grupo07.verificacoes.VerificacoesCamposRelatorio;

// Importa pacotes para manipulação de imagem e arquivos.
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

// Importa pacote de manipulacao de SQL.
import java.sql.SQLException;

// Importa pacote de parse.
import java.text.ParseException;

// Importa pacote de datas.
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Classe com o painel busca para relatorios.
 *
 * @author Grupo 07
 */
public class painelBuscarVenda extends javax.swing.JPanel {

    public painelBuscarVenda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBuscarVenda = new javax.swing.JPanel() {
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
        botaoBuscarVenda = new javax.swing.JLabel();
        buscarVenda = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVenda = new javax.swing.JTable();
        labelDe = new javax.swing.JLabel();
        labelAte = new javax.swing.JLabel();
        textoDe = new javax.swing.JFormattedTextField();
        textoAte = new javax.swing.JFormattedTextField();

        painelBuscarVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        painelBuscarVenda.setPreferredSize(new java.awt.Dimension(10, 459));

        botaoBuscarVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botaoBuscarVenda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botaoBuscarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/botao buscar.png"))); // NOI18N
        botaoBuscarVenda.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        botaoBuscarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoBuscarVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoBuscarVendaMouseClicked(evt);
            }
        });

        buscarVenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscarVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarVenda.setText("BUSCAR VENDA");

        tabelaVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tabelaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID da Venda", "ID do Cliente", "Data da Venda", "Qt. de Produtos", "Total de Lucro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaVenda.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaVenda.getTableHeader().setReorderingAllowed(false);
        tabelaVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaVendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaVenda);

        labelDe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDe.setText("De:");

        labelAte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelAte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAte.setText("Até:");

        try {
            textoDe.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoDe.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        textoDe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        try {
            textoAte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoAte.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        textoAte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout painelBuscarVendaLayout = new javax.swing.GroupLayout(painelBuscarVenda);
        painelBuscarVenda.setLayout(painelBuscarVendaLayout);
        painelBuscarVendaLayout.setHorizontalGroup(
            painelBuscarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscarVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBuscarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(painelBuscarVendaLayout.createSequentialGroup()
                        .addComponent(buscarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoDe, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelAte, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoAte, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(botaoBuscarVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        painelBuscarVendaLayout.setVerticalGroup(
            painelBuscarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscarVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBuscarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBuscarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscarVendaLayout.createSequentialGroup()
                            .addGroup(painelBuscarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textoAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelAte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9))
                        .addGroup(painelBuscarVendaLayout.createSequentialGroup()
                            .addGroup(painelBuscarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buscarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelDe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textoDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscarVendaLayout.createSequentialGroup()
                        .addComponent(botaoBuscarVenda)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBuscarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBuscarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botao para buscar.
     *
     * @param evt
     */
    private void botaoBuscarVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoBuscarVendaMouseClicked

        // Cria modelo de tabela.
        DefaultTableModel modelo = (DefaultTableModel) tabelaVenda.getModel();

        // Zera linhas.
        modelo.setRowCount(0);

        // Cria objeto com metodos de verificacoes.
        VerificacoesCamposRelatorio verifica = new VerificacoesCamposRelatorio();

        // Declara variaveis de verificacao.
        boolean preenchimentoF = verifica.verificarFim(textoAte.getText());
        boolean preenchimentoI = verifica.verificarInicio(textoDe.getText());

        // Variaveis que recebem datas.
        String Dinicio = textoDe.getText();
        String Dfim = textoAte.getText();

        // Declara formato de data.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Verifica preechimento.
        if (preenchimentoF && preenchimentoI) {

            // Pega dias de inicio e fim.
            Calendar inicio = Calendar.getInstance();
            Calendar fim = Calendar.getInstance();

            try {

                // Preenche datas.
                inicio.setTime(sdf.parse(Dinicio));
                fim.setTime(sdf.parse(Dfim));

                // Verifica se data inicial nao eh posterior a final.
                if (inicio.before(fim) || inicio.equals(fim)) {

                    // Chama funcao de busca.
                    buscaVenda(Dinicio, Dfim);

                } else {

                    // Mensagem.
                    JOptionPane.showMessageDialog(null, "Data incorreta", "Erro", JOptionPane.ERROR_MESSAGE);

                }

            } catch (ParseException | SQLException ex) {

                // Mensagem.
                JOptionPane.showMessageDialog(null, "Erro no banco", "Erro", JOptionPane.ERROR_MESSAGE);

            }

            // Se somente inicial foi preenchido.    
        } else if (!preenchimentoI) {

            // Declara variavel.
            Calendar inicio = Calendar.getInstance();

            try {

                // Preenche data.
                inicio.setTime(sdf.parse(Dinicio));

                // Chama funcao de busca.
                buscaVenda(Dinicio, Dfim);

            } catch (ParseException | SQLException ex) {

                // Mensagem.
                JOptionPane.showMessageDialog(null, "Erro no banco", "Erro", JOptionPane.ERROR_MESSAGE);

            }

        } else {

            // Mensagem.
            JOptionPane.showMessageDialog(null, "Sem data inicial", "Erro", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_botaoBuscarVendaMouseClicked

    /**
     * Funcao que apresenta mais informacoes de determinada venda.
     *
     * @param evt
     */
    private void tabelaVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaVendaMouseClicked

        // Verifica evento.
        if (evt.getClickCount() == 2) {

            // Pega linha selecionada.
            int linha = tabelaVenda.getSelectedRow();

            // Verifica sem linhas na tabela.
            if (linha == -1) {

                JOptionPane.showMessageDialog(null, "Sem nada na lista", "Erro", JOptionPane.ERROR_MESSAGE);

            } else {

                try {

                    // Pega id da venda.
                    String ID = tabelaVenda.getValueAt(linha, 0).toString();

                    // Passa para inteiro.
                    int id = Integer.parseInt(ID);

                    // Inicializa objeto.
                    Venda relatorioEscolhido = null;

                    try {

                        // Recebe metodo de procurar venda.
                        relatorioEscolhido = ServicosRelatorio.procurarVenda(id);

                    } catch (SQLException ex) {

                        // Mensagem.
                        JOptionPane.showMessageDialog(null, "Erro no banco", "Erro", JOptionPane.ERROR_MESSAGE);

                    }

                    // Instancia objeto com servicos de relatorio.
                    ServicosRelatorio vendas = new ServicosRelatorio();

                    // Declara painel com relatorio.
                    painelRelatorio vendaSelecionado = new painelRelatorio();

                    // Remove tudo do painel atual.
                    painelBuscarVenda.removeAll();

                    // Adiciona painel ao painel atual.
                    painelBuscarVenda.add(vendaSelecionado);

                    // Modifica seu tamanho.
                    vendaSelecionado.setSize(painelBuscarVenda.getWidth(), painelBuscarVenda.getHeight());

                    // Recebe id do cliente.
                    String idCliente = Integer.toString(relatorioEscolhido.getID_cliente());

                    // Recebe data da venda.
                    String dataVenda = relatorioEscolhido.getData().toString();

                    // Recebe total da venda.
                    float total = relatorioEscolhido.getValor();

                    // Passa para float.
                    String totalV = Float.toString(total);

                    // Recebe dia.
                    CharSequence dia = dataVenda.subSequence(8, 10);

                    // Recebe mes.
                    CharSequence mes = dataVenda.subSequence(5, 7);

                    // Recebe ano.
                    CharSequence ano = dataVenda.subSequence(0, 4);

                    // Concatena para formato de data desejado.
                    String data = dia + "/" + mes + "/" + ano;

                    // Cria lista que recebe lista de vendas.
                    ArrayList<Carrinho> resultado = ServicosRelatorio.procurarItens(id);

                    // Pega tamanho da lista.
                    int size = resultado.size();

                    // Preenche campos do painel 
                    vendaSelecionado.textoIDVenda.setText(ID);
                    vendaSelecionado.textoData.setText(data);
                    vendaSelecionado.textoTotal.setText("R$ " + totalV);

                    // Verifica se cliente existe.
                    if (idCliente != null) {

                        vendaSelecionado.textoIDCliente.setText(idCliente);

                        int idC = Integer.parseInt(idCliente);

                        //Declara objeto de cliente.
                        ArrayList<DadosPessoais> dadosCliente = ServicosCliente.procurarDadosCliente(" ", idC, false);
                        
                        // Pega nome cliente e insere.
                        vendaSelecionado.textoCliente.setText(dadosCliente.get(0).getNome());
                        
                        
                    } else {

                        vendaSelecionado.textoIDCliente.setText("Cliente sem cadastro.");
                        vendaSelecionado.textoCliente.setText("Cliente sem cadastro.");

                    }

                    // Insere tabela para apresentar lista de itens.
                    DefaultTableModel modelo = (DefaultTableModel) vendaSelecionado.tabelaRelatorios.getModel();

                    // Zera linhas.
                    modelo.setRowCount(0);

                    // Loop na lista.
                    for (int i = 0; i < size; i++) {

                        // Chama lista em posicao i.
                        Carrinho lista = resultado.get(i);

                        // Se nao estiver vazia, preenche.
                        if (lista != null) {

                            Object[] row = new Object[2];

                            row[0] = lista.getId_produto();

                            row[1] = lista.getQuantidade();

                            modelo.addRow(row);

                        }

                    }

                    // Insere tabela preenchida
                    vendaSelecionado.tabelaRelatorios.setModel(modelo);

                    // Deixa painel visivel.
                    vendaSelecionado.setVisible(true);

                    // Remasteriza painel.
                    vendaSelecionado.validate();

                } catch (SQLException | IOException ex) {

                    // Mensagem.
                    JOptionPane.showMessageDialog(null, "Erro no banco", "Erro", JOptionPane.ERROR_MESSAGE);

                }  

            }

        }

    }//GEN-LAST:event_tabelaVendaMouseClicked

    /**
     * Funcao que busca vendas por data.
     *
     * @param inicio
     * @param fim
     * @throws SQLException
     */
    public void buscaVenda(String inicio, String fim) throws SQLException {

        // Declara lista de venda que recebe venda.
        ArrayList<Venda> resultado = ServicosRelatorio.procurarVendas(inicio, fim);

        // Cria modelo de tabela.
        DefaultTableModel modelo = (DefaultTableModel) tabelaVenda.getModel();

        // Zera linhas.
        modelo.setRowCount(0);

        // Recebe tamanho da lista.
        int size = resultado.size();

        // Loop na lista.
        for (int i = 0; i < size; i++) {

            // Recebe resultado da lista em posicao i.
            Venda venda = resultado.get(i);

            // Se tiver resultado, preenche.
            if (venda != null) {

                Object[] row = new Object[6];

                row[0] = venda.getID_venda();

                row[1] = venda.getID_cliente();

                row[2] = venda.getData();

                row[3] = venda.getTotalQuantidade();

                row[4] = venda.getValor();

                // Adiciona linha.
                modelo.addRow(row);

            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botaoBuscarVenda;
    private javax.swing.JLabel buscarVenda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAte;
    private javax.swing.JLabel labelDe;
    private javax.swing.JPanel painelBuscarVenda;
    private javax.swing.JTable tabelaVenda;
    public javax.swing.JFormattedTextField textoAte;
    public javax.swing.JFormattedTextField textoDe;
    // End of variables declaration//GEN-END:variables
}
