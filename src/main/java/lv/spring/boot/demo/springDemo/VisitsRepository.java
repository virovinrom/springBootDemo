package lv.spring.boot.demo.springDemo;

import org.springframework.data.repository.CrudRepository;

public interface VisitsRepository extends CrudRepository<Visit, Long> {
}
