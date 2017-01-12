import java.util.List;
import java.util.ArrayList;

class Inventory{
    public static void main(String[]args){
        System.out.println("Whillien STORE");
        List<Item> INV = new ArrayList();
        float total = 0.0f;

        Item t1 = new Item("Adidas", "Sneakers", 5000.00f);

        Item t2 = new Item("Vans", "Sneakers", 2500.00f);

        Item t3 = new Item("Nike", "Sneakers", 10000.00f);

        Item t4 = new Item("Sperry", "Sneakers", 5900.00f);

        Item t5 = new Item("Converse", "Sneakers", 30000.00f);

        Item t6 = new Item("Keds", "Sneakers", 2000.00f);

        Item t7 = new Item("Skechers", "Sneakers", 3500.00f);

        Item t8 = new Item("Dr.Martens", "Sneakers", 7800.00f);

        Item t9 = new Item("Fila", "Sneakers", 5000.00f);

        Item t10 = new Item("Merryl", "Sneakers", 3400.00f);

        INV.add(t1);
        INV.add(t2);
        INV.add(t3);
        INV.add(t4);
        INV.add(t5);
        INV.add(t6);
        INV.add(t7);
        INV.add(t8);
        INV.add(t9);
        INV.add(t10);
        for(Item w: INV){
            if(w.Getname()=="Vans"){
                System.out.println("Found!");
            }else{
                System.out.println("notfound ");
            }
            total = total + w.Getprice();
        }
        System.out.println(total);
    }
}