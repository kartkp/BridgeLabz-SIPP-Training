package MultiLevelUniversityCourseManagementSystem;

public class UniversityCourse {
    public static void main(String[] args) {

        Course<ExamCourse> examCourseList = new Course<>();
        examCourseList.addCourse(new ExamCourse("Data Structures Exam"));
        examCourseList.addCourse(new ExamCourse("Algorithms Exam"));

        Course<AssignmentCourse> assignmentCourseList = new Course<>();
        assignmentCourseList.addCourse(new AssignmentCourse("Database Assignment"));
        assignmentCourseList.addCourse(new AssignmentCourse("OS Assignment"));

        Course<ResearchCourse> researchCourseList = new Course<>();
        researchCourseList.addCourse(new ResearchCourse("AI Research Project"));
        System.out.println("Exam Courses:");
        Course.showCourses(examCourseList.getCourses());

        System.out.println("\nAssignment Courses:");
        Course.showCourses(assignmentCourseList.getCourses());

        System.out.println("\nResearch Courses:");
        Course.showCourses(researchCourseList.getCourses());
    }
}
