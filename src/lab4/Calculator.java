
package lab4;

public class Calculator extends javax.swing.JFrame {
    public Calculator() {
        initComponents();
        setTitle("Calculator");
    }
    private long kq = 0;
    private String phepToan = "";
    private void initComponents() {

        lbHienThi = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btSo7 = new javax.swing.JButton();
        btSo8 = new javax.swing.JButton();
        btSo9 = new javax.swing.JButton();
        btDauChia = new javax.swing.JButton();
        btSo4 = new javax.swing.JButton();
        btSo5 = new javax.swing.JButton();
        btSo6 = new javax.swing.JButton();
        btDauNhan = new javax.swing.JButton();
        btSo1 = new javax.swing.JButton();
        btSo2 = new javax.swing.JButton();
        btSo3 = new javax.swing.JButton();
        btDauTru = new javax.swing.JButton();
        btChuC = new javax.swing.JButton();
        btSo0 = new javax.swing.JButton();
        btDauBang = new javax.swing.JButton();
        btDauCong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbHienThi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbHienThi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbHienThi.setText("0");
        lbHienThi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel1.setLayout(new java.awt.GridLayout(4, 4, 2, 2));

        btSo7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSo7.setText("7");
        btSo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSo7ActionPerformed(evt);
            }
        });
        jPanel1.add(btSo7);

        btSo8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSo8.setText("8");
        btSo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSo8ActionPerformed(evt);
            }
        });
        jPanel1.add(btSo8);

        btSo9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSo9.setText("9");
        btSo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSo9ActionPerformed(evt);
            }
        });
        jPanel1.add(btSo9);

        btDauChia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btDauChia.setText("/");
        btDauChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDauChiaActionPerformed(evt);
            }
        });
        jPanel1.add(btDauChia);

        btSo4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSo4.setText("4");
        btSo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSo4ActionPerformed(evt);
            }
        });
        jPanel1.add(btSo4);

        btSo5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSo5.setText("5");
        btSo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSo5ActionPerformed(evt);
            }
        });
        jPanel1.add(btSo5);

        btSo6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSo6.setText("6");
        btSo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSo6ActionPerformed(evt);
            }
        });
        jPanel1.add(btSo6);

        btDauNhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btDauNhan.setText("x");
        btDauNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDauNhanActionPerformed(evt);
            }
        });
        jPanel1.add(btDauNhan);

        btSo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSo1.setText("1");
        btSo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSo1ActionPerformed(evt);
            }
        });
        jPanel1.add(btSo1);

        btSo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSo2.setText("2");
        btSo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSo2ActionPerformed(evt);
            }
        });
        jPanel1.add(btSo2);

        btSo3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSo3.setText("3");
        btSo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSo3ActionPerformed(evt);
            }
        });
        jPanel1.add(btSo3);

        btDauTru.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btDauTru.setText("-");
        btDauTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDauTruActionPerformed(evt);
            }
        });
        jPanel1.add(btDauTru);

        btChuC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btChuC.setText("C");
        btChuC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChuCActionPerformed(evt);
            }
        });
        jPanel1.add(btChuC);

        btSo0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSo0.setText("0");
        btSo0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSo0ActionPerformed(evt);
            }
        });
        jPanel1.add(btSo0);

        btDauBang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btDauBang.setText("=");
        btDauBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDauBangActionPerformed(evt);
            }
        });
        jPanel1.add(btDauBang);

        btDauCong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btDauCong.setText("+");
        btDauCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDauCongActionPerformed(evt);
            }
        });
        jPanel1.add(btDauCong);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
        );

        pack();
    }

    private void btSo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSo1ActionPerformed
        String gtri = this.lbHienThi.getText();
        if (gtri.length() < 10){
            if (gtri.equals("0")) gtri="";
            this.lbHienThi.setText(gtri + btSo1.getText());
        }
    }//GEN-LAST:event_btSo1ActionPerformed

    private void btSo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSo2ActionPerformed
        String gtri = this.lbHienThi.getText();
        if (gtri.length() < 10){
            if (gtri.equals("0")) gtri="";
            this.lbHienThi.setText(gtri + btSo2.getText());
        }//GEN-LAST:event_btSo2ActionPerformed
    }
    private void btSo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSo3ActionPerformed
        String gtri = this.lbHienThi.getText();
        if (gtri.length() < 10){
            if (gtri.equals("0")) gtri="";
            this.lbHienThi.setText(gtri + btSo3.getText());
       }//GEN-LAST:event_btSo3ActionPerformed
    }

    private void btSo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSo4ActionPerformed
        String gtri = this.lbHienThi.getText();
        if (gtri.length() < 10){
            if (gtri.equals("0")) gtri="";
            this.lbHienThi.setText(gtri + btSo4.getText());
        }//GEN-LAST:event_btSo4ActionPerformed
    }

    private void btSo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSo5ActionPerformed
        String gtri = this.lbHienThi.getText();
        if (gtri.length() < 10){
            if (gtri.equals("0")) gtri="";
            this.lbHienThi.setText(gtri + btSo5.getText());
        }//GEN-LAST:event_btSo5ActionPerformed
    }

    private void btSo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSo6ActionPerformed
        String gtri = this.lbHienThi.getText();
        if (gtri.length() < 10){
            if (gtri.equals("0")) gtri="";
            this.lbHienThi.setText(gtri + btSo6.getText());
        }//GEN-LAST:event_btSo6ActionPerformed
    }
    private void btSo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSo7ActionPerformed
        String gtri = this.lbHienThi.getText();
        if (gtri.length() < 10){
            if (gtri.equals("0")) gtri="";
            this.lbHienThi.setText(gtri + btSo7.getText());
        }//GEN-LAST:event_btSo7ActionPerformed
    }
    private void btSo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSo8ActionPerformed
        String gtri = this.lbHienThi.getText();
        if (gtri.length() < 10){
            if (gtri.equals("0")) gtri="";
            this.lbHienThi.setText(gtri + btSo8.getText());
        }//GEN-LAST:event_btSo8ActionPerformed
    }
    private void btSo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSo9ActionPerformed
        String gtri = this.lbHienThi.getText();
        if (gtri.length() < 10){
            if (gtri.equals("0")) gtri="";
            this.lbHienThi.setText(gtri + btSo9.getText());
        }//GEN-LAST:event_btSo9ActionPerformed
    }
    private void btSo0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSo0ActionPerformed
        String gtri = this.lbHienThi.getText();
        if (gtri.length() < 10){
            if (gtri.equals("0")) gtri="";
            this.lbHienThi.setText(gtri + btSo0.getText());
        }//GEN-LAST:event_btSo0ActionPerformed
    }
    private void tinh(){
        if (this.phepToan.equals("")) this.kq = Long.parseLong(lbHienThi.getText());
        else {
            if (this.phepToan.equals("+")) this.kq+=Long.parseLong(lbHienThi.getText());
            if (this.phepToan.equals("-")) this.kq-=Long.parseLong(lbHienThi.getText());            
            if (this.phepToan.equals("x")) this.kq*=Long.parseLong(lbHienThi.getText());            
            if (this.phepToan.equals("/")) this.kq/=Long.parseLong(lbHienThi.getText());            
        }
    }
    private void btDauCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDauCongActionPerformed
        tinh();
        this.phepToan = "+";
        lbHienThi.setText("0");
    }//GEN-LAST:event_btDauCongActionPerformed

    private void btDauBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDauBangActionPerformed
        tinh();
        lbHienThi.setText(String.valueOf(this.kq));
        this.kq = 0;
    }//GEN-LAST:event_btDauBangActionPerformed

    private void btChuCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChuCActionPerformed
        lbHienThi.setText("0");
        this.phepToan = "";
    }//GEN-LAST:event_btChuCActionPerformed

    private void btDauTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDauTruActionPerformed
        tinh();
        this.phepToan = "-";
        lbHienThi.setText("0");
    }//GEN-LAST:event_btDauTruActionPerformed

    private void btDauNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDauNhanActionPerformed
        tinh();
        this.phepToan = "x";
        lbHienThi.setText("0");
    }//GEN-LAST:event_btDauNhanActionPerformed

    private void btDauChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDauChiaActionPerformed
        tinh();
        this.phepToan = "/";
        lbHienThi.setText("0");
    }//GEN-LAST:event_btDauChiaActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChuC;
    private javax.swing.JButton btDauBang;
    private javax.swing.JButton btDauChia;
    private javax.swing.JButton btDauCong;
    private javax.swing.JButton btDauNhan;
    private javax.swing.JButton btDauTru;
    private javax.swing.JButton btSo0;
    private javax.swing.JButton btSo1;
    private javax.swing.JButton btSo2;
    private javax.swing.JButton btSo3;
    private javax.swing.JButton btSo4;
    private javax.swing.JButton btSo5;
    private javax.swing.JButton btSo6;
    private javax.swing.JButton btSo7;
    private javax.swing.JButton btSo8;
    private javax.swing.JButton btSo9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbHienThi;
    // End of variables declaration//GEN-END:variables
}
