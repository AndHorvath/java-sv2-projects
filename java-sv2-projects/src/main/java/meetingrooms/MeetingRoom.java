package meetingrooms;

public class MeetingRoom {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int length;
    private int width;

    // --- constructors -------------------------------------------------------

    public MeetingRoom(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getLength() { return length; }
    public int getWidth() { return width; }

    // --- public methods -----------------------------------------------------

    public int getArea() {
        return length * width;
    }
}