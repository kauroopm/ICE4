/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machins;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author kauro
 */
public class Machins {

    /**
     * @param args the command line arguments
     */
    public BigDecimal calculatePi(int iterations, int precision) {
        BigDecimal result = new BigDecimal(0);    // The result (sum of Taylor series)
        BigDecimal oddNum = new BigDecimal(1);    // Odd numbers (1, 3, 5, 7 etc.)
        BigDecimal pow5 = new BigDecimal(5);      // Odd powers of 5 (5^1, 5^3, 5^5, 5^7 etc.)
        BigDecimal pow239 = new BigDecimal(239);  // Odd powers of 239 (239^1, 239^3, 239^5 etc.)
        BigDecimal sign = new BigDecimal(1);      // Either 1 or -1 giving the sign of the next term
        BigDecimal num1 = new BigDecimal("16.0");
        BigDecimal num2 = new BigDecimal("4.0");
        BigDecimal num3 = new BigDecimal(5);
        BigDecimal num4 = new BigDecimal(239);
        BigDecimal num5 = new BigDecimal(2);
        BigDecimal num6 = new BigDecimal(-1);
        for (int count = 0; count < iterations; count++) {
            // Calculate and add the next term in the series.
            // The sign of each new term alternates.
            BigDecimal next1 = num1.divide(pow5.multiply(oddNum), iterations, RoundingMode.HALF_UP);
            BigDecimal next2 = num2.divide(pow239.multiply(oddNum), precision, RoundingMode.HALF_UP);
            BigDecimal nextTerm = next1.subtract(next2);
            result = result.add(sign.multiply(nextTerm));
            // Update variables for next time around loop
            pow5 = pow5.multiply(num3).multiply(num3);
            pow239 = pow239.multiply(num4).multiply(num4);
            oddNum = oddNum.add(num5);
            sign = num6.multiply(sign);
            // Change the sign
        }
        return result;
    }
}
