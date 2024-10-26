package OOPS;

public class OOPS7_finalKeyword {
    public static class College {
        int numOfStudents;
        String name;
        final String collegeName = "CIT";

        public College(int numOfStudents, String name) {
            this.numOfStudents = numOfStudents;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        College c1 = new College(100, "Rohit");
        //College c1 = new College(100, "Rohit", "ODI"); This Will result in Error.
        System.out.println("Number of Students: " + c1.numOfStudents + ", Name: " + c1.name + ", College Name: " + c1.collegeName);
    }
}
