package OOPS;

public class OOPS8_staticKeyword {
    public static class DayCare {
        String name;
        static int toddlers;

        public DayCare(String name) {
            this.name = name;
            toddlers++;
        }
    }

    public static void main(String[] args) {
        DayCare d1 = new DayCare("Halleywell");
        System.out.println("Name: " + d1.name + ", Toddlers: " + d1.toddlers);

        DayCare d2 = new DayCare("Tiran");
        System.out.println("Name: " + d2.name + ", Toddlers: " + d1.toddlers);
    }
}
