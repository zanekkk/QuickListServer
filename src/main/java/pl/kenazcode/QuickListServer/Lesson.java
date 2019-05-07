package pl.kenazcode.QuickListServer;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="lessons")
public class Lesson {
    public final static String NAME = "name";
    public final static String LESSON_ID = "lessonId";

    @Id
    @Column(name="lesson_id", nullable=false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long lessonId;
    @Column(name = "lesson_name")
    private String lessonName;
    @Column(name = "lesson_date")
    private Timestamp lessonDate;
    @ManyToMany
    @JoinTable(name = "lessons_students" , joinColumns = { @JoinColumn(name = "lessonId")}, inverseJoinColumns = { @JoinColumn(name = "studentId")})
    List<Student> students = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name="teacher_id", nullable=false)
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Lesson(){
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public Timestamp getLessonDate() {
        return lessonDate;
    }

    public void setLessonDate(Timestamp lessonDate) {
        this.lessonDate = lessonDate;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public long getLessonId() {
        return lessonId;
    }

    public void setLessonId(long lessonId) {
        this.lessonId = lessonId;
    }

    public String getName() {
        return lessonName;
    }

    public void setName(String lessonName) {
        this.lessonName = lessonName;
    }

    public void setCurrentDate(){
        this.lessonDate =new Timestamp(System.currentTimeMillis());
        System.out.println(this.lessonDate);
    }
    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + lessonId +
                ", name='" + lessonName + '\'' +
                '}';
    }
}
