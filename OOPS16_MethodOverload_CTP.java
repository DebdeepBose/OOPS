package OOPS;

class Add {
    int add(int a, int b) {
        return a + b;
    }

    long add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }
}

public class OOPS16_MethodOverload_CTP {
    public static void main(String[] args) {
        Add a1 = new Add();
        System.out.println(a1.add(5, 10));
        System.out.println(a1.add(5, 10, 15));
        System.out.println(a1.add(2.5, 1.25, 1.25, 1.5));
    }
}
