package zoku.sample.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoSampleBeanConfig {
	@Bean
	public SampleBeanInterface sampleBean() {
		return new SampleBean("this is from Auto Confing!");
	}

}
