/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s300037574
 */


import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
public class intern extends javax.swing.JFrame {

    /**
     * Creates new form intern
     */
    public intern() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(135, 240, 152)); //set background colour
    }
    
    //array of string links
    String alllinks [] = {"https://www.rbc.com/en/future-launch/resource-type/programs-services/rbc-summer-tech-labs/",
        "https://buildyourfuture.withgoogle.com/programs/computer-science-summer-institute", 
        "https://www.sickkids.ca/en/learning/patient-family-education/kids-science/#summer",
        "https://cwf-fcf.org/en/explore/wild-outside/?src=EL",
        "https://internationalprograms.utoronto.ca/international-summer-programs/pre-university-programs/advanced-academic-program/",
        "https://www.cs.queensu.ca/undergraduate/internships/qhic.php"};
    
    //method to use hyperlink
    public static String hyperlink (String link){ 
        try {
            URI uri = new URI(link);
            Desktop desktop = null;
            if (Desktop.isDesktopSupported()) {
              desktop = Desktop.getDesktop();
            }

      if (desktop != null)
            desktop.browse(uri);
        } catch (IOException ioe) {
          ioe.printStackTrace(); 
        } catch (URISyntaxException use) {
          use.printStackTrace();
        } 
        return link; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BTNRBC = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BTNGOOGLE = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BTNSICKKIDS = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BTNWILDLIFE = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BTNUOFT = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BTNQUEENS = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jLabel1.setText("STEM Internship Opportunities!");

        BTNRBC.setText("RBC");
        BTNRBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRBCActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("1. RBC Summer Tech Labs");

        jLabel2.setText("Design, develop, and test a prototype for a business unit at RBC!");

        BTNGOOGLE.setText("Google");
        BTNGOOGLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGOOGLEActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("2. Google Computer Science");

        jLabel5.setText("Innovate, program, and design at the Google office!");

        BTNSICKKIDS.setText("Sick Kids");
        BTNSICKKIDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSICKKIDSActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("3. StAr Sick Kids");

        jLabel7.setText("Interact with world-renowned researchers and medical professionals!");

        BTNWILDLIFE.setText("Wildlife");
        BTNWILDLIFE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNWILDLIFEActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setText("4. Wildlife Leadership");

        jLabel9.setText("Get outside and connect with the environment while learning!");

        BTNUOFT.setText("UofT");
        BTNUOFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNUOFTActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel10.setText("5. UofT Academic Program");

        jLabel11.setText("Challenges, engaging projects, and networking at University of Toronto!");

        BTNQUEENS.setText("Queen's");
        BTNQUEENS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNQUEENSActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel12.setText("6. Queen's Computing");

        jLabel13.setText("Work in a computing research lab with computing professors!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNGOOGLE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNQUEENS))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNUOFT)
                            .addGap(8, 8, 8))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNWILDLIFE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(123, 123, 123)
                            .addComponent(BTNRBC)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(166, 166, 166)
                        .addComponent(BTNSICKKIDS)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(BTNRBC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BTNGOOGLE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(BTNSICKKIDS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(BTNWILDLIFE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(BTNUOFT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(BTNQUEENS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNRBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRBCActionPerformed

        hyperlink(alllinks[0]); //when user clicks this button, direct them to this link of the array

    }//GEN-LAST:event_BTNRBCActionPerformed

    private void BTNGOOGLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGOOGLEActionPerformed
        // TODO add your handling code here:
        hyperlink(alllinks[1]); //when user clicks this button, direct them to this link of the array
    }//GEN-LAST:event_BTNGOOGLEActionPerformed

    private void BTNSICKKIDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSICKKIDSActionPerformed
        // TODO add your handling code here:
        hyperlink(alllinks[2]); //when user clicks this button, direct them to this link of the array
    }//GEN-LAST:event_BTNSICKKIDSActionPerformed

    private void BTNWILDLIFEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNWILDLIFEActionPerformed
        // TODO add your handling code here:
        hyperlink(alllinks[3]); //when user clicks this button, direct them to this link of the array
    }//GEN-LAST:event_BTNWILDLIFEActionPerformed

    private void BTNUOFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNUOFTActionPerformed
        // TODO add your handling code here:
        hyperlink(alllinks[4]); //when user clicks this button, direct them to this link of the array
    }//GEN-LAST:event_BTNUOFTActionPerformed

    private void BTNQUEENSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNQUEENSActionPerformed
        // TODO add your handling code here:
        hyperlink(alllinks[5]); //when user clicks this button, direct them to this link of the array
    }//GEN-LAST:event_BTNQUEENSActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(intern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(intern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(intern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(intern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new intern().setVisible(true);
            } 
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNGOOGLE;
    private javax.swing.JButton BTNQUEENS;
    private javax.swing.JButton BTNRBC;
    private javax.swing.JButton BTNSICKKIDS;
    private javax.swing.JButton BTNUOFT;
    private javax.swing.JButton BTNWILDLIFE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
