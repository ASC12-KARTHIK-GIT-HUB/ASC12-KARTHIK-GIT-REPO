def add(*args):
    if all(isinstance(x, (int, float)) for x in args):
        return sum(args)
    else:
        return " ".join(str(x) for x in args)

print(add(10, 20))
print(add(10, 20, 30))
print(add(10.5, 20.1))
print(add("Hello", 20))

class Student:
    def __init__(self):
        self.student_id = None
        self.student_name = ""
        self.city = ""
        self.marks1 = 0
        self.marks2 = 0
        self.marks3 = 0
        self.fee_per_month = 0.0
        self.is_eligible_for_scholarship = False

    def set_student_id(self, student_id): self.student_id = student_id
    def set_student_name(self, student_name): self.student_name = student_name
    def set_city(self, city): self.city = city
    def set_marks1(self, marks1): self.marks1 = marks1
    def set_marks2(self, marks2): self.marks2 = marks2
    def set_marks3(self, marks3): self.marks3 = marks3
    def set_fee_per_month(self, fee_per_month): self.fee_per_month = fee_per_month
    def set_scholarship(self, status): self.is_eligible_for_scholarship = status

    def get_student_id(self): return self.student_id
    def get_student_name(self): return self.student_name
    def get_city(self): return self.city
    def get_marks1(self): return self.marks1
    def get_marks2(self): return self.marks2
    def get_marks3(self): return self.marks3
    def get_fee_per_month(self): return self.fee_per_month
    def get_scholarship(self): return self.is_eligible_for_scholarship

    def get_annual_fee(self): return self.fee_per_month * 12
    def get_total_marks(self): return self.marks1 + self.marks2 + self.marks3
    def get_average(self): return self.get_total_marks() / 3
    def get_result(self):
        if self.marks1 > 60 and self.marks2 > 60 and self.marks3 > 60:
            return "pass"
        else:
            return "fail"

class ArrayStore:
    def __init__(self):
        self.nums = []

    def accept_numbers(self, nums):
        self.nums = nums[:10]

    def display_for(self):
        for num in self.nums:
            print(num, end=" ")
        print()

    def display_while(self):
        i = 0
        while i < len(self.nums):
            print(self.nums[i], end=" ")
            i += 1
        print()

    def sort_ascending(self):
        self.nums.sort()

    def count_number(self, number):
        return self.nums.count(number)

    def insert_number(self, index, number):
        if 0 <= index <= len(self.nums):
            self.nums.insert(index, number)

    def unique_elements(self):
        return list(set(self.nums))

def multiplication_for(n):
    for i in range(1, 11):
        print(f"{n} x {i} = {n*i}")

def multiplication_while(n):
    i = 1
    while i <= 10:
        print(f"{n} x {i} = {n*i}")
        i += 1

def multiplication_dowhile(n):
    i = 1
    while True:
        print(f"{n} x {i} = {n*i}")
        i += 1
        if i > 10:
            break

def word_count(s):
    return len(s.split())

text = "Sum of 12 and 20 is 32"
print(word_count(text))

sample = "  Hello World  "
print(sample[0])
print("Hello" in sample)
print(len(sample))
print(sample.find("World"))
print(sample == "hello world")
print(sample.lower() == "hello world")
print("-".join(["Hello", "World"]))
print(sample.rfind("o"))
print(sample[2:7])
print(sample.lower())
print(sample.upper())
print(sample.strip())
