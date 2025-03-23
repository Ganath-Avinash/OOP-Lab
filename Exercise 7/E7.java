public class E7{
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", 60000, 8);
        System.out.println("Laptop: " + laptop.getBrand() + ", Price: " + laptop.getPrice() + ", RAM: " + laptop.getRAM() + "GB");
    }
}


class Laptop {
    private String brand;
    private double price;
    private int RAM;

    public Laptop(String brand, double price, int RAM) {
        this.brand = brand;
        setPrice(price);
        setRAM(RAM);
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be positive.");
        }
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        if (RAM >= 4) {
            this.RAM = RAM;
        } else {
            System.out.println("RAM must be at least 4GB.");
        }
    }
}

