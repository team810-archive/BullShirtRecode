

// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc810.BullShirtRecode;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc810.BullShirtRecode.commands.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton slowDown;
    public JoystickButton speedUp;
    public JoystickButton fireButton1;
    public JoystickButton fireButton2;
    public JoystickButton fireButton3;
    public JoystickButton fireButton4;
    public JoystickButton safety;
    public Joystick controller;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        controller = new Joystick(0);
        
        safety = new JoystickButton(controller, 1);
        safety.whileHeld(new VariableStorage("safety", "true"));
        fireButton4 = new JoystickButton(controller, 1);
        fireButton4.whenPressed(new FireCannon(4));
        fireButton3 = new JoystickButton(controller, 1);
        fireButton3.whenPressed(new FireCannon(3));
        fireButton2 = new JoystickButton(controller, 2);
        fireButton2.whenPressed(new FireCannon(2));
        fireButton1 = new JoystickButton(controller, 1);
        fireButton1.whenPressed(new FireCannon(1));
        speedUp = new JoystickButton(controller, 7);
        speedUp.whileHeld(new VariableStorage("speed", "2"));
        slowDown = new JoystickButton(controller, 5);
        slowDown.whileHeld(new VariableStorage("speed", "0.5"));


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("FireCannon: default", new FireCannon(0));
        SmartDashboard.putData("DriveCommand: default", new DriveCommand(1, 1));
        SmartDashboard.putData("VariableStorage: default", new VariableStorage("", ""));

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getController() {
        return controller;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

