package br.com.dpl.enumeration.strategy;

import br.com.dpl.factory.PerformanceFactory;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PerformanceStrategyGood implements PerformanceFactory {

    public static final PerformanceFactory INSTANCE = new PerformanceStrategyGood();

    @Override
    public BigDecimal calculateReadjustment(BigDecimal salary) {
        return salary.multiply(new BigDecimal("0.10")).setScale(2, RoundingMode.HALF_UP);
    }

}
