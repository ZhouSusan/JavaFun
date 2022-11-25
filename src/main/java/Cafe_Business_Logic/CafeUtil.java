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
            System.out.format("%s %s", l, menuItems.get(l));
        }
    }
    
}
