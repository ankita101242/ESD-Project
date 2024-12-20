package com.ankita.backend3.DAO;

import com.ankita.backend3.Entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //Employee login(String email, String password);
    //Employee login(@Param("email") String email, @Param("password") String password);
//    @Query("SELECT e FROM Employee e WHERE e.email = :email AND e.password = :password")
//    Employee login(@Param("email") String email, @Param("password") String password);
    Employee findByEmail(String email);
}
