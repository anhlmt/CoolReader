/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.ui.component;

import com.coolreader.entity.Book;

public class ReadBookPanel extends javax.swing.JPanel {

    private final Book book;

    public ReadBookPanel(Book book) {
        this.book = book;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaBookContent = new javax.swing.JTextArea();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textAreaBookContent.setEditable(false);
        textAreaBookContent.setColumns(20);
        textAreaBookContent.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        textAreaBookContent.setLineWrap(true);
        textAreaBookContent.setRows(5);
        textAreaBookContent.setText(book.getContent());
        textAreaBookContent.setWrapStyleWord(true);
        textAreaBookContent.setCaretPosition(0);
        textAreaBookContent.setMargin(new java.awt.Insets(30, 50, 30, 50));
        textAreaBookContent.setSelectionColor(new java.awt.Color(55, 38, 91));
        jScrollPane1.setViewportView(textAreaBookContent);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 750, 540));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaBookContent;
    // End of variables declaration//GEN-END:variables
}
