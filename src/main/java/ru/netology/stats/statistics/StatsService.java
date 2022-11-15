package ru.netology.stats.statistics;

public class StatsService {
    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getSumMSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int getMeanSales(int[] sales) {
        return getSumMSales(sales) / sales.length;
    }


    public int getMonthsUnderMeanSales(int[] sales) {
        int mean = getMeanSales(sales);
        int months = 0;
        for (long i : sales) {
            if (i < mean) {
                months = months + 1;
            }
        }
        return months;
    }

    public int getMonthsAboveMeanSales(int[] sales) {
        int mean = getMeanSales(sales);
        int months = 0;
        for (long i : sales) {
            if (i > mean) {
                months = months + 1;
            }
        }
        return months;
    }
}


