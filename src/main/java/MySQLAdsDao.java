import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//Create a class named MySQLAdsDao that implements the Ads interface
//
//This class should have a private instance property named connection of type Connection that is initialized in the constructor
// Define your constructor so that it accepts an instance of your Config class so that it can obtain the database credentials.
//Implement the methods in the Ads interface
//The connection object will be created just once, in this class' constructor, and the individual methods that query the database should use the connection object to create statements.
public class MySQLAdsDao implements Ads{

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
    public List<Ad> all() throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
        return createAdsFromRs(rs);
    }

//insert new ads into the database
    @Override
    public Long insert(Ad ad) throws SQLException {
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(insertQuery(ad), Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
        rs.next();
        return rs.getLong(1);
    }

    private String insertQuery(Ad ad) {
        return "INSERT INTO ads(user_id, title, description) VALUES "
                + "(" + ad.getUserId() + ", "
                + "'" + ad.getTitle() +"', "
                + "'" + ad.getDescription() + "')";
    }
    private Ad rsToAd (ResultSet rs) throws SQLException {
        return new Ad(
                rs.getLong("id"),
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
