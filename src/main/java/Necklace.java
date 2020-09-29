import java.util.ArrayList;
import java.util.Random;

public class Necklace {
    private double price;
    private String name;
    private int item_id;
    private String date_created;
    private ArrayList<Necklace> products;


    public Necklace(double price, String name, int item_id, String date_created) {
        this.price = price;
        this.name = name;
        this.item_id = item_id;
        this.date_created = date_created;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public ArrayList<Necklace> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Necklace> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Necklace{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", item_id=" + item_id +
                ", date_created='" + date_created + '\'' +
                ", products=" + products +
                '}';
    }
}
