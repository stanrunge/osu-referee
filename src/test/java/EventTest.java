import org.junit.jupiter.api.Test;
import osu.Event;

import static org.junit.jupiter.api.Assertions.*;

class EventTest {
    Event testEvent = new Event(1, "Test event");

    @Test
    void testGetName() {
        assertEquals(testEvent.getName(), "Test event");
    }
}