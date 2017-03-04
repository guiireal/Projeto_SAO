package br.com.cidacastello.java.sao.domain.Interface;

import br.com.cidacastello.java.sao.domain.exception.MaquinaException;
import br.com.cidacastello.java.sao.domain.model.Maquina;
import br.com.cidacastello.java.sao.service.MaquinaService;
import br.com.cidacastello.java.sao.service.impl.MaquinaManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collection;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

/**
 * JANELA DE CADASTRO DE MÁQUINAS
 * 
 * @author Edinilson Pereira - epsnilson@gmail.com
 * @author Guilherme França - gfrancav@gmail.com
 */
public class JFrameCadastroMaquina extends javax.swing.JFrame {

    private Object maquinaAlterar;
    private Maquina maquina;
    private MaquinaService service;
    
    /*
     * CONSTRUTOR
     */
    public JFrameCadastroMaquina() {
        this.initComponents();
        this.carregarMaquinasJTable();
        this.initPopupMaquina();
        this.limparMaquina();
    }

    /*
     * CÓDIGO GERADO AUTOMATICAMENTE
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDadosMaquina = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtTempo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        JLabelMsg = new javax.swing.JLabel();
        jScrollPaneMaquina = new javax.swing.JScrollPane();
        jTableMaquinas = new javax.swing.JTable();
        btExcluirTudo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Máquina");
        setName("JFrameCadastroMaquina"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Máquina");
        jLabel1.setName("lblTitulo"); // NOI18N

        txtNome.setName("textNOME"); // NOI18N

        txtTempo.setName("textTEMPO"); // NOI18N

        jLabel3.setText("NOME:");

        jLabel4.setText("TEMPO:");

        btnOk.setText("Ok");
        btnOk.setName("btnOk"); // NOI18N
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setName("btnCancelar"); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setName("btnExcluir"); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jScrollPaneMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Máquinas Cadastradas"));

        jTableMaquinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome / Descrição", "Tempo disponível"
            }
        ));
        jScrollPaneMaquina.setViewportView(jTableMaquinas);

        btExcluirTudo.setText("Excluir Tudo");
        btExcluirTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirTudoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosMaquinaLayout = new javax.swing.GroupLayout(jPanelDadosMaquina);
        jPanelDadosMaquina.setLayout(jPanelDadosMaquinaLayout);
        jPanelDadosMaquinaLayout.setHorizontalGroup(
            jPanelDadosMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosMaquinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosMaquinaLayout.createSequentialGroup()
                        .addGroup(jPanelDadosMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosMaquinaLayout.createSequentialGroup()
                                .addComponent(txtTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btExcluirTudo)
                                .addGap(0, 49, Short.MAX_VALUE))
                            .addComponent(txtNome)))
                    .addComponent(jScrollPaneMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(jPanelDadosMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelDadosMaquinaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelDadosMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelDadosMaquinaLayout.createSequentialGroup()
                            .addGap(166, 166, 166)
                            .addComponent(jLabel1))
                        .addComponent(JLabelMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(76, Short.MAX_VALUE)))
        );
        jPanelDadosMaquinaLayout.setVerticalGroup(
            jPanelDadosMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosMaquinaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelDadosMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar)
                    .addComponent(btnOk)
                    .addComponent(btExcluirTudo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneMaquina, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelDadosMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelDadosMaquinaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                    .addComponent(JLabelMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        txtNome.getAccessibleContext().setAccessibleName("texte");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelDadosMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDadosMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * MÉTODO QUE CANCELA UMA INSERÇÃO DE MÁQUINA E FECHA A JANELA
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limparMaquina();
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    /*
     * MÉTODO QUE GUARDA UMA MÁQUINA
     */
    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        this.service = new MaquinaManager();
        if (this.maquinaAlterar != null) 
            this.maquina = (Maquina) this.maquinaAlterar;
        else 
            this.maquina = new Maquina();
        
        this.maquina.setDescricaoDaMaquina(txtNome.getText());
        this.maquina.setTempoTotal(Double.parseDouble(txtTempo.getText()));

