public class Chocolade extends Product {
   private double calories;

   public Chocolade(String name, double price, double calories){
    super(name, price);
    this.calories = calories;
   }
   
   public double getCalories() {
       return calories;
   }

   public void setCalories(double calories) {
       this.calories = calories;
   }

   @Override
   public String displayInfo() {
       return String.format("Шоколад:\n\t%s\n\t%s\n\tЦена: %.2f\n\t Калории: %.2f", brand, name, price, calories);
   }
}
