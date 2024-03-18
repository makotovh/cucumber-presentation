package com.makotovh.cucumerpresentation.cucumber;

import com.makotovh.cucumerpresentation.cucumber.steps.ResponseHandler;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.World;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.reactive.server.WebTestClient;

@ContextConfiguration
@WebAppConfiguration
@RequiredArgsConstructor
public abstract class BaseIntegrationTest {
  @Autowired protected WebTestClient webTestClient;
  @Autowired protected  ResponseHandler responseHandler;
}
