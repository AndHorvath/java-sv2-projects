package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {

    // --- attributes ---------------------------------------------------------

    private List<MeetingRoom> meetingRooms;

    // --- constructors -------------------------------------------------------

    public Office() {
        meetingRooms = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<MeetingRoom> getMeetingRooms() { return meetingRooms; }

    // --- public methods -----------------------------------------------------

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            printMeetingRoomDetails(meetingRoom, true, false);
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            printMeetingRoomNameByIndex(i);
        }
    }

    public void printEvenNames() {
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            printMeetingRoomNameByIndex(i);
        }
    }

    public void printAreas() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            printMeetingRoomDetails(meetingRoom, false, true);
        }
    }

    public void printMeetingRoomsWithName(String name) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equals(name)) {
                printMeetingRoomData(meetingRoom);
            }
        }
    }

    public void printMeetingRoomsContains(String part) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().contains(part)) {
                printMeetingRoomData(meetingRoom);
            }
        }
    }

    public void printAreasLargerThan(int area) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getArea() > area) {
                printMeetingRoomData(meetingRoom);
            }
        }
    }

    // --- private methods ----------------------------------------------------

    private void printMeetingRoomNameByIndex(int index) {
        System.out.println(meetingRooms.get(index).getName());
    }

    private void printMeetingRoomDetails(MeetingRoom meetingRoom, boolean isNameToPrint, boolean isAreaToPrint) {
        if (isNameToPrint) {
            System.out.println(meetingRoom.getName());
        }
        if (isAreaToPrint) {
            System.out.println(meetingRoom.getArea());
        }
    }

    private void printMeetingRoomData(MeetingRoom meetingRoom) {
        System.out.println();
        printMeetingRoomDetails(meetingRoom, true, true);
    }
}