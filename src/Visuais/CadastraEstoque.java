package Visuais;

import Modelos.Estoque;
import Controle.EstoqueControle;

/**
 *
 * @author genilton
 */
public class CadastraEstoque extends javax.swing.JFrame {
    private boolean edita;
    private Estoque oldEstoque;
    private int i;

    public CadastraEstoque(int i) {
        initComponents();
        this.i = i;
        EstoqueControle estoques = new EstoqueControle();
        Estoque estoque = estoques.getLista().get(i);
        setLocationRelativeTo(null);
        if(estoque != null)
        {
            cp_Nome.setText(estoque.getProduto().getNome().trim());
            cp_Preco.setText("" + estoque.getProduto().getPreco());
            cp_Qtd.setText("" + estoque.getQtdEstoque());
            this.oldEstoque = estoque;
            this.edita = true;
        }
    }

    public CadastraEstoque() {
        this.edita = false;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        btn_Cancela = new javax.swing.JButton();
        btn_Salva = new javax.swing.JButton();
        cp_Qtd = new javax.swing.JTextField();
        cp_Preco = new javax.swing.JTextField();
        cp_Nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Preço");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantidade");

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(btn_Salva)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Cancela))
                    .addComponent(cp_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cp_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cp_Qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cp_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cp_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(cp_Qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Salva)
                    .addComponent(btn_Cancela))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jDesktopPane2.setLayer(btn_Cancela, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btn_Salva, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Qtd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Preco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Nome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void btn_SalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalvaActionPerformed
        EstoqueControle estoques = new EstoqueControle();
        Estoque estoque = new Estoque();
        if(!estoque.getProduto().validaNome(cp_Nome.getText().trim()))
        {
            return;
        }            
        if( !estoque.getProduto().validaPreco(cp_Preco.getText()))
        {
            return;
        } 
        if( !estoque.validaQtdEstoque(cp_Qtd.getText().trim()) )
        {
            return;
        }           
        if(this.edita)
        {
            estoques.apaga(i);
            estoques.cadastra(estoque);
        }
        else
        {
            estoques.cadastra(estoque);
        }
        new Estoques().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_SalvaActionPerformed

    private void btn_CancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelaActionPerformed
        new Estoques().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_CancelaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancela;
    private javax.swing.JButton btn_Salva;
    private javax.swing.JTextField cp_Nome;
    private javax.swing.JTextField cp_Preco;
    private javax.swing.JTextField cp_Qtd;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
