package com.neoflex.vacationcalclate.api;

import com.neoflex.vacationcalclate.function.CalculateFunction;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/calculate")
public class VacationApi {
    private final Logger logger = LoggerFactory.getLogger(VacationApi.class);
    private final CalculateFunction calculateFunction;

    @GetMapping
    double getVacation(@RequestParam(value = "averageSalary") int averageSalary,
                       @RequestParam(value = "durationOfVacation") int durationOfVacation) {
        if (averageSalary > 0 && durationOfVacation > 0) {
            logger.info("Received an average salary {}", averageSalary);
            logger.info("Received an duration of vacation {}", durationOfVacation);

            double amountVacationPay = calculateFunction.calculateVacationPay(averageSalary, durationOfVacation);

            logger.info("The amount of vacation pay {}", +amountVacationPay);

            return amountVacationPay;
        }else {
            logger.warn("Incorrect data was entered");
            return 0;

        }
    }
}
