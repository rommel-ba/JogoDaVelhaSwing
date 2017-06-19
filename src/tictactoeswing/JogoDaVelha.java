/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeswing;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import org.json.JSONObject;

/**
 *
 * @author jeiso
 */
public class JogoDaVelha extends javax.swing.JFrame {

    private boolean Jogador1Ativo = true;
    private boolean Jogador2Ativo = false;
    private JediPublisher pub;
    private JediSubscriber sub;
    private JSONObject json;
    private Jogada jogada;
    private static String minhaJogada;
    private static String msg;

    public JogoDaVelha() {
        minhaJogada = "inicio";
        sub = new JediSubscriber();
        sub.setupSubscriber();
        pub = new JediPublisher();
        pub.setupPublisher();
        json = new JSONObject();
        jogada = new Jogada();
        initComponents();
        threadSub();
    }

    /*
      * Jogador somente clica uma vez para inserir o seu símbolo.
      * Segundo clique mostra o outro símbolo
     */
    public void JogadorAtivo() {
        if (Jogador1Ativo == true) {
            Jogador1Ativo = false;
            Jogador2Ativo = true;
        } else {
            Jogador1Ativo = true;
            Jogador2Ativo = false;
        }

        JogadorVencedor("X");
        JogadorVencedor("O");
    }

    public void JogadorVencedor(String Jogador) {

        //Verificação de linhas (horizontal)
        if (B1.getText().equals(Jogador)
                && B2.getText().equals(Jogador)
                && B3.getText().equals(Jogador)) {

            if (B1.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
        }

        if (B4.getText().equals(Jogador)
                && B5.getText().equals(Jogador)
                && B6.getText().equals(Jogador)) {

            if (B4.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
        }

        if (B7.getText().equals(Jogador)
                && B8.getText().equals(Jogador)
                && B9.getText().equals(Jogador)) {

            if (B7.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
        }

        // Verificação vertical
        if (B1.getText().equals(Jogador)
                && B4.getText().equals(Jogador)
                && B7.getText().equals(Jogador)) {

            if (B1.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
        }

        if (B2.getText().equals(Jogador)
                && B5.getText().equals(Jogador)
                && B8.getText().equals(Jogador)) {

            if (B2.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
        }

        if (B3.getText().equals(Jogador)
                && B6.getText().equals(Jogador)
                && B9.getText().equals(Jogador)) {

            if (B3.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
        }

        // Verificação diagonal
        if (B1.getText().equals(Jogador)
                && B5.getText().equals(Jogador)
                && B9.getText().equals(Jogador)) {

            if (B1.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
        }

        if (B7.getText().equals(Jogador)
                && B5.getText().equals(Jogador)
                && B3.getText().equals(Jogador)) {

            if (B7.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
        }

        //Verificação de empate
        if (!B1.getText().equals("")
                && !B2.getText().equals("")
                && !B3.getText().equals("")
                && !B4.getText().equals("")
                && !B5.getText().equals("")
                && !B6.getText().equals("")
                && !B7.getText().equals("")
                && !B8.getText().equals("")
                && !B9.getText().equals("")) {

            Vencedor("Empate");

        }

    }

    public void Vencedor(String JogadorVencedor) {
        if (JogadorVencedor.equals("Jogador 1")) {
            JOptionPane.showMessageDialog(null, "Parabéns, Jogador 1");
            LimparCampos();

        } else if (JogadorVencedor.equals("Jogador 2")) {
            JOptionPane.showMessageDialog(null, "Parabéns, Jogador 2");
            LimparCampos();
        }

        if (JogadorVencedor.equals("Empate")) {
            JOptionPane.showMessageDialog(null, "Empate!");
            LimparCampos();
        }
        System.exit(0);
    }

    public void LimparCampos() {
        B1.setText("");
        B1.setEnabled(true);
        B2.setText("");
        B2.setEnabled(true);
        B3.setText("");
        B3.setEnabled(true);
        B4.setText("");
        B4.setEnabled(true);
        B5.setText("");
        B5.setEnabled(true);
        B6.setText("");
        B6.setEnabled(true);
        B7.setText("");
        B7.setEnabled(true);
        B8.setText("");
        B8.setEnabled(true);
        B9.setText("");
        B9.setEnabled(true);
        minhaJogada = "novo";
        msg = "novo";
        

        Jogador1Ativo = true;
        Jogador2Ativo = false;

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
        B7 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        NovoJogo = new javax.swing.JButton();
        SairDoJogo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe SD");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        B7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B7.setName("B7"); // NOI18N
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B1.setName("B1"); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B6.setName("B6"); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B2.setName("B2"); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B4.setName("B4"); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B3.setName("B3"); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B5.setName("B5"); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B9.setName("B9"); // NOI18N
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B8.setName("B8"); // NOI18N
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Jogo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel1.setText("Jogador 1                  Símbolo: X");

        jLabel2.setText("Jogador 2                  Símbolo: O");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle do Jogo"));

        NovoJogo.setText("Novo Jogo");
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });

        SairDoJogo.setText("Sair do Jogo");
        SairDoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairDoJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SairDoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(NovoJogo)
                .addGap(18, 18, 18)
                .addComponent(SairDoJogo)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Tic Tac Toe SD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        jogada(B1);
    }//GEN-LAST:event_B1ActionPerformed

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
        LimparCampos();
    }//GEN-LAST:event_NovoJogoActionPerformed

    private void SairDoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairDoJogoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairDoJogoActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        jogada(B3);
    }//GEN-LAST:event_B3ActionPerformed


    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        jogada(B2);
    }//GEN-LAST:event_B2ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        jogada(B4);
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        jogada(B5);
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        jogada(B6);
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        jogada(B7);
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        jogada(B8);
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        jogada(B9);
    }//GEN-LAST:event_B9ActionPerformed

    private void marcarBotao(String botao) {
        switch (botao) {
            case "B1": {
                jogada(B1);
                break;
            }
            case "B2": {
                jogada(B2);
                break;
            }
            case "B3": {
                jogada(B3);
                break;
            }
            case "B4": {
                jogada(B4);
                break;
            }
            case "B5": {
                jogada(B5);
                break;
            }
            case "B6": {
                jogada(B6);
                break;
            }
            case "B7": {
                jogada(B7);
                break;
            }
            case "B8": {
                jogada(B8);
                break;
            }
            case "B9": {
                jogada(B9);
                break;
            }
        }
    }

    private void jogada(JButton botao) {
        if (Jogador1Ativo == true) {
            if (botao.getText().equals("")) {
                botao.setText("X");
                botao.setEnabled(false);
                pub.postar("canal", botao.getName());
                JogadorAtivo();

            }
        } else if (botao.getText().equals("")) {
            botao.setText("O");
            botao.setEnabled(false);
            pub.postar("canal", botao.getName());
            JogadorAtivo();
        }
    }

    private void threadSub() {
        sub.setupSubscriber();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
//                String msg = "vazio";
                while (true) {
                    msg = sub.getMsg();
                    System.out.println(msg);
                    if (msg != null) {
                        if (!minhaJogada.equals(msg)) {
                            System.out.println("jogada diferente");
                            marcarBotao(msg);
                            repaint();
                        }
                    }
                }
            }
        });
        t.setDaemon(true);
        t.start();
    }

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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton NovoJogo;
    private javax.swing.JButton SairDoJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}
