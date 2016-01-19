package org.usfirst.frc.team3482.robot.subsystems;

import org.usfirst.frc.team3482.robot.*;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Clamp extends Subsystem {
    DoubleSolenoid doubleSolenoid1 = RobotMap.clampDoubleSolenoid1;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void extend() {
    	doubleSolenoid1.set(DoubleSolenoid.Value.kForward);
    }
    
    public void retract() {
    	doubleSolenoid1.set(DoubleSolenoid.Value.kReverse);
    }
}
