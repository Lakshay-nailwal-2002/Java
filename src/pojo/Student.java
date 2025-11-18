package pojo;

public class Student {
    private String name;
    private String dob;
    private String id;
    private String classList;

    public Student() {
    }

    public Student(String dob, String name, String id, String classList) {
        this.dob = dob;
        this.name = name;
        this.id = id;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", id='" + id + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
}
