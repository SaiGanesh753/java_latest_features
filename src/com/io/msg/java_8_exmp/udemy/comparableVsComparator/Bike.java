package java_8_exmp.udemy.comparableVsComparator;

public class Bike implements Comparable<Bike> {

    private String bName;
    private int rYear;
    private int price;

    public Bike(String bName, int rYear, int price) {
        this.bName = bName;
        this.rYear = rYear;
        this.price = price;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public int getrYear() {
        return rYear;
    }

    public void setrYear(int rYear) {
        this.rYear = rYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bName='" + bName + '\'' +
                ", rYear=" + rYear +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Bike b2) {
        return this.bName.compareTo(b2.bName);
    }
}
