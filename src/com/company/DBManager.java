package com.company;

import com.company.users.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {

    public static final String url = "jdbs:postgresql::localhost/ProjectJava";
    public static final String user = "postgres";
    public static final String password = "postgres";
    public static Connection connection;

    public static void connect(){
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection to Postgresql server was successful ");
        }catch (Exception e){
            System.out.println("ERROR with connection");
            e.printStackTrace();
        }
    }
    //comment
    public static ArrayList<User> getAllUsers(){
        ArrayList<User> users = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "SELECT * FROM public.\"User\"");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Long email = resultSet.getLong("email");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String password = resultSet.getString("password");
                Integer cash = resultSet.getInt("cash");
                String number = resultSet.getString("number");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void addUser(User user){

    }

    public static User getUser(Long  email){
        return null;
    }

    public static void updateUser(User user){

    }

    public static void deleteUser(Long email){

    }
}
