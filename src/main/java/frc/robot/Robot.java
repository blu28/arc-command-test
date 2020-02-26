package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Robot extends TimedRobot {
  
    @Override
    public void teleopPeriodic() {
      // Drive with arcade drive.
      // That means that the Y axis drives forward
      // and backward, and the X turns left and right.
      m_robotDrive.arcadeDrive(m_stick.getY(), m_stick.getX());
    }
  }