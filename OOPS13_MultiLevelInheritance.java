package OOPS;

class Carnivore {
    void carnivorus() {
        System.out.println("Eats Flesh");
    }

}

class Tiger extends Carnivore {
    public void hunter() {
        System.out.println("Hunts Animals");
    }
}

class Cub extends Tiger {
    public void growl() {
        System.out.println("Growls");
    }
}

public class OOPS13_MultiLevelInheritance {
    public static void main(String[] args) {
        Cub c1 = new Cub();
        c1.growl();
        c1.hunter();
        c1.carnivorus();
    }
}