        try {
            service.validar(this.maquina);
            service.salvar(this.maquina);
            JOptionPane.showMessageDialog(null, "Máquina inserida com sucesso!!");
            this.limparMaquina();
            this.carregarMaquinasJTable();
        } catch (MaquinaException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }

    }//GEN-LAST:event_btnOkActionPerformed

    /*
     * MÉTODO QUE EXCLUI UMA MÁQUINA
     */
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            this.service = new MaquinaManager();
            this.maquina = (Maquina) this.maquinaAlterar;
            this.maquina.setDescricaoDaMaquina(txtNome.getText());
            this.maquina.setTempoTotal(Double.parseDouble(txtTempo.getText()));
            service.validar(this.maquina);
            service.apagar(this.maquina);
            JOptionPane.showMessageDialog(this.jPanelDadosMaquina, "Registro excluído com sucesso"); 
            this.limparMaquina();
            this.carregarMaquinasJTable();
         } catch(MaquinaException erro){
             JOptionPane.showMessageDialog(this.jPanelDadosMaquina, erro.getMessage());
         } catch(NullPointerException erro) {
             JOptionPane.showMessageDialog(null, "Não existem máquinas a serem removidas");
         }       
    }//GEN-LAST:event_btnExcluirActionPerformed

    /*
     * MÉTODO QUE EXCLUI TODOS OS REGISTROS DO DATABASE
     * 
     * @author GUILHERME FRANÇA - gfrancav@gmail.com
     */
    private void btExcluirTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirTudoActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir os registros ?\n(Não poderá ser desfeito)", "Mensagem", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            Collection<Maquina> maquinas;
            DefaultTableModel table;
            try {
                this.service = new MaquinaManager();
                table = (DefaultTableModel) jTableMaquinas.getModel();
                this.service.apagarTudo();
                maquinas = this.service.listar();
                for (int i = 0; i < maquinas.size(); i++) {
                    table.removeRow(i);
                }
                this.limparMaquina();
                JOptionPane.showMessageDialog(null, "Todas as máquinas foram excluídas !");
                this.carregarMaquinasJTable();

            } catch (MaquinaException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir os registros !" + ex.getMessage(), "Mensagem",JOptionPane.ERROR);
            }
        } 
    }//GEN-LAST:event_btExcluirTudoActionPerformed
    
    /*
     * MÉTODO QUE CARREGA TODAS AS MÁQUINAS DO BANCO
     */
    private void carregarMaquinasJTable() {
        Collection<Maquina> maquinas;
        DefaultTableModel table;
        table = (DefaultTableModel) this.jTableMaquinas.getModel();
        this.service = new MaquinaManager();
        try {
            maquinas = this.service.listar();
            table.getDataVector().clear();
            this.jTableMaquinas.updateUI();
            for (Maquina mq : maquinas) {
                table.addRow(new Object[]{mq, mq.getTempoTotal()});
            }
        } catch (MaquinaException cause) {
            JOptionPane.showMessageDialog(this.jPanelDadosMaquina, cause.getMessage());
        }
    }
    
    /*
     * MÉTODO QUE LIMPA OS CAMPOS
     */
    private void limparMaquina(){
        this.txtNome.setText(null);
        this.txtTempo.setText(null);
        this.txtNome.grabFocus();
    }
    
    /*
     * CRIA UM MENU POPUP NO JTABLE
     */
    private void initPopupMaquina() {
        final JPopupMenu menu = new JPopupMenu();

        // CRIA E ADICIONA UM NOVO ITEM
        JMenuItem item = new JMenuItem("Alterar");

        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalSelecionados = jTableMaquinas.getSelectedRowCount();
                if (totalSelecionados == 1) {
                    int row = jTableMaquinas.getSelectedRow();
                    maquinaAlterar = jTableMaquinas.getModel().getValueAt(row, 0);

                    Maquina maquina = (Maquina) maquinaAlterar;
                    txtNome.setText(maquina.getDescricaoDaMaquina());
                    txtTempo.setText(Double.toString(maquina.getTempoTotal()));
                } else {
                    JOptionPane.showMessageDialog(jPanelDadosMaquina, "Selecione somente uma máquina");
                }
            }
        });

        menu.add(item);

        item = new JMenuItem("Apagar");

        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int totalSelecionados;
                totalSelecionados = jTableMaquinas.getSelectedRowCount();

                if (totalSelecionados == 1) {
                    int row = jTableMaquinas.getSelectedRow();

                    maquinaAlterar = jTableMaquinas.getModel().getValueAt(row, 0);

                    Maquina maquina = (Maquina) maquinaAlterar;

                    txtNome.setText(maquina.getDescricaoDaMaquina());
                    txtTempo.setText(Double.toString(maquina.getTempoTotal()));
                }
            }
        });

        menu.add(item);

        // SETA O COMPONENTE PARA SER VISÍVEL A POPUP NO JTABLE QUANDO CLICADO
        this.jTableMaquinas.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                if (evt.isPopupTrigger()) {
                    menu.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }

            @Override
            public void mouseReleased(MouseEvent evt) {
                if (evt.isPopupTrigger()) {
                    menu.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }
        });
    }

    /**
     * MÉTODO PRINCIPAL
     * 
     * @param args
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException erro) {
            JOptionPane.showMessageDialog(null, "Erro inesperado !\n" + erro.getMessage());
        }
       
        /*
         * CRIA E DEIXA VISÍVEL A JANELA
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCadastroMaquina().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelMsg;
    private javax.swing.JButton btExcluirTudo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelDadosMaquina;
    private javax.swing.JScrollPane jScrollPaneMaquina;
    private javax.swing.JTable jTableMaquinas;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTempo;
    // End of variables declaration//GEN-END:variables
    
}
