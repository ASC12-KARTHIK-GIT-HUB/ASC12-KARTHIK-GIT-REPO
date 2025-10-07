class MeetingRoom {
    int id;
    int capacity;
    int floor;

    public MeetingRoom(int id, int capacity, int floor) {
        this.id = id;
        this.capacity = capacity;
        this.floor = floor;
    }

    public void displayDetails() {
        System.out.println("Room ID: " + id + ", Capacity: " + capacity + ", Floor: " + floor);
    }
}

class ZoomMeetingRoom extends MeetingRoom {
    String zoomDeviceId;
    String zoomAccountId;

    public ZoomMeetingRoom(int id, int capacity, int floor, String zoomDeviceId, String zoomAccountId) {
        super(id, capacity, floor);
        this.zoomDeviceId = zoomDeviceId;
        this.zoomAccountId = zoomAccountId;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Zoom Device ID: " + zoomDeviceId + ", Zoom Account ID: " + zoomAccountId);
    }
}

class Booking {
    int employeeId;
    String date;
    String time;
    int duration;

    public Booking(int employeeId, String date, String time, int duration) {
        this.employeeId = employeeId;
        this.date = date;
        this.time = time;
        this.duration = duration;
    }

    public void displayBooking() {
        System.out.println("Employee ID: " + employeeId + ", Date: " + date + ", Time: " + time + ", Duration: " + duration + " hrs");
    }
}

public class Lab1 {

    // Task 2: Welcome Message
    public static String welcomeMessage(String name) {
        return "Hello " + name + ", Welcome to Java World!";
    }

    // Task 3: Largest Number
    public static int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // Task 4: Print Digits in Words
    public static void printDigitsInWords(int number) {
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String numStr = String.valueOf(number);
        for (char digit : numStr.toCharArray()) {
            System.out.print(words[digit - '0'] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Welcome Message
        System.out.println(welcomeMessage("Karthik"));

        // Largest Number
        int largestNum = largest(45, 78, 12);
        System.out.println("Largest number: " + largestNum);

        // Print Digits in Words
        System.out.print("Digits in number 951: ");
        printDigitsInWords(951);

        // Meeting Rooms Example
        MeetingRoom room1 = new MeetingRoom(101, 5, 2);
        ZoomMeetingRoom room2 = new ZoomMeetingRoom(102, 10, 3, "Z123", "A456");

        System.out.println("\nMeeting Room Details:");
        room1.displayDetails();
        room2.displayDetails();

        // Booking Example
        Booking booking1 = new Booking(1001, "2025-10-07", "10:00 AM", 2);
        System.out.println("\nBooking Details:");
        booking1.displayBooking();
    }
}
