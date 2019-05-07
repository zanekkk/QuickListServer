package pl.kenazcode.QuickListServer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.kenazcode.QuickListServer.Repository.LessonsRepository;
import pl.kenazcode.QuickListServer.Repository.StudentsRepository;
import pl.kenazcode.QuickListServer.Repository.TeacherRepository;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuickListServerApplicationTests {
	@Autowired
	LessonsRepository lessonsRepository;
	@Autowired
	StudentsRepository studentRepository;
    @Autowired
    TeacherRepository teacherRepository;
	@Autowired
	StudentsRepository studentsRepository;
	@Test
	public void contextLoads() {
        Teacher teacher = new Teacher("Anna", "Bielawska");
        teacherRepository.save(teacher);

        Lesson lesson = new Lesson();
        lesson.setName("Lekcja1");
        lesson.setTeacher(teacher);
        lesson.setCurrentDate();
        Lesson lesson2 = new Lesson();
        lesson2.setTeacher(teacher);
        lesson2.setName("Lekcja2");
        lesson2.setCurrentDate();


        Student student = new Student("Michał","Kowalski","Krdzis");
		Student student2 = new Student("Ania","Nowak","Krpis");
		Student student3 = new Student("Wojtek","Maniek","Lpits");
		Student student4 = new Student("Arek","Maniek","Krdzid");

		studentsRepository.save(student);
		studentsRepository.save(student2);
		studentsRepository.save(student3);
		studentsRepository.save(student4);

		List<Student> students = new ArrayList<>();
		students.add(student);
		students.add(student2);

		List<Student> students2 = new ArrayList<>();
		students2.add(student3);
		students2.add(student4);

		lesson.setStudents(students);
		lesson2.setStudents(students2);

		lessonsRepository.save(lesson);
		lessonsRepository.save(lesson2);

	}

}
