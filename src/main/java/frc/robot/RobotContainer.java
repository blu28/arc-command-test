package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.OIConstants;
import frc.robot.commands.AutoCommand;
import frc.robot.subsystems.DriveSubsystem;

public class RobotContainer {

    private final PWMVictorSPX m_leftmotor = new PWMVictorSPX(DriveConstants.kLeftMotorPort);
    private final PWMVictorSPX m_rightmotor = new PWMVictorSPX(DriveConstants.kRightMotorPort);
    private final DriveSubsystem m_drivesubsystem = new DriveSubsystem(m_leftmotor, m_rightmotor);
    private final Joystick m_stick = new Joystick(OIConstants.kJoystickPort);
    private final Command m_autocommand;
    
    public RobotContainer() {
        m_drivesubsystem.setDefaultCommand(
            new RunCommand(() -> m_drivesubsystem
            .arcadeDrive(m_stick.getY(GenericHID.Hand.kLeft),
            m_stick.getX(GenericHID.Hand.kLeft)), m_drivesubsystem));
        m_autocommand = new AutoCommand(m_drivesubsystem);
    }
    public Command getAutonomousCommand() {
        return m_autocommand;
    }
}