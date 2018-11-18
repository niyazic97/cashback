package ru.itpark.service;

public class CashBackService {
    public int calculateCashBackService(int ordinaryCategory, int increasedCategory, int specialCategory) {
        int maxCashBack = 3000;

        int g = ordinaryCategory / 100;
        int e = increasedCategory * 5 / 100;
        int q = specialCategory * 30 / 100;
        int sum = g + e + q;
        if (sum >= maxCashBack) {
            return maxCashBack;
        }

        return sum;
    }
}
