package br.com.dpl.strategy.performance;

import br.com.dpl.factory.PerformanceFactory;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PerformanceGreatStrategy implements PerformanceFactory {

    public static final PerformanceFactory INSTANCE = new PerformanceGreatStrategy();

    @Override
    public BigDecimal calculateReadjustment(BigDecimal salary) {
        return salary.multiply(new BigDecimal("0.20")).setScale(2, RoundingMode.HALF_UP);
    }

}
