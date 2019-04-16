package pl.kenazcode.QuickListServer;

public enum
ResponseMessages {
    LESSON_ALREADY_EXISTS("Lesson already exists."),
    LESSON_SUCCESSFULLY_CREATED("Lesson successfully created."),
    WRONG_LESSON("Wrong lesson name."),
    LESSON_FOUND("Lesson found.");

    private final String message;

    ResponseMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
