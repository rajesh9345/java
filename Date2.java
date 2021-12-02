package Date;

import java.time.LocalDate;

public class Second {

	public static void main(String[] args) {
    LocalDate ld= LocalDate.now();
    System.out.println(ld.getMonth());
    System.out.println(ld.getYear());

    System.out.println(ld.getDayOfWeek());
    System.out.println(ld.getDayOfYear());
    System.out.println(ld.getDayOfMonth());
    LocalDate ld1=ld.plusDays(10);
    System.out.println(ld1);
    ld1=ld.minusDays(1);
    System.out.println(ld1);
    ld1=ld.plusMonths(2);
    System.out.println(ld1.getDayOfWeek());
    ld1=ld.plusWeeks(3);
    System.out.println(ld1.getDayOfWeek());

	}

}
