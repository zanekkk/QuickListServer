package pl.kenazcode.QuickListServer.Repository;

import pl.kenazcode.QuickListServer.Lesson;

import java.util.Collection;

public interface LessonsRepositoryInterface {

    Collection<Lesson> getAllLessons();
//    void createLesson();
    Collection<Lesson> getStudentsFromLessons();
}
