package frc.robot.subsystems;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
    private final SpeedController m_leftmotor;
    private final SpeedController m_rightmotor;
    private final DifferentialDrive m_diffdrive;

    public DriveSubsystem(final SpeedController leftmotor, final SpeedController rightmotor) {
        m_leftmotor = leftmotor;
        m_rightmotor = rightmotor;
        m_diffdrive = new DifferentialDrive(m_leftmotor, m_rightmotor);
    }

    public void arcadeDrive(final double fwd, final double rot) {
        m_diffdrive.arcadeDrive(fwd, rot);
    }

    public void arcadeDrive(final GenericHID m_stick) {
        m_diffdrive.arcadeDrive(m_stick.getY(Hand.kLeft), m_stick.getX(Hand.kLeft));
    }
}