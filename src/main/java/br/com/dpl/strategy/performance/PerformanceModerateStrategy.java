package br.com.dpl.strategy.performance;

import br.com.dpl.factory.PerformanceFactory;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PerformanceModerateStrategy implements PerformanceFactory {

    public static final PerformanceFactory INSTANCE = new PerformanceModerateStrategy();

    @Override
    public BigDecimal calculateReadjustment(BigDecimal salary) {
        return salary.multiply(new BigDecimal("0.03")).setScale(2, RoundingMode.HALF_UP);
    }

}
