package pl.kenazcode.QuickListServer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kenazcode.QuickListServer.Student;

@Repository
public interface StudentsRepository extends JpaRepository<Student, Integer> {
}
