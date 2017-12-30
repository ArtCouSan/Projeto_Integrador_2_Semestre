package br.com.Grupo07.telas.relatorio;

// Importa pacote de manipuladores de imagens.
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * Classe com o painel apresentacao para relatorios.
 *
 * @author Grupo 07
 */
public class painelRelatorio extends javax.swing.JPanel {

    public painelRelatorio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paineRelatorioVenda = new javax.swing.JPanel() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRelatorios = new javax.swing.JTable();
        labelTotal = new javax.swing.JLabel();
        labelCliente = new javax.swing.JLabel();
        labelIDVenda = new javax.swing.JLabel();
        botaoSair = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        textoCliente = new javax.swing.JLabel();
        textoIDVenda = new javax.swing.JLabel();
        textoData = new javax.swing.JLabel();
        textoTotal = new javax.swing.JLabel();
        labelIDCliente = new javax.swing.JLabel();
        textoIDCliente = new javax.swing.JLabel();

        paineRelatorioVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        paineRelatorioVenda.setPreferredSize(new java.awt.Dimension(10, 459));

        tabelaRelatorios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tabelaRelatorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID do Produto", "Qt. de Produtos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRelatorios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaRelatorios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaRelatorios);

        labelTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTotal.setText("Total de Lucro na Venda:");

        labelCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCliente.setText("Cliente:");

        labelIDVenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelIDVenda.setText("Venda ID:");

        botaoSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/botao sair.png"))); // NOI18N
        botaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSairMouseClicked(evt);
            }
        });

        labelData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelData.setText("Data:");

        textoCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textoIDVenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textoData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textoTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        labelIDCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelIDCliente.setText("ID Cliente:");

        textoIDCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout paineRelatorioVendaLayout = new javax.swing.GroupLayout(paineRelatorioVenda);
        paineRelatorioVenda.setLayout(paineRelatorioVendaLayout);
        paineRelatorioVendaLayout.setHorizontalGroup(
            paineRelatorioVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineRelatorioVendaLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(botaoSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineRelatorioVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(paineRelatorioVendaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(paineRelatorioVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paineRelatorioVendaLayout.createSequentialGroup()
                        .addComponent(labelIDCliente)
                        .addGap(18, 18, 18)
                        .addComponent(textoIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(paineRelatorioVendaLayout.createSequentialGroup()
                        .addGroup(paineRelatorioVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paineRelatorioVendaLayout.createSequentialGroup()
                                .addComponent(labelCliente)
                                .addGap(18, 18, 18)
                                .addComponent(textoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paineRelatorioVendaLayout.createSequentialGroup()
                                .addComponent(labelIDVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoIDVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(paineRelatorioVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paineRelatorioVendaLayout.createSequentialGroup()
                                .addComponent(labelTotal)
                                .addGap(72, 72, 72)
                                .addComponent(textoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(paineRelatorioVendaLayout.createSequentialGroup()
                                .addComponent(labelData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textoData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(13, 13, 13))))
        );
        paineRelatorioVendaLayout.setVerticalGroup(
            paineRelatorioVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineRelatorioVendaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(paineRelatorioVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paineRelatorioVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelData, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelIDVenda))
                    .addComponent(textoIDVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoData, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paineRelatorioVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTotal)
                    .addComponent(textoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12)
                .addGroup(paineRelatorioVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIDCliente)
                    .addComponent(textoIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botaoSair)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineRelatorioVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineRelatorioVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botao de sair.
     *
     * @param evt
     */
    private void botaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseClicked

        // Instancia objeto com painl.
        painelBuscarVenda painel = new painelBuscarVenda();

        // Remove tudo.
        paineRelatorioVenda.removeAll();

        // Adiciona painel ao painel atual.
        paineRelatorioVenda.add(painel);

        // Deixa painel visivel.
        paineRelatorioVenda.setVisible(true);

        // Modifica tamanho do painel.
        painel.setSize(paineRelatorioVenda.getWidth(), paineRelatorioVenda.getHeight());

        // Remasteriza painel.
        paineRelatorioVenda.validate();

    }//GEN-LAST:event_botaoSairMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botaoSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelIDCliente;
    private javax.swing.JLabel labelIDVenda;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JPanel paineRelatorioVenda;
    public javax.swing.JTable tabelaRelatorios;
    public javax.swing.JLabel textoCliente;
    public javax.swing.JLabel textoData;
    public javax.swing.JLabel textoIDCliente;
    public javax.swing.JLabel textoIDVenda;
    public javax.swing.JLabel textoTotal;
    // End of variables declaration//GEN-END:variables
}
