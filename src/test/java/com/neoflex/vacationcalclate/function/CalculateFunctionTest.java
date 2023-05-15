package com.neoflex.vacationcalclate.function;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculateFunctionTest {

    CalculateFunction calculateFunction = new CalculateFunction();

    @Test
    void calculateVacationPay() {
        System.out.println(calculateFunction.calculateVacationPay(100000, 14));
    }
}