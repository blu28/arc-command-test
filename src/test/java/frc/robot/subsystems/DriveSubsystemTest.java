package frc.robot.subsystems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;
import com.frc151.helpers.MockHardwareExtension;


import edu.wpi.first.wpilibj.PWMVictorSPX;

public class DriveSubsystemTest {
    DriveSubsystem drivess;
    PWMVictorSPX leftmotor = mock(PWMVictorSPX.class);
    PWMVictorSPX rightmotor = mock(PWMVictorSPX.class);

    @Before
    public void before () {
        MockHardwareExtension.beforeAll();
        drivess = new DriveSubsystem(leftmotor, rightmotor);
    }

    @Test
    public void constructorTest () {
        //Arrange
        drivess = new DriveSubsystem(leftmotor, rightmotor);
        //Act
        //Assert
        assertEquals(0.0, drivess.getSpeed(), 0.0); 
    }
    @Test
    public void itShouldSetZero() {
        fail("test fail");
    }
}