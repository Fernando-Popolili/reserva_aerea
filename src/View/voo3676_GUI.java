/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author fpopo
 */
public class voo3676_GUI extends javax.swing.JFrame {

    /**
     * Creates new form voo3676_GUI
     */
    public voo3676_GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        assento6_2 = new javax.swing.JLabel();
        assento1_2 = new javax.swing.JLabel();
        assento3_2 = new javax.swing.JLabel();
        assento2_2 = new javax.swing.JLabel();
        assento5_2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        resp_voo2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        assento4_2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Reserva_Aérea"));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("VOO N° 3676");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 30, 180, 70);

        assento6_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assento6_2.setText(Model.Funcoes2_DAO.assentosvoo2[5]);
        jPanel1.add(assento6_2);
        assento6_2.setBounds(170, 210, 110, 40);

        assento1_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assento1_2.setText(Model.Funcoes2_DAO.assentosvoo2[0]);
        jPanel1.add(assento1_2);
        assento1_2.setBounds(40, 110, 80, 40);

        assento3_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assento3_2.setText(Model.Funcoes2_DAO.assentosvoo2[2]);
        jPanel1.add(assento3_2);
        assento3_2.setBounds(40, 210, 90, 40);

        assento2_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assento2_2.setText(Model.Funcoes2_DAO.assentosvoo2[1]);
        jPanel1.add(assento2_2);
        assento2_2.setBounds(40, 160, 130, 40);

        assento5_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assento5_2.setText(Model.Funcoes2_DAO.assentosvoo2[4]);
        jPanel1.add(assento5_2);
        assento5_2.setBounds(170, 160, 100, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Selecione o assento:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(130, 290, 150, 14);

        resp_voo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resp_voo2ActionPerformed(evt);
            }
        });
        jPanel1.add(resp_voo2);
        resp_voo2.setBounds(130, 310, 120, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 370, 73, 23);

        jButton2.setText("Reservar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(150, 340, 80, 23);

        assento4_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assento4_2.setText(Model.Funcoes2_DAO.assentosvoo2[3]);
        jPanel1.add(assento4_2);
        assento4_2.setBounds(170, 110, 120, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(290, 20, 60, 60);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnFechar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(350, 370, 40, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resp_voo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resp_voo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resp_voo2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new InicioConsulta_GUI().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String x = resp_voo2.getText();

        Model.Funcoes2_DAO.reserva_2(x);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(voo3676_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(voo3676_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(voo3676_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(voo3676_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new voo3676_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assento1_2;
    public static javax.swing.JLabel assento2_2;
    public static javax.swing.JLabel assento3_2;
    public static javax.swing.JLabel assento4_2;
    public static javax.swing.JLabel assento5_2;
    public static javax.swing.JLabel assento6_2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField resp_voo2;
    // End of variables declaration//GEN-END:variables
}
