package StockExercise;

import StockExercise.Given.ObservableStock;
import StockExercise.Given.ObserverStockExchangeCenter;
import StockExercise.Given.StockType;

public class ObserverStockExchangeCenterImpl extends ObserverStockExchangeCenter {
    public ObserverStockExchangeCenterImpl() {
        super();
    }

    @Override
    public void buyStock(ObservableStock s){
        super.buyStock(s);
        observe(s);
    }

    @Override
    public void notifyChange(StockType type, double price){
        //@TODO: Implememnt me
        this.ownedStock.put(type, price);
    }

    //@TODO: Override any necessary methods
    @Override
    public void observe(ObservableStock o){
        //@TODO: Implememnt me
        o.registerStockExchangeCenter(this);
    }
}
