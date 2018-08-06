/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.ui.screen;

public class NewBookScreen extends javax.swing.JPanel {

    public NewBookScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerBar1 = new com.coolreader.ui.component.HeaderBar();
        newBookPanel1 = new com.coolreader.ui.component.NewBookPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(headerBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 50));
        add(newBookPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1050, 650));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.coolreader.ui.component.HeaderBar headerBar1;
    private com.coolreader.ui.component.NewBookPanel newBookPanel1;
    // End of variables declaration//GEN-END:variables
}
