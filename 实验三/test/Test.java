package test;

import entities.Course;
import entities.Student;
import entities.Teacher;

public class Test {

    public static void main(String[] args) {
        // 创建教师
        Teacher teacher1 = new Teacher(1, "张三", "男");
        Teacher teacher2 = new Teacher(2, "李华", "男");

        // 教师教授的课程
        Course course1 = new Course(101, "Java编程", "教学楼A201", "周三 3-5节", teacher1);
        Course course2 = new Course(102, "Python编程", "教学楼B202", "周四 4-6节", teacher2);
        Course course3 = new Course(103, "Web开发", "教学楼C203", "周五 5-7节", teacher1);

        // 添加课程到教师的教授课程列表
        teacher1.addTeachingCourse(course1);
        teacher2.addTeachingCourse(course2);
        teacher1.addTeachingCourse(course3);

        // 学生选课
        Student student1 = new Student(1001, "李四", "男");
        student1.addSelectedCourse(course1);
        student1.addSelectedCourse(course2);

        Student student2 = new Student(1002, "王五", "女");
        student2.addSelectedCourse(course1);
        student2.addSelectedCourse(course3);

        // 打印学生课表信息
        printStudentSchedule(student1);
        System.out.println("------------");
        printStudentSchedule(student2);
    }

    // 打印学生课表信息的方法
    public static void printStudentSchedule(Student student) {
        System.out.println("学生编号：" + student.getId());
        System.out.println("学生姓名：" + student.getName());

        for (Course c : student.getSelectedCourses()) {
            System.out.println("课程名称：" + c.getCourseName());
            System.out.println("上课地点：" + c.getLocation());
            System.out.println("上课时间：" + c.getTime());
            System.out.println("授课教师：" + c.getTeacher().getName());
            System.out.println("----");
        }
    }
}
