package OOPS;

public class OOPS1 {
    public static class Student {
        String name;
        int roll;
        double percent;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Raghav";
        s1.roll = 25;
        s1.percent = 92.25;

        Student s2 = new Student();
        s2.name = "Rohan";
        s2.roll = 30;
        s2.percent = 90.5;

        System.out.println("Student Name Is : " + s1.name);
        System.out.println("Student Roll Is : " + s1.roll);
        System.out.println("Student Percent Is : " + s1.percent);

        System.out.println("Student Name Is : " + s2.name);
        System.out.println("Student Roll Is : " + s2.roll);
        System.out.println("Student Percent Is : " + s2.percent);

    }
}
