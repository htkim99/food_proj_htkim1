package foodprojhtkim.common;

import foodprojhtkim.NotiApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { NotiApplication.class })
public class CucumberSpingConfiguration {}
