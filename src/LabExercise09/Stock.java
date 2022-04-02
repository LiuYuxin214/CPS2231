package LabExercise09;

public class Stock {
    String symbol;
    String name;
    double currentPrice = 0;
    double previousClosingPrice;

    public Stock() {
    }

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
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

    public static void main(String[] args) {
        Stock a = new Stock("ORCL", "Oracle Corporation");
        a.setPreviousClosingPrice(34.5);
        a.setCurrentPrice(34.35);
        System.out.println(a.getChangePercent());
    }
}