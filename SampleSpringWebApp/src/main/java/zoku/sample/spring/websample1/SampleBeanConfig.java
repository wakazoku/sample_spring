package zoku.sample.spring.websample1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "zoku.sample.spring.websample1")
public class SampleBeanConfig {
	@Bean
	public SampleBean sampleBean() {
		return new SampleBean();
	}

}
