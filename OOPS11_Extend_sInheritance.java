class Result {
    int a;
    int b;

    Result(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Swapper {
    Result swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return new Result(a, b);
    }
}

class Doubler extends Swapper {
    Result twice(int a, int b) {
        a = 2 * a;
        b = 2 * b;
        return new Result(a, b);
    }
}

public class OOPS11_Extend_sInheritance {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        Doubler d = new Doubler();

        System.out.println("Before doubling: a = " + a + ", b = " + b);
        Result doubled = d.twice(a, b);
        a = doubled.a;
        b = doubled.b;
        System.out.println("After doubling: a = " + a + ", b = " + b);

        Result swapped = d.swap(a, b);
        a = swapped.a;
        b = swapped.b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
