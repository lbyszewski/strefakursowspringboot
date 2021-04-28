package pl.company.strefakusow.plscomsk.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.company.strefakusow.plscomsk.entity.Employee;
import pl.company.strefakusow.plscomsk.repository.EmployeeRepository;

@RestController
@RequiredArgsConstructor
public class Controller {


    private EmployeeRepository employeeRepository;


    @PostMapping("/employee")
    public Employee employee( Employee employee){
        return employeeRepository.save(employee);
    }
}
