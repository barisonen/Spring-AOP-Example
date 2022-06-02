package com.javatpoint.aspect;

import com.javatpoint.model.Employee;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class EmployeeServiceAspect {

    @Before(value = "execution(* com.javatpoint.service.EmployeeService.*(..)) && args(empId, fname, sname)")
    public void beforeAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {

        System.out.println(new Date().toInstant().toEpochMilli());
        System.out.println("Before method" + joinPoint.getSignature());
        System.out.println("Creating Employee with second name: " + sname);
    }

    @AfterReturning(pointcut = "execution(* com.javatpoint.service.EmployeeService.*(..))", returning = "result")
    public void afterExecuted(JoinPoint joinPoint, Employee result) {

        System.out.println("Second name: " + result.getSecondName());
        System.out.println("Employee created.");
    }

}
