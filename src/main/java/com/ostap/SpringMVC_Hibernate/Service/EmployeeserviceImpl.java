package com.ostap.SpringMVC_Hibernate.Service;

import com.ostap.SpringMVC_Hibernate.DAO.EmployeeDAO;
import com.ostap.SpringMVC_Hibernate.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeserviceImpl implements EmployeeService{
    @Autowired
    private EmployeeDAO employeeDAO;


    @Override
    @Transactional
    public List<Employee> getAllEmployees() {

        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }
}
