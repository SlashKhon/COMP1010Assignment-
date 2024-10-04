package task7;

import static org.junit.Assert.*;

import org.junit.Test;

import core.Node;

public class ThingsToDoTest {
    @Test
    public void testCountStudents() {
        Node d = new Node(10, null);
        Node c = new Node(70, d);
        Node b = new Node(20, c);
        Node a = new Node(90, b);

        assertEquals(4, ThingsToDo.countStudents(a));
        assertEquals(3, ThingsToDo.countStudents(b));
        assertEquals(2, ThingsToDo.countStudents(c));
        assertEquals(1, ThingsToDo.countStudents(d));
        assertEquals(0, ThingsToDo.countStudents(null));
    }

    @Test
    public void testAverage() {
        Node d = new Node(100, null);
        Node c = new Node(20, d);
        Node b = new Node(70, c);
        Node a = new Node(90, b);

        assertEquals(70.0, ThingsToDo.average(a), 0.01);
        assertEquals(63.3333, ThingsToDo.average(b), 0.01);
        assertEquals(60.0, ThingsToDo.average(c), 0.01);
        assertEquals(100.0, ThingsToDo.average(d), 0.01);
        assertEquals(0, ThingsToDo.average(null), 0.01);
    }

    @Test
    public void testIdentical() {
        Node d1 = new Node(10, null);
        Node c1 = new Node(20, d1);
        Node b1 = new Node(70, c1);
        Node a1 = new Node(90, b1);

        Node d2 = new Node(10, null);
        Node c2 = new Node(20, d2);
        Node b2 = new Node(70, c2);
        Node a2 = new Node(90, b2);

        assertTrue(ThingsToDo.identical(a1, a2));
        assertTrue(ThingsToDo.identical(b1, b2));
        assertTrue(ThingsToDo.identical(c1, c2));
        assertTrue(ThingsToDo.identical(d1, d2));

        assertFalse(ThingsToDo.identical(a1, b2));
        assertFalse(ThingsToDo.identical(a2, b1));

        c2 = new Node(20, null);
        b2 = new Node(70, c2);
        a2 = new Node(90, b2);
        assertFalse(ThingsToDo.identical(a1, a2));
        assertFalse(ThingsToDo.identical(a2, a1));
    }
}
