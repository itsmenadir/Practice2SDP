public class DatabaseConnection {
    private static DatabaseConnection instance;
    private DatabaseConnection() {
        System.out.println("Connected to the database.");
    }
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
