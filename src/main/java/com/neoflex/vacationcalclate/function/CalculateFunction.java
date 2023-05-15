package com.neoflex.vacationcalclate.function;

import org.springframework.stereotype.Component;

@Component
public class CalculateFunction {

    public double calculateVacationPay(int averageSalary, int durationOfVacation){
        double averageDailyEarnings = averageSalary / 29.3;
        double vacationPay = Math.round(averageDailyEarnings * durationOfVacation * 100);
        return vacationPay / 100;
    }
}
