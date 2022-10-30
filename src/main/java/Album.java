import java.io.Serializable;
import java.util.Date;

//Referring back to the MySQL Tables lesson, create a bean, Album, for the albums table.
//Referring back to the Database Design lesson, create beans for the quotes and authors tables (Quote and Author). Instead of including a foreign key property in the Quote class, include an Author property.
//Create a class, BeanTest, and include a main method that instantiates a few instances of Album, Author and Quote.
//In BeanTest, experiment with storing multiple instances of Quote in an arraylist and iterating over it to print out the content and author name of multiple quotes.

public class Album implements Serializable {
//# id, artist, name, release-date, sales, genre
private long id;
private String artist;
private String name;
private Date releaseDate;
private long sales;
private String genre;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public long getSales() {
        return sales;
    }

    public void setSales(long sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
