package OOPS;

public class OOPS4_GettersSetters {
    public static class House {
        private String type;
        private int age;
        private double rent;

        public String getType() {
            return type;
        }

        public int getAge() {
            return age;
        }

        public double getRent() {
            return rent;
        }

        public void setDetails(String type, int age, double rent) {
            this.type = type;
            this.age = age;
            this.rent = rent;
        }
    }


    public static void main(String[] args) {
        House h1 = new House();
        h1.setDetails("Bungalow", 20, 2000.50);
        System.out.println(h1.getType() + " " + h1.getAge() + " " + h1.getRent());
    }
}
