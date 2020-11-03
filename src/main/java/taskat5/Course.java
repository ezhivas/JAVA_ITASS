package taskat5;

public class Course {
    private String courseName;
    private int courseDuration;

    public Course(String courseName, int courseDuration) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
    }

    public int getCourseDuration() {
        return courseDuration;
    }
}

