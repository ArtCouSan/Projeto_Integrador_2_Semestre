package br.com.Grupo07.telas.cliente;

// Importa pacotes com construtores.
import br.com.Grupo07.construtor.cliente.Cliente;
import br.com.Grupo07.construtor.cliente.Contato;
import br.com.Grupo07.construtor.cliente.DadosPessoais;
import br.com.Grupo07.construtor.cliente.Endereco;

// Importa pacote com servicos.
import br.com.Grupo07.servicos.ServicosCliente;
import br.com.Grupo07.verificacoes.VerificacoesCamposCliente;

// Importa pacote com modificadores de imagem.
import java.io.IOException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

// Importa pacote com manipuladores de sql.
import java.sql.SQLException;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Painel de alteracao do cliente.
 *
 * @author Grupo 07
 */
public class painelAlterar extends javax.swing.JPanel {

    // Declara filtro de imagem.
    @SuppressWarnings("FieldMayBeFinal")
    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos de imagem", "png", "jpg");
    // Variavel que ira receber caminho da imagem.
    @SuppressWarnings("FieldMayBeFinal")
    private String imgCaminho = null;

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
        textoEnderecoLogradouro = new javax.swing.JTextField();
        labelEnderecoBairro = new javax.swing.JLabel();
        labelDataDeNascimento = new javax.swing.JLabel();
        labelGenero = new javax.swing.JLabel();
        labelCPF = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        imagemCliente = new javax.swing.JLabel();
        comboGenero = new javax.swing.JComboBox();
        labelLogradouro = new javax.swing.JLabel();
        textoBairro = new javax.swing.JTextField();
        labelComplemento = new javax.swing.JLabel();
        textoComplemento = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        textoEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        labelCelular = new javax.swing.JLabel();
        textoDataDeNascimento = new javax.swing.JFormattedTextField();
        textoNome = new javax.swing.JTextField();
        textoCPF = new javax.swing.JFormattedTextField();
        textoTelefone = new javax.swing.JFormattedTextField();
        textoCelular = new javax.swing.JFormattedTextField();
        textoNumero = new javax.swing.JFormattedTextField();
        textoID_Cliente = new javax.swing.JLabel();
        labelID_Cliente = new javax.swing.JLabel();
        textoDD_Telefone = new javax.swing.JFormattedTextField();
        textoDD_Celular = new javax.swing.JFormattedTextField();
        labelCEP = new javax.swing.JLabel();
        textoCEP = new javax.swing.JFormattedTextField();
        painelBotoesAlterar = new javax.swing.JPanel() {
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
        botaoSair = new javax.swing.JLabel();
        botaoImagemProduto = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JLabel();
        botaoExcluir = new javax.swing.JLabel();

        painelAlterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        painelAlterar.setForeground(new java.awt.Color(255, 255, 255));
        painelAlterar.setMinimumSize(new java.awt.Dimension(500, 400));
        painelAlterar.setPreferredSize(new java.awt.Dimension(10, 459));

        textoEnderecoLogradouro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoEnderecoLogradouro.setBorder(null);

        labelEnderecoBairro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelEnderecoBairro.setText("Bairro:");

        labelDataDeNascimento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDataDeNascimento.setText("Data de Nascimento:");

        labelGenero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelGenero.setText("Genêro:");

        labelCPF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCPF.setText("CPF:");

        labelNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNome.setText("Nome:");

        imagemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/perfil.jpg"))); // NOI18N
        imagemCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imagemCliente.setMaximumSize(new java.awt.Dimension(161, 158));
        imagemCliente.setMinimumSize(new java.awt.Dimension(161, 158));

        comboGenero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Masculino", "Feminino", "Unissex" }));

        labelLogradouro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelLogradouro.setText("Logradouro:");

        textoBairro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoBairro.setBorder(null);

        labelComplemento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelComplemento.setText("Complemento:");

        textoComplemento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoComplemento.setBorder(null);

        labelNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNumero.setText("Número:");

        labelTelefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTelefone.setText("Telefone:");

        textoEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoEmail.setBorder(null);

        labelEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelEmail.setText("Email:");

        labelCelular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCelular.setText("Celular:");

        textoDataDeNascimento.setBorder(null);
        try {
            textoDataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoDataDeNascimento.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        textoDataDeNascimento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textoNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textoCPF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            textoCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoCPF.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        textoCPF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textoTelefone.setBorder(null);
        try {
            textoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoTelefone.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        textoTelefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textoCelular.setBorder(null);
        try {
            textoCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoCelular.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        textoCelular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textoNumero.setBorder(null);
        textoNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        textoNumero.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        textoNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textoID_Cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        labelID_Cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelID_Cliente.setText("ID do Cliente");

        textoDD_Telefone.setBorder(null);
        try {
            textoDD_Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoDD_Telefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textoDD_Celular.setBorder(null);
        try {
            textoDD_Celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoDD_Celular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        labelCEP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCEP.setText("CEP:");

        textoCEP.setBorder(null);
        try {
            textoCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textoCEP.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        textoCEP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

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

        javax.swing.GroupLayout painelBotoesAlterarLayout = new javax.swing.GroupLayout(painelBotoesAlterar);
        painelBotoesAlterar.setLayout(painelBotoesAlterarLayout);
        painelBotoesAlterarLayout.setHorizontalGroup(
            painelBotoesAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoImagemProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSair)
                .addGap(21, 21, 21))
        );
        painelBotoesAlterarLayout.setVerticalGroup(
            painelBotoesAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesAlterarLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(painelBotoesAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botaoImagemProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout painelAlterarLayout = new javax.swing.GroupLayout(painelAlterar);
        painelAlterar.setLayout(painelAlterarLayout);
        painelAlterarLayout.setHorizontalGroup(
            painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlterarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAlterarLayout.createSequentialGroup()
                        .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelAlterarLayout.createSequentialGroup()
                                .addComponent(labelID_Cliente)
                                .addGap(18, 18, 18)
                                .addComponent(textoID_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(painelAlterarLayout.createSequentialGroup()
                                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoCPF)
                                    .addComponent(textoNome)))
                            .addGroup(painelAlterarLayout.createSequentialGroup()
                                .addComponent(labelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(painelAlterarLayout.createSequentialGroup()
                                .addComponent(labelDataDeNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textoDataDeNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imagemCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(painelAlterarLayout.createSequentialGroup()
                        .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelEnderecoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoEmail)
                            .addGroup(painelAlterarLayout.createSequentialGroup()
                                .addComponent(textoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoNumero))
                            .addComponent(textoBairro)
                            .addComponent(textoEnderecoLogradouro)
                            .addGroup(painelAlterarLayout.createSequentialGroup()
                                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textoDD_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoDD_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textoCelular, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(textoCEP))
                        .addGap(10, 10, 10))))
            .addComponent(painelBotoesAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelAlterarLayout.setVerticalGroup(
            painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlterarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAlterarLayout.createSequentialGroup()
                        .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoID_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelID_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCPF)
                            .addGroup(painelAlterarLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(textoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelGenero)
                            .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDataDeNascimento)
                            .addComponent(textoDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imagemCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLogradouro)
                    .addComponent(textoEnderecoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEnderecoBairro)
                    .addComponent(textoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelComplemento)
                        .addComponent(textoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelNumero))
                    .addComponent(textoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCEP)
                    .addComponent(textoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmail)
                    .addComponent(textoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefone)
                    .addComponent(textoDD_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoDD_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCelular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(painelBotoesAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(painelAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(painelAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botao sair da tela.
     *
     * @param evt
     */
    private void botaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseClicked

        // Instancia objeto com o painel de buscar cliente.
        painelBuscarCliente painelBuscarCliente = new painelBuscarCliente();

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

    }//GEN-LAST:event_botaoSairMouseClicked

    /**
     * Botao que pega imagem do cliente.
     *
     * @param evt
     */
    private void botaoImagemProdutoPegarImagem(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoImagemProdutoPegarImagem

        // Instancia arquivo.
        JFileChooser arquivo = new JFileChooser();

        // Insere filtro de escolha
        arquivo.setFileFilter(filtro);

        // Variavel para manuseio de imagem.
        BufferedImage img;

        // Variavel que recebe imagem.
        Icon novaImg = null;

        // Desabilitar opcoes de todas opcoes de arquivo.
        arquivo.setAcceptAllFileFilterUsed(false);

        // Abrir na tela.
        arquivo.showOpenDialog(painelAlterar);

        // Titulo.
        arquivo.setDialogTitle("Escolha imagem: extensao jpg e png");

        // Impede mais de uma selecao.
        arquivo.setMultiSelectionEnabled(true);

        // Verifica se foi selecionado algo.
        if (arquivo.getSelectedFile() != null) {

            try {

                // Defina tamanho.
                int largura = 161, altura = 158;

                // Variavel recebe imagem selecionada.
                img = ImageIO.read(arquivo.getSelectedFile());

                // Variavel recebe imagem modificada.
                novaImg = new ImageIcon(img.getScaledInstance(largura, altura,
                        java.awt.Image.SCALE_SMOOTH));

            } catch (IOException ex) {

                // Mensagem.
                JOptionPane.showMessageDialog(null, "Erro na selecao", "Erro", JOptionPane.ERROR);

            }

            // Variavel recebe caminho de imagem.
            imgCaminho = arquivo.getSelectedFile().getAbsolutePath();

            // Substitui label e apresenta imagem.
            imagemCliente.setVisible(true);

        }

    }//GEN-LAST:event_botaoImagemProdutoPegarImagem

    /**
     * Botao que salva alteracoes.
     *
     * @param evt
     */
    private void botaoSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSalvarMouseClicked

        // Instancia objeto com metodo de verificacao dos campos.
        VerificacoesCamposCliente verificarCampos = new VerificacoesCamposCliente();

        // Insere confirmacao para insercao.
        int confirmar = JOptionPane.showConfirmDialog(null, "Confirmacao", "Deseja prosseguir?", JOptionPane.OK_OPTION);

        // Se confirmar.
        if (confirmar == 0) {

            try {

                //Cria objeto de verificacao.
                boolean verificar = false;

                // Inicia variavel que verifica posse de cpf.
                boolean jaCadastrado = ServicosCliente.posseDeCliente(textoCPF.getText());

                // Instancia objeto com o metodo de verificacao.
                // Seu parametro tem os campos de verificacao do painel.
                verificar = verificarCampos.verificarFormularios(
                        textoNome.getText(),
                        textoCPF.getText(),
                        comboGenero.getSelectedItem().toString(),
                        textoDataDeNascimento.getText(),
                        textoEnderecoLogradouro.getText(),
                        textoBairro.getText(),
                        textoComplemento.getText(),
                        textoNumero.getText(),
                        textoTelefone.getText(),
                        textoCelular.getText(),
                        textoCEP.getText(),
                        textoDD_Telefone.getText(),
                        textoDD_Celular.getText()
                );

                int continuar = 0;

                // Verifica campos.
                if (verificar) {

                    // Verifica tratamento de replica.
                    if (jaCadastrado) {

                        JOptionPane.showMessageDialog(null, "CPF já cadastrado", "Erro", JOptionPane.INFORMATION_MESSAGE);
                        
                        // Pergunta se deseja continuar.
                        continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar e apagar o outro?", "Apagar duplicata", JOptionPane.YES_NO_OPTION);

                        // Se sim apaga
                        if (continuar == 0) {

                            // Instancia classe.
                            ServicosCliente servico = new ServicosCliente();

                            // Pega cliente com id.
                            Cliente cliente = servico.obterCliente(textoCPF.getText());

                            // Metodo de desativacao.
                            ServicosCliente.excluirCliente(cliente.getID_Cliente());

                        }

                    }

                    // Deixa prosseguir
                    if (continuar == 0) {

                        // Objeto que recebe dados.
                        DadosPessoais dados = new DadosPessoais();

                        // Objeto que recebe endereco.
                        Endereco endereco = new Endereco();

                        // Objeto que recebe contato.
                        Contato contato = new Contato();

                        // Objeto que recebe cliente.
                        Cliente cliente = new Cliente();

                        // Preenche dados.
                        dados.setNome(textoNome.getText());
                        dados.setCPF(textoCPF.getText());
                        dados.setGenero(comboGenero.getSelectedItem().toString());
                        dados.setDataNascimento(textoDataDeNascimento.getText());

                        // Preenche endereco.
                        endereco.setLogradouro(textoEnderecoLogradouro.getText());
                        endereco.setBairro(textoBairro.getText());
                        endereco.setComplemento(textoComplemento.getText());
                        endereco.setNumero(textoNumero.getText());
                        endereco.setCEP(textoCEP.getText());

                        // Preenche contato.
                        contato.setEmail(textoEmail.getText());
                        contato.setTelefone(textoTelefone.getText());
                        contato.setDD_Telefone(textoDD_Telefone.getText());
                        contato.setCelular(textoCelular.getText());
                        contato.setDD_Celular(textoDD_Celular.getText());

                        // Preenche id do cliente.
                        int id = Integer.parseInt(textoID_Cliente.getText());
                        cliente.setID_Cliente(id);

                        // Se nao tiver imagem selecioanada.
                        if (imgCaminho == null) {

                            // Insere imagem padrao.
                            imgCaminho = "src\\br\\com\\Grupo07\\Imagens\\perfil.jpg";

                            // Modifica imagem com caminho.
                            dados.setImagem(imgCaminho);

                        } else {

                            // Modifica imagem com caminho.
                            dados.setImagem(imgCaminho);

                        }

                        // Preenche cliente como ativo.
                        cliente.setClienteAtivo(true);

                        // Procurar cliente pelo id_cliente.
                        ArrayList<Cliente> procurarCliente = ServicosCliente.procurarCliente(id, false);

                        // Preenche id's.
                        dados.setID_DadosPessoais(procurarCliente.get(0).getID_DadosPessoais());
                        endereco.setID_Endereco(procurarCliente.get(0).getID_Endereco());
                        contato.setID_Contato(procurarCliente.get(0).getID_Contato());

                        // Metodo que altera.
                        ServicosCliente.alterarCliente(dados, endereco, contato, cliente);

                        // Mensagem.
                        JOptionPane.showMessageDialog(null, "Alterado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        
                        // Instancia objeto com painel.
                        painelBuscarCliente painelBuscarCliente = new painelBuscarCliente();

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
                        
                    }

                }

            } catch (IOException | SQLException ex) {

                // Mensagem.
                JOptionPane.showMessageDialog(null, "Erro na selecao", "Erro", JOptionPane.ERROR);

            }

        }

    }//GEN-LAST:event_botaoSalvarMouseClicked

    /**
     * Boatao que desativa cliente.
     *
     * @param evt
     */
    private void botaoExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoExcluirMouseClicked

        // Insere confirmacao para insercao.
        int confirmar = JOptionPane.showConfirmDialog(null, "Confirmacao", "Deseja prosseguir?", JOptionPane.OK_OPTION);

        // Se confirmar.
        if (confirmar == 0) {

            try {

                // Variavel que recebe id do cliente.
                int id = Integer.parseInt(textoID_Cliente.getText());

                // Metodo de desativacao.
                ServicosCliente.excluirCliente(id);

                // Instancia objeto com painel.
                painelBuscarCliente painelBuscarCliente = new painelBuscarCliente();

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

            } catch (SQLException ex) {

                // Mensagem.
                JOptionPane.showMessageDialog(null, "Erro ao excluir", "Erro", JOptionPane.ERROR);

            }

        }

    }//GEN-LAST:event_botaoExcluirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel botaoExcluir;
    public javax.swing.JLabel botaoImagemProduto;
    public javax.swing.JLabel botaoSair;
    public javax.swing.JLabel botaoSalvar;
    public javax.swing.JComboBox comboGenero;
    public javax.swing.JLabel imagemCliente;
    private javax.swing.JLabel labelCEP;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelComplemento;
    private javax.swing.JLabel labelDataDeNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEnderecoBairro;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelID_Cliente;
    private javax.swing.JLabel labelLogradouro;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelTelefone;
    public javax.swing.JPanel painelAlterar;
    public javax.swing.JPanel painelBotoesAlterar;
    public javax.swing.JTextField textoBairro;
    public javax.swing.JFormattedTextField textoCEP;
    public javax.swing.JFormattedTextField textoCPF;
    public javax.swing.JFormattedTextField textoCelular;
    public javax.swing.JTextField textoComplemento;
    public javax.swing.JFormattedTextField textoDD_Celular;
    public javax.swing.JFormattedTextField textoDD_Telefone;
    public javax.swing.JFormattedTextField textoDataDeNascimento;
    public javax.swing.JTextField textoEmail;
    public javax.swing.JTextField textoEnderecoLogradouro;
    public javax.swing.JLabel textoID_Cliente;
    public javax.swing.JTextField textoNome;
    public javax.swing.JFormattedTextField textoNumero;
    public javax.swing.JFormattedTextField textoTelefone;
    // End of variables declaration//GEN-END:variables
}
