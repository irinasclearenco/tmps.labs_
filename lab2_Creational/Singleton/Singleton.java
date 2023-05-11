package Lab1.Singleton;

public class Singleton {
    
    private static Singleton instance = new Singleton();

    // make the constructoe private so that this class can't be instantiated
    private Singleton(){}

    // get the only available object
    public static Singleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("This is an example of Singleton");
    }
}
