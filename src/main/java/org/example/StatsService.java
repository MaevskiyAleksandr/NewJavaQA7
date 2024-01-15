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

    public int maxSales(int[] sales) {
        int amountSales = 0;

        for (int maxPurchase : sales) {

            amountSales = amountSales + maxPurchase;
        }
        return amountSales;
    }

    public double averageSalesAmount(int[] sales) {

        double averageAmount = 0;

        for (int avgPurchaseMonth : sales) {
            averageAmount = averageAmount + avgPurchaseMonth / 12;
        }

        return averageAmount;

    }

    public int monthOfTheBiggestSales(int[] sales) {
        int saleMax = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[saleMax]) {
                saleMax = i;
            }
        }
        return saleMax + 1;
    }

    public int monthOfTheMinSales(int[] sales) {
        int saleMin = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[saleMin]) {
                saleMin = i;
            }
        }
        return saleMin + 1;
    }

    public int numberOfMonthsWithBelowAverageSales(int[] sale) {
        int averageSum = (int) averageSalesAmount(sale);
        int numberUnderAverage = 0;

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < averageSum) {
                numberUnderAverage = numberUnderAverage + 1;
            }
        }
        return numberUnderAverage;
    }

    public int numberOfMonthsWithSalesAboveAverage(int[] sale) {
        int averageSum = (int) averageSalesAmount(sale);
        int numberOverAverage = 0;

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > averageSum) {
                numberOverAverage = numberOverAverage + 1;
            }
        }
        return numberOverAverage;
    }

}
