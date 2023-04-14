package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindHighSale() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 8;
        long actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);


    }

    @Test
    public void ShouldFinedTotal() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedTotal = 180;
        long actualTotal = service.totalAmount(sales);

        Assertions.assertEquals(expectedTotal, actualTotal);


    }


    @Test
    public void ShouldFinedAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 180 / 12;
        long actualAverage = service.averageValue(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void shouldFindLowSale() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 9;
        long actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }


    @Test
    public void ShouldSalesTest() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 5;
        long actualMonth = service.monthLowMiddleSumm(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void HighSalesTest() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 5;
        long actualMonth = service.monthHughMiddleSumm(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }
}

