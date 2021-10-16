package lab1.task2;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String title;
    private String description;
    private Student[] students;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    List<Student> filterYear(int year)
    {
        List<Student> filter = new ArrayList<>();

        for (Student st : students)
        {
            if(st.getYear() == year)
                filter.add(st);
        }
        return filter;
    }
}
