package frc.robot;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.RobotMap.Controller;

public class OI {
    public static XboxController driver;
    public XboxController gunner;
   
    public OI() {
        driver = new XboxController(Controller.driverController);
        gunner = new XboxController(Controller.gunnerController);
    }
}