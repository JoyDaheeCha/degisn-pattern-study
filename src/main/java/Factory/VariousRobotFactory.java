package Factory;

public class VariousRobotFactory implements RobotFactory{

    @Override
    public Robot createRobot(String name) {
        if(name.equalsIgnoreCase("Power")) {
            return new PowerRobot();
        }
        if(name.equalsIgnoreCase("Super")) {
            return new SuperRobot();
        }
        return null;
    }
}
