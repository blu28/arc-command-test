package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.OIConstants;

public class RobotContainer {

    private final PWMVictorSPX m_leftMotor = new PWMVictorSPX(DriveConstants.kLeftMotorPort);
    private final PWMVictorSPX m_rightMotor = new PWMVictorSPX(DriveConstants.kRightMotorPort);
    private final DifferentialDrive m_robotDrive = new DifferentialDrive(m_leftMotor, m_rightMotor);
    private final Joystick m_stick = new Joystick(OIConstants.kJoystickPort);
    
    public RobotContainer() {
        configureButtonBindings();
        m_robotDrive.setDefaultCommand(
            
        )
    }

    private void configureButtonBindings() {

    }
}