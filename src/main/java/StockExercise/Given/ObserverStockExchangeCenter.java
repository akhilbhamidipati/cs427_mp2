package StockExercise.Given;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//Don't modify me
public abstract class ObserverStockExchangeCenter {

    //assume map is immutable
    protected Map<StockType, Double> ownedStock;

    public ObserverStockExchangeCenter() {
        this.ownedStock = new HashMap<>();
    }

    public void buyStock(ObservableStock s){
        ownedStock.put(s.getName(), 0.0);
    }

    //assume we won't change values in the map
    public Map<StockType, Double> getOwnedStock(){
        return ownedStock;
    }

    public abstract void observe(ObservableStock o);
    public abstract void notifyChange(StockType type, double price);
}
