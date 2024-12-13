// Intake Main

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    TalonFX intakeMotor1 = new TalonFX(2);

    public Intake() {};

    public void run(double speed) {
      intakeMotor1.set(speed);
    }
}
