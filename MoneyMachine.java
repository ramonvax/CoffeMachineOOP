public class MoneyMachine {
    private final String CURRENCY = "R$";
    private double profit = 0, moneyReceived = 0;

    public void report() {
        System.out.println("Money: " + CURRENCY + profit);
    }
}
