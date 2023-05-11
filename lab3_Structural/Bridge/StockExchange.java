package Lab2.Bridge;

public class StockExchange extends Program{
    protected StockExchange(Developer developer){
        super(developer);
    }

    @Override
    public void developProgram(){
        System.out.println("Exchange development in progress ...");
        developer.writeCode();
    }
}