/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.benjaminhalasz.gui;


import hu.benjaminhalasz.dao.DAOPerson;
import hu.benjaminhalasz.model.Application;
import hu.benjaminhalasz.model.Person;
import java.sql.Connection;

/**
 *
 * @author benjaminhalasz
 */
public class MainFrame extends javax.swing.JFrame {
    Application a;
    Person pe;
    private Connection con;

    /**
     * Creates new form Frame
     */
    public MainFrame() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        submissionButton = new javax.swing.JButton();
        listApplicantsButton = new javax.swing.JButton();
        listApplicationsButton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        submissionButton.setText("Submit New Application");
        submissionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submissionButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(submissionButton, gridBagConstraints);

        listApplicantsButton.setText("List Applicants");
        listApplicantsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listApplicantsButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(listApplicantsButton, gridBagConstraints);

        listApplicationsButton.setText("List Applications");
        listApplicationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listApplicationsButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(listApplicationsButton, gridBagConstraints);

        exitbutton.setText("Exit");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        getContentPane().add(exitbutton, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submissionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submissionButtonActionPerformed
        new FrameRegistrationForm().go();
        new FramePersonTable().setVisible(false);
    }//GEN-LAST:event_submissionButtonActionPerformed

    private void listApplicantsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listApplicantsButtonActionPerformed
        new FramePersonTable().setVisible(true);
      //  setVisible(false);
        
    }//GEN-LAST:event_listApplicantsButtonActionPerformed

    private void listApplicationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listApplicationsButtonActionPerformed
  
     new FrameApplicationTable().setVisible(true);
     

        
        
    }//GEN-LAST:event_listApplicationsButtonActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
       System.exit(0);
    }//GEN-LAST:event_exitbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbutton;
    private javax.swing.JButton listApplicantsButton;
    private javax.swing.JButton listApplicationsButton;
    private javax.swing.JButton submissionButton;
    // End of variables declaration//GEN-END:variables
}
