package main.designpatterns.Creational.Singleton;

public class DatabaseConnection {

    private static DatabaseConnection instance = null;

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance() {
        if(instance == null){
            synchronized (DatabaseConnection.class){
                if(instance == null){
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
}
