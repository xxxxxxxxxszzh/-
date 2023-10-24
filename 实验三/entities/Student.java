package entities;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Course> selectedCourses = new ArrayList<>();

    public Student(int id, String name, String gender) {
        super(id, name, gender);
    }

    // 添加一个课程到已选课程列表
    public void addSelectedCourse(Course course) {
        this.selectedCourses.add(course);
    }

    // 获取所有已选课程
    public List<Course> getSelectedCourses() {
        return selectedCourses;
    }
}
