package entities;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private List<Course> teachingCourses = new ArrayList<>();

    public Teacher(int id, String name, String gender) {
        super(id, name, gender);
    }

    // 添加一个课程到所教课程列表
    public void addTeachingCourse(Course course) {
        this.teachingCourses.add(course);
    }

    // 获取所有所教课程
    public List<Course> getTeachingCourses() {
        return teachingCourses;
    }
}
