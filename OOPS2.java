package OOPS;

public class OOPS2 {
    public static class Employee {
        String name;
        int id;
    }

    public static void show(Employee e) {
        System.out.println(e.name + " " + e.id);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Sam";
        e1.id = 240123;
        show(e1);
    }
}
