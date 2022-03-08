package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {

    // --- attributes ---------------------------------------------------------

    private Office office;
    private Scanner scanner;

    // --- constructors -------------------------------------------------------

    public MeetingRoomController() {
        office = new Office();
        scanner = new Scanner(System.in);
    }

    // --- getters and setters ------------------------------------------------

    public Office getOffice() { return office; }
    public Scanner getScanner() { return scanner; }

    // --- public methods -----------------------------------------------------

    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();
    }

    public void runMenu() {
        printMenu();
        handleUserInput();
    }

    public void printMenu() {
        System.out.println(
            """
                1. Tárgyaló rögzítése
                2. Tárgyalók sorrendben
                3. Tárgyalók visszafelé sorrendben
                4. Minden második tárgyaló
                5. Területek
                6. Keresés pontos név alapján
                7. Keresés névtöredék alapján
                8. Keresés terület alapján
                9. Kilépés
                """
        );
    }

    public void readOffice() {
        System.out.println("Adja meg a rögzítendő tárgyaló nevét!");
        String name = scanner.nextLine();

        System.out.println("Adja meg a rögzítendő tárgyaló hosszát!");
        int length = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Adja meg a rögzítendő tárgyaló szélességét!");
        int width = scanner.nextInt();
        scanner.nextLine();

        office.addMeetingRoom(new MeetingRoom(name, length, width));
    }

    // --- private methods ----------------------------------------------------

    private void handleUserInput() {
        System.out.println("Adja meg a kívánt menüpont számát:");
        int menuKey = scanner.nextInt();
        scanner.nextLine();

        switch (menuKey) {
            case 1 -> readOffice();
            case 2 -> printNames();
            case 3 -> printNamesReverse();
            case 4 -> printEvenNames();
            case 5 -> printAreas();
            case 6 -> printMeetingRoomsWithName();
            case 7 -> printMeetingRoomsContains();
            case 8 -> printAreasLargerThan();
            case 9 -> exit();
            default -> invalidMenuKey();
        }
        if (menuKey != 9) {
            handleUserInput();
        }
    }

    private void printNames() {
        office.printNames();
    }

    private void printNamesReverse() {
        office.printNamesReverse();
    }

    private void printEvenNames() {
        office.printEvenNames();
    }

    private void printAreas() {
        office.printAreas();
    }

    private void printMeetingRoomsWithName() {
        System.out.println("Adja meg a tárgyaló pontos nevét!");
        String name = scanner.nextLine();
        office.printMeetingRoomsWithName(name);
    }

    private void printMeetingRoomsContains() {
        System.out.println("Adja meg a tárgyaló nevének valamely részét!");
        String part = scanner.nextLine();
        office.printMeetingRoomsContains(part);
    }

    private void printAreasLargerThan() {
        System.out.println("Adja meg a tárgyaló minimális elvárt területét!");
        int minimalArea = scanner.nextInt();
        scanner.nextLine();
        office.printAreasLargerThan(minimalArea);
    }

    private void exit() {
        System.out.println("Ön kilépett a programból.");
    }

    private void invalidMenuKey() {
        System.out.println("A kért menüpont nem létezik.");
    }
}