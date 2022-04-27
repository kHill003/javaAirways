import People.Crew.CabinCrew;
import People.Crew.CrewRoles;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {
    CabinCrew cabinCrew;

    @Before
    public void before() {
        cabinCrew = new CabinCrew("Shaggy Dog", CrewRoles.HOST);

    }

    @Test
    public void canGetCrewName() {
        assertEquals("Shaggy Dog", cabinCrew.getName());
    }

    @Test
    public void canGetRole() {
        assertEquals("Host", cabinCrew.getRole());
    }

    @Test
    public void canSetName() {
        cabinCrew.setName("Harry McGruff");
        assertEquals("Harry McGruff", cabinCrew.getName());
    }

    @Test
    public void canGiveAnnouncement() {
        String announcement = cabinCrew.giveAnnouncement("We have cookies");
        assertEquals("Attention We have cookies", announcement);
    }
}



