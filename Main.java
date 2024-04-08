public class Main {
    public static void main(String[] args) {
        // Obtain an instance of ClothingSingleton
      Clothing c1 = ClothingSingleton.getInstance();
      c1.getClothing("Black dress", "Dior");


        Clothing c2 = ClothingSingleton.getInstance();
        c1.getClothing("Blue skinny jeans", "Tommy jeans");


    }
}

//---------- Comments section -------------

/*
 Clothing c1 = ClothingSingleton.getInstance():
    *c1 -> Variable storing the instance of Clothing
    *ClothingSingleton -> subClass
    *getInstance() -> Method to obtain the singleton instance
    *c1.getClothing("Black dress", "Dior") -> Invoking the method with "Black dress" and "Dior" as parameters

    /////////////////////
    Clothing c2 -> Instance created to test the behavior of the else condition.







 */
