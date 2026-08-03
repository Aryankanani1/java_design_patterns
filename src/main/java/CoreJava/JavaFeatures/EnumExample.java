package CoreJava.JavaFeatures;

public class EnumExample {
    // Enum declaration
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        // Using enum
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today); // Output: Today is: MONDAY

        // Switch case with enum
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week."); // Output: Start of the work week.
                break;
            case FRIDAY:
                System.out.println("End of the work week.");
                break;
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Midweek day.");
                break;
        }

        // Looping through enum values
        System.out.println("Days of the week:"); // Output: Days of the week:
        for (Day day : Day.values()) {
            System.out.println(day);
        }
        // Output:
//        SUNDAY
//        MONDAY
//        TUESDAY
//        WEDNESDAY
//        THURSDAY
//        FRIDAY
//        SATURDAY
    }
}
