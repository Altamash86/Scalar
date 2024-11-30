package main.designpatterns.Builder;

public class BuilderMain {
    public static void main(String[] args) {
         Student s1 = Student.builder()
                 .id(1)
                 .age(18)
                 .name("Altamash")
                 .university("NMU")
                 .gradYear(2019)
                 .build();
         Student s2 = Student.builder()
                .id(2)
                .age(20)
                .name("ABC")
                .gradYear(2021)
                .build();

        System.out.println(s1);
        System.out.println(s2);

    }
}
/*
Output:
Student{id=1, name='Altamash', age=18, university='NMU', gardYear=2019}
Student{id=2, name='ABC', age=20, university='null', gardYear=2021}
*/
