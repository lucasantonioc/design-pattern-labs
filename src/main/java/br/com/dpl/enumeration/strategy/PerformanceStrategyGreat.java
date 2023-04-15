package br.com.dpl.enumeration.strategy;

import br.com.dpl.factory.PerformanceFactory;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PerformanceStrategyGreat implements PerformanceFactory {

    public static final PerformanceFactory INSTANCE = new PerformanceStrategyGreat();

    @Override
    public BigDecimal calculateReadjustment(BigDecimal salary) {
        return salary.multiply(new BigDecimal("0.20")).setScale(2, RoundingMode.HALF_UP);
    }

}
