package Java_Inheritance;

class Course {
    String courseName;
    int duration;
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
}

public class EducationalCourse {
    public static void main(String[] args) {
        PaidOnlineCourse p = new PaidOnlineCourse("Java Programming", 30, "Udemy", true, 999.0, 10.0);
        System.out.println(p.courseName + " " + p.duration + " " + p.platform + " " + p.isRecorded + " " + p.fee + " " + p.discount);
    }
}

