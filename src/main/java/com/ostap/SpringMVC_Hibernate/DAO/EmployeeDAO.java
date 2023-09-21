package com.ostap.SpringMVC_Hibernate.DAO;

import com.ostap.SpringMVC_Hibernate.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

}
