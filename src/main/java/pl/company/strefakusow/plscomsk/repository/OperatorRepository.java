package pl.company.strefakusow.plscomsk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.company.strefakusow.plscomsk.entity.Operator;

public interface OperatorRepository extends JpaRepository<Operator, Long> {
}
