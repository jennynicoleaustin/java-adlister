package com.codeup.adlister.dao;

import com.codeup.adlister.Config;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;


public class MySQLUsersDao implements Users{
    private Connection connection = null;

    public MySQLUsersDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    }

    @Override
    public User findByUsername(String username) throws SQLException {
        String sql = "SELECT username FROM users where username = ? LIMIT 1";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, username);
        ResultSet rs = stmt.executeQuery();
        if(!rs.next()) {
            return null;
        }
        rs.next();
        User user = new User(
                rs.getLong("user_id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );
        return user;
    }
    @Override
    public Long insert(User user) throws SQLException {
        String sql = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, user.getUsername());
        stmt.setString(2, user.getEmail());
        stmt.setString(3, user.getPassword());
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        rs.next();
        return rs.getLong(1);
    }

}
