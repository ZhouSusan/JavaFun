package JavaFun;
import JavaFun.MyInfo;
import static org.junit.jupiter.api.Assertions.*;

class MyInfoTest {

    @org.junit.jupiter.api.Test
    void displayInfoTest() {
        MyInfo susan = new MyInfo("Susan Zhou", 33, "Chicago, IL");
        assertEquals("My name is Susan Zhou.\nI am 33 years old.\nChicago, IL is my hometown.", susan.displayInfo());
    }
}