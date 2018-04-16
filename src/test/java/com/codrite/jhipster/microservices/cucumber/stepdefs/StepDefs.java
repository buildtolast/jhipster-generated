package com.codrite.jhipster.microservices.cucumber.stepdefs;

import com.codrite.jhipster.microservices.MicroserviceTestApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MicroserviceTestApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
