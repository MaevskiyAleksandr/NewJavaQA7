import org.example.StatsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    void statisticSaleSum() {
        StatsService service = new StatsService();

        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = (long) service.maxSales(sale);


        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void statisticSaleAverageMonth(){
        StatsService service = new StatsService();
        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = (long) service.averageSalesAmount(sale);

        long expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void statisticSaleMax(){
        StatsService service = new StatsService();

        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = (long) service.monthOfTheBiggestSales(sale);


        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void statisticSaleMin(){
        StatsService service = new StatsService();

        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = (long) service.monthOfTheMinSales(sale);


        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void statisticMonthUnderAverage(){
        StatsService service = new StatsService();

        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = (long) service.numberOfMonthsWithBelowAverageSales(sale);


        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void statisticMonthOverAverage(){
        StatsService service = new StatsService();

        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = (long) service.numberOfMonthsWithSalesAboveAverage(sale);


        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}


