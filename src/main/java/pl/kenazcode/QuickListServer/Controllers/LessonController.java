package pl.kenazcode.QuickListServer.Controllers;


import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.kenazcode.QuickListServer.Lesson;
import pl.kenazcode.QuickListServer.Services.LessonService;

import java.util.List;
import java.util.Map;

@RestController
public class LessonController {
    @Autowired
    LessonService lessonService;


    @GetMapping(value = "/lessonList")
    public List<Lesson> getLessonList() {
        return lessonService.getLessonsList();
    }

    @GetMapping(value = "/lesson/{lessonId}")
    @ResponseBody
    public Lesson getLesson(@PathVariable int lessonId) {
        System.out.println(lessonId);
        return lessonService.getLesson(lessonId);
    }

    @PostMapping(value = "/addLesson")
    @ResponseBody
    public ResponseEntity addLesson(@RequestBody Map<String, String> newLesson) throws JSONException {
        System.out.println(newLesson);
        return lessonService.addLesson(newLesson);
    }
}

