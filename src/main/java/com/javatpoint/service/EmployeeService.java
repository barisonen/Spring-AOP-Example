package com.javatpoint.service;

import com.javatpoint.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public Employee createEmployee(String empId, String fname, String sname) {

        Employee emp = new Employee();
        emp.setEmpId(empId);
        emp.setFirstName(fname);
        emp.setSecondName("not using coming parameter");

        return emp;
    }
}
