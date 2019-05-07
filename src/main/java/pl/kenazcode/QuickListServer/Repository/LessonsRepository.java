package pl.kenazcode.QuickListServer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.kenazcode.QuickListServer.Lesson;

import java.util.List;

@Repository
public interface LessonsRepository extends JpaRepository<Lesson, Integer> {
    @Query("SELECT l.lessonId, l.lessonName FROM Lesson l")
    List<Lesson> getAllLessons();
}
