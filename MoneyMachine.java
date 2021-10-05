import java.util.Scanner;

public class MoneyMachine {
    private Scanner entry = new Scanner(System.in);
    private double profit = 0, moneyReceived = 0;
    private double[] moneyValue = { .05, .10, .25, .50, 1 };
    private String[] moneyName = { "R$ 0,05", "R$ 0,10", "R$ 0,25", "R$ 0,50", "R$ 1,00" };

    public String report() {
        return "Money: R$ %.2f" + profit;
    }

    public double processCoin() {
        System.out.println("Please Insert coins");
        for (int i = 0; i < moneyName.length; i++) {
            int cont = 0;
            System.out.println("How many " + moneyName[i] + " ?");
            cont = entry.nextInt();
            moneyReceived += (cont * moneyValue[i]);
        }
        return moneyReceived;
    }

    public boolean makePayment(double cost) {
        if (processCoin() >= cost) {
            System.out.printf("Here is R$ %.2f in change.\n", (moneyReceived - cost));
            profit += cost;
            moneyReceived = 0;
            return true;
        } else {
            System.out.println("Sorry that's not enough money. Money refunded.");
            moneyReceived = 0;
            return false;
        }
    }

}
