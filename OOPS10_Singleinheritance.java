package OOPS;

class Clock {
    void hour() {
        System.out.println("Clock Shows Hour");
    }
}

class Watch extends Clock {
    void minute() {
        System.out.println("Watch Shows Minute");
    }
}

public class OOPS10_Singleinheritance {
    public static void main(String[] args) {
        Watch w1 = new Watch();
        w1.hour();
        w1.minute();
    }
}
