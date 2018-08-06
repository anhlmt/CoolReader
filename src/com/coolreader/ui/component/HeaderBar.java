/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.ui.component;

import com.coolreader.ui.screen.Window;
import com.coolreader.entity.Account;
import com.coolreader.service.AccountService;
import com.coolreader.ui.screen.LoginScreen;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class HeaderBar extends javax.swing.JPanel {

    private int mousePressX, mousePressY;

    public HeaderBar() {
        initComponents();
        Account account = AccountService.getInstance().getCurrentAccount();
        if (account == null) {
            lbHeaderTitle.setText("");
            lbLogout.setText("");
        } else {
            lbHeaderTitle.setText("Hi, " + account.getUsername() + ".");
            lbLogout.setText("<HTML><U>Logout</U></HTML>");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbHeaderTitle = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        lbExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(55, 38, 91));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbHeaderTitle.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lbHeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbHeaderTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbHeaderTitle.setText("Hi, AnhLMT.");
        add(lbHeaderTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 12, 500, 25));

        lbLogout.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbLogout.setForeground(new java.awt.Color(255, 255, 255));
        lbLogout.setText("<HTML><U>Logout</U></HTML>");
        lbLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbLogoutMouseExited(evt);
            }
        });
        add(lbLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, 30));

        lbExit.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lbExit.setForeground(new java.awt.Color(255, 255, 255));
        lbExit.setText("X");
        lbExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
        });
        add(lbExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 20, -1));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("@beta v1.0");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 20));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cool Reader");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lbLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseEntered
        lbLogout.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
    }//GEN-LAST:event_lbLogoutMouseEntered

    private void lbLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseExited
        lbLogout.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
    }//GEN-LAST:event_lbLogoutMouseExited

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbExitMouseClicked

    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        AccountService.getInstance().logout();
        Window window = Window.getInstance();
        window.getContentPane().removeAll();
        window.add(new LoginScreen(), new AbsoluteConstraints(0, 0, Window.WIDTH, Window.HEIGHT));
        window.revalidate();
        window.repaint();
    }//GEN-LAST:event_lbLogoutMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        mousePressX = evt.getX();
        mousePressY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Window window = Window.getInstance();
        window.setLocation(evt.getXOnScreen() - mousePressX, evt.getYOnScreen() - mousePressY);
    }//GEN-LAST:event_formMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbHeaderTitle;
    private javax.swing.JLabel lbLogout;
    // End of variables declaration//GEN-END:variables
}
