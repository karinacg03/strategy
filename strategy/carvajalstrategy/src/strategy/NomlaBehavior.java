package strategy;

public class NomlaBehavior implements RobotBehavior {

    @Override
    public String toString() {
        return "normalBehavior:"+ "if find another robot ignore if";
    }

    @Override
    public int movecommand() {
        return 0;
    }
    
}
