// 2. Part B: Date Class with Validation and Exception Handling [B) Define a class Date (Day,
 //Month, Year) with functions to accept and display it. Accept date from user. Throw user
 // defined exception “invalid Date Exception” if the date is invalid. ]
 
 
 class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

class Date {
    private int day, month, year;

    public void accept() throws InvalidDateException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day: ");
        day = scanner.nextInt();
        System.out.print("Enter month: ");
        month = scanner.nextInt();
        System.out.print("Enter year: ");
        year = scanner.nextInt();
        if (!isValidDate()) {
            throw new InvalidDateException("The entered date is invalid.");
        }
    }

    private boolean isValidDate() {
        if (month < 1 || month > 12) return false;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) daysInMonth[1] = 29;
        return day > 0 && day <= daysInMonth[month - 1];
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void display() {
        System.out.printf("Date: %02d/%02d/%04d\n", day, month, year);
    }
}

public class DateValidation {
    public static void main(String[] args) {
        try {
            Date date = new Date();
            date.accept();
            date.display();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}
