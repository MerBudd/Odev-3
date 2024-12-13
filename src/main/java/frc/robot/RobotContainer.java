// Intake and Feeder Motor Test
// Version 1.11

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import frc.robot.subsystems.Feeder;
import frc.robot.subsystems.Intake;

import frc.robot.commands.IntakingCommand;

public class RobotContainer {
  Joystick dualsense5 = new Joystick(0);
  Feeder feederKraken = new Feeder();
  Intake intakeKraken = new Intake();

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(dualsense5, 1).whileTrue(new IntakingCommand(intakeKraken, 1, feederKraken, 0.7));
    new JoystickButton(dualsense5, 2).whileTrue(new IntakingCommand(intakeKraken, -1, feederKraken, -0.7));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
