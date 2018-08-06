/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.ui.component;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;

public class TabButton extends javax.swing.JPanel {

    public TabButton() {
        initComponents();
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_title = new javax.swing.JLabel();
        lb_icon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(55, 38, 91));
        setMaximumSize(new java.awt.Dimension(350, 150));
        setMinimumSize(new java.awt.Dimension(350, 150));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_title.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        lb_title.setForeground(new java.awt.Color(255, 255, 255));
        lb_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_title.setText("Book");
        add(lb_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 193, 118));

        lb_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons-reading-book.png"))); // NOI18N
        lb_icon.setText("jLabel1");
        add(lb_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 20, 100, 118));
        lb_icon.getAccessibleContext().setAccessibleName("lb_logo");
    }// </editor-fold>//GEN-END:initComponents

    public void setIcon(ImageIcon icon) {
        lb_icon.setIcon(icon);
    }

    public void setTitle(String title) {
        lb_title.setText(title);
    }

    public void highlight() {
        setBackground(new Color(84, 69, 115));
    }

    public void unHighlight() {
        setBackground(new Color(55, 38, 91));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_icon;
    private javax.swing.JLabel lb_title;
    // End of variables declaration//GEN-END:variables
}
