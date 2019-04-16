package pl.kenazcode.QuickListServer.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import pl.kenazcode.QuickListServer.Lesson;
import pl.kenazcode.QuickListServer.Repository.LessonsRepository;
import pl.kenazcode.QuickListServer.ResponseContent;
import pl.kenazcode.QuickListServer.ResponseMessages;

@Service
public class LessonService {

    @Autowired
    LessonsRepository lessonsRepository;

    public List<Lesson> getLessonsList() {
        List<Lesson> lessons = new ArrayList<>();
        try {
            lessons = lessonsRepository.getAllLessons();
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        return lessons;
    }

    public Lesson getLesson(int id) {
        Lesson lesson = new Lesson();
        Optional<Lesson> lessons = lessonsRepository.findById(id);

        try {
          if(lessons.isPresent()) {
              return lessons.get();
          }
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        return null;
    }

    public ResponseEntity addLesson(Map<String, String> newLesson) throws JSONException {
        String name = newLesson.get(Lesson.NAME);
        Lesson lesson = new Lesson();
        lesson.setName(name);
        lesson.setCurrentDate();
        lessonsRepository.save(lesson);
        return ResponseEntity.ok(ResponseContent.createResultMessage(ResponseMessages.LESSON_SUCCESSFULLY_CREATED));
    }
}

