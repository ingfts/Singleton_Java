public class ClothingSingleton implements Clothing{
    private static ClothingSingleton instance = null;

    //instance-> variable
    public static Clothing getInstance(){

        if (instance == null){
            instance = new ClothingSingleton();
            System.out.println("\nInstance created!");
        }else{
            System.out.println("\nERROR. Not allowed to create a new instance");

        }
        return instance;
    }

    @Override
    public void getClothing (String type, String brand){
        System.out.println("Type: " + type + " Brand: " + brand);
    }
}

// ------------ Comments section ------------
/*

** PART ONE:

-ClothingSingleton -> Gets access to the interface: "Clothing"
-private static ClothingSingleton instance = null:
      *private -> Prevents outside instantiation
      *static ->  Indicates a class variable
      *ClothingSingleton -> Type of the variable 'instance'
      *instance -> variable

----------------------------------------------------------------

** PART TWO:

-public static Clothing getInstance():
        *public -> Method accessible from outside the class
        *static -> Indicates a class variable
        *Clothing -> Return type of the method
        *getInstance() -> creates an instance of "Clothing"

            Loop for:
                The if statement checks if the 'Clothing' instance stored in the variable 'instance' is null.
                If no instance exists, one is created; Otherwise, the else condition is executed
                triggering an error message since it's not allowed to have two instances.


-@Override -> indicates replacing the superclass method "getClothing()" with a specific implementation.
-public void getClothing:
        *public: Method accessible from outside the class
        *void: does not return anything
        *getClothing(): method from the superclass "Clothing"


        ////////////////////////////////////////////////////
*/