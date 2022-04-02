package LabExercise09;

public class Stock {
    String symbol;
    String name;
    double currentPrice = 0;
    double previousClosingPrice;

    public Stock() {
    }

    public Stock(String newsymbol, String newname) {
        symbol = newsymbol;
        name = newname;
    }

    public static void main(String[] args) {
        Stock a = new Stock("ORCL", "Oracle Corporation");
        System.out.println(a.getChangePercent());
    }

    public void setCurrentPrice(double newprice) {
        currentPrice = newprice;
    }

    public void setPreviousClosingPrice(double newprice) {
        previousClosingPrice = newprice;
    }

    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }
}