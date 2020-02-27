package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

public class DriveCommand extends CommandBase {
//    private final DriveSubsystem m_subsystem;
    public DriveCommand(DriveSubsystem subsystem) {
//        m_subsystem = subsystem;
        addRequirements(subsystem);
    };
}
