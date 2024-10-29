package OOPS;

class Insect {
    void Sound() {
        System.out.println("Insect Makes Sound");
    }
}

class Dragonfly extends Insect {
    @Override
    void Sound() {
        System.out.println("Dragonfly Makes Sound");
    }
}

public class OOPS17_MethodOverride_RTP {
    public static void main(String[] args) {
        Dragonfly d1 = new Dragonfly();
        d1.Sound();
    }
}
