/**
 * @author Anh Le Minh Tuan
 * @facebook fb.com/anh.leminhtuanfb
 * @date Jul 30, 2018
 */
package com.coolreader.ui.component;

import com.coolreader.ui.screen.Window;
import com.coolreader.service.AccountService;
import com.coolreader.service.BookService;
import com.coolreader.ui.screen.ListBookScreen;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class LoginPanel extends JPanel {

    private JButton btnLogin;
    private JLabel lbLogo;
    private JLabel lbPassword;
    private JLabel lbTitle;
    private JLabel lbUsername;
    private JPasswordField txtfPassword;
    private JTextField txtfUsername;

    public LoginPanel() {
        initComponents();
    }

    private void initComponents() {
        lbLogo = new JLabel();
        lbTitle = new JLabel();
        txtfUsername = new JTextField();
        lbPassword = new JLabel();
        lbUsername = new JLabel();
        txtfPassword = new JPasswordField();
        btnLogin = new JButton();

        this.setBackground(new Color(251, 251, 251));
        this.setLayout(new AbsoluteLayout());
        lbLogo.setIcon(new ImageIcon(getClass().getResource("/assets/icon1.jpg")));
        this.add(lbLogo, new AbsoluteConstraints(30, 10, 330, 270));
        lbTitle.setFont(new java.awt.Font("VNI-Lithos", 1, 48)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(64, 64, 64));
        lbTitle.setText("Cool Reader");
        this.add(lbTitle, new AbsoluteConstraints(370, 90, -1, -1));

        txtfUsername.setFont(new Font("Consolas", 0, 12)); // NOI18N
        txtfUsername.setToolTipText("");
        txtfUsername.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        txtfUsername.setMargin(new Insets(2, 5, 2, 2));
        txtfUsername.setSelectionColor(new Color(194, 6, 5));
        this.add(txtfUsername, new AbsoluteConstraints(390, 280, 200, 30));

        lbPassword.setFont(new Font("Consolas", 1, 12)); // NOI18N
        lbPassword.setText("Password");
        this.add(lbPassword, new AbsoluteConstraints(390, 320, -1, -1));

        lbUsername.setFont(new Font("Consolas", 1, 12)); // NOI18N
        lbUsername.setText("Username");
        this.add(lbUsername, new AbsoluteConstraints(390, 260, -1, -1));

        txtfPassword.setCursor(new Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtfPassword.setMargin(new Insets(2, 5, 2, 2));
        txtfPassword.setSelectionColor(new Color(194, 6, 5));
        this.add(txtfPassword, new AbsoluteConstraints(390, 340, 200, 30));

        btnLogin.setBackground(new Color(144, 200, 246));
        btnLogin.setFont(new Font("Consolas", 1, 12)); // NOI18N
        btnLogin.setIcon(new ImageIcon(getClass().getResource("/assets/login.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        this.add(btnLogin, new AbsoluteConstraints(440, 390, 100, 35));

    }

    private void btnLoginActionPerformed(ActionEvent evt) {
        Window window = Window.getInstance();
        if (AccountService.getInstance().login(txtfUsername.getText(), String.valueOf(txtfPassword.getPassword()))) {
            //
            window.getContentPane().removeAll();
            window.add(new ListBookScreen(), new AbsoluteConstraints(0, 0, Window.WIDTH, Window.HEIGHT));
            window.revalidate();
            window.repaint();
        } else {
            JOptionPane.showMessageDialog(window, "Username or password is incorrect.");
        }
    }
}
