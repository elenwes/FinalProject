package com.company.loginRegistration;

import com.company.Main;
import com.company.users.Admin;
import com.company.users.Client;
import com.company.users.Seller;
import com.company.users.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Registration extends Container {
    public String[] type = {"Client", "Seller", "Admin"};
    public Registration(){
        setSize(500, 400);
        setLayout(null);

        JComboBox types = new JComboBox<>(type);
        types.setBounds(230, 5, 135, 20);
        add(types);


        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(80, 30, 100, 30);
        add(nameLabel);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(230, 30, 150, 30);
        add(nameTextField);

        JLabel surnameLabel = new JLabel("Surname: ");
        surnameLabel.setBounds(80, 60, 100, 30);
        add(surnameLabel);

        JTextField surnameTextField = new JTextField();
        surnameTextField.setBounds(230, 60, 150, 30);
        add(surnameTextField);

        JLabel numberLabel = new JLabel("Phone number: ");
        numberLabel.setBounds(80, 90, 100, 30);
        add(numberLabel);

        JTextField numberTextField = new JTextField();
        numberTextField.setBounds(230, 90, 150, 30);
        add(numberTextField);

        JLabel emailLabel = new JLabel("Email: ");
        emailLabel.setBounds(80, 120, 100, 30);
        add(emailLabel);

        JTextField emailTextField = new JTextField();
        emailTextField.setBounds(230, 120, 150, 30);
        add(emailTextField);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(80, 150, 100, 30);
        add(passwordLabel);

        JTextField passwordTextField = new JTextField();
        passwordTextField.setBounds(230, 150, 150, 30);
        add(passwordTextField);

        JLabel password2Label = new JLabel("Repeat password: ");
        password2Label.setBounds(80, 180, 130, 30);
        add(password2Label);

        JTextField password2TextField = new JTextField();
        password2TextField.setBounds(230, 180, 150, 30);
        add(password2TextField);

        JButton registrationButton = new JButton("Registration");
        registrationButton.setBounds(70, 250, 150, 30);
        add(registrationButton);

        JButton backButton = new JButton("Back to menu");
        backButton.setBounds(230, 250, 150, 30);
        add(backButton);

        JLabel error = new JLabel();
        error.setBounds(80, 220, 200, 30);
        add(error);

        registrationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User user;

                if (types.getSelectedItem().equals("Client")) {
                    user = new Client();
                } else if (types.getSelectedItem().equals("Seller")) {
                    user = new Seller();
//                } else if(types.getSelectedItem().equals("Admin")){
                } else {
                    user = new Admin();
                }

                user.setName(nameTextField.getText());
                user.setSurname(surnameTextField.getText());
                user.setNumber(numberTextField.getText());
                user.setEmail(emailTextField.getText());
                user.setPassword(passwordTextField.getText());
                user.setPassword2(password2TextField.getText());

                /*try {
                    UserRepo.addUser(user);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }*/

                Main.frame.registration.setVisible(false);
                Main.frame.mainMenu.setVisible(true);

            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.mainMenu.setVisible(true);
                Main.frame.registration.setVisible(false); //Menu to User or Manager
            }
        });
    }

}
