public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(11, 16, 2023);

        System.out.print("Initial Date: ");
        date1.displayDate();

        date1.setMonth(12);
        date1.setDay(25);
        date1.setYear(2023);

        System.out.print("Updated Date: ");
        date1.displayDate();
    }
}
