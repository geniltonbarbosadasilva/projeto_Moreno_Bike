package Visuais;

import Modelos.Cliente;
import Modelos.Estoque;
import Modelos.Produto;
import Modelos.Venda;
import Controle.ClienteControle;
import Controle.EstoqueControle;
import Controle.VendaControle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author genilton
 */
public class CadastraVenda extends javax.swing.JFrame {
    private boolean edita;
    private Venda oldVenda;
    private int i;

    public CadastraVenda(int i) {
        this.edita = true;
        initComponents();
        setLocationRelativeTo(null);
        ClienteControle clientes = new ClienteControle();       
        VendaControle vendas = new VendaControle();
        EstoqueControle estoques = new EstoqueControle();
        this.i = i;
        this.oldVenda = vendas.getLista().get(i);
        DefaultTableModel linha = (DefaultTableModel) this.TableCliente.getModel();
        String[] c = new String[2];
                
        for(Cliente cliente : clientes.getLista()){                    
            c[0] = cliente.getNome().trim();
            c[1] = cliente.getCpf().trim();
            linha.addRow(c);
        }
        linha = (DefaultTableModel) this.TableProduto.getModel();
        for(Estoque estoque : estoques.getLista()){                    
            c[0] = estoque.getProduto().getNome().trim();
            c[1] = ( "" + estoque.getQtdEstoque() ).trim();
            linha.addRow(c);
        }
        this.TableCliente.setEnabled(false);
        this.TableProduto.setEnabled(false);
        cp_Dia.setText("" + this.oldVenda.getData().getDia());
        cp_Mes.setText("" + this.oldVenda.getData().getMes());
        cp_Ano.setText("" + this.oldVenda.getData().getAno());
        cp_Qtd.setText("" + this.oldVenda.getProdutos().getQtd());
        cp_Dia.setEditable(false);
        cp_Mes.setEditable(false);
        cp_Ano.setEditable(false);
        cp_Qtd.setEditable(false);
        if(!this.oldVenda.isPago())
        {
            this.radioNao.setSelected(true);
        }
    }

    public CadastraVenda() {
        this.edita = false;
        initComponents();
        setLocationRelativeTo(null);
        ClienteControle clientes = new ClienteControle();       
        EstoqueControle estoques = new EstoqueControle();
        DefaultTableModel linha = (DefaultTableModel) this.TableCliente.getModel();
        String[] c = new String[2];
                
        for(Cliente cliente : clientes.getLista()){                    
            c[0] = cliente.getNome().trim();
            c[1] = cliente.getCpf().trim();
            linha.addRow(c);
        }
        linha = (DefaultTableModel) this.TableProduto.getModel();
        for(Estoque estoque : estoques.getLista()){                    
            c[0] = estoque.getProduto().getNome().trim();
            c[1] = ( "" + estoque.getQtdEstoque() ).trim();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cp_Dia = new javax.swing.JTextField();
        cp_Mes = new javax.swing.JTextField();
        cp_Ano = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        radioSim = new javax.swing.JRadioButton();
        radioNao = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProduto = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCliente = new javax.swing.JTable();
        cp_Qtd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

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

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Produtos");

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

        TableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {    },
            new String [] {
                "Nome", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(TableProduto);

        TableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {    },
            new String [] {
                "Nome", "CPF"
            }
        ));
        jScrollPane2.setViewportView(TableCliente);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantidade:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("/");

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Salva)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(cp_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cp_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(btn_Cancela))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cp_Qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 48, Short.MAX_VALUE))))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(radioSim))
                                            .addComponent(cp_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(radioNao)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cp_Qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(radioSim)
                    .addComponent(radioNao))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cp_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cp_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cp_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Salva)
                    .addComponent(btn_Cancela))
                .addGap(33, 33, 33))
        );
        jDesktopPane2.setLayer(btn_Cancela, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btn_Salva, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Dia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Mes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Ano, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(radioSim, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(radioNao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Qtd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        VendaControle vendas = new VendaControle();
        EstoqueControle estoques = new EstoqueControle();
        Venda venda = new Venda();
        Produto produto = new Produto();
        
        if(edita)
        {
            venda = vendas.getLista().get(this.i); 
            if(this.radioSim.isSelected())
            {
                venda.setPago(true);
            }
            else if(this.radioNao.isSelected())
            {
                venda.setPago(false);
            }            
            vendas.apaga(this.i);
            vendas.cadastra(venda);
            new Vendas().setVisible(true);
            dispose();        
            return;
        }
        if(this.TableCliente.getSelectedRow() == -1)
        {
            JOptionPane.showMessageDialog(rootPane, "Selecione um Cliente", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(this.TableProduto.getSelectedRow() == -1)
        {
            JOptionPane.showMessageDialog(rootPane, "Selecione um Produto", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        venda.setCpfCliente(clientes.getLista().get(this.TableCliente.getSelectedRow()).getCpf());
        produto = estoques.getLista().get(this.TableProduto.getSelectedRow()).getProduto();
        if(!produto.validaQtd(cp_Qtd.getText().trim()))
        {
            return;
        }
        if(estoques.getLista().get(this.TableProduto.getSelectedRow()).getQtdEstoque() < produto.getQtd())
        {
            JOptionPane.showMessageDialog(rootPane, "Produto indisponivel", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!venda.getData().validaDia(cp_Dia.getText().trim()))
        {
            return;
        }
        if(!venda.getData().validaMes(cp_Mes.getText().trim()))
        {
            return;
        }
        if(!venda.getData().validaAno(cp_Ano.getText().trim()))
        {
            return;
        }
        if(this.radioSim.isSelected())
        {
            venda.setPago(true);
        }    
        venda.setProdutos(produto);
        vendas.cadastra(venda);
        estoques.getLista().get(this.TableProduto.getSelectedRow()).setQtdEstoque(estoques.getLista().get(this.TableProduto.getSelectedRow()).getQtdEstoque()-produto.getQtd());
        estoques.grava();

        new Vendas().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_SalvaActionPerformed

    private void btn_CancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelaActionPerformed
        new Vendas().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_CancelaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoPago;
    private javax.swing.JTable TableCliente;
    private javax.swing.JTable TableProduto;
    private javax.swing.JButton btn_Cancela;
    private javax.swing.JButton btn_Salva;
    private javax.swing.JTextField cp_Ano;
    private javax.swing.JTextField cp_Dia;
    private javax.swing.JTextField cp_Mes;
    private javax.swing.JTextField cp_Qtd;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radioNao;
    private javax.swing.JRadioButton radioSim;
    // End of variables declaration//GEN-END:variables
}
