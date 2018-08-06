/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.ui.screen;

import com.coolreader.ui.component.LoginPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class LoginScreen extends javax.swing.JPanel {

    public LoginScreen() {
        initComponents();
        loginPanel = new LoginPanel();
        add(loginPanel, new AbsoluteConstraints(0, 50, 1050, 650));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerBar1 = new com.coolreader.ui.component.HeaderBar();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(headerBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 50));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.coolreader.ui.component.HeaderBar headerBar1;
    // End of variables declaration//GEN-END:variables
    private LoginPanel loginPanel;
}
