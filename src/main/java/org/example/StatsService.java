package org.example;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long maxSales(long[] sales) {
        long amountSales = 0;

        for (long maxPurchase : sales) {

            amountSales = amountSales + maxPurchase;
        }
        return amountSales;
    }

    public long averageSalesAmount(long[] sales) {

        long averageAmount = sales.length;

        long sum = maxSales(sales);
        long averageMonth = sum / averageAmount;
        return averageMonth;
    }

    public long monthOfTheBiggestSales(long[] sales) {
        long saleMax = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[(int) saleMax]) {
                saleMax = i;
            }
        }
        return saleMax + 1;
    }

    public long monthOfTheMinSales(long[] sales) {
        long saleMin = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[(int) saleMin]) {
                saleMin = i;
            }
        }
        return saleMin + 1;
    }

    public long numberOfMonthsWithBelowAverageSales(long[] sale) {
        long averageSum = (long) averageSalesAmount(sale);
        long numberUnderAverage = 0;

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < averageSum) {
                numberUnderAverage = numberUnderAverage + 1;
            }
        }
        return numberUnderAverage;
    }

    public long numberOfMonthsWithSalesAboveAverage(long[] sale) {
        long averageSum = (long) averageSalesAmount(sale);
        long numberOverAverage = 0;

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > averageSum) {
                numberOverAverage = numberOverAverage + 1;
            }
        }
        return numberOverAverage;
    }

}
