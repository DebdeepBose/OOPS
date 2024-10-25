package OOPS;

public class OOPS3_AccessModifiers {
    public static class BigTree{
        String fruit;
        double height;
        private int age;
    }

    public static void main(String[] args) {
        BigTree t1 = new BigTree();
        t1.fruit = "Apple";
        t1.height = 2.1;
        t1.age = 20;

        System.out.println(t1.age);
        //It should give a compilation error
    }
}
