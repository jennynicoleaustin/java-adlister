import java.io.Serializable;

////Referring back to the Database Design lesson, create beans for the quotes and authors tables (Quote and Author). Instead of including a foreign key property in the Quote class, include an Author property.
public class Quote implements Serializable {
    private long quoteID;
    private long author;
    private String quote;

    public long getQuoteID() {
        return quoteID;
    }

    public void setQuoteID(long quoteID) {
        this.quoteID = quoteID;
    }

    public long getAuthor() {
        return author;
    }

    public void setAuthor(long author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
