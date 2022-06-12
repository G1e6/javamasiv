package ru.netology.stats.javamassiv.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumOfAllSales(){
        StatsService service = new StatsService();

        int[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumma = 180;
        int actualSumma = service.sumOfAllSales(salesPerMonth);
        Assertions.assertEquals(expectedSumma, actualSumma);

    }

    @Test
    public void averageSalesPerMonth() {
        StatsService service = new StatsService();

        int[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAverage = service.averageSalesPerMonth(salesPerMonth);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        int[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expectedMax = 8;
        int actualMax = service.maxSales(salesPerMonth);
        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();

        int[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expectedMin = 9;
        int actualMin = service.minSales(salesPerMonth);
        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void numberOfMonthsBelowAverage() {
        StatsService service = new StatsService();

        int[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numberOfMonthsBelowAverage(salesPerMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfMonthsAboveAverage() {
        StatsService service = new StatsService();

        int[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numberOfMonthsAboveAverage(salesPerMonth);
        Assertions.assertEquals(expected, actual);
    }
}
