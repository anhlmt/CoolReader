/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.ui.screen;

import com.coolreader.entity.Book;

public class ReadBookScreen extends javax.swing.JPanel {

    private Book book;

    public ReadBookScreen(Book book) {
        this.book = book;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerBar1 = new com.coolreader.ui.component.HeaderBar();
        readBookTitle1 = new com.coolreader.ui.component.ReadBookTitle(book);
        readBookPanel1 = new com.coolreader.ui.component.ReadBookPanel(book);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(headerBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 50));
        add(readBookTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1050, 50));
        add(readBookPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1050, 600));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.coolreader.ui.component.HeaderBar headerBar1;
    private com.coolreader.ui.component.ReadBookPanel readBookPanel1;
    private com.coolreader.ui.component.ReadBookTitle readBookTitle1;
    // End of variables declaration//GEN-END:variables
}
