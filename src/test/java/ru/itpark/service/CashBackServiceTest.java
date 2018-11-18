package ru.itpark.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackServiceTest {

    @Test
    void calculateCashBackService() {
        {
            CashBackService service = new CashBackService();
            int cashBack = service.calculateCashBackService(100, 100, 100);
            assertEquals(36, cashBack);
        }

        {
            CashBackService service = new CashBackService();
            int cashBack = service.calculateCashBackService(0, 0, 10000);
            assertEquals(3000, cashBack);
        }
    }
}
