package com.makotovh.cucumerpresentation.cucumber;

import com.makotovh.cucumerpresentation.repository.SectionRepository;
import com.makotovh.cucumerpresentation.repository.UnitRepository;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringIntegrationTest {

  @Autowired private UnitRepository unitRepository;
  @Autowired private SectionRepository sectionRepository;

  @Before
  public void setUp() {
    unitRepository.deleteAll();
    sectionRepository.deleteAll();
  }
}
