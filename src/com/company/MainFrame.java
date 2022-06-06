package com.company;

import com.company.loginRegistration.Login;
import com.company.loginRegistration.MainMenu;
import com.company.loginRegistration.Registration;

import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {
    public static MainMenu mainMenu;
    public static Registration registration;
    public static Login login;

    public MainFrame(){
        setSize(500, 400);
        setLocationRelativeTo(null);

        setTitle("Internet shop");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        mainMenu = new MainMenu();
        mainMenu.setLocation(0, 0);
        add(mainMenu);

        registration = new Registration();
        registration.setLocation(0, 0);
        registration.setVisible(false);
        add(registration);

        login = new Login();
        login.setLocation(0, 0);
        login.setVisible(false);
        add(login);

    }
}
