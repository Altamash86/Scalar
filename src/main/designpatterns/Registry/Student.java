package main.designpatterns.Registry;

public class Student implements Registry<Student> {

    private int id;
    private char name;
    private String batchName;
    private String university;

    public Student(int id, char name, String batchName, String university) {
        this.id = id;
        this.name = name;
        this.batchName = batchName;
        this.university = university;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public Student clone(int id, char name) {
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setBatchName(this.getBatchName());
        s.setUniversity(this.getUniversity());
        return s;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", batchName='" + batchName + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
