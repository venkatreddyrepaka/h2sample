package com.example.h2sample.repository;

import com.example.h2sample.dao.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Employee> listEmployees() {
        return jdbcTemplate.query("SELECT ID, NAME FROM EMPLOYEE", (rs, rownum) -> {
            Employee employee = new Employee();
            employee.setId(rs.getInt("ID"));
            employee.setName(rs.getString("NAME"));
            return employee;
        });
    }

}
