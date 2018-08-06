/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.ui.screen;

import com.coolreader.service.BookService;
import com.coolreader.ui.component.BookBuffer;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Window extends JFrame {

    private BookBuffer bookBuffer = new BookBuffer();

    public static int WIDTH = 1050, HEIGHT = 700;

    private Screen previousScreen;

    private static Window window;

    private Window() {
        BookService bookService = new BookService();
        bookBuffer.setListBook(bookService.listAllBooks());
        bookBuffer.setMaxBookId(bookService.getMaxBookId());
        initComponents();
    }

    public static Window getInstance() {
        if (window == null) {
            window = new Window();
        }
        return window;
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cool Reader");
        setMinimumSize(new Dimension(1050, 700));
        setUndecorated(true);
        setPreferredSize(new Dimension(1050, 700));
        setResizable(false);
        setLocationRelativeTo(null);

        getContentPane().setLayout(new AbsoluteLayout());

        getContentPane().add(new LoginScreen(), new AbsoluteConstraints(0, 0, Window.WIDTH, Window.HEIGHT));

    }

    public static void render(JPanel panel) {
        window.getContentPane().removeAll();
        window.add(panel, new AbsoluteConstraints(0, 0, Window.WIDTH, Window.HEIGHT));
        window.revalidate();
        window.repaint();
    }

    public Screen getPreviousScreen() {
        return previousScreen;
    }

    public void setPreviousScreen(Screen previousScreen) {
        this.previousScreen = previousScreen;
    }

    public BookBuffer getBookBuffer() {
        return bookBuffer;
    }

    public void setBookBuffer(BookBuffer bookBuffer) {
        this.bookBuffer = bookBuffer;
    }

}
