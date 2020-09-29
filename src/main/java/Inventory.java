import java.util.ArrayList;

public class Inventory {



    public static void main(String[] args) {
        ArrayList<Necklace> products = new ArrayList<>();
        Necklace cubanLink = new Necklace(5000.00,"Cuban Link 14k Gold", 2643,"04/3/2019");
        Store jewelryStore = new Store("Icebox","Asher",products );
        products.add(cubanLink);

        System.out.println(products);

        jewelryStore.restock();

        jewelryStore.sell(2643);

        System.out.println(products);



    }
}
