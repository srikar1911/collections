package practice;

public enum FoodItem {

    EGGS(3), BACON(3), SAUSAGE(3.5), BISCUIT(2)

    ;
    private double price;

    private FoodItem(double price){ // this, name of the item, price - 3 arguments
        this.price = price;
    }

    public double price(){
     return price;
    }
}

class Menu {
    public static void main(String[] args) {
//        System.out.println(FoodItem.values());
//        System.out.println(FoodItem.BACON);
//        System.out.println(FoodItem.EGGS);
//        System.out.println(FoodItem.SAUSAGE);
//        System.out.println(FoodItem.BISCUIT);

        FoodItem[] itemMenu = FoodItem.values();
        System.out.println("===============================");
        System.out.println("S.No\tItem Name\t\tPrice");
        System.out.println("===============================");
        for (FoodItem S : FoodItem.values()) {

            System.out.print((S.ordinal()+1));
            System.out.print("\t\t" +S);
            System.out.println("\t\t\t" +S.price());
        }
        System.out.println("===============================");
    }
}
class CaterMenu{
   // EnumSet<FoodItem> itemsSet = EnumSet.

}
