package main.designpatterns.Singleton;

import java.util.concurrent.Callable;

public class DBMultiThread implements Callable<DatabaseConnection> {

    @Override
    public DatabaseConnection call() throws Exception {
        return DatabaseConnection.getInstance();
    }
}
