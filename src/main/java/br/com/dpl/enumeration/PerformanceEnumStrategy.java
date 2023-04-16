package br.com.dpl.enumeration;

import br.com.dpl.factory.*;
import br.com.dpl.strategy.performance.*;

public enum PerformanceEnumStrategy {

    MODERATE(PerformanceModerateStrategy.INSTANCE),
    GOOD(PerformanceGoodStrategy.INSTANCE),
    GREAT(PerformanceGreatStrategy.INSTANCE);

    private final PerformanceFactory performanceFactory;

    PerformanceEnumStrategy(PerformanceFactory performanceFactory) {
        this.performanceFactory = performanceFactory;
    }

    public PerformanceFactory getInstance() {
        return performanceFactory;
    }

}
