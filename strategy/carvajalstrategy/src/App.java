import strategy.AgresiveBehavior;
import strategy.Robot;

public class App {
    public static void main(String[] args) throws Exception {
Robot roboto = new Robot();
roboto.setName("MR, roboto");
roboto.setBehavior(
new AgresiveBehavior());
System.out.println(roboto.getName());
roboto.move();
Robot wally = new Robot();
wally.setName("MR , wally");
wally.setBehavior(
new DefenciveBehavior());
System.out.println(wally.getName());
wally.move();
    }
}
