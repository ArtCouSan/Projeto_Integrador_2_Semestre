package br.com.Grupo07.telas.principal;

// Importando pacotes de telas.
import br.com.Grupo07.telas.cliente.painelCliente;
import br.com.Grupo07.telas.cliente.painelBuscarCliente;
import br.com.Grupo07.telas.produto.painelBuscarProduto;
import br.com.Grupo07.telas.produto.painelProduto;
import br.com.Grupo07.telas.relatorio.painelBuscarVenda;
import br.com.Grupo07.telas.venda.painelOperacaoVenda;

// Importando pacotes de maipuladores de imagem e arquivo.
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

// Importando pacotes de maipuladores de data.
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JPanel;

/**
 * Classe com os paineis.
 *
 * @author Grupo 07
 */
public class TelaOperador extends javax.swing.JFrame {

    // Cria objetos com valor null para nao ocupar espaco desnecessario na memoria.
    painelProduto cadastrarProduto = null;
    painelCliente cadastrarCliente = null;
    painelBuscarCliente buscarCliente = null;
    painelBuscarProduto buscarProduto = null;
    painelOperacaoVenda venda = null;
    painelBuscarVenda relatorio = null;

    public TelaOperador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaOperador = new javax.swing.JPanel() {
            private Image image;
            {
                try {
                    image = ImageIO.read(new File("src/br/com/Grupo07/Imagens/telaMarrom.jpg"));
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
        labelUsuario = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        botaoCadastrarProduto = new javax.swing.JLabel();
        botaoCadastrarCliente = new javax.swing.JLabel();
        botaoBuscarCliente = new javax.swing.JLabel();
        botaoBuscarProduto = new javax.swing.JLabel();
        botaoOperacaoVenda = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        painelEscolha = new javax.swing.JPanel() {
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
        botaoRelatorioVenda = new javax.swing.JLabel();
        logoSWS = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto PI");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 670));
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TelaOperador.setPreferredSize(new java.awt.Dimension(900, 900));

        labelUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        labelLogo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        labelLogo.setForeground(new java.awt.Color(255, 255, 255));
        labelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/SWS Logo.png"))); // NOI18N

        botaoCadastrarProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoCadastrarProduto.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/Botao CP Mouse Out.png"))); // NOI18N
        botaoCadastrarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCadastrarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCadastrarProdutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoCadastrarProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoCadastrarProdutoMouseExited(evt);
            }
        });

        botaoCadastrarCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/Botao CC Mouse Out.png"))); // NOI18N
        botaoCadastrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCadastrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCadastrarClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoCadastrarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoCadastrarClienteMouseExited(evt);
            }
        });

        botaoBuscarCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        botaoBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/Botao BC Mouse Out.png"))); // NOI18N
        botaoBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoBuscarClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoBuscarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoBuscarClienteMouseExited(evt);
            }
        });

        botaoBuscarProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoBuscarProduto.setForeground(new java.awt.Color(255, 255, 255));
        botaoBuscarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/Botao BP Mouse Out.png"))); // NOI18N
        botaoBuscarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoBuscarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoBuscarProdutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoBuscarProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoBuscarProdutoMouseExited(evt);
            }
        });

        botaoOperacaoVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoOperacaoVenda.setForeground(new java.awt.Color(255, 255, 255));
        botaoOperacaoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/Botao Vender Mouse Out.png"))); // NOI18N
        botaoOperacaoVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoOperacaoVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoOperacaoVendaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoOperacaoVendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoOperacaoVendaMouseExited(evt);
            }
        });

        data.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        data.setForeground(new java.awt.Color(255, 255, 255));

        painelEscolha.setMinimumSize(new java.awt.Dimension(600, 500));
        painelEscolha.setPreferredSize(new java.awt.Dimension(600, 500));
        painelEscolha.setLayout(new java.awt.BorderLayout());

        botaoRelatorioVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoRelatorioVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/Botao Relatorio Mouse Out.png"))); // NOI18N
        botaoRelatorioVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRelatorioVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoRelatorioVendaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoRelatorioVendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoRelatorioVendaMouseExited(evt);
            }
        });

        logoSWS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/logo.png"))); // NOI18N
        logoSWS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoSWSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoSWSMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/SWS Logo 2.png"))); // NOI18N

        javax.swing.GroupLayout TelaOperadorLayout = new javax.swing.GroupLayout(TelaOperador);
        TelaOperador.setLayout(TelaOperadorLayout);
        TelaOperadorLayout.setHorizontalGroup(
            TelaOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaOperadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaOperadorLayout.createSequentialGroup()
                        .addGroup(TelaOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TelaOperadorLayout.createSequentialGroup()
                                .addComponent(labelUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addComponent(botaoRelatorioVenda)
                            .addComponent(botaoOperacaoVenda)
                            .addGroup(TelaOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(botaoBuscarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoCadastrarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoBuscarProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoCadastrarProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaOperadorLayout.createSequentialGroup()
                        .addComponent(logoSWS)
                        .addGap(15, 15, 15)))
                .addGroup(TelaOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelEscolha, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addGroup(TelaOperadorLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(labelLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        TelaOperadorLayout.setVerticalGroup(
            TelaOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaOperadorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(TelaOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaOperadorLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(TelaOperadorLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaOperadorLayout.createSequentialGroup()
                        .addComponent(painelEscolha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(TelaOperadorLayout.createSequentialGroup()
                        .addComponent(botaoOperacaoVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCadastrarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoBuscarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoBuscarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoRelatorioVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                        .addComponent(logoSWS)
                        .addContainerGap())))
        );

        getContentPane().add(TelaOperador, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Função que chama painel de cadastrar produto.
     *
     * @param evt
     */
    private void botaoCadastrarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarProdutoMouseClicked

        // Se o painel nao foi chamado anteriormente.
        if (cadastrarProduto == null || !cadastrarProduto.isDisplayable()) {

            // Instancia classe no objeto.
            cadastrarProduto = new painelProduto();

            // Chama função para criar tela.
            criarTela(cadastrarProduto);

        // Se o painel foi chamado anteriormente.        
        } else {

            // Chama função para criar tela.
            criarTela(cadastrarProduto);

        }

    }//GEN-LAST:event_botaoCadastrarProdutoMouseClicked

    /**
     * Função que chama painel de buscar produto.
     *
     * @param evt
     */
    private void botaoBuscarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoBuscarProdutoMouseClicked

        // Se o painel nao foi chamado anteriormente.
        if (buscarProduto == null || !buscarProduto.isDisplayable()) {

            // Instancia classe no objeto.
            buscarProduto = new painelBuscarProduto();

            // Chama função para criar tela.
            criarTela(buscarProduto);

        // Se o painel foi chamado anteriormente.    
        } else {

            // Chama função para criar tela.
            criarTela(buscarProduto);

        }

    }//GEN-LAST:event_botaoBuscarProdutoMouseClicked

    /**
     * Função que chama painel de cadastrar cliente.
     *
     * @param evt
     */
    private void botaoCadastrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarClienteMouseClicked

        // Se o painel nao foi chamado anteriormente.
        if (cadastrarCliente == null || !cadastrarCliente.isDisplayable()) {

            // Instancia classe no objeto.
            cadastrarCliente = new painelCliente();
                    
            // Chama função para criar tela.
            criarTela(cadastrarCliente);

        // Se o painel foi chamado anteriormente.        
        } else {

            // Chama função para criar tela.
            criarTela(cadastrarCliente);

        }
    }//GEN-LAST:event_botaoCadastrarClienteMouseClicked

    /**
     * Função que chama painel de buscar cliente.
     *
     * @param evt
     */
    private void botaoBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoBuscarClienteMouseClicked

        // Se o painel nao foi chamado anteriormente.
        if (buscarCliente == null || !buscarCliente.isDisplayable()) {

            // Instancia classe no objeto.
            buscarCliente = new painelBuscarCliente();

            // Chama função para criar tela.
            criarTela(buscarCliente);

        // Se o painel foi chamado anteriormente.       
        } else {

            // Chama função para criar tela.
            criarTela(buscarCliente);

        }

    }//GEN-LAST:event_botaoBuscarClienteMouseClicked

    /**
     * Função que cria data no frame.
     *
     * @param evt
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        // Instancia classe com time.
        long timeInMillis = System.currentTimeMillis();
        
        // Pega calendario
        Calendar cal1 = Calendar.getInstance();
        
        // Altera time.
        cal1.setTimeInMillis(timeInMillis);

        // Instancia classe com data.
        Date dataSistema = new Date();
        
        // Instancia classe com formato da data.
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        
        // Imprime no label a data.
        data.setText(formatoData.format(dataSistema));

    }//GEN-LAST:event_formWindowOpened

    /**
     * Função que chama painel de operacao de venda.
     *
     * @param evt
     */
    private void botaoOperacaoVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoOperacaoVendaMouseClicked

        // Se o painel nao foi chamado anteriormente.
        if (venda == null || !venda.isDisplayable()) {

            // Instancia classe no objeto.
            venda = new painelOperacaoVenda();

            // Chama função para criar tela.
            criarTela(venda);

        // Se o painel foi chamado anteriormente.    
        } else {

            // Chama função para criar tela.
            criarTela(venda);

        }

    }//GEN-LAST:event_botaoOperacaoVendaMouseClicked

    /**
     * Função que chama painel de relatorio de venda.
     * @param evt 
     */
    private void botaoRelatorioVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRelatorioVendaMouseClicked

        // Se o painel nao foi chamado anteriormente.
        if (relatorio == null || !relatorio.isDisplayable()) {

            // Instancia classe no objeto.
            relatorio = new painelBuscarVenda();

            // Chama função para criar tela.
            criarTela(relatorio);

        // Se o painel foi chamado anteriormente.    
        } else {

            // Chama função para criar tela.
            criarTela(relatorio);

        }

    }//GEN-LAST:event_botaoRelatorioVendaMouseClicked

    private void botaoCadastrarProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarProdutoMouseEntered
        botaoCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/Botao CP Mouse In 1.png")));
    }//GEN-LAST:event_botaoCadastrarProdutoMouseEntered

    private void botaoCadastrarProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarProdutoMouseExited
        botaoCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/Botao CP Mouse Out.png")));
    }//GEN-LAST:event_botaoCadastrarProdutoMouseExited

    private void botaoBuscarProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoBuscarProdutoMouseEntered
        botaoBuscarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/Botao BP Mouse In 1.png")));
    }//GEN-LAST:event_botaoBuscarProdutoMouseEntered

    private void botaoBuscarProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoBuscarProdutoMouseExited
        botaoBuscarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/Botao BP Mouse Out.png")));
    }//GEN-LAST:event_botaoBuscarProdutoMouseExited

    private void botaoCadastrarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarClienteMouseEntered
        botaoCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/Botao CC Mouse In 1.png")));
    }//GEN-LAST:event_botaoCadastrarClienteMouseEntered

    private void botaoCadastrarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarClienteMouseExited
        botaoCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/Botao CC Mouse Out.png")));
    }//GEN-LAST:event_botaoCadastrarClienteMouseExited

    private void botaoBuscarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoBuscarClienteMouseEntered
        botaoBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/Botao BC Mouse In 1.png")));
    }//GEN-LAST:event_botaoBuscarClienteMouseEntered

    private void botaoBuscarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoBuscarClienteMouseExited
        botaoBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/Botao BC Mouse Out.png")));
    }//GEN-LAST:event_botaoBuscarClienteMouseExited

    private void botaoOperacaoVendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoOperacaoVendaMouseEntered
        botaoOperacaoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/Botao Vender Mouse In 1.png")));
    }//GEN-LAST:event_botaoOperacaoVendaMouseEntered

    private void botaoOperacaoVendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoOperacaoVendaMouseExited
        botaoOperacaoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/Botao Vender Mouse Out.png")));
    }//GEN-LAST:event_botaoOperacaoVendaMouseExited

    private void botaoRelatorioVendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRelatorioVendaMouseEntered
        botaoRelatorioVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/Botao Relatorio Mouse In 1.png")));
    }//GEN-LAST:event_botaoRelatorioVendaMouseEntered

    private void botaoRelatorioVendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRelatorioVendaMouseExited
        botaoRelatorioVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/Botao Relatorio Mouse Out.png")));
    }//GEN-LAST:event_botaoRelatorioVendaMouseExited

    private void logoSWSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoSWSMouseEntered
        logoSWS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/logo mouse in.png")));
    }//GEN-LAST:event_logoSWSMouseEntered

    private void logoSWSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoSWSMouseExited
        logoSWS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Grupo07/Imagens/logo.png")));
    }//GEN-LAST:event_logoSWSMouseExited

    /**
     * Funcao de cria painel no painel fixado.
     * @param painel 
     */
    public void criarTela(JPanel painel) {

        // Guardar campos de componentes no painel.
        Component[] components = painelEscolha.getComponents();
        
        // Se não estiver vazio.
        if (components != null) {
            
            // Guarda componentes.
            for (Component comp : components) {
                
                // Os deixa invisivel no painel.
                comp.setVisible(false);
                
            }
            
        }

        // Instancia painel no objeto.
        painelEscolha.add(painel);
        
        // Adapta seu tamanho ao painel.
        painel.setSize(painelEscolha.getWidth(), painelEscolha.getHeight());
        
        // Deixa painel visivel.
        painel.setVisible(true);
        
        // Valida encaixe do painel sobre o outro e remasteriza na tela.
        painel.validate();

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaOperador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOperador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOperador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOperador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOperador().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelaOperador;
    private javax.swing.JLabel botaoBuscarCliente;
    private javax.swing.JLabel botaoBuscarProduto;
    private javax.swing.JLabel botaoCadastrarCliente;
    private javax.swing.JLabel botaoCadastrarProduto;
    private javax.swing.JLabel botaoOperacaoVenda;
    private javax.swing.JLabel botaoRelatorioVenda;
    private javax.swing.JLabel data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel logoSWS;
    private javax.swing.JPanel painelEscolha;
    // End of variables declaration//GEN-END:variables

}
