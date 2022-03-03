package HomeWorks;

import java.text.ParseException;
import java.time.LocalDate;

public class birthDate {

    public static void main(String[] args) throws ParseException {
        LocalDate now = LocalDate.now();
       LocalDate birth = LocalDate.of(1994, 9, 26);

        LocalDate diff=now.minusYears(birth.getYear()).minusMonths(birth.getMonthValue()).minusDays(birth.getDayOfMonth());

        int diffYear= birth.getYear()+diff.getYear()+1;
        int diffMonth= 12-birth.getMonthValue()-1;
        int diffDay=now.getDayOfMonth()-(30-birth.getDayOfMonth());

        int endYear= now.getYear()-diff.getYear()-1;
        int endMonth= (12-diffMonth-1);
        int endDay=  (30-now.getDayOfMonth()+diffDay);

        LocalDate birthDay = LocalDate.of(endYear, endMonth, endDay);
        System.out.println(birthDay);

        LocalDate bd = now.minusYears(27).minusMonths(5).plusDays(3);
        System.out.println(bd);

    }
}
