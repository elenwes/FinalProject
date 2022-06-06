package com.company.loginRegistration;

import com.company.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends Container {
    public Login(){
        setSize(500, 400);
        setLayout(null);

        JLabel emailLabel = new JLabel("Email: ");
        emailLabel.setBounds(80, 80, 100, 30);
        add(emailLabel);

        JTextField emailTextField = new JTextField();
        emailTextField.setBounds(230, 80, 150, 30);
        add(emailTextField);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(80, 130, 100, 30);
        add(passwordLabel);

        JTextField passwordTextField = new JTextField();
        passwordTextField.setBounds(230, 130, 150, 30);
        add(passwordTextField);

        JButton backButton = new JButton("Back to menu");
        backButton.setBounds(70, 200, 150, 30);
        add(backButton);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(230, 200, 150, 30);
        add(loginButton);

        JLabel error = new JLabel();
        error.setBounds(80, 165, 180, 30);
        add(error);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailTextField.getText();
                String password = passwordTextField.getText();

                /*User user = UserRepo.getUserByEmail(email);

                if (user == null) {
                    error.setText("Email is incorrect!");
                } else if (!user.verifyPassword(password)) {
                    error.setText("Email or password incorrect!");
                } else {
                    Main.frame.login.setVisible(false);
                    Main.frame.mainMenu.setVisible(true);

                    GlobalStates.auth.setAuth(true, user);
                }*/
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.mainMenu.setVisible(true);
                Main.frame.login.setVisible(false);
            }
        });
    }
}
