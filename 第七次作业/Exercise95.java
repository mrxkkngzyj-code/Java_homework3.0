import java.util.GregorianCalendar;

public class Exercise95 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        System.out.println("当前日期："
                + calendar.get(GregorianCalendar.YEAR) + "年"
                + (calendar.get(GregorianCalendar.MONTH) + 1) + "月"
                + calendar.get(GregorianCalendar.DAY_OF_MONTH) + "日");

        calendar.setTimeInMillis(1234567898765L);
        System.out.println("设置后的日期："
                + calendar.get(GregorianCalendar.YEAR) + "年"
                + (calendar.get(GregorianCalendar.MONTH) + 1) + "月"
                + calendar.get(GregorianCalendar.DAY_OF_MONTH) + "日");
    }
}
