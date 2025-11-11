class Course {
    String courseName;
    int duration;
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
}

class PaidOnlineCourse extends OnlineCourse {
    int fee;
    int discount;
    void displayCourseInfo() {
        System.out.println(courseName + " | " + platform + " | Duration: " + duration + " weeks | Fee: " + fee + " | Discount: " + discount + "%");
    }
}

public class Main7 {
    public static void main(String[] args) {
        PaidOnlineCourse c = new PaidOnlineCourse();
        c.courseName = "Java Full Stack";
        c.duration = 8;
        c.platform = "Udemy";
        c.isRecorded = true;
        c.fee = 5000;
        c.discount = 20;
        c.displayCourseInfo();
    }
}

