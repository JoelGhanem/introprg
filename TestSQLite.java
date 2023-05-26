public class TestSQLite {
    public static void main(String[] args) throws java.sql.SQLException {
        java.sql.DriverManager.getDriver("jdbc:sqlite:test.bd");
    }
}
