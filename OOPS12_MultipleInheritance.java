package OOPS;

interface Herbivore {
    void herbivore();
}

interface Quadpedal {
    void fourlegged();
}

class Cow implements Herbivore, Quadpedal {
    @Override
    public void herbivore() {
        System.out.println("Eats Grass & Plants");
    }

    @Override
    public void fourlegged() {
        System.out.println("Walks On Four Legs");
    }
}

public class OOPS12_MultipleInheritance {
    public static void main(String[] args) {
        Cow c1 = new Cow();
        c1.herbivore();
        c1.fourlegged();
    }
}
