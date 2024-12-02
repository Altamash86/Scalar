package main.designpatterns.Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeMain {
    public static void main(String[] args) {

        Student s1 = new Student(1,'A',"MAY23","IITB");

        List<Student> students = new ArrayList<>();

        students.add(s1);

        int id = 1;

        for(int i=2;i<27;i++){
            char name = (char) ('A'+i-1);
            id++;
            students.add(s1.clone(id,name));
        }

        System.out.println(students);
    }
}
/*
Output:
[
    Student{id=1, name=A, batchName='MAY23', university='IITB'},
    Student{id=2, name=B, batchName='MAY23', university='IITB'},
    Student{id=3, name=C, batchName='MAY23', university='IITB'},
    Student{id=4, name=D, batchName='MAY23', university='IITB'},
    Student{id=5, name=E, batchName='MAY23', university='IITB'},
    Student{id=6, name=F, batchName='MAY23', university='IITB'},
    Student{id=7, name=G, batchName='MAY23', university='IITB'},
    Student{id=8, name=H, batchName='MAY23', university='IITB'},
    Student{id=9, name=I, batchName='MAY23', university='IITB'},
    Student{id=10, name=J, batchName='MAY23', university='IITB'},
    Student{id=11, name=K, batchName='MAY23', university='IITB'},
    Student{id=12, name=L, batchName='MAY23', university='IITB'},
    Student{id=13, name=M, batchName='MAY23', university='IITB'},
    Student{id=14, name=N, batchName='MAY23', university='IITB'},
    Student{id=15, name=O, batchName='MAY23', university='IITB'},
    Student{id=16, name=P, batchName='MAY23', university='IITB'},
    Student{id=17, name=Q, batchName='MAY23', university='IITB'},
    Student{id=18, name=R, batchName='MAY23', university='IITB'},
    Student{id=19, name=S, batchName='MAY23', university='IITB'},
    Student{id=20, name=T, batchName='MAY23', university='IITB'},
    Student{id=21, name=U, batchName='MAY23', university='IITB'},
    Student{id=22, name=V, batchName='MAY23', university='IITB'},
    Student{id=23, name=W, batchName='MAY23', university='IITB'},
    Student{id=24, name=X, batchName='MAY23', university='IITB'},
    Student{id=25, name=Y, batchName='MAY23', university='IITB'},
    Student{id=26, name=Z, batchName='MAY23', university='IITB'}
]
*/
