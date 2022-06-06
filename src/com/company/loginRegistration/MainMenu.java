package com.company.loginRegistration;

import com.company.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends Container {
    protected JButton loginButton;
    private JButton registerButton;

    private JButton logoutButton;

    private JButton userMenuButton;
    private JButton userProfileButton;

    public MainMenu(){
        setSize(500, 400);
        setLayout(null);


        loginButton = new JButton("Login");
        loginButton.setBounds(110, 100, 250, 35);
        add(loginButton);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.mainMenu.setVisible(false);
                Main.frame.login.setVisible(true);
            }
        });

        registerButton = new JButton("Registration");
        registerButton.setBounds(110, 150, 250, 35);
        add(registerButton);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.mainMenu.setVisible(false);
                Main.frame.registration.setVisible(true);
            }
        });
    }
}
