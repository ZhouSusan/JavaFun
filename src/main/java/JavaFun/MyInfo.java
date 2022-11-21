package JavaFun;

public class MyInfo {
    private String _name;
    private int _age;
    private String _homeTown;

    public MyInfo(String name, int age, String homeTown) {
        this._name = name;
        this._age = age;
        this._homeTown = homeTown;
    }

    public String displayInfo() {
        return "My name is " + this._name + ".\nI am " + this._age + " years old.\n" + this._homeTown + " is my hometown.";
    }

    public static void main(String[] args) {
        MyInfo susan = new MyInfo("Susan Zhou", 33, "Chicago, IL");
        System.out.println(susan.displayInfo());
    }
}
