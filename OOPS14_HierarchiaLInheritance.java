package OOPS;

class Bike {
    void runs() {
        System.out.println("Bike Runs");
    }
}

class Dirt extends Bike {
    void dirtBike() {
        System.out.println("Is a dirtbike");
    }
}

class Motor extends Bike {
    void motorBike() {
        System.out.println("Is a motorbike");
    }
}

class Sports extends Bike {
    void sportsBike() {
        System.out.println("Is a sportsbike");
    }
}

public class OOPS14_HierarchiaLInheritance {
    public static void main(String[] args) {
        Dirt d1 = new Dirt();
        Motor m1 = new Motor();
        Sports s1 = new Sports();

        d1.runs();
        d1.dirtBike();

        m1.runs();
        m1.motorBike();

        s1.runs();
        s1.sportsBike();

    }
}
