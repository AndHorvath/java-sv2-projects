package meetingrooms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class OfficeTest {

    Office office;
    MeetingRoom meetingRoom;

    @BeforeEach
    void setUp() {
        office = new Office();
    }

    @Test
    void getMeetingRoomsTest() {
        assertEquals(new ArrayList<>(), office.getMeetingRooms());
    }

    @Test
    void addMeetingRoomTest() {
        meetingRoom = new MeetingRoom("Room A", 5, 4);
        office.addMeetingRoom(meetingRoom);
        assertEquals(List.of(meetingRoom), office.getMeetingRooms());
    }
}