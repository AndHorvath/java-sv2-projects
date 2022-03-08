package meetingrooms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomControllerTest {

    MeetingRoomController meetingRoomController;

    @BeforeEach
    void setUp() {
        meetingRoomController = new MeetingRoomController();
    }

    @Test
    void getOfficeTest() {
        assertEquals(new ArrayList<>(), meetingRoomController.getOffice().getMeetingRooms());
    }

    @Test
    void getScannerTest() {
        assertNotNull(meetingRoomController.getScanner());
    }
}