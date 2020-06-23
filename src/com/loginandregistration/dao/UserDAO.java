package com.loginandregistration.dao;

import java.sql.*;

public class UserDAO {

    String queryStatement = "select * from registration where emailId=? and password=?";
    String url = "jdbc:mysql://localhost:3306/database1";
    String username = "root";
    String passwords = "1211";
    String insertStatement = "insert into registration values (?, ?, ?, ?);";
    Connection connection = getConnection();

    public boolean check(String emailId, String password) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryStatement);
            preparedStatement.setString(1, emailId);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
                return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, username, passwords);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean addUserToDataBase(String username, String passwords, int userAge, String emailId){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertStatement);
            preparedStatement.setString(1, emailId);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, passwords);
            preparedStatement.setString(4, String.valueOf(userAge));
            return preparedStatement.executeUpdate()==1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
