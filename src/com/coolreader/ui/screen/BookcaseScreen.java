/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.ui.screen;

import com.coolreader.entity.Account;
import com.coolreader.entity.Bookcase;
import com.coolreader.service.AccountService;
import com.coolreader.service.BookcaseService;
import com.coolreader.ui.component.BookcasePanel;
import com.coolreader.ui.component.MenuPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class BookcaseScreen extends javax.swing.JPanel {

    private final MenuPanel menuPanel;
    private final BookcasePanel bookcasePanel;

    private final Bookcase bookcase;

    public BookcaseScreen() {
        initComponents();
        Account account = AccountService.getInstance().getCurrentAccount();
        //bookcase = new BookcaseService().getBookcaseByAccount(account);
        bookcase = AccountService.getInstance().getBookcase();
        System.out.println(bookcase.toString());
        menuPanel = new MenuPanel();
        bookcasePanel = new BookcasePanel(bookcase);

        menuPanel.setActiveTab(2);
        add(menuPanel, new AbsoluteConstraints(0, 50, 1050, 150));

        add(bookcasePanel, new AbsoluteConstraints(0, 200, Window.WIDTH, 500));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerBar1 = new com.coolreader.ui.component.HeaderBar();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(headerBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 50));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.coolreader.ui.component.HeaderBar headerBar1;
    // End of variables declaration//GEN-END:variables
}
