public class Config {

    public String getUrl() {
        return "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false";
    }

    public String getUser() {
        return "adlister";
    }

    public String getPassword() {
        return "password1234";
    }
}

