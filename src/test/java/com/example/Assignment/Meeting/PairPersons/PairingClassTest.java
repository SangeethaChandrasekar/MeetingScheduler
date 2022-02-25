package com.example.Assignment.Meeting.PairPersons;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class PairingClassTest {
    ArrayList array = new ArrayList(Arrays.asList(1, 2, 3, 4));
    ArrayList array1 = new ArrayList(Arrays.asList("1", "2"));
    ArrayList array2 = new ArrayList(Arrays.asList(1.0, 2.25, 3.33));
    ArrayList array3 = new ArrayList(Arrays.asList());


    KWFour know4 = new KWFour(array3);
    PairingClass knowFour = new PairingClass();

    @org.junit.Test
    public void makePairingTest() {
        assertEquals((knowFour.makePairing(array)), array);
        assertEquals((knowFour.makePairing(array1)), array1);
        assertEquals((knowFour.makePairing(array2)), array2);
    }
    @org.junit.Test
    public void isEmptyTest() {
        assertTrue(knowFour.scheduleMeeting(array3));
    }
    @org.junit.Test
    public void scheduleMeetingTest() {
        assertFalse(knowFour.scheduleMeeting(array));
    }
    @org.junit.Test
    public void negativeTest() {
        assertNotEquals(knowFour.makePairing(array), array2);
        assertNotEquals(knowFour.makePairing(array), array3);
        assertNotSame(knowFour.makePairing(array1), array);
        assertFalse(knowFour.scheduleMeeting(array));
    }
    @org.junit.Test
    public void makePairingTest2() {
        assertSame(knowFour.makePairing(array3), array3);
        assertSame(knowFour.makePairing(array2), array2);
    }
}