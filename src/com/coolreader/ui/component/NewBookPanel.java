/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.ui.component;

import com.coolreader.entity.Book;
import com.coolreader.service.BookService;
import com.coolreader.ui.screen.ListBookScreen;
import com.coolreader.ui.screen.Window;
import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class NewBookPanel extends javax.swing.JPanel {

    private final BookService bookService = new BookService();

    public NewBookPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textContent = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textTitle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textAuthor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textPublisher = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textCategory = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textBrief = new javax.swing.JTextArea();
        btnSave = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(55, 38, 91));
        btnBack.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons-back-filled-30.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setOpaque(true);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBackMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBackMouseReleased(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 60));

        textContent.setColumns(20);
        textContent.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        textContent.setLineWrap(true);
        textContent.setRows(5);
        textContent.setWrapStyleWord(true);
        textContent.setCaretPosition(0);
        textContent.setMargin(new java.awt.Insets(30, 50, 30, 50));
        textContent.setSelectionColor(new java.awt.Color(55, 38, 91));
        jScrollPane1.setViewportView(textContent);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 700, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("Title");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));
        jPanel1.add(textTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 280, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Author");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 30));
        jPanel1.add(textAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 280, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Publisher");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 30));
        jPanel1.add(textPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 280, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Category");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, 30));
        jPanel1.add(textCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 280, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Brief");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 100, 30));

        textBrief.setColumns(20);
        textBrief.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        textBrief.setLineWrap(true);
        textBrief.setRows(5);
        textBrief.setWrapStyleWord(true);
        textBrief.setSelectionColor(new java.awt.Color(55, 38, 91));
        jScrollPane2.setViewportView(textBrief);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 280, 120));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 300, 450));

        btnSave.setBackground(new java.awt.Color(55, 38, 91));
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSaveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSaveMouseReleased(evt);
            }
        });
        btnSave.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-save-as-30.png"))); // NOI18N
        btnSave.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Save");
        btnSave.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 10, -1, 40));

        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 140, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        Window window = Window.getInstance();
        window.getContentPane().removeAll();
        window.add(new ListBookScreen(), new AbsoluteConstraints(0, 0, Window.WIDTH, Window.HEIGHT));
        window.revalidate();
        window.repaint();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        Book book = new Book();
        if (!textTitle.getText().equals("")) {
            book.setTitle(textTitle.getText());
            book.setAuthor(textAuthor.getText());
            book.setPublisher(textPublisher.getText());
            book.setCategory(textCategory.getText());
            book.setBrief(textBrief.getText());
            book.setContent(textContent.getText());
            book.setCreatedDate(Date.valueOf(LocalDate.now()));
            book.setUpdatedDate(Date.valueOf(LocalDate.now()));
            if (bookService.createBook(book)) {
                Window.getInstance().getBookBuffer().addBook(book);
                JOptionPane.showMessageDialog(Window.getInstance(), "Saved.");
            } else {
                JOptionPane.showMessageDialog(Window.getInstance(), "An error occur.");
            }
            Window window = Window.getInstance();
            window.getContentPane().removeAll();
            window.add(new ListBookScreen(), new AbsoluteConstraints(0, 0, Window.WIDTH, Window.HEIGHT));
            window.revalidate();
            window.repaint();
        } else {
            JOptionPane.showMessageDialog(Window.getInstance(), "Enter book title.");
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        btnBack.setBackground(new Color(121, 110, 145));;
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setBackground(new Color(55, 38, 91));
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMousePressed
        btnBack.setBackground(new Color(55, 38, 91));
    }//GEN-LAST:event_btnBackMousePressed

    private void btnBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseReleased
        btnBack.setBackground(new Color(121, 110, 145));;
    }//GEN-LAST:event_btnBackMouseReleased

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        btnSave.setBackground(new Color(121, 110, 145));;
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        btnSave.setBackground(new Color(55, 38, 91));
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMousePressed
        btnSave.setBackground(new Color(55, 38, 91));
    }//GEN-LAST:event_btnSaveMousePressed

    private void btnSaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseReleased
        btnSave.setBackground(new Color(121, 110, 145));;
    }//GEN-LAST:event_btnSaveMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JPanel btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField textAuthor;
    private javax.swing.JTextArea textBrief;
    private javax.swing.JTextField textCategory;
    private javax.swing.JTextArea textContent;
    private javax.swing.JTextField textPublisher;
    private javax.swing.JTextField textTitle;
    // End of variables declaration//GEN-END:variables
}
