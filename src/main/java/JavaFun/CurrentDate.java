package JavaFun;
import java.util.Date;

public class CurrentDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.format("Today's date is %s", date.toString());
    }
}
