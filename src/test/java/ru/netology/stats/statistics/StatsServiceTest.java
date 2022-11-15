package ru.netology.stats.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.getSumMSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
        System.out.println(expectedSum + " Ожидаемая сумма продаж за все месяцы составляет");
        System.out.println(actualSum + " Сумма продаж за все месяцы составляет");
    }

    @Test
    public void meanSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMean = 15;
        int actualMean = service.getMeanSales(sales);

        Assertions.assertEquals(expectedMean, actualMean);
        System.out.println(expectedMean + " Ожидаемая средняя продаж за все месяцы составляет");
        System.out.println(actualMean + " Средняя продаж за все месяцы составляет");
    }

    @Test
    public void minMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.getMinMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
        System.out.println(expectedMonth + " Ожидаемый номер месяца с минимальными продажами");
        System.out.println(actualMonth + " Номер месяца с минимальными продажами");
    }

    @Test
    public void maxMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.getMaxMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
        System.out.println(expectedMonth + " Ожидаемый номер месяца с максимальными продажами");
        System.out.println(actualMonth + " Номер месяца с максимальными продажами");
    }

    @Test
    public void getMonthsUnderMeanSales() {
        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonths = 5;
        int actualMonths = service.getMonthsUnderMeanSales(sales);

        Assertions.assertEquals(expectedMonths, actualMonths);
        System.out.println(expectedMonths + " Ожидаемое количество месяцев с продажами ниже среднего");
        System.out.println(actualMonths + " Количество месяцев с продажами ниже среднего");
    }

    @Test
    public void getMonthsAboveMeanSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonths = 5;
        int actualMonths = service.getMonthsAboveMeanSales(sales);

        Assertions.assertEquals(expectedMonths, actualMonths);
        System.out.println(expectedMonths + " Ожидаемое количество месяцев с продажами выше среднего");
        System.out.println(actualMonths + " Количество месяцев с продажами выше среднего");
    }
}
