package ru.netology.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.services.HolidayService;

public class HolidayServiceTest {

    @ParameterizedTest
    // @CsvSource({
    //  "2,100000,60000,150000",
    // "3,10000,3000,20000"
    //  })
    @CsvFileSource(files = "src/test/resources/holidays.csv")

    public void testMonthForHoliday(int expected, int income, int expenses, int amount) {
        HolidayService service = new HolidayService();
        // int expected = 2;
        int actual = service.calculate(income, expenses, amount);
        Assertions.assertEquals(expected, actual);
    }
}
