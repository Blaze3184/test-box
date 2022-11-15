package frc.robot;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.Constants.OIConstants;

public class OI {
    public XboxController driverController;
    public XboxController gunnerController;
   
    public OI() {
    driverController = new XboxController(OIConstants.kDriverControllerPort);
    gunnerController = new XboxController(OIConstants.kGunnerControllerPort);
    }
}