package Cafe_Business_Logic;
import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int streakGoal = 0;
        for (int i = 0; i <= 10; i++) {
            streakGoal += i;
        }

        return streakGoal;
    }

    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for (int j = 0; j < prices.length; j++) {
            sum += prices[0];
        }

        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int l = 0; l < menuItems.size(); l++) {
            System.out.format("%s %s\n", l, menuItems.get(l));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");

        //The readLine() method of Console class in Java is used to read a single line of text from the console.
        String userName = System.console().readLine();
        customers.add(userName);

        int count = customers.size()-1;
        System.out.format("Hello, %s! There are %s customers ahead of you.\n", userName, count);
    }

    public void printAllCustomers(ArrayList<String> customers) {
        for (int t = 0; t < customers.size(); t++) {
            System.out.println(customers.get(t));
        }
    }
}
