package javaapplicationbj;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dufnill
 */
public class BJWindow extends javax.swing.JFrame {

    /**
     * Creates new form Window
     */
    public BJWindow() {
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

        BancoLabel = new javax.swing.JLabel();
        ManoLabel = new javax.swing.JLabel();
        BancoText = new javax.swing.JTextField();
        ManoText1 = new javax.swing.JTextField();
        ManoText2 = new javax.swing.JTextField();
        ResetButton = new javax.swing.JButton();
        AzioneLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FaiQuestoLabel = new javax.swing.JLabel();
        PuntataLabel = new javax.swing.JLabel();
        PuntaQuestoLabel = new javax.swing.JLabel();
        VintoButton = new javax.swing.JButton();
        PariButton = new javax.swing.JButton();
        PersoButton = new javax.swing.JButton();
        ManoText3 = new javax.swing.JTextField();
        ManoText4 = new javax.swing.JTextField();
        CalcolaButton = new javax.swing.JButton();
        AvvisiLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BancoLabel.setText("Banco:");

        ManoLabel.setText("La tua mano:");

        BancoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BancoTextActionPerformed(evt);
            }
        });

        ManoText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManoText1ActionPerformed(evt);
            }
        });

        ResetButton.setBackground(new java.awt.Color(255, 0, 0));
        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        AzioneLabel.setText("La tua azione:");

        FaiQuestoLabel.setText("Carta");

        PuntataLabel.setText("Puntata:");

        PuntaQuestoLabel.setText("min");

        VintoButton.setBackground(new java.awt.Color(153, 255, 153));
        VintoButton.setText("Vinto");
        VintoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VintoButtonActionPerformed(evt);
            }
        });

        PariButton.setBackground(new java.awt.Color(255, 255, 102));
        PariButton.setText("Pari");
        PariButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PariButtonActionPerformed(evt);
            }
        });

        PersoButton.setBackground(new java.awt.Color(255, 0, 0));
        PersoButton.setText("Perso");

        CalcolaButton.setBackground(new java.awt.Color(153, 153, 255));
        CalcolaButton.setText("Calcola");
        CalcolaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcolaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BancoLabel)
                                        .addGap(50, 50, 50)
                                        .addComponent(BancoText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ManoLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ManoText1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ManoText2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ManoText3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ManoText4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CalcolaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AzioneLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FaiQuestoLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ResetButton)
                                    .addComponent(PersoButton)
                                    .addComponent(PariButton)
                                    .addComponent(VintoButton))
                                .addGap(81, 81, 81))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PuntataLabel)
                                .addGap(18, 18, 18)
                                .addComponent(PuntaQuestoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(AvvisiLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(VintoButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PariButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BancoLabel)
                                    .addComponent(BancoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ManoText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ManoText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ManoText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ManoText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ManoLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CalcolaButton)
                                    .addComponent(PersoButton))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AvvisiLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PuntataLabel)
                            .addComponent(PuntaQuestoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AzioneLabel)
                            .addComponent(FaiQuestoLabel)
                            .addComponent(ResetButton))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BancoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BancoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BancoTextActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void VintoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VintoButtonActionPerformed
        this.PuntaQuestoLabel.setText("Ballati la fresca");
    }//GEN-LAST:event_VintoButtonActionPerformed

    private void PariButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PariButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PariButtonActionPerformed

    private void ManoText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManoText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManoText1ActionPerformed

    private void CalcolaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcolaButtonActionPerformed
        String banco, mano1, mano2, mano3, mano4;
        int bancoint = 0;
        int mano = 0;
       
        banco = this.BancoText.getText();
        mano1 = this.ManoText1.getText();
        mano2 = this.ManoText2.getText();
        mano3 = this.ManoText3.getText();
        mano4 = this.ManoText4.getText();
        
        /* banco */
        if (banco.isEmpty()){
            this.AvvisiLabel.setText("Inserisci quanto ha il banco");
        }
        else{
            if (banco.equals("J") || banco.equals("Q") || banco.equals("K") || banco.equals("j") || banco.equals("q") || banco.equals("k")){
                banco = "10";
                bancoint = Integer.parseInt(banco);
            }
            else if (banco.equals("A") || banco.equals("a")){
                bancoint += 11;
            }

        } 
        /* */
       
        if (mano1.isEmpty() || mano2.isEmpty()){
            this.AvvisiLabel.setText("Inserisci entrambe le carte che hai ricevuto");
        }
        else {
            if (bancoint == 11){
                if (mano1.equals("A") || mano1.equals("a")){
                    if (mano2.equals("8") || mano2.equals("9")){
                        this.AzioneLabel.setText("Stai");
                    }
                    else {
                        this.AzioneLabel.setText("Carta");
                    }
                }
            }
        }

        
    }//GEN-LAST:event_CalcolaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BJWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BJWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BJWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BJWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BJWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvvisiLabel;
    private javax.swing.JLabel AzioneLabel;
    private javax.swing.JLabel BancoLabel;
    private javax.swing.JTextField BancoText;
    private javax.swing.JButton CalcolaButton;
    private javax.swing.JLabel FaiQuestoLabel;
    private javax.swing.JLabel ManoLabel;
    private javax.swing.JTextField ManoText1;
    private javax.swing.JTextField ManoText2;
    private javax.swing.JTextField ManoText3;
    private javax.swing.JTextField ManoText4;
    private javax.swing.JButton PariButton;
    private javax.swing.JButton PersoButton;
    private javax.swing.JLabel PuntaQuestoLabel;
    private javax.swing.JLabel PuntataLabel;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton VintoButton;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
