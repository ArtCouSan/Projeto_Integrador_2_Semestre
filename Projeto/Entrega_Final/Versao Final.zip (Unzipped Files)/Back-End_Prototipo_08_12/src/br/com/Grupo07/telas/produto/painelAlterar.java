package br.com.Grupo07.telas.produto;

// Importa pacotes de contrutores.
import br.com.Grupo07.construtor.produto.Marca;
import br.com.Grupo07.construtor.produto.Modelo;
import br.com.Grupo07.construtor.produto.Produto;

// Importa pacote de servicos.
import br.com.Grupo07.servicos.ServicosProduto;

// Importa pacote de verificacao.
import br.com.Grupo07.verificacoes.VerificacoesCamposProduto;

// Importa pacotes para manipulação de imagem e arquivos.
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.IOException;

// Importa pacote de manipulacao de SQL.
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Classe com o painel alterar produto.
 *
 * @author Grupo 07
 */
public class painelAlterar extends javax.swing.JPanel {

    public painelAlterar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelAlterar = new javax.swing.JPanel() {
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
        labelQuantidade = new javax.swing.JLabel();
        labelPreco = new javax.swing.JLabel();
        labelTamanho = new javax.swing.JLabel();
        labelGenero = new javax.swing.JLabel();
        comboGenero = new javax.swing.JComboBox();
        labelCor = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        textoModelo = new javax.swing.JTextField();
        labelIDEstoque = new javax.swing.JLabel();
        imagemProduto = new javax.swing.JLabel();
        textoQuantidade = new javax.swing.JFormattedTextField();
        textoTamanho = new javax.swing.JFormattedTextField();
        textoMarca = new javax.swing.JTextField();
        textoCor = new javax.swing.JTextField();
        textoPreco = new javax.swing.JTextField();
        apresentacaoIDEstoque = new javax.swing.JLabel();
        painelBotoes = new javax.swing.JPanel() {
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
        botaoExcluir = new javax.swing.JLabel();
        botaoImagemProduto = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JLabel();
        botaoSair = new javax.swing.JLabel();

        painelAlterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        painelAlterar.setPreferredSize(new java.awt.Dimension(10, 459));

        labelQuantidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelQuantidade.setText("Quantidade:");

        labelPreco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelPreco.setText("Preço:");

        labelTamanho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTamanho.setText("Tamanho:");

        labelGenero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelGenero.setText("Genêro:");

        comboGenero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Masculino", "Feminino", "Unissex", " " }));

        labelCor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCor.setText("Cor:");

        labelMarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelMarca.setText("Marca:");

        labelModelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelModelo.setText("Modelo:");

        textoModelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoModelo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelIDEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelIDEstoque.setText("ID de Estoque:");

        imagemProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/perfil.jpg"))); // NOI18N
        imagemProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imagemProduto.setPreferredSize(new java.awt.Dimension(161, 158));

        textoQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        textoQuantidade.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        textoQuantidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textoTamanho.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        textoTamanho.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        textoTamanho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textoMarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoMarca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textoCor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoCor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textoPreco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoPreco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        apresentacaoIDEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        botaoExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoExcluir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/botao excluir.png"))); // NOI18N
        botaoExcluir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botaoExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoExcluir.setDoubleBuffered(true);
        botaoExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoExcluirMouseClicked(evt);
            }
        });

        botaoImagemProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoImagemProduto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botaoImagemProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/botao imagem.png"))); // NOI18N
        botaoImagemProduto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botaoImagemProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoImagemProduto.setDoubleBuffered(true);
        botaoImagemProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoImagemProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoImagemProdutoPegarImagem(evt);
            }
        });

        botaoSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoSalvar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/botao salvar.png"))); // NOI18N
        botaoSalvar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botaoSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSalvar.setDoubleBuffered(true);
        botaoSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSalvarMouseClicked(evt);
            }
        });

        botaoSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoSair.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/botao sair.png"))); // NOI18N
        botaoSair.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botaoSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSair.setDoubleBuffered(true);
        botaoSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoImagemProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSair)
                .addContainerGap())
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botaoSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoImagemProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout painelAlterarLayout = new javax.swing.GroupLayout(painelAlterar);
        painelAlterar.setLayout(painelAlterarLayout);
        painelAlterarLayout.setHorizontalGroup(
            painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlterarLayout.createSequentialGroup()
                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAlterarLayout.createSequentialGroup()
                        .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelAlterarLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAlterarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoPreco)
                            .addComponent(comboGenero, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textoTamanho)
                            .addComponent(textoQuantidade, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(painelAlterarLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelAlterarLayout.createSequentialGroup()
                                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCor)
                                    .addComponent(labelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoMarca)
                                    .addComponent(textoModelo)
                                    .addComponent(textoCor, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(painelAlterarLayout.createSequentialGroup()
                                .addComponent(labelIDEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apresentacaoIDEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(30, 30, 30)
                        .addComponent(imagemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelAlterarLayout.setVerticalGroup(
            painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlterarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelAlterarLayout.createSequentialGroup()
                        .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelIDEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apresentacaoIDEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMarca)
                            .addComponent(textoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imagemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGenero))
                .addGap(18, 18, 18)
                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPreco)
                    .addComponent(textoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelQuantidade))
                .addGap(19, 19, 19)
                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTamanho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(painelAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Declara filtro de imagem.
    @SuppressWarnings("FieldMayBeFinal")
    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos de imagem", "png", "jpg");
    // Variavel que ira receber caminho da imagem.
    @SuppressWarnings("FieldMayBeFinal")
    private String imgCaminho = null;


    /**
     * Botao que desativa produto.
     * @param evt 
     */
    private void botaoExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoExcluirMouseClicked

        // Insere confirmacao para insercao.
        int confirmar = JOptionPane.showConfirmDialog(null, "Confirmacao", "Deseja prosseguir?", JOptionPane.OK_OPTION);

        // Se confirmar.
        if (confirmar == 0) {

            try {

                // Variavel que recebe id do cliente.
                int id = Integer.parseInt(apresentacaoIDEstoque.getText());

                // Metodo de desativacao.
                ServicosProduto.excluirProduto(id);

                // Instancia objeto com o painel de busca.
                painelBuscarProduto painelBuscar = new painelBuscarProduto();

                // Remove tudo do painel atual.
                painelAlterar.removeAll();

                // Instancia painel no objeto.
                painelAlterar.add(painelBuscar);

                // Adapta seu tamanho ao painel.      
                painelBuscar.setSize(painelAlterar.getWidth(), painelAlterar.getHeight());

                // Deixa painel visivel.
                painelBuscar.setVisible(true);

                // Valida encaixe do painel sobre o outro e remasteriza na tela.
                painelBuscar.validate();

            } catch (SQLException ex) {

                // Mensagem.
                JOptionPane.showMessageDialog(null, "Erro ao excluir", "Erro", JOptionPane.ERROR);

            }

        }

    }//GEN-LAST:event_botaoExcluirMouseClicked

    /**
     * Botao de selecionar e salvar imagem.
     *
     * @param evt
     */
    private void botaoImagemProdutoPegarImagem(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoImagemProdutoPegarImagem

        // Instancia seletor de arquivo.
        JFileChooser arquivo = new JFileChooser();

        // Insere filtro para png e jgp.
        arquivo.setFileFilter(filtro);

        // Inicia variavel para parametrizar imagem.
        BufferedImage img;

        // Variavel para receber imagem.
        Icon novaImg = null;

        // Parametro para seletor selecionar somente o pre determinado
        arquivo.setAcceptAllFileFilterUsed(false);

        // Instancia seletor no frame.
        arquivo.showOpenDialog(painelAlterar);

        // Titulo.
        arquivo.setDialogTitle("Escolha imagem: extensao jpg e png");

        // Impede mais de uma selecao.
        arquivo.setMultiSelectionEnabled(true);

        // Se alguma imagem for selecionada.
        if (arquivo.getSelectedFile() != null) {

            // Verifica erro de Io
            try {

                // Parametriza a dimensao de imagem.
                int largura = 161, altura = 158;

                // Recebe arquivo selecionado.
                img = ImageIO.read(arquivo.getSelectedFile());

                // Recebe imagem parametrizada.
                novaImg = new ImageIcon(img.getScaledInstance(largura, altura,
                        java.awt.Image.SCALE_SMOOTH));

                // Insere imagem na tela por um label.
                imgCaminho = arquivo.getSelectedFile().getAbsolutePath();

            } catch (IOException ex) {

                // Mensagem de erro.
                JOptionPane.showMessageDialog(null, "Erro na imagem", "Erro", JOptionPane.ERROR);

            }

            // Substitui label por imagem.
            imagemProduto.setIcon(novaImg);
            imagemProduto.setVisible(true);

        }

    }//GEN-LAST:event_botaoImagemProdutoPegarImagem

    /**
     * Botao para salvar alteracoes.
     *
     * @param evt
     */
    private void botaoSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSalvarMouseClicked

        try {

            // Instancia objeto com classe de verificacao.
            VerificacoesCamposProduto verificarCampos = new VerificacoesCamposProduto();

            // Insere confirmacao para insercao.
            int confirmar = JOptionPane.showConfirmDialog(null, "Confirmacao", "Deseja prosseguir?", JOptionPane.OK_OPTION);

            // Chama metodo de verificacao
            boolean verificar = false;

            verificar = verificarCampos.verificarFormularios(
                    textoModelo.getText(),
                    textoMarca.getText(),
                    textoCor.getText(),
                    comboGenero.getSelectedItem().toString(),
                    textoPreco.getText(),
                    textoQuantidade.getText(),
                    textoTamanho.getText()
            );

            // Se positiva a continuacao.
            if (confirmar == 0) {

                // Se estiver tudo okay.
                if (verificar) {

                    // Instancia objetos com metodos de servico.
                    ServicosProduto Servicos = new ServicosProduto();

                    // Objeto que recebe dados.
                    Produto produto = new Produto();

                    // Objeto que recebe marca.
                    Marca marca = new Marca();

                    // Objeto que recebe modelo.
                    Modelo modelo = new Modelo();

                    // Preenche dados.
                    produto.setCor(textoCor.getText());
                    produto.setGeneros(comboGenero.getSelectedItem().toString());
                    float pre = Float.parseFloat(textoPreco.getText());
                    produto.setPreco(pre);
                    int quant = Integer.parseInt(textoQuantidade.getText());
                    produto.setQuantidade(quant);
                    int tam = Integer.parseInt(textoTamanho.getText());
                    produto.setTamanho(tam);
                    int ID = Integer.parseInt(apresentacaoIDEstoque.getText());
                    produto.setID(ID);
                    produto.setProdutoAtivo(true);

                    // Preenche marca.
                    marca.setMarca(textoMarca.getText());

                    // Preenche modelo.
                    modelo.setModelo(textoModelo.getText());

                    // Procurar cliente pelo id_cliente.
                    ArrayList<Produto> procurar = Servicos.procurarProduto(" ", ID, false);

                    // Preenche id's.
                    marca.setID_Marca(procurar.get(0).getID_Marca());
                    modelo.setID_Modelo(procurar.get(0).getID_Modelo());

                    // Se nao tiver imagem selecioanada.
                    if (imgCaminho == null) {

                        // Insere imagem padrao.
                        imgCaminho = "src\\br\\com\\Grupo07\\Imagens\\perfil.jpg";

                        // Modifica imagem com caminho.
                        produto.setImagem(imgCaminho);

                    } else {

                        // Modifica imagem com caminho.
                        produto.setImagem(imgCaminho);

                    }             
                    
                    // Metodo que altera.
                    Servicos.alterarProduto(produto, marca, modelo);
                    
                    // Instancia objeto com painel de busca.
                    painelBuscarProduto painelBuscarCliente = new painelBuscarProduto();

                    // Remove tudo do painel atual.
                    painelAlterar.removeAll();

                    // Instancia painel no objeto.
                    painelAlterar.add(painelBuscarCliente);

                    // Adapta seu tamanho ao painel.
                    painelBuscarCliente.setSize(painelAlterar.getWidth(), painelAlterar.getHeight());

                    // Deixa painel visivel.
                    painelBuscarCliente.setVisible(true);

                    // Valida encaixe do painel sobre o outro e remasteriza na tela.
                    painelBuscarCliente.validate();

                    // Mensagem.
                    JOptionPane.showMessageDialog(null, "Alterado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
                }

            } else {

                // Mensagem de cancelamento.
                JOptionPane.showMessageDialog(null, "Cancelado, sucesso", "Cancelamento", JOptionPane.OK_OPTION);

            }

        } catch (SQLException ex) {
            
            // Mensagem.
            JOptionPane.showMessageDialog(null, "Erro no banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);

        } catch (FileNotFoundException ex) {

            // Mensagem.
            JOptionPane.showMessageDialog(null, "Erro na selecao", "Erro", JOptionPane.ERROR_MESSAGE);

        } catch (IOException ex) {

            // Mensagem.
            JOptionPane.showMessageDialog(null, "Erro na imagem", "Erro", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_botaoSalvarMouseClicked

    /**
     * Botao de sair.
     *
     * @param evt
     */
    private void botaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseClicked

        // Instancia objeto com o painel de busca.
        painelBuscarProduto painelBuscar = new painelBuscarProduto();

        // Remove tudo do painel atual.
        painelAlterar.removeAll();

        // Instancia painel no objeto.
        painelAlterar.add(painelBuscar);

        // Adapta seu tamanho ao painel.      
        painelBuscar.setSize(painelAlterar.getWidth(), painelAlterar.getHeight());

        // Deixa painel visivel.
        painelBuscar.setVisible(true);

        // Valida encaixe do painel sobre o outro e remasteriza na tela.
        painelBuscar.validate();

    }//GEN-LAST:event_botaoSairMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel apresentacaoIDEstoque;
    public javax.swing.JLabel botaoExcluir;
    public javax.swing.JLabel botaoImagemProduto;
    public javax.swing.JLabel botaoSair;
    public javax.swing.JLabel botaoSalvar;
    public javax.swing.JComboBox comboGenero;
    public javax.swing.JLabel imagemProduto;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelIDEstoque;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelTamanho;
    public javax.swing.JPanel painelAlterar;
    public javax.swing.JPanel painelBotoes;
    public javax.swing.JTextField textoCor;
    public javax.swing.JTextField textoMarca;
    public javax.swing.JTextField textoModelo;
    public javax.swing.JTextField textoPreco;
    public javax.swing.JFormattedTextField textoQuantidade;
    public javax.swing.JFormattedTextField textoTamanho;
    // End of variables declaration//GEN-END:variables
}
