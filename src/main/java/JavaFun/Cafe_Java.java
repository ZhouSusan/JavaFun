package JavaFun;

public class Cafe_Java {
    public static void main(String[] args) {
        //Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly.";
        String readyMessage = ", your order is now ready!";
        String displayTotalAmount = ", your total is $";

        //Menu variables(prices)
        double sandwich = 6.99;
        double soda = 1.00;
        double water = 1.50;
        double chickenSoup = 2.5;
        double sliceOfPizza = 4.50;

        //Customer name variables
        String customer1 = "Cynthia";
        String customer2 = "Jackson";
        String customer3 = "Harris";
        String customer4 = "Pat";

        //Order Completions
        boolean isOrder1Ready = true;
        boolean isOrder2Ready = false;
        boolean isOrder3Ready = false;
        boolean isOrder4Ready = true;

        /* App Interaction Simulation
          ex. System.out.println(generalGreeting + customer1);// Displays "Welcome to Cafe Java, Cynthia"
          Your customer interaction print statements will go here
          */
        System.out.println(generalGreeting + customer2);
        System.out.println(customer3 + pendingMessage);
        System.out.println(customer1 + readyMessage);
        System.out.println(customer4 + displayTotalAmount + (sandwich + water));
    }
}
