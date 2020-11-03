package taskat5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Student {
    private final String studentName;
    private final String specialty;
    private final String startDate;
    private final Course[] courses = new Course[10];
    private int courseInd;
    private int totalCoursesDuration = 0;

    public Student(String studentName, String specialty, String startDate) {
        this.studentName = studentName;
        this.specialty = specialty;
        this.startDate = startDate;
    }

    public void addCourses(Course course) {
        courses[courseInd++] = course;
    }

    public void isProgramFinished(boolean detailed) throws NumberFormatException, ParseException {
        boolean isFinished;
        Date currentDate = new Date();
        Date studentStartDate;
        String finishDate;
        String result;
        long remainsToStudyHours;
        long remainsToStudyDays;
        SimpleDateFormat sdate = new SimpleDateFormat("dd.MM.yyyy");
        studentStartDate = sdate.parse(startDate);
        long educationDurationHours = (((currentDate.getTime() - studentStartDate.getTime()) / 3600000) / 24) * 8;
        System.out.println(currentDate.getTime() - studentStartDate.getTime());
        for (int i = 0; i < courseInd; i++) {
            totalCoursesDuration += courses[i].getCourseDuration();
        }
        int totalDurationDays = (totalCoursesDuration / 8) * 24;
        Date finishD = new Date(studentStartDate.getTime() + TimeUnit.HOURS.toMillis(totalDurationDays));
        Long getFinishTime = finishD.getTime();
        finishDate = sdate.format(getFinishTime);

        if (totalCoursesDuration < educationDurationHours) {
            remainsToStudyDays = (educationDurationHours - totalCoursesDuration) / 8;
            remainsToStudyHours = (educationDurationHours - totalCoursesDuration) - (remainsToStudyDays * 8);
            isFinished = true;
        } else {
            remainsToStudyDays = (totalCoursesDuration - educationDurationHours) / 8;
            remainsToStudyHours = (totalCoursesDuration - educationDurationHours) - (remainsToStudyDays * 8);
            isFinished = false;
        }

        if (isFinished) {
            if (detailed) {
                result = "\nStudent name: " + studentName + "\nWork hours from 10.00 to 18.00"
                        + "\nStudent Specialty: " + specialty + "\nProgram total duration : " +
                        totalCoursesDuration + " hours." + "\nStart date: " + startDate
                        + "\nFinish date: " + finishDate
                        + "\nCourse is finished " + remainsToStudyDays + " days " + remainsToStudyHours + " hours ago";

            } else {
                result = "\nStudent " + studentName + "(" + specialty + ")" + ". Course is not finished. It remains to study "
                        + remainsToStudyDays + " days " + remainsToStudyHours + " hours";
            }
        } else {
            if (detailed) {
                result = "\nStudent name: " + studentName + "\nWork hours from 10.00 to 18.00"
                        + "\nStudent Specialty: " + specialty + "\nProgram total duration : " + totalCoursesDuration +
                        " hours." + "\nStart date: " + startDate + "\nFinish date: " +
                        finishDate + "\nCourse is not finished. It remains to study " +
                        remainsToStudyDays + " days " + remainsToStudyHours + " hours";
            } else {
                result = "\nStudent " + studentName + "(" + specialty + ")" + ". Course is not finished. It remains to study "
                        + remainsToStudyDays + " days " + remainsToStudyHours + " hours";
            }
        }
        System.out.println(result);
    }
}
