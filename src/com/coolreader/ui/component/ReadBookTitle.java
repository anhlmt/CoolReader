/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.ui.component;

import com.coolreader.entity.Book;
import com.coolreader.ui.screen.BookcaseScreen;
import com.coolreader.ui.screen.ListBookScreen;
import com.coolreader.ui.screen.Screen;
import com.coolreader.ui.screen.Window;
import java.awt.Color;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class ReadBookTitle extends javax.swing.JPanel {

    private final Book book;

    public ReadBookTitle(Book book) {
        this.book = book;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBookTitle = new javax.swing.JLabel();
        lbBookAuthor = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();

        setBackground(new java.awt.Color(55, 38, 91));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbBookTitle.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lbBookTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbBookTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBookTitle.setText(book.getTitle());
        add(lbBookTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 0, 600, -1));

        lbBookAuthor.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        lbBookAuthor.setForeground(new java.awt.Color(255, 255, 255));
        lbBookAuthor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBookAuthor.setText(book.getAuthor());
        add(lbBookAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 25, 600, -1));

        btnBack.setBackground(new java.awt.Color(55, 38, 91));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons-back-filled-30.png"))); // NOI18N
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
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        Window window = Window.getInstance();
        window.getContentPane().removeAll();
        if (window.getPreviousScreen() == Screen.ListBookScreen) {
            window.add(new ListBookScreen(), new AbsoluteConstraints(0, 0, Window.WIDTH, Window.HEIGHT));
        }
        if (window.getPreviousScreen() == Screen.BookcaseScreen) {
            window.add(new BookcaseScreen(), new AbsoluteConstraints(0, 0, Window.WIDTH, Window.HEIGHT));
        }
        window.revalidate();
        window.repaint();
    }//GEN-LAST:event_btnBackMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel lbBookAuthor;
    private javax.swing.JLabel lbBookTitle;
    // End of variables declaration//GEN-END:variables
}
