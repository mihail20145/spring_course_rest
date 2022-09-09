package com.zaurtregulov.spring.rest.configuration.controller;

import com.zaurtregulov.spring.rest.entity.Employee;
import com.zaurtregulov.spring.rest.exeption_hendong.EmploeeIncorrectData;
import com.zaurtregulov.spring.rest.exeption_hendong.NoSuchEmployeeExeption;
import com.zaurtregulov.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){

        List<Employee>allEmployees=employeeService.getAllEmployees();

        return allEmployees;
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){

        Employee employee=employeeService.getEnployee(id);

            if(employee==null){

                throw new NoSuchEmployeeExeption("there is no employee with ID "+id+" in Database");
            }
        return employee;

    }
    @PostMapping("/employees")
    public  Employee addNewEmployee(@RequestBody Employee employee){

        employeeService.saveEmployee(employee);

        return employee;
    }
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){

        employeeService.saveEmployee(employee);

        return employee;
    }

}
