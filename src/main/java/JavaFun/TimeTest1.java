package JavaFun;

public class TimeTest1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long tot = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            tot += i;
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.format("Time of execution: %s", elapsedTime);
    }

}
