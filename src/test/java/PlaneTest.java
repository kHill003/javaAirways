import Journey.Airplanes.Plane;
import Journey.Airplanes.PlaneTypes;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;


    @Before
    public void before() {
        plane = new Plane(PlaneTypes.JET_ONE);
    }

    @Test
    public void canGetCapacity() {
        assertEquals(170, plane.getPlaneCapacity());
    }

    @Test
    public void canGetWeight() {
        assertEquals(2000, plane.getPlaneWeight());}

    @Test
    public void canGetPlaneType(){

        assertEquals("JET_ONE", plane.getType().toString());

    }
    }





