package com.makotovh.cucumerpresentation.repository;

import com.makotovh.cucumerpresentation.entity.Unit;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends CrudRepository<Unit, Long> {

  Optional<Unit> findByName(String name);
}
