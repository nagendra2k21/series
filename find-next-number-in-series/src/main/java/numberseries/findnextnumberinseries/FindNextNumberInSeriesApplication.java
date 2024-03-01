package numberseries.findnextnumberinseries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class FindNextNumberInSeriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindNextNumberInSeriesApplication.class, args);
	}

	public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }
}
