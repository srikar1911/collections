package practice;

public enum Day {
    SUNDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    @Override
    public String toString() {
        return "Day{}";
    }
}

class year{
    public static void main(String[] args) {
        System.out.println(Day.SATURDAY);
        System.out.println(Day.values());

    }
}