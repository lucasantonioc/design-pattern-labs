package br.com.dpl.model;

import br.com.dpl.enumeration.PerformanceEnumStrategy;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTests {

    @ParameterizedTest
    @CsvSource({
            "MODERATE,   1030.00",
            "GOOD,       1100.00",
            "GREAT,      1200.00"
    })
    void testCalculateSalary(PerformanceEnumStrategy performance, BigDecimal salary) {
        Employee employee = new Employee("Lucas", LocalDate.now(), new BigDecimal("1000.00"), performance);
        employee.calculateReadjustment();
        assertEquals(salary, employee.getSalary());
    }
}
