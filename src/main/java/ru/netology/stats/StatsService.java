package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long sumSale = 0;
        for (long sale : sales) {
            sumSale += sale;
        }
        return sumSale;
    }

    public long average(long[] sales) {
        long sumSale = 0;
        for (long sale : sales) {
            sumSale += sale;
        }
        long averageSale = sumSale / 12;
        return averageSale;
    }

    public int monthMaxSales(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++){
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int monthMinSales(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++){
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int salesBellowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)){
                counter++;
            }
        }
        return counter;
    }

    public int salesAboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)){
                counter++;
            }
        }
        return counter;
    }
}

