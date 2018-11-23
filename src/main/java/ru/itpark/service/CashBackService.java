package ru.itpark.service;

public class CashBackService {
    public int calculateCashBackService(int ordinaryCategory, int increasedCategory, int specialCategory) {
        int maxCashBack = 3000;

        int regularCashback= ordinaryCategory / 100;
        int increasedСashback = increasedCategory * 5 / 100;
        int casbackOnSpecialOffers = specialCategory * 30 / 100;
        int sum = regularCashback + increasedСashback + casbackOnSpecialOffers;
        if (sum >= maxCashBack) {
            return maxCashBack;
        }

        return sum;
    }
}

