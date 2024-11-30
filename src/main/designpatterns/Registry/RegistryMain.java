package main.designpatterns.Registry;

import java.util.ArrayList;
import java.util.List;

public class RegistryMain {
    public static void main(String[] args) {

        Student may23 = new Student(0,'x',"MAY23","IITB");
        Student aug23 = new Student(0,'x',"AUG23","IITM");

        StudentRegistry registry = new StudentRegistry();
        registry.addToRegistry(may23.getBatchName(),may23);
        registry.addToRegistry(aug23.getBatchName(),aug23);

        Student a = registry.getFromRegistry("MAY23").clone(86,'A');
        Student b = registry.getFromRegistry("AUG23").clone(87,'B');

        System.out.println(a);
        System.out.println(b);
    }
}
/*
Output:
Student{id=86, name=A, batchName='MAY23', university='IITB'}
Student{id=87, name=B, batchName='AUG23', university='IITM'}
*/
