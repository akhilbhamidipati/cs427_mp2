package StockExercise.Given;

//Don't modify me
public abstract class ObservableStock {

    private double price;
    private StockType name;

    public ObservableStock(StockType name) {
        this.name = name;
    }

    public StockType getName() {
        return name;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void notifyPriceChange(double price);
    public abstract void registerStockExchangeCenter(ObserverStockExchangeCenter oc);
}
