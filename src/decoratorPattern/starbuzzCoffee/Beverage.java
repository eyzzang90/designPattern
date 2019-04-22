package decoratorPattern.starbuzzCoffee;

public abstract class Beverage {

    String description = "제목없음";

    public static String TALL = "tall";
    public static String GRANDE = "grande";
    public static String VENTI = "venti";

    String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
