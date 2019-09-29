package Visuais;

import Modelos.Cliente;
import Modelos.Manutencao;
import Controle.ClienteControle;
import Controle.ManutencaoControle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author genilton
 */
public class CadastraManutencao extends javax.swing.JFrame {
    private boolean edita;
    private Manutencao oldManutencao;
    private int i;

    public CadastraManutencao(int i) {
        this.edita = true;
        initComponents();
        setLocationRelativeTo(null);
        ClienteControle clientes = new ClienteControle();       
        ManutencaoControle manutencaos = new ManutencaoControle();
        this.i = i;
        this.oldManutencao = manutencaos.getLista().get(i);
        DefaultTableModel linha = (DefaultTableModel) this.TableCliente.getModel();
        String[] c = new String[2];
                
        for(Cliente cliente : clientes.getLista()){                    
            c[0] = cliente.getNome().trim();
            c[1] = cliente.getCpf().trim();
            linha.addRow(c);
        }
        this.TableCliente.setEnabled(false);
        cp_Dia.setText("" + this.oldManutencao.getData().getDia());
        cp_Mes.setText("" + this.oldManutencao.getData().getMes());
        cp_Ano.setText("" + this.oldManutencao.getData().getAno());
        cp_Desc.setText("" + this.oldManutencao.getDesc().trim());
        cp_Preco.setText("" + String.format("%.2f", this.oldManutencao.calculaPreco()));
        cp_Dia.setEditable(false);
        cp_Mes.setEditable(false);
        cp_Ano.setEditable(false);
        cp_Desc.setEditable(false);
        cp_Preco.setEditable(false);
        if(!this.oldManutencao.isPago())
        {
            this.radioNao.setSelected(true);
        }
    }

    public CadastraManutencao() {
        this.edita = false;
        initComponents();
        setLocationRelativeTo(null);
        ClienteControle clientes = new ClienteControle();       
        DefaultTableModel linha = (DefaultTableModel) this.TableCliente.getModel();
        String[] c = new String[2];
                
        for(Cliente cliente : clientes.getLista()){                    
            c[0] = cliente.getNome().trim();
            c[1] = cliente.getCpf().trim();
            linha.addRow(c);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoPago = new javax.swing.ButtonGroup();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        btn_Cancela = new javax.swing.JButton();
        btn_Salva = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cp_Dia = new javax.swing.JTextField();
        cp_Mes = new javax.swing.JTextField();
        cp_Ano = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        radioSim = new javax.swing.JRadioButton();
        radioNao = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCliente = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        cp_Desc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cp_Preco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jDesktopPane2.setForeground(new java.awt.Color(255, 255, 255));

        btn_Cancela.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_Cancela.setText("Cancelar");
        btn_Cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelaActionPerformed(evt);
            }
        });

        btn_Salva.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_Salva.setText("Salvar");
        btn_Salva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalvaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cliente");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pago");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data");

        cp_Dia.setPreferredSize(new java.awt.Dimension(20, 20));

        cp_Mes.setText("    ");
        cp_Mes.setPreferredSize(new java.awt.Dimension(20, 20));

        cp_Ano.setText("    ");
        cp_Ano.setPreferredSize(new java.awt.Dimension(20, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("/");

        radioSim.setBackground(new java.awt.Color(255, 255, 255));
        GrupoPago.add(radioSim);
        radioSim.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        radioSim.setForeground(new java.awt.Color(255, 255, 255));
        radioSim.setSelected(true);
        radioSim.setText("Sim");

        radioNao.setBackground(new java.awt.Color(255, 255, 255));
        GrupoPago.add(radioNao);
        radioNao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        radioNao.setForeground(new java.awt.Color(255, 255, 255));
        radioNao.setText("Não");

        TableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {    },
            new String [] {
                "Nome", "CPF"
            }
        ));
        jScrollPane2.setViewportView(TableCliente);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("/");

        cp_Desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_DescActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descrisão");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Preço:");

        cp_Preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp_PrecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cp_Dia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioSim)
                                .addGap(18, 18, 18)
                                .addComponent(radioNao))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(cp_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addComponent(btn_Salva)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_Cancela))
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(cp_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cp_Desc, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cp_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(radioSim)
                            .addComponent(radioNao))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cp_Desc)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cp_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cp_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cp_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cp_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Salva)
                    .addComponent(btn_Cancela))
                .addGap(35, 35, 35))
        );
        jDesktopPane2.setLayer(btn_Cancela, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btn_Salva, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Dia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Mes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Ano, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(radioSim, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(radioNao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Desc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Preco, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void btn_SalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalvaActionPerformed
        ClienteControle clientes = new ClienteControle();       
        ManutencaoControle manutencoes = new ManutencaoControle();
        Manutencao manutencao = new Manutencao();
        
        if(edita)
        {
            manutencao = manutencoes.getLista().get(this.i); 
            if(this.radioSim.isSelected())
            {
                manutencao.setPago(true);
            }
            else if(this.radioNao.isSelected())
            {
                manutencao.setPago(false);
            }            
            manutencoes.apaga(this.i);
            manutencoes.cadastra(manutencao);
            new Manutencoes().setVisible(true);
            dispose();        
            return;
        }
        if(this.TableCliente.getSelectedRow() == -1)
        {
            JOptionPane.showMessageDialog(rootPane, "Selecione um Cliente", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        manutencao.setCpfCliente(clientes.getLista().get(this.TableCliente.getSelectedRow()).getCpf());
        if(!manutencao.getData().validaDia(cp_Dia.getText().trim()))
        {
            return;
        }
        if(!manutencao.getData().validaMes(cp_Mes.getText().trim()))
        {
            return;
        }
        if(!manutencao.getData().validaAno(cp_Ano.getText().trim()))
        {
            return;
        }
        if(this.radioSim.isSelected())
        {
            manutencao.setPago(true);
        }    
        if(!manutencao.validaDesc(cp_Desc.getText().trim()))
        {
            return;
        }
        if(!manutencao.validaPreco(cp_Preco.getText().trim()))
        {
            return;
        }
        
        manutencoes.cadastra(manutencao);

        new Manutencoes().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_SalvaActionPerformed

    private void btn_CancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelaActionPerformed
        new Manutencoes().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_CancelaActionPerformed

    private void cp_DescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp_DescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cp_DescActionPerformed

    private void cp_PrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp_PrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cp_PrecoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoPago;
    private javax.swing.JTable TableCliente;
    private javax.swing.JButton btn_Cancela;
    private javax.swing.JButton btn_Salva;
    private javax.swing.JTextField cp_Ano;
    private javax.swing.JTextField cp_Desc;
    private javax.swing.JTextField cp_Dia;
    private javax.swing.JTextField cp_Mes;
    private javax.swing.JTextField cp_Preco;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radioNao;
    private javax.swing.JRadioButton radioSim;
    // End of variables declaration//GEN-END:variables
}
