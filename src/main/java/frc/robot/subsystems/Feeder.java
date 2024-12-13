// Feeder Main

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Feeder extends SubsystemBase {
    TalonFX feederMotor1 = new TalonFX(1);

    public Feeder() {};

    public void run(double speed) {
      feederMotor1.set(speed);
    }
}
