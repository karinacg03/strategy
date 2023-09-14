package strategy;

public class AgresiveBehavior implements RobotBehavior {

    @Override
    public String toString() {
        return "AgresiveBehavior"+"if find another robot ignore if";
    }

    @Override
    public int movecommand() {
        return 1;
    }
    
}
