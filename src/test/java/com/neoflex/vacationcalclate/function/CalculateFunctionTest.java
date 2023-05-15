package com.neoflex.vacationcalclate.function;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

class CalculateFunctionTest {

    CalculateFunction calculateFunction = new CalculateFunction();

    @Test
    void calculateVacationPay() {
        Assertions.assertEquals(47781.57, calculateFunction.calculateVacationPay(100000, 14));
    }
}