package Factory;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;  // main one

public class RobotFactoryTest {

    @Test
    public void RobotFactory_슈퍼로봇과_파워로봇이_서브_클래스에서_잘_생성되는가() {
        RobotFactory robotFactory = new VariousRobotFactory();
        Robot robot1 = robotFactory.createRobot("super");
        Robot robot2 = robotFactory.createRobot("power");
        assertThat(robot1.getName()).isEqualTo( new SuperRobot().getName());
        assertThat(robot2.getName()).isEqualTo( new PowerRobot().getName());
    }

}
