 class InvalidDateException(Exception):
 """Custom exception for invalid dates."""
 def __init__(self, message="Invalid Date"):
 self.message = message
 super().__init__(self.message)
 class Date:
 def __init__(self):
 self.day = 0
 self.month = 0
 self.year = 0
 def accept(self):
 """Accepts the date from the user and validates it."""
 try:
 self.day = int(input("Enter day: "))
 self.month = int(input("Enter month: "))
 self.year = int(input("Enter year: "))
 if not self.is_valid_date():
 raise InvalidDateException("The entered date is invalid.")
 except ValueError:
 raise InvalidDateException("Invalid input! Please enter integers for day, month, and year.")
 def is_valid_date(self):
 """Validates the date."""
 # Check for valid month
 if self.month < 1 or self.month > 12:
 return False
 # Days in each month
 days_in_month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
 # Check for leap year
 if self.year % 4 == 0 and (self.year % 100 != 0 or self.year % 400 == 0):
 days_in_month[1] = 29 # February in a leap year
 # Check for valid day
 if self.day < 1 or self.day > days_in_month[self.month- 1]:
 return False
 return True
 10
 def display(self):
"""Displays the date in DD/MM/YYYY format."""
 print(f"Date: {self.day:02}/{self.month:02}/{self.year}")
 # Usage
 try:
 date = Date()
 date.accept()
 date.display()
 except InvalidDateException as e:
 print(e)