package taskat5;

public class DemoClass {
    public static void main(String[] args) throws Exception {
        System.out.println("Start test");


            Course java = new Course("Java", 135);
            Course qa = new Course("Manual testing", 120);
            Course aqa = new Course("Automation testing", 132);
            Course math = new Course("Math",100);
            Course db = new Course("Data Bases", 20);
            Course nets = new Course("Net", 20);

            Student student1 = new Student("Korotun", "AQA", "28.09.2020");
            student1.addCourses(java);
            student1.addCourses(qa);
            student1.addCourses(aqa);

            Student student2 = new Student("Reuka", "QA", "28.09.2020");
            student2.addCourses(aqa);
            student2.addCourses(qa);

            Student student3 = new Student("Vasilets", "Java devepopment","01.11.2020");
            student3.addCourses(java);
            student3.addCourses(math);
            student3.addCourses(db);
            student3.addCourses(nets);

            student1.isProgramFinished(true);
            student2.isProgramFinished(true);
            student3.isProgramFinished(false);


        }

    }



