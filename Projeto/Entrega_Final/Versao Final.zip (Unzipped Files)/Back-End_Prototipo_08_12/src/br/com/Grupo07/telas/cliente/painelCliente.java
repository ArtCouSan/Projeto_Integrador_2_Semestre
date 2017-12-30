package br.com.Grupo07.telas.cliente;

// Importa pacotes para manipulação de imagem e arquivos.
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

// Importa pacotes de contrutores.
import br.com.Grupo07.construtor.cliente.Contato;
import br.com.Grupo07.construtor.cliente.DadosPessoais;
import br.com.Grupo07.construtor.cliente.Endereco;

// Importa pacote de servicos.
import br.com.Grupo07.servicos.ServicosCliente;

// Importa pacote de verificacao.
import br.com.Grupo07.verificacoes.VerificacoesCamposCliente;

// Importa pacote de manipulacao de SQL.
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 * Painel de cadastro do cliente.
 *
 * @author Grupo 07
 */
public class painelCliente extends javax.swing.JPanel {

    // Declara filtro de imagem.
    @SuppressWarnings("FieldMayBeFinal")
    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos de imagem", "png", "jpg");
    // Variavel que ira receber caminho da imagem.
    @SuppressWarnings("FieldMayBeFinal")
    private String imgCaminho = null;

