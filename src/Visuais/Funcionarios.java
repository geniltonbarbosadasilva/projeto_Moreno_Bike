package Visuais;

import Modelos.Funcionario;
import Controle.FuncionarioControle;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author genilton
 */

public class Funcionarios extends javax.swing.JFrame {

    public Funcionarios() {        
        initComponents();
        setLocationRelativeTo(null);
                
        FuncionarioControle Funcionarios = new FuncionarioControle();
        DefaultTableModel linha = (DefaultTableModel) this.tabela.getModel();
        String[] c = new String[5];
        
        for(Funcionario Funcionario: Funcionarios.getLista()){
            c[0] = Funcionario.getNome();
            c[1] = String.format("%.2f", Funcionario.getSalario());
            c[2] = Funcionario.getCpf();
            c[3] = Funcionario.getTelefone();
            c[4] = Funcionario.getEndereco().toString();
            linha.addRow(c);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_Busca = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btn_Cadastrar = new javax.swing.JToggleButton();
        btn_Editar = new javax.swing.JButton();
        btn_Apagar = new javax.swing.JButton();
        cp_Busca = new javax.swing.JTextField();
        btn_Busca = new javax.swing.JToggleButton();
        radioNome = new javax.swing.JRadioButton();
        radioCpf = new javax.swing.JRadioButton();
        radioTelefone = new javax.swing.JRadioButton();
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

        tabela.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] { },
            new String [] {
                "Nome", "Salario", "CPF", "Telefone", "Endereço"
            }
        ));
        jScrollPane2.setViewportView(tabela);

        btn_Cadastrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_Cadastrar.setText("Cadastrar");
        btn_Cadastrar.setToolTipText("");
        btn_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarActionPerformed(evt);
            }
        });

        btn_Editar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_Editar.setText("Editar");
        btn_Editar.setToolTipText("");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        btn_Apagar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_Apagar.setText("Apagar");
        btn_Apagar.setToolTipText("");
        btn_Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ApagarActionPerformed(evt);
            }
        });

        cp_Busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_BuscaActionPerformed(evt);
            }
        });

        btn_Busca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_Busca.setText("Buscar");
        btn_Busca.setToolTipText("");
        btn_Busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscaActionPerformed(evt);
            }
        });

        radioNome.setBackground(new java.awt.Color(255, 255, 255));
        grupo_Busca.add(radioNome);
        radioNome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        radioNome.setForeground(new java.awt.Color(255, 255, 255));
        radioNome.setSelected(true);
        radioNome.setText("por nome");

        radioCpf.setBackground(new java.awt.Color(255, 255, 255));
        grupo_Busca.add(radioCpf);
        radioCpf.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        radioCpf.setForeground(new java.awt.Color(255, 255, 255));
        radioCpf.setText("por CPF");

        radioTelefone.setBackground(new java.awt.Color(255, 255, 255));
        grupo_Busca.add(radioTelefone);
        radioTelefone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        radioTelefone.setForeground(new java.awt.Color(255, 255, 255));
        radioTelefone.setText("por telefone");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(btn_Cadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Editar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Apagar))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(cp_Busca, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioTelefone)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radioNome)
                                            .addComponent(radioCpf))
                                        .addGap(61, 61, 61)
                                        .addComponent(btn_Busca)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(radioNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioCpf))
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cp_Busca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Busca)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cadastrar)
                    .addComponent(btn_Apagar)
                    .addComponent(btn_Editar))
                .addGap(34, 34, 34))
        );
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_Cadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_Editar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_Apagar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cp_Busca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_Busca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(radioNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(radioCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(radioTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
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

    private void cp_BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp_BuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cp_BuscaActionPerformed

    private void btn_ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ApagarActionPerformed
        if(this.tabela.getSelectedRow() != (-1))
        {
            FuncionarioControle Funcionarios = new FuncionarioControle();
            Funcionarios.apaga(this.tabela.getSelectedRow());
            new Funcionarios().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btn_ApagarActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        if(this.tabela.getSelectedRow() != (-1))
        {
            new CadastraFuncionario(this.tabela.getSelectedRow()).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarActionPerformed
        new CadastraFuncionario().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_CadastrarActionPerformed

    private void btn_BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscaActionPerformed
        if( cp_Busca.getText().trim() != null && !cp_Busca.getText().trim().equals(""))
        {
            FuncionarioControle Funcionarios = new FuncionarioControle();
            if( this.radioNome.isSelected() )
            {
                Funcionarios.busca( 1, cp_Busca.getText().trim());
            }
            if( this.radioCpf.isSelected() )
            {
                Funcionarios.busca( 2, cp_Busca.getText().trim());
            }
            if( this.radioTelefone.isSelected())
            {
                Funcionarios.busca( 3, cp_Busca.getText().trim());
            }
            new Funcionarios().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btn_BuscaActionPerformed

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

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        new Painel().setVisible(true);
        dispose();
    }//GEN-LAST:event_inicioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBarra;
    private javax.swing.JMenuItem btClientes;
    private javax.swing.JMenuItem btEstoque;
    private javax.swing.JMenuItem btFuncionario;
    private javax.swing.JMenuItem btManutencao;
    private javax.swing.JMenuItem btVenda;
    private javax.swing.JButton btn_Apagar;
    private javax.swing.JToggleButton btn_Busca;
    private javax.swing.JToggleButton btn_Cadastrar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JTextField cp_Busca;
    private javax.swing.ButtonGroup grupo_Busca;
    private javax.swing.JMenuItem inicio;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menu;
    private javax.swing.JRadioButton radioCpf;
    private javax.swing.JRadioButton radioNome;
    private javax.swing.JRadioButton radioTelefone;
    private javax.swing.JMenu servicos;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}