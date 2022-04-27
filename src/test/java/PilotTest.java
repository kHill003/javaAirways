import People.Crew.CrewRoles;
import People.Crew.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Andy McDuff", CrewRoles.PILOT, "C45");
    }

    @Test
    public void pilotHasAName() {
        assertEquals("Andy McDuff", pilot.getName());
    }
    @Test
    public void pilotHasRole(){assertEquals("Pilot", pilot.getRole());}

    @Test
    public void pilotHasLicence(){assertEquals("C45", pilot.getLicenceNum());}

    @Test
    public void pilotCanFlyAPlane(){assertEquals("I can fly you know!",pilot.flyPlane());}
}