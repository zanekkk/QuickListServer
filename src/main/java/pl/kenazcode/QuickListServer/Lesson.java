package pl.kenazcode.QuickListServer;


import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name="lessons")
public class Lesson {
    public final static String NAME = "name";
    public final static String ID = "id";

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "date")
    private Date date;
//    private List<Student> studentLists = new ArrayList<Student>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentDate(){
        date = new java.sql.Date(System.currentTimeMillis());
        System.out.println(date);
    }
    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
