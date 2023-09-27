package com.ostap.SpringMVC_Hibernate.Service;

import com.ostap.SpringMVC_Hibernate.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);
}
