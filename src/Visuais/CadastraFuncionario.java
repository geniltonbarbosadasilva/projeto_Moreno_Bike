package Visuais;

import Modelos.Funcionario;
import Controle.FuncionarioControle;

/**
 *
 * @author genilton
 */
public class CadastraFuncionario extends javax.swing.JFrame {
    private boolean edita;
    private Funcionario oldFuncionario;
    private int i;

    public CadastraFuncionario(int i) {
        initComponents();
        this.i = i;
        FuncionarioControle funcionarios = new FuncionarioControle();
        Funcionario funcionario = funcionarios.getLista().get(i);
        setLocationRelativeTo(null);
        if(funcionario != null)
        {
            cp_Nome.setText(funcionario.getNome().trim());
            cp_Cpf.setText(funcionario.getCpf().trim());
            cp_Telefone.setText(funcionario.getTelefone().trim());
            cp_Rua.setText(funcionario.getEndereco().getRua().trim());
            cp_Num.setText(funcionario.getEndereco().getNumero().trim());
            cp_Bairro.setText(funcionario.getEndereco().getBairro().trim());
            cp_Cidade.setText(funcionario.getEndereco().getCidade().trim());
            cp_Estado.setText(funcionario.getEndereco().getEstado().trim());
            cp_Salario.setText(funcionario.getSalario() + "");
            this.oldFuncionario = funcionario;
            this.edita = true;
        }
    }

    public CadastraFuncionario() {
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
        cp_Estado = new javax.swing.JTextField();
        cp_Cidade = new javax.swing.JTextField();
        cp_Bairro = new javax.swing.JTextField();
        cp_Num = new javax.swing.JTextField();
        cp_Rua = new javax.swing.JTextField();
        cp_Telefone = new javax.swing.JTextField();
        cp_Cpf = new javax.swing.JTextField();
        cp_Nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cp_Salario = new javax.swing.JTextField();

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
        jLabel2.setText("CPF:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefone:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Endereço");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rua:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bairro:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cidade:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Salario:");

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(29, 29, 29)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cp_Salario, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cp_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(btn_Salva)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Cancela))
                    .addComponent(cp_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cp_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cp_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cp_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cp_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cp_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cp_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cp_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(cp_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cp_Salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cp_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cp_Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cp_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cp_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cp_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Salva)
                    .addComponent(btn_Cancela))
                .addGap(24, 24, 24))
        );
        jDesktopPane2.setLayer(btn_Cancela, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btn_Salva, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Estado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Cidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Bairro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Num, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Rua, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Telefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Cpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Nome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cp_Salario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void btn_SalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalvaActionPerformed
            Funcionario funcionario = new Funcionario();
            FuncionarioControle funcionarios = new FuncionarioControle();

            if(!funcionario.validaNome(cp_Nome.getText().trim()))
            {
                return;
            }
            
            if(edita)
            {
                if( !cp_Cpf.getText().trim().equals( this.oldFuncionario.getCpf().trim() ))
                {
                    if(!funcionarios.validaCpf(cp_Cpf.getText().trim()))
                    {
                        return;
                    }
                }
            } 
            else
            {
                if(!funcionarios.validaCpf(cp_Cpf.getText().trim()))
                {
                    return;
                }                                
            }
            
            if(!funcionario.validaCpf(cp_Cpf.getText().trim())) // Verifica se o cpf e valido
            {
                return;
            }
                        
            if(!funcionario.validaTelefone(cp_Telefone.getText().trim()))
            {
                return;
            }

            if(!funcionario.validaSalario(cp_Salario.getText().trim()))
            {
                return;
            }

            if(!funcionario.getEndereco().validaRua(cp_Rua.getText().trim()))
            {
                return;
            }

            if(!funcionario.getEndereco().validaNumero(cp_Num.getText().trim()))
            {
                return;
            }
            
            if(!funcionario.getEndereco().validaBairro(cp_Bairro.getText().trim()))
            {
                return;
            }
            
            if(!funcionario.getEndereco().validaCidade(cp_Cidade.getText().trim()))
            {
                return;
            }
            
            if(!funcionario.getEndereco().validaEstado(cp_Estado.getText().trim()))
            {
                return;
            }
            
            if(this.edita)
            {
                funcionarios.apaga(i);
                funcionarios.cadastra(funcionario);
            }
            else
            {
                funcionarios.cadastra(funcionario);
            }
            new Funcionarios().setVisible(true);
            dispose();
    }//GEN-LAST:event_btn_SalvaActionPerformed

    private void btn_CancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelaActionPerformed
        new Funcionarios().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_CancelaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancela;
    private javax.swing.JButton btn_Salva;
    private javax.swing.JTextField cp_Bairro;
    private javax.swing.JTextField cp_Cidade;
    private javax.swing.JTextField cp_Cpf;
    private javax.swing.JTextField cp_Estado;
    private javax.swing.JTextField cp_Nome;
    private javax.swing.JTextField cp_Num;
    private javax.swing.JTextField cp_Rua;
    private javax.swing.JTextField cp_Salario;
    private javax.swing.JTextField cp_Telefone;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