    // Painel.
    public painelCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCadastrarCliente = new javax.swing.JPanel() {
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
        botaoSalvar4 = new javax.swing.JLabel();
        botaoImagemCliente = new javax.swing.JLabel();
        botaoLimparFormularios = new javax.swing.JLabel();
        textoDD_Telefone = new javax.swing.JFormattedTextField();
        textoDD_Celular = new javax.swing.JFormattedTextField();
        labelCEP = new javax.swing.JLabel();
        textoCEP = new javax.swing.JFormattedTextField();

        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setLayout(new java.awt.BorderLayout());

        painelCadastrarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        painelCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        painelCadastrarCliente.setMinimumSize(new java.awt.Dimension(500, 400));
        painelCadastrarCliente.setPreferredSize(new java.awt.Dimension(10, 459));

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
        textoNome.setBorder(null);

        textoCPF.setBorder(null);
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

        botaoSalvar4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoSalvar4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botaoSalvar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/botao salvar.png"))); // NOI18N
        botaoSalvar4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botaoSalvar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSalvar4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoSalvar4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoSalvar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSalvar4MouseClicked(evt);
            }
        });

        botaoImagemCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoImagemCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botaoImagemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/botao imagem.png"))); // NOI18N
        botaoImagemCliente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botaoImagemCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoImagemCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoImagemCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoImagemCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoImagemClienteMouseClicked(evt);
            }
        });

        botaoLimparFormularios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoLimparFormularios.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botaoLimparFormularios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/botao limpar.png"))); // NOI18N
        botaoLimparFormularios.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botaoLimparFormularios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoLimparFormularios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoLimparFormularios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoLimparFormularios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoLimparFormulariosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvar4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoImagemCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoLimparFormularios))
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoSalvar4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoImagemCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoLimparFormularios))
                .addContainerGap())
        );

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

        javax.swing.GroupLayout painelCadastrarClienteLayout = new javax.swing.GroupLayout(painelCadastrarCliente);
        painelCadastrarCliente.setLayout(painelCadastrarClienteLayout);
        painelCadastrarClienteLayout.setHorizontalGroup(
            painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastrarClienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastrarClienteLayout.createSequentialGroup()
                        .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadastrarClienteLayout.createSequentialGroup()
                                .addComponent(labelID_Cliente)
                                .addGap(18, 18, 18)
                                .addComponent(textoID_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(painelCadastrarClienteLayout.createSequentialGroup()
                                .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoCPF)
                                    .addComponent(textoNome)))
                            .addGroup(painelCadastrarClienteLayout.createSequentialGroup()
                                .addComponent(labelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(painelCadastrarClienteLayout.createSequentialGroup()
                                .addComponent(labelDataDeNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textoDataDeNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imagemCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(painelCadastrarClienteLayout.createSequentialGroup()
                        .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelEnderecoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoEmail)
                            .addGroup(painelCadastrarClienteLayout.createSequentialGroup()
                                .addComponent(textoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoNumero))
                            .addComponent(textoBairro)
                            .addComponent(textoEnderecoLogradouro)
                            .addGroup(painelCadastrarClienteLayout.createSequentialGroup()
                                .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textoDD_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoDD_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textoCelular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)))
                            .addComponent(textoCEP))
                        .addGap(59, 59, 59))))
            .addGroup(painelCadastrarClienteLayout.createSequentialGroup()
                .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelCadastrarClienteLayout.setVerticalGroup(
            painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastrarClienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastrarClienteLayout.createSequentialGroup()
                        .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoID_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelID_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCPF)
                            .addGroup(painelCadastrarClienteLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(textoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelGenero)
                            .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDataDeNascimento)
                            .addComponent(textoDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imagemCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLogradouro)
                    .addComponent(textoEnderecoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEnderecoBairro)
                    .addComponent(textoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelComplemento)
                        .addComponent(textoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelNumero))
                    .addComponent(textoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCEP)
                    .addComponent(textoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmail)
                    .addComponent(textoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefone)
                    .addComponent(textoDD_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelCadastrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoDD_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCelular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(painelCadastrarCliente, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botao de salvar ou cadastrar.
     * @param evt
     */
    private void botaoSalvar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSalvar4MouseClicked

        // Instancia objeto com metodo de verificacao dos campos.
        VerificacoesCamposCliente verificarCampos = new VerificacoesCamposCliente();

        // Insere confirmacao para insercao.
        int confirmar = JOptionPane.showConfirmDialog(null, "Confirmacao", "Deseja prosseguir?", JOptionPane.OK_OPTION);

        // Se positiva a continuacao.
        if (confirmar == 0) {

            // Para erros em sql.
            try {

                //Cria objeto de verificacao.
                boolean verificar = false;

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
                
                // Verifica se ja eh existente o cpf.
                boolean verificaCPF = verificarCampos.verificarCPF(textoCPF.getText());
                
                // Se os campos estiverem de acorda com as regras, insere.
                if (verificar && verificaCPF) {

                    // Instancia nos objetos os metodos de dados, endereco e contato.
                    DadosPessoais dados = new DadosPessoais();
                    Endereco endereco = new Endereco();
                    Contato contato = new Contato();

                    // Objeto de dados insere os dados pessoais do cliente.
                    dados.setNome(textoNome.getText());
                    dados.setCPF(textoCPF.getText());
                    dados.setGenero(comboGenero.getSelectedItem().toString());
                    dados.setDataNascimento(textoDataDeNascimento.getText());

                    // Objeto de endereco insere o endereco do cliente.
                    endereco.setLogradouro(textoEnderecoLogradouro.getText());
                    endereco.setBairro(textoBairro.getText());
                    endereco.setComplemento(textoComplemento.getText());
                    endereco.setNumero(textoNumero.getText());
                    endereco.setCEP(textoCEP.getText());

                    // Objeto de contato insere os contatos do cliente.
                    contato.setEmail(textoEmail.getText());
                    contato.setTelefone(textoTelefone.getText());
                    contato.setDD_Telefone(textoDD_Telefone.getText());
                    contato.setCelular(textoCelular.getText());
                    contato.setDD_Celular(textoDD_Celular.getText());

                    // Verifica se tem imagem selecionada.
                    if (imgCaminho == null) {

                        // Se não, insere um caminho de imagem pre definido.
                        imgCaminho = "src\\br\\com\\Grupo07\\Imagens\\perfil.jpg";
                        dados.setImagem(imgCaminho);

                    } else {

                        // Se sim, insere o caminho da imagem selecionada.
                        dados.setImagem(imgCaminho);

                    }

                    // Chama classe de servico para cadastrar cliente com seus construtores(objetos).
                    ServicosCliente.cadastrarCliente(dados, endereco, contato);

                    // Mensagem de sucesso
                    JOptionPane.showMessageDialog(null, "Cadastratado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                    // Limpa campos.
                    limparCampos();

                }

            // Mensagem de erro no banco de dados
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, "Erro no banco de dados", "Erro", JOptionPane.ERROR);

            // Mensagem de erro na imagem.
            } catch (FileNotFoundException ex) {

                JOptionPane.showMessageDialog(null, "Erro no imagem", "Erro", JOptionPane.ERROR);
                
            }

        // Se negativa a continuacao.
        } else {

            JOptionPane.showMessageDialog(null, "Cancelado, sucesso", "Cancelamento", JOptionPane.OK_OPTION);

        }
    }//GEN-LAST:event_botaoSalvar4MouseClicked

    /**
     * Botao de selecionar e salvar imagem.
     * @param evt 
     */
    private void botaoImagemClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoImagemClienteMouseClicked

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
        arquivo.showOpenDialog(painelCadastrarCliente);

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
            imagemCliente.setIcon(novaImg);
            imagemCliente.setVisible(true);

        }
    }//GEN-LAST:event_botaoImagemClienteMouseClicked

    /**
     * Botao que limpa formularios.
     * @param evt 
     */
    private void botaoLimparFormulariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoLimparFormulariosMouseClicked

        // Chama funcao para limpar os campos.
        limparCampos();

    }//GEN-LAST:event_botaoLimparFormulariosMouseClicked

    /**
     * Funcao que limpa todos os campos.
     */
    public void limparCampos() {

        // Limpa todos formularios.
        textoNome.setText("");
        textoCPF.setText("");
        comboGenero.setSelectedIndex(0);
        textoDataDeNascimento.setText("");
        textoEnderecoLogradouro.setText("");
        textoBairro.setText("");
        textoComplemento.setText("");
        textoNumero.setText("");
        textoEmail.setText("");
        textoTelefone.setText("");
        textoCelular.setText("");
        textoCEP.setText("");
        textoDD_Celular.setText("");
        textoDD_Telefone.setText("");
        Icon imagemPerfil = new ImageIcon("src\\br\\com\\Grupo07\\Imagens\\perfil.jpg");
        imagemCliente.setIcon(imagemPerfil);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botaoImagemCliente;
    public javax.swing.JLabel botaoLimparFormularios;
    public javax.swing.JLabel botaoSalvar4;
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
    public javax.swing.JPanel painelBotoes;
    public javax.swing.JPanel painelCadastrarCliente;
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
