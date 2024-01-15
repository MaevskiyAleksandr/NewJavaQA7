import org.example.StatsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StatsServiceTest {

    @Test
    void statisticSaleSum() {
        StatsService service = new StatsService();

        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = (int) service.maxSales(sale);


        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void statisticSaleAverageMonth(){
        StatsService service = new StatsService();
        // Подготавливаем данные:
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        double actual = (double) service.averageSalesAmount(sale);

        double expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void statisticSaleMax(){
        StatsService service = new StatsService();

        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int actual = (int) service.monthOfTheBiggestSales(sale);


        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void statisticSaleMin(){
        StatsService service = new StatsService();

        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int actual = (int) service.monthOfTheMinSales(sale);


        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void statisticMonthUnderAverage(){
        StatsService service = new StatsService();

        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int actual = (int) service.numberOfMonthsWithBelowAverageSales(sale);


        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void statisticMonthOverAverage(){
        StatsService service = new StatsService();

        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int actual = (int) service.numberOfMonthsWithSalesAboveAverage(sale);

        
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}


