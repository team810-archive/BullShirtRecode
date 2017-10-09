// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc810.BullShirtRecode.subsystems;

import org.usfirst.frc810.BullShirtRecode.RobotMap;
import org.usfirst.frc810.BullShirtRecode.commands.*;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Cannon extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS
	private final Compressor compressor = RobotMap.cannonCompressor;
    private final Solenoid valve1 = RobotMap.cannonValve1;
    private final Solenoid valve2 = RobotMap.cannonValve2;
    private final Solenoid valve3 = RobotMap.cannonValve3;
    private final Solenoid valve4 = RobotMap.cannonValve4;
    private final Solenoid valveFill1 = RobotMap.cannonValveFill1;
    private final Solenoid valveFill2 = RobotMap.cannonValveFill2;
    private final Solenoid valveFill3 = RobotMap.cannonValveFill3;
    private final Solenoid valveFill4 = RobotMap.cannonValveFill4;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    private Solenoid getValve(int cNum){
    	switch(cNum){
    	case 1:
    		return valve1;
    	case 2:
    		return valve2;
    	case 3:
    		return valve3;
    	case 4:
    		return valve4;
    	case 5:
    		return valveFill1;
    	case 6:
    		return valveFill2;
    	case 7:
    		return valveFill3;
    	case 8:
    		return valveFill4;
    	default:
    		throw new IndexOutOfBoundsException("Tried accessing out of bounds solenoid");
    	}
    }
    
    public void openValve(int cNum){
    	getValve(cNum).set(true);
    }
    
    public void closeValve(int cNum){
    	getValve(cNum).set(false);
    }

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
}

