package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants.AutoConstants;
import frc.robot.subsystems.DriveSubsystem;

public class AutoCommand extends SequentialCommandGroup {
    private final DriveSubsystem m_subsystem;

    public AutoCommand(DriveSubsystem subsystem) {
        m_subsystem = subsystem;
        addCommands(
            new WaitCommand(AutoConstants.kAutoWaitSeconds),
            new DriveCommand(m_subsystem, AutoConstants.kAutoSpeed, 0).withTimeout(AutoConstants.kAutoWaitSeconds)
        );
    };
}
