package Cafe_Business_Logic;

public class CafeUtil {
    public int getStreakGoal() {
        int streakGoal = 0;
        for (int i = 0; i <= 10; i++) {
            streakGoal += i;
        }

        return streakGoal;
    }
}
