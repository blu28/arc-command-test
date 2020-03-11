package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

public class DriveCommand extends CommandBase {
    private final DriveSubsystem m_subsystem;
    private final GenericHID m_stick;
    private double fwd;
    private double rot;

    public DriveCommand(DriveSubsystem subsystem, GenericHID stick) {
        m_subsystem = subsystem;
        m_stick = stick;
        addRequirements(subsystem);
        fwd = 0.0;
        rot = 0.0;
    };
    public DriveCommand(DriveSubsystem subsystem, double fwd, double rot) {
        this.fwd = fwd;
        this.rot = rot;
        m_stick = null;
        m_subsystem = subsystem;
    }
    @Override
    public void execute() {
        if (m_stick != null) {
            m_subsystem.arcadeDrive(m_stick);
        } else {
            m_subsystem.arcadeDrive(fwd,rot);
        }
    }
    @Override 
    public boolean isFinished() {   
        return false;
    }
}
