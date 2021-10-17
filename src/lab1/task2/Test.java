package lab1.task2;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        Course course = new Course();
        Student[] students = new Student[3];

        students[0] = new Student();
        students[0].setYear(1);
        students[0].setName("Tudor");

        students[1] = new Student();
        students[1].setYear(2);
        students[1].setName("Alex");

        students[2] = new Student();
        students[2].setYear(3);
        students[2].setName(("George"));

        course.setStudents(students);

        course.setTitle("Students");
        course.setDescription("About students");

        int year = Integer.parseInt(args[0]);

        List <Student> filter = course.filterYear(year);

        for (Student st : filter)
        {
            System.out.println(st.getName());
        }
        
        Student student1 = students[0];
        Student student2 = new Student();
        student2.setName("Tudor");
        student2.setYear(1);

        System.out.println(student1.equals(student2));
    }
}
