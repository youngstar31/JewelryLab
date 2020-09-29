import java.util.ArrayList;
import java.util.Random;

public class Store {
    private String name;
    private String ownerName;
    private ArrayList<Necklace> products;


    public Store(String name, String ownerName, ArrayList<Necklace> products) {
        this.name = name;
        this.ownerName = ownerName;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public ArrayList<Necklace> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Necklace> products) {
        this.products = products;
    }

    public void restock(){

        while (products.size() < 20){
            Random generateRand = new Random();
            products.add(new Necklace(3000.00,"Cuban Link 24k Gold",2473,"04/23/2019" ));

        }
    }

    public void sell(int item_id){

        for(int item = 0; item < products.size(); item++){
            if (products.get(item).getItem_id() == item_id){
                products.remove(products.get(item));

            }
        }
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", products=" + products +
                '}';
    }
}
