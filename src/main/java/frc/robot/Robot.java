package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.RobotContainer;

public class Robot extends TimedRobot {

  private RobotContainer m_robotcontainer;

  @Override
  public void robotInit() {
    m_robotcontainer = new RobotContainer();
  }
  @Override
  public void robotPeriodic() {
    CommandScheduler.getInstance().run();
  }

}