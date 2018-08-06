/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.ui.component;

import com.coolreader.entity.Book;
import com.coolreader.entity.Bookcase;
import com.coolreader.service.AccountService;
import com.coolreader.service.BookService;
import com.coolreader.service.BookcaseService;
import com.coolreader.ui.screen.ReadBookScreen;
import com.coolreader.ui.screen.Screen;
import com.coolreader.ui.screen.Window;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class BookcasePanel extends javax.swing.JPanel {

    private final Bookcase bookcase;
    private final BookcaseService bookcaseService = new BookcaseService();
    private final BookService bookService = new BookService();

    public BookcasePanel(Bookcase bookcase) {
        this.bookcase = bookcase;
        initComponents();
        //init data table
        //List<Book> list = bookcaseService.viewBookcase(bookcase);
        List<Book> list = bookcase.getListBook();
        initTableData(list);
    }

    private void initTableData(List<Book> list) {
        Object[][] objects = new Object[list.size()][9];
        Book book = null;
        for (int i = 0; i < list.size(); i++) {
            book = list.get(i);
            objects[i][0] = book.getId();
            objects[i][1] = book.getTitle();
            objects[i][2] = book.getBrief();
            objects[i][3] = book.getAuthor();
            objects[i][4] = book.getPublisher();
            objects[i][5] = book.getCategory();
            objects[i][6] = book.getContent();
            objects[i][7] = book.getCreatedDate();
            objects[i][8] = book.getUpdatedDate();
        }
        model = new javax.swing.table.DefaultTableModel(
                objects,
                new String[]{
                    "ID", "Title", "Brief", "Author", "Publisher", "Category", "Content", "Created Date", "Updated Date"
                }
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        //model.fireTableDataChanged();
        tableBooks.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRemove = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBooks = new javax.swing.JTable();
        btnRead = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnClear = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textBookcaseName = new javax.swing.JLabel();
        btnEditName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRemove.setBackground(new java.awt.Color(55, 38, 91));
        btnRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemoveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRemoveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRemoveMouseReleased(evt);
            }
        });
        btnRemove.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-delete-filled-30.png"))); // NOI18N
        btnRemove.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel13.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Remove");
        btnRemove.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 8, 100, 30));

        jPanel5.setBackground(new java.awt.Color(55, 38, 91));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\MyPC\\Desktop\\CoolReader\\icons-read-book-1.png")); // NOI18N
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        jLabel15.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Read");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 13, 80, 30));

        btnRemove.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 140, 50));

        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 160, 40));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tableBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Title", "Brief", "Author", "Publisher", "Category", "Content", "Created Date", "Updated Date"
            }
        ));
        tableBooks.setRowHeight(30);
        tableBooks.setRowMargin(0);
        tableBooks.setSelectionBackground(new java.awt.Color(55, 38, 91));
        jScrollPane1.setViewportView(tableBooks);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 990, 340));

        btnRead.setBackground(new java.awt.Color(55, 38, 91));
        btnRead.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRead.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReadMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReadMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnReadMouseReleased(evt);
            }
        });
        btnRead.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons-read-book-1.png"))); // NOI18N
        btnRead.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Read");
        btnRead.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 8, 100, 30));

        jPanel4.setBackground(new java.awt.Color(55, 38, 91));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\MyPC\\Desktop\\CoolReader\\icons-read-book-1.png")); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Read");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 13, 80, 30));

        btnRead.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 140, 50));

        add(btnRead, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 160, 40));

        btnClear.setBackground(new java.awt.Color(55, 38, 91));
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClearMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnClearMouseReleased(evt);
            }
        });
        btnClear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-trash-30.png"))); // NOI18N
        btnClear.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Clear");
        btnClear.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 8, 90, 30));

        jPanel2.setBackground(new java.awt.Color(55, 38, 91));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\MyPC\\Desktop\\CoolReader\\icons-read-book-1.png")); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Read");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 13, 80, 30));

        btnClear.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 140, 50));

        add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 160, 40));

        textBookcaseName.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        textBookcaseName.setForeground(new java.awt.Color(55, 38, 91));
        textBookcaseName.setText(bookcase.getName());
        add(textBookcaseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        btnEditName.setBackground(new java.awt.Color(55, 38, 91));
        btnEditName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-edit-30.png"))); // NOI18N
        btnEditName.setToolTipText("Edit bookcase name");
        btnEditName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditName.setOpaque(true);
        btnEditName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditNameMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditNameMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEditNameMouseReleased(evt);
            }
        });
        add(btnEditName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnReadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReadMouseClicked
        Window window = Window.getInstance();
        Book book = null;
        //get select row
        int selectedRowCount = tableBooks.getSelectedRowCount();
        if (selectedRowCount > 1) {
            JOptionPane.showMessageDialog(window, "Too many book selected.");
        } else if (selectedRowCount == 0) {
            JOptionPane.showMessageDialog(window, "You need select a book.");
        } else {
            int selectedRow = tableBooks.getSelectedRow();
            int id = (int) tableBooks.getValueAt(selectedRow, 0);
            //book = bookService.getBookById(id);
            book = window.getBookBuffer().getBookById(id);

            //handler view
            window.getContentPane().removeAll();
            window.add(new ReadBookScreen(book), new AbsoluteConstraints(0, 0, Window.WIDTH, Window.HEIGHT));
            window.revalidate();
            window.repaint();
            window.setPreviousScreen(Screen.BookcaseScreen);
        }
    }//GEN-LAST:event_btnReadMouseClicked

    private void btnReadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReadMouseEntered
        btnRead.setBackground(new Color(121, 110, 145));;
    }//GEN-LAST:event_btnReadMouseEntered

    private void btnReadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReadMouseExited
        btnRead.setBackground(new Color(55, 38, 91));
    }//GEN-LAST:event_btnReadMouseExited

    private void btnReadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReadMousePressed
        btnRead.setBackground(new Color(55, 38, 91));
    }//GEN-LAST:event_btnReadMousePressed

    private void btnReadMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReadMouseReleased
        btnRead.setBackground(new Color(121, 110, 145));;
    }//GEN-LAST:event_btnReadMouseReleased

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        if (!bookcaseService.clearBookcaseById(bookcase.getId())) {
            JOptionPane.showMessageDialog(Window.getInstance(), "Có gì đâu mà xóa ><");
        }else{
            AccountService.getInstance().getBookcase().clearBooks();
        }
        //handler view
        //List<Book> list = bookcaseService.viewBookcase(bookcase);
        
        initTableData(AccountService.getInstance().getBookcase().getListBook());

    }//GEN-LAST:event_btnClearMouseClicked

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        btnClear.setBackground(new Color(121, 110, 145));;
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        btnClear.setBackground(new Color(55, 38, 91));
    }//GEN-LAST:event_btnClearMouseExited

    private void btnClearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMousePressed
        btnClear.setBackground(new Color(55, 38, 91));
    }//GEN-LAST:event_btnClearMousePressed

    private void btnClearMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseReleased
        btnClear.setBackground(new Color(121, 110, 145));;
    }//GEN-LAST:event_btnClearMouseReleased

    private void btnRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMouseClicked
        Window window = Window.getInstance();
        int selectedRowCount = tableBooks.getSelectedRowCount();
        if (selectedRowCount > 1) {
            JOptionPane.showMessageDialog(window, "Too many book selected.");
        } else if (selectedRowCount == 0) {
            JOptionPane.showMessageDialog(window, "You need select a book.");
        } else {
            int selectedRow = tableBooks.getSelectedRow();
            int id = (int) tableBooks.getValueAt(selectedRow, 0);
            bookcaseService.deleteBookFromBookcaseById(bookcase.getId(), id);
            
            Book book = new Book();
            book.setId(id);
            AccountService.getInstance().getBookcase().deleteABook(book);
            //handler view
            //List<Book> list = bookcaseService.viewBookcase(bookcase);
            List<Book> list = AccountService.getInstance().getBookcase().getListBook();
            initTableData(list);
        }
    }//GEN-LAST:event_btnRemoveMouseClicked

    private void btnRemoveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMouseEntered
        btnRemove.setBackground(new Color(121, 110, 145));;
    }//GEN-LAST:event_btnRemoveMouseEntered

    private void btnRemoveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMouseExited
        btnRemove.setBackground(new Color(55, 38, 91));
    }//GEN-LAST:event_btnRemoveMouseExited

    private void btnRemoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMousePressed
        btnRemove.setBackground(new Color(55, 38, 91));
    }//GEN-LAST:event_btnRemoveMousePressed

    private void btnRemoveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMouseReleased
        btnRemove.setBackground(new Color(121, 110, 145));;
    }//GEN-LAST:event_btnRemoveMouseReleased

    private void btnEditNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditNameMouseEntered
        btnEditName.setBackground(new Color(121, 110, 145));;
    }//GEN-LAST:event_btnEditNameMouseEntered

    private void btnEditNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditNameMouseExited
        btnEditName.setBackground(new Color(55, 38, 91));
    }//GEN-LAST:event_btnEditNameMouseExited

    private void btnEditNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditNameMousePressed
        btnEditName.setBackground(new Color(55, 38, 91));
    }//GEN-LAST:event_btnEditNameMousePressed

    private void btnEditNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditNameMouseReleased
        btnEditName.setBackground(new Color(121, 110, 145));;
    }//GEN-LAST:event_btnEditNameMouseReleased

    private void btnEditNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditNameMouseClicked
        String input = JOptionPane.showInputDialog(Window.getInstance(), "Enter bookcase name:", bookcase.getName());
        if (!input.equals("")) {
            bookcase.setName(input);
            textBookcaseName.setText(input);
            bookcaseService.updateBookcase(bookcase);
        }
    }//GEN-LAST:event_btnEditNameMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnClear;
    private javax.swing.JLabel btnEditName;
    private javax.swing.JPanel btnRead;
    private javax.swing.JPanel btnRemove;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBooks;
    private javax.swing.JLabel textBookcaseName;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel model;
}
