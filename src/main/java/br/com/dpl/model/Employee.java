package br.com.dpl.model;

import br.com.dpl.enumeration.PerformanceStrategyEnum;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

	private String name;
	private LocalDate admissionDate;
	private BigDecimal salary = BigDecimal.ZERO;
    private PerformanceStrategyEnum performance;

    public Employee(String name, LocalDate admissionDate, BigDecimal salary, PerformanceStrategyEnum performance) {
		this.name = name;
		this.admissionDate = admissionDate;
		this.salary = salary;
        this.performance = performance;
    }

	public BigDecimal getSalary() {
		return salary;
	}

    public void calculateReadjustment() {
        this.salary = this.salary.add(this.performance.getInstance().calculateReadjustment(this.salary));
    }

}
