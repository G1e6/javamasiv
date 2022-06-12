package ru.netology.stats.javamassiv.service;

public class StatsService {
    public int sumOfAllSales(int[] summa) {
        int allSumma = 0;
        for (int s : summa) {
            allSumma += s;
        }
        return allSumma;
    }

    public int averageSalesPerMonth(int[] averageSums) {
        int sum = sumOfAllSales(averageSums);
        return sum / averageSums.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int numberOfMonthsBelowAverage(int[] months) {
        int average = averageSalesPerMonth(months);
        int month = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i] < average) {
                month = month + 1;
            }
        }
        return month;

    }

    public int numberOfMonthsAboveAverage(int[] months) {
        int average = averageSalesPerMonth(months);
        int month = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i] > average) {
                month = month + 1;
            }
        }
        return month;

    }


}