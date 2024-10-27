package OOPS;

public class OOPS9_fractionClass {

    public static Object add(Fraction f1, Fraction f2) {
        int newnum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
        int newden = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(newnum, newden);
        if (newnum == newden) {
            return 1;
        }
        return f3;
    }

    public static int gcd(int numerator, int denominator) {
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        while (denominator != 0) {
            int temp = denominator;
            denominator = numerator % denominator;
            numerator = temp;
        }
        return numerator;
    }

    public static class Fraction {
        int numerator;
        int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
            simplify();
        }

        public void simplify() {
            int hcf = gcd(numerator, denominator);
            numerator /= hcf;
            denominator /= hcf;
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 4);
        System.out.println(f1.numerator + "/" + f1.denominator);
        Fraction f2 = new Fraction(2, 4);
        System.out.println(f2.numerator + "/" + f2.denominator);
        Object result = add(f1, f2);
        if (result instanceof Integer) {
            System.out.println(result);
        } else {
            Fraction f3 = (Fraction) result;
            System.out.println(f3.numerator + "/" + f3.denominator);
        }
    }
}
