package prasetyoputrapratama.spring.core;

public class Database {
    private static Database database;

    public static Database getDatabase() {
        if (database == null) {
            database = new Database();
        }

        return database;
    }

    private Database() {
        
    }
    
}
