package OOPS;

public class OOPS6_Constructor {
    public static class Drink {
        private String name;
        private int quantity;
        private double price;

        public Drink(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        String getName() {
            return name;
        }

        int getQuantity() {
            return quantity;
        }

        double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Drink d1 = new Drink("Pepsi", 2, 90.50);
        System.out.println(d1.getName() + " " + d1.getQuantity() + " " + d1.getPrice());
    }
}
