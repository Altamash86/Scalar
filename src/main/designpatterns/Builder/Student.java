package main.designpatterns.Builder;

public class Student {

    private int id;
    private String name;
    private int age;
    private String university;
    private int gardYear;

    private Student(int id, String name, int age, String university, int gardYear) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.university = university;
        this.gardYear = gardYear;
    }

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                ", gardYear=" + gardYear +
                '}';
    }

    public static class Builder{

        private int id;
        private String name;
        private int age;
        private String university;
        private int gradYear;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder university(String university) {
            this.university = university;
            return this;
        }

        public Builder gradYear(int gardYear) {
            this.gradYear = gardYear;
            return this;
        }

        public void validate(){
            if(age < 18){
                throw new InvalidAgeException();
            }
            if(gradYear >= 2023){
                throw new InvalidGradYearException();
            }
        }

        public Student build(){
            validate();
            return new Student(id,name,age,university,gradYear);
        }
    }
}
