import java.util.Scanner;

public class AppMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MoneyMachine cashRegister = new MoneyMachine();
        final int LINESIZE = 80;
        String command;

        while (true) {
            System.out.println("Whats do you like?");
            command = input.nextLine();
            if (command.equals("off")) {
                for (int i = 0; i < LINESIZE; i++) {
                    System.out.print("-");
                }
                System.out.println("\nSystem shutdown");
                break;
            } else if (command.equals("report")) {
                System.out.println("alfa test");
            } else if (command.equals("espresso") || command.equals("latte") || command.equals("cappuccino")) {
                System.out.println("beta test");
            } else {
                System.out.println("comand not understood");
            }
            
        }

    }

}
