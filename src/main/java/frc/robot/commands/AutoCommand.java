package frc.robot.commands;

import static frc.robot.Constants.AutoConstants.kAutoDriveTime;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants.AutoConstants;
import frc.robot.subsystems.DriveSubsystem;

public class AutoCommand extends SequentialCommandGroup {
    private final DriveSubsystem m_subsystem;
    private boolean done_yet = false;

    public AutoCommand(final DriveSubsystem subsystem) {
        m_subsystem = subsystem;
        addCommands(new WaitCommand(AutoConstants.kAutoWaitSeconds),
            new DriveCommand(m_subsystem, AutoConstants.kAutoSpeed, 0).withTimeout(kAutoDriveTime),
            new DriveCommand(m_subsystem, 0.0, 0.0)
        );
        done_yet = true;
    };
    @Override
    public boolean isFinished () {
        return done_yet;
    }
}
