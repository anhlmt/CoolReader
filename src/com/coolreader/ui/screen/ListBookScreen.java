/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.ui.screen;

import com.coolreader.ui.component.MenuPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class ListBookScreen extends javax.swing.JPanel {

    private final MenuPanel menuPanel;

    public ListBookScreen() {
        initComponents();
        menuPanel = new MenuPanel();
        menuPanel.setActiveTab(1);
        add(menuPanel, new AbsoluteConstraints(0, 50, 1050, 500));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerBar1 = new com.coolreader.ui.component.HeaderBar();
        bookPanel1 = new com.coolreader.ui.component.ListBookPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(headerBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 50));
        add(bookPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1050, 500));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.coolreader.ui.component.ListBookPanel bookPanel1;
    private com.coolreader.ui.component.HeaderBar headerBar1;
    // End of variables declaration//GEN-END:variables
}
