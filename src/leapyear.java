class leapyear {
    public static void main(String arg[]) {
        int year = 2000;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("This year is leaf year");
        } else {
            System.out.println("This year is not leaf year");
        }
    }
}