package com.loginandregistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

    String sql = "select * from login where userName=? and password=?";
    String url = "jdbc:mysql://localhost:3306/abc";
    String username = "root";
    String passwords = "1211";

    public boolean check(String userName, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, passwords);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
                return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
