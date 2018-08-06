/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.ui.component;

import com.coolreader.entity.Account;
import com.coolreader.entity.Book;
import com.coolreader.entity.Bookcase;
import com.coolreader.service.AccountService;
import com.coolreader.service.BookService;
import com.coolreader.service.BookcaseService;
import com.coolreader.ui.screen.NewBookScreen;
import com.coolreader.ui.screen.ReadBookScreen;
import com.coolreader.ui.screen.Screen;
import com.coolreader.ui.screen.UpdateBookScreen;
import com.coolreader.ui.screen.Window;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class ListBookPanel extends javax.swing.JPanel {

    private final BookService bookService = new BookService();
    private final BookcaseService bookcaseService = new BookcaseService();

    private final Account account = AccountService.getInstance().getCurrentAccount();
    private final Bookcase bookcase;

    public ListBookPanel() {
        initComponents();
        //
        bookcase = AccountService.getInstance().getBookcase();
        //init data table
        //List<Book> list = bookService.listAllBooks();
        initTableData(Window.getInstance().getBookBuffer().getListBook());
    }

    public void initTableData(List<Book> list) {
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
        tableBooks.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableBooks = new javax.swing.JTable();
        btnAddToBookcase = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRead = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textFieldSearch = new javax.swing.JTextField();
        comboboxFields = new javax.swing.JComboBox<>();
        btnRemove = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnNew = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btnAddToBookcase.setBackground(new java.awt.Color(55, 38, 91));
        btnAddToBookcase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddToBookcase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddToBookcaseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddToBookcaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddToBookcaseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddToBookcaseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAddToBookcaseMouseReleased(evt);
            }
        });
        btnAddToBookcase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons-add-to-book-case.png"))); // NOI18N
        btnAddToBookcase.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, 40, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html>Add<br/>to bookcase</html");
        btnAddToBookcase.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 6, 80, 30));
        jLabel3.getAccessibleContext().setAccessibleName("");

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

        btnAddToBookcase.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 140, 50));

        add(btnAddToBookcase, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, 130, 40));

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
        btnRead.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 8, 40, 30));

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

        add(btnRead, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 130, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Search");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 100, 30));

        textFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSearchKeyReleased(evt);
            }
        });
        add(textFieldSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 200, 30));

        comboboxFields.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        comboboxFields.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "By Title", "By Author", "By Category" }));
        add(comboboxFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 90, 30));

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
        if(!account.getRole().getAuthority().equals("Admin")) btnRemove.hide();

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-delete-filled-30.png"))); // NOI18N
        btnRemove.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel11.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Remove");
        btnRemove.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 7, 70, 30));

        jPanel5.setBackground(new java.awt.Color(55, 38, 91));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\MyPC\\Desktop\\CoolReader\\icons-read-book-1.png")); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Read");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 13, 80, 30));

        btnRemove.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 140, 50));

        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 130, 40));

        btnUpdate.setBackground(new java.awt.Color(55, 38, 91));
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUpdateMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUpdateMouseReleased(evt);
            }
        });
        btnUpdate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        if(!account.getRole().getAuthority().equals("Admin")) btnUpdate.hide();

        jLabel14.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-edit-30.png"))); // NOI18N
        btnUpdate.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel15.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Update");
        btnUpdate.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 7, 70, 30));

        jPanel6.setBackground(new java.awt.Color(55, 38, 91));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\MyPC\\Desktop\\CoolReader\\icons-read-book-1.png")); // NOI18N
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        jLabel17.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Read");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 13, 80, 30));

        btnUpdate.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 140, 50));

        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 130, 40));

        btnNew.setBackground(new java.awt.Color(55, 38, 91));
        btnNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNewMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNewMouseReleased(evt);
            }
        });
        btnNew.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        if(!account.getRole().getAuthority().equals("Admin")) btnNew.hide();

        jLabel18.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-new-30.png"))); // NOI18N
        btnNew.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel19.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("New");
        btnNew.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 7, 70, 30));

        jPanel7.setBackground(new java.awt.Color(55, 38, 91));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\MyPC\\Desktop\\CoolReader\\icons-read-book-1.png")); // NOI18N
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        jLabel21.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Read");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 13, 80, 30));

        btnNew.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 140, 50));

        add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 130, 40));
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnAddToBookcaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToBookcaseMouseEntered
        btnAddToBookcase.setBackground(new Color(121, 110, 145));;
    }//GEN-LAST:event_btnAddToBookcaseMouseEntered

    private void btnAddToBookcaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToBookcaseMouseExited
        btnAddToBookcase.setBackground(new Color(55, 38, 91));
    }//GEN-LAST:event_btnAddToBookcaseMouseExited

    private void btnAddToBookcaseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToBookcaseMousePressed
        btnAddToBookcase.setBackground(new Color(55, 38, 91));
    }//GEN-LAST:event_btnAddToBookcaseMousePressed

    private void btnAddToBookcaseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToBookcaseMouseReleased
        btnAddToBookcase.setBackground(new Color(121, 110, 145));;
    }//GEN-LAST:event_btnAddToBookcaseMouseReleased

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
//            book = bookService.getBookById(id);
            book = Window.getInstance().getBookBuffer().getBookById(id);
            //handler view
            window.getContentPane().removeAll();
            window.add(new ReadBookScreen(book), new AbsoluteConstraints(0, 0, Window.WIDTH, Window.HEIGHT));
            window.revalidate();
            window.repaint();
            window.setPreviousScreen(Screen.ListBookScreen);
        }

    }//GEN-LAST:event_btnReadMouseClicked

    private void textFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSearchKeyReleased
        String search = textFieldSearch.getText();
        int select = comboboxFields.getSelectedIndex();
        switch (select) {
            case 0:
//                initTableData(bookService.getBookByTitle(search + '%'));
                initTableData(Window.getInstance().getBookBuffer().getBooksByTitle(search));
                break;
            case 1:
//                initTableData(bookService.getBookByAuthor(search + '%'));
                initTableData(Window.getInstance().getBookBuffer().getBooksByAuthor(search));
                break;
            case 2:
//                initTableData(bookService.getBookByCategory(search + '%'));
                initTableData(Window.getInstance().getBookBuffer().getBooksByCategory(search));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_textFieldSearchKeyReleased

    private void btnAddToBookcaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToBookcaseMouseClicked
        Window window = Window.getInstance();
        int selectedRowCount = tableBooks.getSelectedRowCount();
        if (selectedRowCount == 0) {
            JOptionPane.showMessageDialog(window, "You need select a book.");
        } else {
            int selectedRow = tableBooks.getSelectedRow();
            int bookId = (int) tableBooks.getValueAt(selectedRow, 0);
            if (!bookcaseService.addBookToBookcaseById(bookcase.getId(), bookId)) {
                JOptionPane.showMessageDialog(window, "This book is already in your bookcase.");
            } else {
                Book book = Window.getInstance().getBookBuffer().getBookById(bookId);
                bookcase.addABook(book);
                JOptionPane.showMessageDialog(window, "Add success.");
            }
        }
    }//GEN-LAST:event_btnAddToBookcaseMouseClicked

    private void btnRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMouseClicked
        Window window = Window.getInstance();
        int selectedRowCount = tableBooks.getSelectedRowCount();
        if (selectedRowCount == 0) {
            JOptionPane.showMessageDialog(window, "You need select a book.");
        } else {
            int selectedRow = tableBooks.getSelectedRow();
            int bookId = (int) tableBooks.getValueAt(selectedRow, 0);
            if (bookService.deleteBookById(bookId)) {
                //List<Book> list = bookService.listAllBooks();
                Book book = new Book();
                book.setId(bookId);
                window.getBookBuffer().deleteBook(book);

                initTableData(window.getBookBuffer().getListBook());
                JOptionPane.showMessageDialog(window, "Deleted.");
            } else {
                JOptionPane.showMessageDialog(window, "An error occur.");
            }
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

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        Window window = Window.getInstance();
        int selectedRowCount = tableBooks.getSelectedRowCount();
        if (selectedRowCount == 0) {
            JOptionPane.showMessageDialog(window, "You need select a book.");
        } else {
            int selectedRow = tableBooks.getSelectedRow();
            int bookId = (int) tableBooks.getValueAt(selectedRow, 0);
            //Book book = bookService.getBookById(bookId);
            Book book = Window.getInstance().getBookBuffer().getBookById(bookId);
            if (book != null) {
                window.getContentPane().removeAll();
                window.add(new UpdateBookScreen(book), new AbsoluteConstraints(0, 0, Window.WIDTH, Window.HEIGHT));
                window.revalidate();
                window.repaint();
            }
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setBackground(new Color(121, 110, 145));;
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setBackground(new Color(55, 38, 91));
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnUpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMousePressed
        btnUpdate.setBackground(new Color(55, 38, 91));
    }//GEN-LAST:event_btnUpdateMousePressed

    private void btnUpdateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseReleased
        btnUpdate.setBackground(new Color(121, 110, 145));;
    }//GEN-LAST:event_btnUpdateMouseReleased

    private void btnNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseClicked
        Window window = Window.getInstance();
        window.getContentPane().removeAll();
        window.add(new NewBookScreen(), new AbsoluteConstraints(0, 0, Window.WIDTH, Window.HEIGHT));
        window.revalidate();
        window.repaint();
    }//GEN-LAST:event_btnNewMouseClicked

    private void btnNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseEntered
        btnNew.setBackground(new Color(121, 110, 145));;
    }//GEN-LAST:event_btnNewMouseEntered

    private void btnNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseExited
        btnNew.setBackground(new Color(55, 38, 91));
    }//GEN-LAST:event_btnNewMouseExited

    private void btnNewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMousePressed
        btnNew.setBackground(new Color(55, 38, 91));
    }//GEN-LAST:event_btnNewMousePressed

    private void btnNewMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseReleased
        btnNew.setBackground(new Color(121, 110, 145));;
    }//GEN-LAST:event_btnNewMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAddToBookcase;
    private javax.swing.JPanel btnNew;
    private javax.swing.JPanel btnRead;
    private javax.swing.JPanel btnRemove;
    private javax.swing.JPanel btnUpdate;
    private javax.swing.JComboBox<String> comboboxFields;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBooks;
    private javax.swing.JTextField textFieldSearch;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel model;
}
