package com.ankita.backend3.Controller;

import com.ankita.backend3.DTO.Loginform;
import com.ankita.backend3.Entity.Employee;
import com.ankita.backend3.Entity.Employee_Salary;
import com.ankita.backend3.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/login")
    public ResponseEntity<Employee> login(@RequestBody Loginform emp) {
        // Assuming LoginRequest has userId and password fields
        String email = emp.getEmail();
        String enteredPassword = emp.getPassword();

        Employee employeeData = employeeService.verifyEmployee(email, enteredPassword);
        if(employeeData!=null)
            return ResponseEntity.ok(employeeData);
         else {
            return ResponseEntity.status(401).body(null);
        }
    }
}
