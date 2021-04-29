package pl.company.strefakusow.plscomsk.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.company.strefakusow.plscomsk.entity.Employee;
import pl.company.strefakusow.plscomsk.repository.EmployeeRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {


    private final EmployeeRepository employeeRepository;


    @PostMapping("/employee")
    public Employee employee(@RequestBody Employee employee){
        return employeeRepository.saveAndFlush(employee);
    }

    @GetMapping("/employee")
    List<Employee> employeeList (){
        return employeeRepository.findAll();
    }

    @DeleteMapping("/employee")
    ResponseEntity deleteEmployee(@RequestBody Long id){
        employeeRepository.deleteById(id);
        return ResponseEntity.ok().build();

    }
}
