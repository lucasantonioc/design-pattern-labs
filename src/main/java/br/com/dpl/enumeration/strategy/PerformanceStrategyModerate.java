package br.com.dpl.enumeration.strategy;

import br.com.dpl.factory.PerformanceFactory;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PerformanceStrategyModerate implements PerformanceFactory {

    public static final PerformanceFactory INSTANCE = new PerformanceStrategyModerate();

    @Override
    public BigDecimal calculateReadjustment(BigDecimal salary) {
        return salary.multiply(new BigDecimal("0.03")).setScale(2, RoundingMode.HALF_UP);
    }

}
