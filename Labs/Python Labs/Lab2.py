class MeetingRoom:
    def __init__(self, room_id, capacity, floor_location):
        self.room_id = room_id
        self.capacity = capacity
        self.floor_location = floor_location

class ZoomMeetingRoom(MeetingRoom):
    def __init__(self, room_id, capacity, floor_location, zoom_device_id, zoom_account_id):
        super().__init__(room_id, capacity, floor_location)
        self.zoom_device_id = zoom_device_id
        self.zoom_account_id = zoom_account_id

class Booking:
    def __init__(self, employee_id, meeting_date, meeting_time, duration):
        self.employee_id = employee_id
        self.meeting_date = meeting_date
        self.meeting_time = meeting_time
        self.duration = duration

bookings_by_date = {}

def add_booking(booking):
    if booking.meeting_date not in bookings_by_date:
        bookings_by_date[booking.meeting_date] = []
    bookings_by_date[booking.meeting_date].append(booking)

def get_bookings_by_date(date):
    return bookings_by_date.get(date, [])

def welcome_message(name):
    return f"Welcome, {name}!"

def largest_number(a, b, c):
    return max(a, b, c)

def print_digits_in_words(number):
    words = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    for digit in str(number):
        print(words[int(digit)], end=" ")
    print()

# Test examples
print(welcome_message("Karthik"))
print("Largest:", largest_number(10, 25, 7))
print_digits_in_words(951)

room1 = MeetingRoom("R101", 10, 1)
room2 = ZoomMeetingRoom("R102", 15, 1, "ZD123", "ZA456")
booking1 = Booking("E001", "2025-10-10", "10:00", 2)
booking2 = Booking("E002", "2025-10-10", "14:00", 1)

add_booking(booking1)
add_booking(booking2)

for b in get_bookings_by_date("2025-10-10"):
    print(b.employee_id, b.meeting_time, b.duration)
