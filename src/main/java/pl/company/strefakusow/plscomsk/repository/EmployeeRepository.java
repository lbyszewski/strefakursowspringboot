package pl.company.strefakusow.plscomsk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.company.strefakusow.plscomsk.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
