package com.codeup.adlister.dao;

import com.codeup.adlister.Config;
import com.codeup.adlister.models.Ad;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// TODO: 11/2/22 Refactor your MySQLAdsDao to use prepared statements. Test these changes and ensure everything still works.
public class MySQLAdsDao implements Ads {

private Connection connection = null;

    public MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    }
//    Your methods should retrieve ads from the database
    @Override
//    Do I need to refactor this to include a prepared stmt, if the statement does not include user input?
    public List<Ad> all() throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
        return createAdsFromRs(rs);
    }

//insert new ads into the database
    @Override
    public Long insert(Ad ad) throws SQLException {
        String sql = "INSERT INTO ads (user_id, title, description) VALUES (?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.setLong(1, ad.getUserId());
        stmt.setString(2, ad.getTitle());
        stmt.setString(3, ad.getDescription());
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        rs.next();
        return rs.getLong(1);
    }


    private Ad rsToAd (ResultSet rs) throws SQLException {
        return new Ad(
                rs.getLong("ad_id"),
                rs.getLong("user_id"),
                rs.getString("title"),
                rs.getString("description")
        );
    }

    private List<Ad> createAdsFromRs (ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(rsToAd(rs));
        }
        return ads;
    }

}
