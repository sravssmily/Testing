package runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "C:\\Users\\lenin\\eclipse-workspace\\TestingProject-6\\src\\test\\java\\features",
glue = {"steps"},
dryRun = false,
plugin = {"html:target/Cucumberreport.html",
		 "pretty",
		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		 "timeline:test-output-thread/"
		 }
)


public class TestNgrunner extends AbstractTestNGCucumberTests {

}
