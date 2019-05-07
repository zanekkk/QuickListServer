package pl.kenazcode.QuickListServer;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="teachers")
public class Teacher {
    @Id
    @Column(name="teacher_id",  nullable=false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long teacherId;
    @Column(name="teacher_name")
    private String name;
    @Column(name="teacher_surname")
    private String surname;
    @OneToMany(mappedBy="teacher", cascade={CascadeType.ALL})
    private List<Lesson> lessons;

    public Teacher(){
    }

    public Teacher(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
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
}
