package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;

public class DriveCommand extends CommandBase {
    private final Drive m_subsystem;
    public DriveCommand(Drive subsystem) {
        m_subsystem = subsystem;
        addRequirements(subsystem);
    }
}