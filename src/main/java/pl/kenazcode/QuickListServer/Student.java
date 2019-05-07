package pl.kenazcode.QuickListServer;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="students")
public class
Student {
    @Id
    @Column(name="student_id",  nullable=false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long studentId;
    @Column(name="student_name")
    private String name;
    @Column(name="student_surname")
    private String surname;
    @Column(name="group_number")
    private String groupNumber;
    @ManyToMany(mappedBy = "students")
    List<Lesson> lessons = new ArrayList<>();

    public Student(){}

    public Student(String name, String surname, String groupNumber) {
        this.name = name;
        this.surname = surname;
        this.groupNumber = groupNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public Student(long studentId){
        this.studentId = studentId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }
}
