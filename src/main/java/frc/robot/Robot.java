package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.RobotContainer;

public class Robot extends TimedRobot {

  @Override
  public void robotInit() {
    new RobotContainer();
  }
  @Override
  public void robotPeriodic() {
    CommandScheduler.getInstance().run();
  }
  @Override
  public void testInit() {
    CommandScheduler.getInstance().cancelAll();
  }

}