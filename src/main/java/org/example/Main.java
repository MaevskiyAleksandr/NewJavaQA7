package org.example;

public class Main {
    public static void main(String[] args) {

        StatsService stats = new StatsService();
        long[] num = {412422, 124235, 12324, 212342, 20, 2342342, 235, 6234, 62342, 62, 31, 21};
        int min = stats.minSales(num);
        System.out.println(min);

        StatsService stats2 = new StatsService();
        int[] num2 = {1, 2, 3};
        int amount = stats2.maxSales(num2);
        System.out.println(amount);

        //StatsService stats3 = new StatsService();
        //int [] num3 = {412422, 124235, 12324, 212342, 1522235, 2342342, 235, 6234, 62342, 62, 31, 21};
       // int avg = stats3.averageSalesAmount(num3);
       // System.out.println(avg);

        StatsService stats4 = new StatsService();
        int[] num4 = new int[12];
        num4[1] = 542132;
        num4[2] = 145100;
        num4[3] = 5411000;
        num4[4] = 5000;
        num4[5] = 100500;
        num4[6] = 1750;
        num4[7] = 10999;
        num4[8] = 1999;
        num4[9] = 2899;
        num4[10] = 4799;
        num4[11] = 7999;
        long monthMaxSales = stats4.monthOfTheBiggestSales(num4);
        System.out.println(monthMaxSales);


    }


}