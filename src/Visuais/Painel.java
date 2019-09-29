package Visuais;

import java.awt.Color;
import javax.swing.border.MatteBorder;

/**
 *
 * @author genilton
 */
public class Painel extends javax.swing.JFrame {

    public Painel() {    
        initComponents();
        this.dasativaBT();
        setLocationRelativeTo(null);               
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        icoCliente = new javax.swing.JButton();
        icoServicos = new javax.swing.JButton();
        icoFuncionarios = new javax.swing.JButton();
        icoProdutos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btVendas = new javax.swing.JButton();
        btManu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        MenuBarra = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        servicos = new javax.swing.JMenu();
        btManutencao = new javax.swing.JMenuItem();
        btVenda = new javax.swing.JMenuItem();
        btClientes = new javax.swing.JMenuItem();
        btEstoque = new javax.swing.JMenuItem();
        btFuncionario = new javax.swing.JMenuItem();
        inicio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo2.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });

        icoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon1.png"))); // NOI18N
        icoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Foco(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Desfoco(evt);
            }
        });
        icoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icoClienteActionPerformed(evt);
            }
        });

        icoServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon2.png"))); // NOI18N
        icoServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoServicosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoServicosMouseExited(evt);
            }
        });
        icoServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icoServicosActionPerformed(evt);
            }
        });

        icoFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon3.png"))); // NOI18N
        icoFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoFuncionariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoFuncionariosMouseExited(evt);
            }
        });
        icoFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icoFuncionariosActionPerformed(evt);
            }
        });

        icoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon4.png"))); // NOI18N
        icoProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoProdutosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoProdutosMouseExited(evt);
            }
        });
        icoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icoProdutosActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo3.png"))); // NOI18N

        btVendas.setBackground(new java.awt.Color(47, 134, 211));
        btVendas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btVendas.setForeground(new java.awt.Color(255, 255, 255));
        btVendas.setText("Vendas");
        btVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVendasActionPerformed(evt);
            }
        });

        btManu.setBackground(new java.awt.Color(47, 134, 211));
        btManu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btManu.setForeground(new java.awt.Color(255, 255, 255));
        btManu.setText("Manutençoes");
        btManu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManuActionPerformed(evt);
            }
        });

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(icoFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(icoServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btVendas)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btManu))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(icoServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(icoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(icoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(icoFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btVendas)
                                .addGap(24, 24, 24)
                                .addComponent(btManu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        menu.setText("Menu");

        servicos.setText("Serviços");

        btManutencao.setText("Manutenção");
        btManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManutencaoActionPerformed(evt);
            }
        });
        servicos.add(btManutencao);

        btVenda.setText("Venda");
        btVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVendaActionPerformed(evt);
            }
        });
        servicos.add(btVenda);

        menu.add(servicos);

        btClientes.setText("Clientes");
        btClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientesActionPerformed(evt);
            }
        });
        menu.add(btClientes);

        btEstoque.setText("Estoque");
        btEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEstoqueActionPerformed(evt);
            }
        });
        menu.add(btEstoque);

        btFuncionario.setText("Funcionario");
        btFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncionarioActionPerformed(evt);
            }
        });
        menu.add(btFuncionario);

        inicio.setText("Tela Inicial");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        menu.add(inicio);

        MenuBarra.add(menu);

        setJMenuBar(MenuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManutencaoActionPerformed
        new Manutencoes().setVisible(true);
        dispose();
    }//GEN-LAST:event_btManutencaoActionPerformed

    private void btClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientesActionPerformed
        new Clientes().setVisible(true);
        dispose();
    }//GEN-LAST:event_btClientesActionPerformed

    private void btEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEstoqueActionPerformed
        new Estoques().setVisible(true);
        dispose();
    }//GEN-LAST:event_btEstoqueActionPerformed

    private void btVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVendaActionPerformed
        new Vendas().setVisible(true);
        dispose();
    }//GEN-LAST:event_btVendaActionPerformed

    private void btFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionarioActionPerformed
        new Funcionarios().setVisible(true);
        dispose();
    }//GEN-LAST:event_btFuncionarioActionPerformed

    private void icoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icoClienteActionPerformed
        new Clientes().setVisible(true);
        dispose();
    }//GEN-LAST:event_icoClienteActionPerformed

    private void icoFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icoFuncionariosActionPerformed
        new Funcionarios().setVisible(true);
        dispose();
    }//GEN-LAST:event_icoFuncionariosActionPerformed

    private void icoServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icoServicosActionPerformed
        this.btVendas.setEnabled(true);
        this.btManu.setEnabled(true);
        this.btVendas.setVisible(true);
        this.btManu.setVisible(true);
    }//GEN-LAST:event_icoServicosActionPerformed

    private void icoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icoProdutosActionPerformed
        new Estoques().setVisible(true);
        dispose();
    }//GEN-LAST:event_icoProdutosActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        new Painel().setVisible(true);
        dispose();
    }//GEN-LAST:event_inicioActionPerformed

    private void Foco(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Foco
        this.icoCliente.setBorder(new MatteBorder(1, 1, 3, 3, cor));
        this.dasativaBT();
    }//GEN-LAST:event_Foco

    private void Desfoco(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Desfoco
        this.icoCliente.setBorder(new MatteBorder(0, 0, 0, 0, cor));        
    }//GEN-LAST:event_Desfoco

    private void icoServicosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoServicosMouseEntered
        this.icoServicos.setBorder(new MatteBorder(1, 1, 3, 3, cor));        
    }//GEN-LAST:event_icoServicosMouseEntered

    private void icoFuncionariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoFuncionariosMouseEntered
        this.icoFuncionarios.setBorder(new MatteBorder(1, 1, 3, 3, cor));
        this.dasativaBT();
    }//GEN-LAST:event_icoFuncionariosMouseEntered

    private void icoProdutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoProdutosMouseEntered
        this.icoProdutos.setBorder(new MatteBorder(1, 1, 3, 3, cor));
        this.dasativaBT();
    }//GEN-LAST:event_icoProdutosMouseEntered

    private void icoServicosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoServicosMouseExited
        this.icoServicos.setBorder(new MatteBorder(0, 0, 0, 0, cor));
    }//GEN-LAST:event_icoServicosMouseExited

    private void icoFuncionariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoFuncionariosMouseExited
        this.icoFuncionarios.setBorder(new MatteBorder(0, 0, 0, 0, cor));
    }//GEN-LAST:event_icoFuncionariosMouseExited

    private void icoProdutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoProdutosMouseExited
        this.icoProdutos.setBorder(new MatteBorder(0, 0, 0, 0, cor));
    }//GEN-LAST:event_icoProdutosMouseExited

    private void btManuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManuActionPerformed
        new Manutencoes().setVisible(true);
        dispose();        
    }//GEN-LAST:event_btManuActionPerformed

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        this.dasativaBT();
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        this.dasativaBT();
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        this.dasativaBT();
    }//GEN-LAST:event_jLabel1MouseEntered

    private void btVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVendasActionPerformed
        new Vendas().setVisible(true);
        dispose();
    }//GEN-LAST:event_btVendasActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Painel().setVisible(true);
            }
        });
    }

    private void dasativaBT()
    {
        this.btVendas.setEnabled(false);
        this.btManu.setEnabled(false);
        this.btVendas.setVisible(false);
        this.btManu.setVisible(false);
    }
    private final Color cor = new Color(47,134,211);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBarra;
    private javax.swing.JMenuItem btClientes;
    private javax.swing.JMenuItem btEstoque;
    private javax.swing.JMenuItem btFuncionario;
    private javax.swing.JButton btManu;
    private javax.swing.JMenuItem btManutencao;
    private javax.swing.JMenuItem btVenda;
    private javax.swing.JButton btVendas;
    private javax.swing.JButton icoCliente;
    private javax.swing.JButton icoFuncionarios;
    private javax.swing.JButton icoProdutos;
    private javax.swing.JButton icoServicos;
    private javax.swing.JMenuItem inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenu servicos;
    // End of variables declaration//GEN-END:variables
}
