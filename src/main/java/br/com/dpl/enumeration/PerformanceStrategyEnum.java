package br.com.dpl.enumeration;

import br.com.dpl.enumeration.strategy.*;
import br.com.dpl.factory.*;

public enum PerformanceStrategyEnum {

    MODERATE(PerformanceStrategyModerate.INSTANCE),
    GOOD(PerformanceStrategyGood.INSTANCE),
    GREAT(PerformanceStrategyGreat.INSTANCE);

    private final PerformanceFactory performanceFactory;

    PerformanceStrategyEnum(PerformanceFactory performanceFactory) {
        this.performanceFactory = performanceFactory;
    }

    public PerformanceFactory getInstance() {
        return performanceFactory;
    }

}
