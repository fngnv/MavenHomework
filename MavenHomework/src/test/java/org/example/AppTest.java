package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

    @org.junit.Test
    public void testGetDistance() {
        double c = App.getDistance(5, 10);
        assertEquals(5.0, c);
    }
}
