import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public Chocolade getChocolade(String name, double calories){
        for (Product product : products) {
            if(product instanceof Chocolade){
                Chocolade chocolade = (Chocolade)product;
                if(chocolade.getName().equals(name) && chocolade.getCalories() == calories){
                    return chocolade;
                }
            }
        }
        return null;
    }
}
