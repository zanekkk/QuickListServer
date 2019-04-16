package pl.kenazcode.QuickListServer;

public class Student {
    private long id;
    private String name;
    private String surname;

    public Student(long id){
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
