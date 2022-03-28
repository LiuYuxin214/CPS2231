package Assignment4;

class Stock {
    String symbol;
    String name;
    double currentPrice = 0;
    double previousClosingPrice;

    Stock(String newsymbol, String newname, double newpreviousClosingPrice) {
        symbol = newsymbol;
        name = newname;
        previousClosingPrice = newpreviousClosingPrice;
    }

    double getChangePercent(double newcurrentPrice) {
        currentPrice = newcurrentPrice;
        return (currentPrice / previousClosingPrice - 1) * 100;
    }
}

public class StockClass {

    public static void main(String[] args) {
        Stock a = new Stock("ORCL", "Oracle Corporation", 34.5);
        System.out.println(a.getChangePercent(34.35) + "%");
    }

}
