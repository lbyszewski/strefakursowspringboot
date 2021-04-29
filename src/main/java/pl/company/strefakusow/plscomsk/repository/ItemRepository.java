package pl.company.strefakusow.plscomsk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.company.strefakusow.plscomsk.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
