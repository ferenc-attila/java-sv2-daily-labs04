package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stock {

    List<Double> stock;


    public Stock(List<Double> stock) {
        this.stock = stock;
    }

    public List<Double> getStock() {
        return stock;
    }

    public double maxProfit () {
        double maxProfit = 1;
        for (int i = 0; i < this.stock.size()-1; i++) {
            if (this.stock.get(i+1) > this.stock.get(i)) {
                    maxProfit *= this.stock.get(i+1)/this.stock.get(i);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Stock stock = new Stock(Arrays.asList(1.23,4.35,0.23,4.0,8.4));
        System.out.println(stock.maxProfit());  //8.17

        Stock stock2 = new Stock(Arrays.asList(12.0,2.0,8.0,4.0));
        System.out.println(stock2.maxProfit()); //6.0
    }
}
