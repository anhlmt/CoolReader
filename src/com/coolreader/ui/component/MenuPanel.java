/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.ui.component;

import com.coolreader.ui.screen.Window;
import com.coolreader.ui.screen.BookcaseScreen;
import com.coolreader.ui.screen.ListBookScreen;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class MenuPanel extends javax.swing.JPanel {

    private TabButton tabBook, tabBookcase, tabProfile, currTab;
    private JSeparator sep1, sep2;

    public MenuPanel() {
        initComponents();
    }

    private void initComponents() {
        setBackground(new Color(251, 251, 251));
        setMaximumSize(new Dimension(Window.WIDTH, 150));
        setMinimumSize(new Dimension(Window.WIDTH, 150));
        setLayout(new AbsoluteLayout());

        tabBook = new TabButton();
        tabBookcase = new TabButton();
        tabProfile = new TabButton();
        currTab = tabBook;
        sep1 = new JSeparator();
        sep2 = new JSeparator();

        sep1.setOrientation(SwingConstants.VERTICAL);
        add(sep1, new AbsoluteConstraints(350, 50, 10, 50));

        sep2.setOrientation(SwingConstants.VERTICAL);
        add(sep2, new AbsoluteConstraints(700, 50, 10, 50));

        tabBook.setIcon(new ImageIcon(getClass().getResource("/assets/icons-reading-book.png")));
        tabBook.setTitle("Book");
        tabBook.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                tabBookMousePressed(evt);
            }

            @Override
            public void mouseReleased(MouseEvent evt) {
                tabBookMouseReleased(evt);
            }
        });
        add(tabBook, new AbsoluteConstraints(0, 0, 351, 150));

        tabBookcase.setIcon(new ImageIcon(getClass().getResource("/assets/icons-book-shelf.png")));
        tabBookcase.setTitle("Bookcase");
        tabBookcase.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                tabBookcaseMousePressed(evt);
            }

            @Override
            public void mouseReleased(MouseEvent evt) {
                tabBookcaseMouseReleased(evt);
            }
        });
        add(tabBookcase, new AbsoluteConstraints(349, 0, 352, 150));
        tabProfile.setIcon(new ImageIcon(getClass().getResource("/assets/icons-admin.png")));
        tabProfile.setTitle("Profile");
        tabProfile.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                tabProfileMousePressed(evt);
            }

            @Override
            public void mouseReleased(MouseEvent evt) {
                tabProfileMouseReleased(evt);
            }
        });
        add(tabProfile, new AbsoluteConstraints(699, 0, 350, 150));
    }

    private void tabBookMousePressed(MouseEvent evt) {
        //graphics handler
        zoomIn(tabBook, tabBook.getX(), tabBook.getY(), tabBook.getWidth(), tabBook.getHeight(), 2);
        //logic handler
    }

    private void tabBookMouseReleased(MouseEvent evt) {
        Window window = Window.getInstance();
        //graphics handler
        zoomOut(tabBook, tabBook.getX(), tabBook.getY(), tabBook.getWidth(), tabBook.getHeight(), 2);
        //logic handler
        window.getContentPane().removeAll();
        window.add(new ListBookScreen(), new AbsoluteConstraints(0, 0, Window.WIDTH, Window.HEIGHT));
        window.revalidate();
        window.repaint();
    }

    private void tabBookcaseMousePressed(MouseEvent evt) {
        //graphics handler
        zoomIn(tabBookcase, tabBookcase.getX(), tabBookcase.getY(), tabBookcase.getWidth(), tabBookcase.getHeight(), 2);
        //logic handler
    }

    private void tabBookcaseMouseReleased(MouseEvent evt) {
        Window window = Window.getInstance();
        //graphics handler
        zoomOut(tabBookcase, tabBookcase.getX(), tabBookcase.getY(), tabBookcase.getWidth(), tabBookcase.getHeight(), 2);
        //logic handler
        window.getContentPane().removeAll();
        window.add(new BookcaseScreen(), new AbsoluteConstraints(0, 0, Window.WIDTH, Window.HEIGHT));
        window.revalidate();
        window.repaint();
    }

    private void tabProfileMousePressed(MouseEvent evt) {
        //graphics handler
        zoomIn(tabProfile, tabProfile.getX(), tabProfile.getY(), tabProfile.getWidth(), tabProfile.getHeight(), 2);
        //logic handler
    }

    private void tabProfileMouseReleased(MouseEvent evt) {
        Window window = Window.getInstance();
        //graphics handler
        zoomOut(tabProfile, tabProfile.getX(), tabProfile.getY(), tabProfile.getWidth(), tabProfile.getHeight(), 2);
//        currTab.unHighlight();
//        currTab = tabProfile;
//        currTab.highlight();
        JOptionPane.showMessageDialog(window, "Coming soon... xD");
        //logic handler
    }

    private void zoomIn(Component component, int x, int y, int w, int h, int deth) {
        remove(component);
        add(component, new AbsoluteConstraints(x + deth, y + deth, w - deth * 2, h - deth * 2));
        Window.getInstance().revalidate();
        Window.getInstance().repaint();
    }

    private void zoomOut(Component component, int x, int y, int w, int h, int deth) {
        remove(component);
        add(component, new AbsoluteConstraints(x - deth, y - deth, w + deth * 2, h + deth * 2));
        Window.getInstance().revalidate();
        Window.getInstance().repaint();
    }

    public void setActiveTab(int tabButton) {
        currTab.unHighlight();
        switch (tabButton) {
            case 1:
                currTab = tabBook;
                break;
            case 2:
                currTab = tabBookcase;
                break;
            case 3:
                currTab = tabProfile;
                break;
            default:
                break;
        }
        currTab.highlight();
    }
}
