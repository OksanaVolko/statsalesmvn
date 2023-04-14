package ru.netology.stats;

public class StatsService {


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] >= sales[maxMonth]) {
                maxMonth = month;

            }
        }
        return maxMonth + 1;
    }

    public long totalAmount(long[] sales) {
        long summa = 0;
        for (long sale : sales) {
            summa += sale;
        }

        return summa;
    }

    public long averageValue(long[] sales) {
        return totalAmount(sales) / sales.length;

    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] <= sales[minMonth]) {
                minMonth = month;

            }
        }
        return minMonth + 1;


    }

    public int monthLowMiddleSumm(long[] sales) {
        int month = 0;
        for (long sale : sales) {
            if (sale < averageValue(sales)) {
                month++;

            }
        }
        return month;
    }

    public int monthHughMiddleSumm(long[] sales) {
        int month = 0;
        for (long sale : sales) {
            if (sale > averageValue(sales)) {
                month++;

            }
        }
        return month;


    }

}