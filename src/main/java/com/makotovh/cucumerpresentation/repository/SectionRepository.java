package com.makotovh.cucumerpresentation.repository;

import com.makotovh.cucumerpresentation.entity.Section;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends CrudRepository<Section, Long> {}
