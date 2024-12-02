package main.designpatterns.Creational.Singleton;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingletonMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(2);
        DBMultiThread db1 = new DBMultiThread();
        DBMultiThread db2 = new DBMultiThread();
        Future<DatabaseConnection> dbCon1 = service.submit(db1);
        Future<DatabaseConnection> dbCon2 = service.submit(db2);
        System.out.println("first DB instance: "+dbCon1.get());
        System.out.println("second DB instance: "+dbCon2.get());
        service.shutdown();

    }
}

/*
Output:
first DB instance: main.designpatterns.Creational.Singleton.DatabaseConnection@312b1dae
second DB instance: main.designpatterns.Creational.Singleton.DatabaseConnection@312b1dae
*/