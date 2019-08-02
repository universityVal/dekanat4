package sk.pro.dekanat.model;

public class Student {
    private int id;
    private  String name;
    private Faculty faculty;

    public Student() {
    }

    public Student(int id, String name, Faculty faculty) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", faculty=" + faculty +
                '}';
    }
}
