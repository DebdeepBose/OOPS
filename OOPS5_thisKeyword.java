package OOPS;

public class OOPS5_thisKeyword {
    public static class Clock {
        private String type;
        private int time;

        public String getType() {
            return type;
        }

        public int getTime() {
            return time;
        }

        public void setFeature(String type, int time) {
            this.type = type;
            this.time = time;
        }
    }

    public static void show(Clock c1) {
        System.out.println(c1.getType() + " " + c1.getTime());
    }


    public static void main(String[] args) {
        Clock c1 = new Clock();
        Clock c2 = new Clock();
        c1.setFeature("Analog", 5);
        c2.setFeature("Digital", 7);
        show(c1);
        show(c2);
    }
}
