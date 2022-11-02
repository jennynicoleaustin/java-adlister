package com.codeup.adlister.dao;

import com.codeup.adlister.Config;

import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao;

    public static Ads getAdsDao() throws SQLException {
        if (adsDao == null) {
            Config config = new Config();
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
    public static Users getUsersDao() throws SQLException {
        if (usersDao == null) {
            Config config = new Config();
            usersDao = new MySQLUsersDao(config);
        }
        return usersDao;
    }
}
