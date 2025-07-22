package MultiLevelUniversityCourseManagementSystem;

import java.util.*;
class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }
    public static void showCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c.getTitle());
        }
    }
}
