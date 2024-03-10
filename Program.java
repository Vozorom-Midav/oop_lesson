import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Chocolade chocolate1 = new Chocolade("Chocolate #1", 220 , 150);
        Chocolade chocolate2 = new Chocolade("Chocolate #2", 270 , 230);
        System.out.println(chocolate1.displayInfo());
        System.out.println(chocolate2.displayInfo());

        Product chocolate3 = new Chocolade("Chocolate #3", 220 , 78);
        Product chocolate4 = new Chocolade("Chocolate #4", 270 , 433);
        System.out.println(chocolate3.displayInfo());
        System.out.println(chocolate4.displayInfo());
        
        ArrayList<Product> list = new ArrayList<>();
        list.add(chocolate1);
        list.add(chocolate2);
        list.add(chocolate3);
        list.add(chocolate4);

        VendingMachine vendingMachine = new VendingMachine(list);
        
        Chocolade myChocolade = vendingMachine.getChocolade("Chocolate #3", 78);
        if(myChocolade != null){
            System.out.println("Вы купили: ");
            System.out.println(myChocolade.displayInfo());
        }
        else{
            System.out.println("Такой шоколадки нет в автомате.");
        }
    }
}
