package com.ankita.backend3.Controller;

import com.ankita.backend3.Entity.Employee_Salary;
import com.ankita.backend3.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    @GetMapping("/salary/history/{employeeId}/{month}/{year}")
    public List<Employee_Salary> getSalaryHistory(@PathVariable Integer employeeId,
                                           @PathVariable Integer month,
                                           @PathVariable Integer year) {
        return salaryService.getSalaryHistory(employeeId, month, year);
    }

    @GetMapping("/salary/history/{employeeId}")
    public List<Employee_Salary> getSalary(@PathVariable Integer employeeId){
        return salaryService.getSalary(employeeId);
    }
}

