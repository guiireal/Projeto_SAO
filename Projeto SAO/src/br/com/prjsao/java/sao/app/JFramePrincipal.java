package br.com.cidacastello.java.sao.app;

import br.com.cidacastello.java.sao.domain.Interface.JFrameCadastroMaquina;
import br.com.cidacastello.java.sao.domain.Interface.JFrameCalculoOciosidade;
import javax.swing.JOptionPane;

/**
 * CLASSE RESPONSÁVEL PELA CRIAÇÃO DA JANELA PRINCIPAL
 * 
 * @author Cida
 * @author Guilherme França
 */
public class JFramePrincipal extends javax.swing.JFrame {
    
    /**
     * ATRIBUTOS 
     */
    JFrameCadastroMaquina frmCadastroMaquina; 
    JFrameCalculoOciosidade frmCalculoOciosida;
   
    /**
     * MÉTODO CONSTRUTOR QUE INCIA OS COMPONENTES DA JANELA
     */
    public JFramePrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * MÉTODO GERADO AUTOMATICAMENTE (NÃO MODIFICAR)
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblVersao = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemMaquina = new javax.swing.JMenuItem();
        jMenuPeca = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemProdDiaria = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SAO – Sistema de Análise de Ociosidade");

        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelPrincipal.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SAO – Sistema de Análise de Ociosidade");
        jPanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 480, 60));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cidacastello/images/iniciacao_cientifica copy.png"))); // NOI18N
        jPanelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 310));

        lblVersao.setText("ver 1.3.0 (07/03/2016)");
        jPanelPrincipal.add(lblVersao, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 290, 120, -1));

        jMenuCadastro.setText("Cadastro");

        jMenuItemMaquina.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemMaquina.setText("Máquina");
        jMenuItemMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMaquinaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemMaquina);

        jMenuPeca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuPeca.setText("Peça");
        jMenuCadastro.add(jMenuPeca);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Operações");
        jMenuCadastro.add(jMenuItem2);

        jMenuBar1.add(jMenuCadastro);

        jMenu1.setText("Operações");

        jMenuItemProdDiaria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemProdDiaria.setText("Produção Diária");
        jMenuItemProdDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdDiariaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemProdDiaria);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * INSTANCIA E CRIA A JANELA DE CADASTRO DE MÁQUINAS
     * 
     * @param evt PASSA UM ACTION EVENT
     */
    private void jMenuItemMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMaquinaActionPerformed
        frmCadastroMaquina = new JFrameCadastroMaquina();
        frmCadastroMaquina.setVisible(true);
        frmCadastroMaquina.setLocationRelativeTo(null);
        frmCadastroMaquina.setResizable(false);
        
    }//GEN-LAST:event_jMenuItemMaquinaActionPerformed

    /*
     * INSTANCIA E CHAMA A JANELA QUE MOSTRA A PRODUÇÃO DIÁRIA DE PEÇAS
     * 
     * @param evt PASSA UM ACTION EVENT
     */
    private void jMenuItemProdDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdDiariaActionPerformed
        frmCalculoOciosida = new JFrameCalculoOciosidade();
        frmCalculoOciosida.setVisible(true);
        frmCalculoOciosida.setLocationRelativeTo(null);
        frmCalculoOciosida.setResizable(false);
    }//GEN-LAST:event_jMenuItemProdDiariaActionPerformed

    /*
     * MÉTODO PRINCIPAL EXECUTADO PELA JVM
     * 
     * @param args ARGUMENTO DE STRINGS
     */
    public static void main(String[] args) {
     
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
         * CRIA E INSTANCIA O JFRAME PRINCIPAL UTILIZANDO UMA CLASSE ANÔNIMA
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemMaquina;
    private javax.swing.JMenuItem jMenuItemProdDiaria;
    private javax.swing.JMenuItem jMenuPeca;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JLabel lblVersao;
    // End of variables declaration//GEN-END:variables
}
