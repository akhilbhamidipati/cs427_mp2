package StockExercise;

import StockExercise.Given.ObservableStock;
import StockExercise.Given.ObserverStockExchangeCenter;
import StockExercise.Given.StockType;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class StockTest {


    @Test
    public void stockPriceChangeTest(){
        ObservableStock amazonStock = new ObservableStockImpl(StockType.Amazon);
        ObserverStockExchangeCenter NYStockCenter = new ObserverStockExchangeCenterImpl();
        NYStockCenter.buyStock(amazonStock);
        Map<StockType, Double> boughtStocks = NYStockCenter.getOwnedStock();
        assertEquals(1, boughtStocks.size());
        assertEquals(0,boughtStocks.get(StockType.Amazon),0);

        amazonStock.setPrice(5);
        Map<StockType, Double> boughtStocks2 = NYStockCenter.getOwnedStock();
        assertEquals(1, boughtStocks2.size());
        assertEquals(5,boughtStocks2.get(StockType.Amazon),0);
    }

    @Test
    public void multipleStockPriceChangeTest(){
        ObservableStock amazonStock = new ObservableStockImpl(StockType.Amazon);
        ObservableStock googleStock = new ObservableStockImpl(StockType.Google);
        ObserverStockExchangeCenter NYStockCenter = new ObserverStockExchangeCenterImpl();
        NYStockCenter.buyStock(amazonStock);
        NYStockCenter.buyStock(googleStock);
        Map<StockType, Double> boughtStocks = NYStockCenter.getOwnedStock();
        assertEquals(2, boughtStocks.size());
        assertEquals(0,boughtStocks.get(StockType.Amazon),0);
        assertEquals(0,boughtStocks.get(StockType.Google),0);

        amazonStock.setPrice(5);
        Map<StockType, Double> boughtStocks2 = NYStockCenter.getOwnedStock();
        assertEquals(2, boughtStocks2.size());
        assertEquals(5,boughtStocks2.get(StockType.Amazon),0);
        assertEquals(0,boughtStocks2.get(StockType.Google),0);

        googleStock.setPrice(10);
        Map<StockType, Double> boughtStocks3 = NYStockCenter.getOwnedStock();
        assertEquals(2, boughtStocks3.size());
        assertEquals(5,boughtStocks3.get(StockType.Amazon),0);
        assertEquals(10,boughtStocks3.get(StockType.Google),0);
    }
}
