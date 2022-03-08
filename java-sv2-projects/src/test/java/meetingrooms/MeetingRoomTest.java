package meetingrooms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomTest {

    MeetingRoom meetingRoom;

    @BeforeEach
    void setUp() {
        meetingRoom = new MeetingRoom("Room A", 5, 4);
    }

    @Test
    void getNameTest() {
        assertEquals("Room A", meetingRoom.getName());
    }

    @Test
    void getLengthTest() {
        assertEquals(5, meetingRoom.getLength());
    }

    @Test
    void getWidthTest() {
        assertEquals(4, meetingRoom.getWidth());
    }

    @Test
    void getAreaTest() {
        assertEquals(20, meetingRoom.getArea());
    }
}