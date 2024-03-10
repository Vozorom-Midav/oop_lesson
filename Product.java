/*
 * Продукт
 */

public class Product {
    protected String name;
    protected String brand;
    protected double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        checkPrice(price);
    }

    public Product(String brand, String name, double price){
        
        checkBrand(brand);
        checkName(name);
        checkPrice(price);
    }

    public Product(String name, double price){
        this("<BRAND>", name, price);
    }

    public Product(String name){
        this(name, 200);
    }

    public Product(){
        this("<NAME>");
    }

    private void checkBrand(String brand){
        if(brand == null || brand.length() < 3){
            this.brand = "<BRAND>";
        }
        else{
           this.brand = brand;
        }
    }

    private void checkName(String name){
        if(name == null || name.length() < 3){
            this.name = "<NAME>";
        }
        else{
            this.name = name;
        }
    }

    private void checkPrice(double price){
        if(price < 200){
            this.price = 200;
        }
        else{
            this.price = price;
        }
    }

    public String displayInfo(){
        return String.format("%s - %s - %.2f", brand, name, price);
    }
    
}