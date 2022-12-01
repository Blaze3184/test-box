// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.reverseMotor;
import frc.robot.commands.runMotor;
import frc.robot.subsystems.MotorSS;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.OIConstants;
import edu.wpi.first.wpilibj.XboxController.Axis;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.POVButton;



/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final MotorSS m_MotorSS = new MotorSS();

  private final runMotor m_autoCommand = new runMotor(m_MotorSS);

  private XboxController m_driverController = new XboxController(OIConstants.kDriverControllerPort);
  


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    new JoystickButton(m_driverController, Button.kB.value).whenHeld(new runMotor(m_MotorSS));
    new JoystickButton(m_driverController, Button.kA.value).whenHeld(new reverseMotor(m_MotorSS));
    new JoystickButton(m_driverController, Button.kX.value).whenHeld(new runMotor(m_MotorSS));
    new JoystickButton(m_driverController, Button.kY.value).whenHeld(new reverseMotor(m_MotorSS));
    new JoystickButton(m_driverController, Button.kLeftBumper.value).whenHeld(new runMotor(m_MotorSS));
    new JoystickButton(m_driverController, Button.kRightBumper.value).whenHeld(new reverseMotor(m_MotorSS));
    new JoystickButton(m_driverController, Button.kLeftStick.value).whenHeld(new runMotor(m_MotorSS));
    new JoystickButton(m_driverController, Button.kRightStick.value).whenHeld(new reverseMotor(m_MotorSS));
    new JoystickButton(m_driverController, Button.kStart.value).whenHeld(new runMotor(m_MotorSS));
    new JoystickButton(m_driverController, Button.kBack.value).whenHeld(new reverseMotor(m_MotorSS));
    new POVButton(m_driverController, 0).whenHeld(new runMotor(m_MotorSS));
    new POVButton(m_driverController, 180).whenHeld(new reverseMotor(m_MotorSS));
    new POVButton(m_driverController, 270).whenHeld(new runMotor(m_MotorSS));
    new POVButton(m_driverController, 90).whenHeld(new reverseMotor(m_MotorSS));
    new POVButton(m_driverController, 45).whenHeld(new runMotor(m_MotorSS));
    new POVButton(m_driverController, 135).whenHeld(new reverseMotor(m_MotorSS));
    new POVButton(m_driverController, 225).whenHeld(new runMotor(m_MotorSS));
    new POVButton(m_driverController, 315).whenHeld(new reverseMotor(m_MotorSS));
    
    }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
