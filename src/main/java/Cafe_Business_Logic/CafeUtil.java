package Cafe_Business_Logic;
import java.util.ArrayList;
import java.util.Scanner;

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
            System.out.println("Please enter your name:");
            Scanner in = new Scanner(System.in);
            String userName = in.nextLine();
            customers.add(userName);
            int count= customers.size()-1;
            System.out.println("Hello, "+userName+"! There are "+count+" people in front of you.");
            System.out.println(customers);
    }
}
