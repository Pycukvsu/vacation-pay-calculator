package com.neoflex.vacationcalclate.function;

import org.springframework.stereotype.Component;

@Component
public class CalculateFunction {

    private final double averageNumberDaysInMonth = 29.3;
    private final int numberOfWorkingDays = 247;
    public double calculateVacationPay(int averageSalary, int durationOfVacation){
        double averageDailyEarnings = averageSalary / averageNumberDaysInMonth;
        double vacationPay = Math.round(averageDailyEarnings * durationOfVacation * 100);
        return vacationPay / 100;
    }
}
