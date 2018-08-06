/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.ui.screen;

import com.coolreader.entity.Book;

public class UpdateBookScreen extends javax.swing.JPanel {

    private final Book book;

    public UpdateBookScreen(Book book) {
        this.book = book;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerBar = new com.coolreader.ui.component.HeaderBar();
        editBookPanel = new com.coolreader.ui.component.EditBookPanel(book);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(headerBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 50));
        add(editBookPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1050, 650));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.coolreader.ui.component.EditBookPanel editBookPanel;
    private com.coolreader.ui.component.HeaderBar headerBar;
    // End of variables declaration//GEN-END:variables
}
