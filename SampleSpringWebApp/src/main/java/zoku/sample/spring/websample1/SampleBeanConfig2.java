package zoku.sample.spring.websample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "zoku.sample.spring.websample1")
public class SampleBeanConfig2 {
	@Autowired
	private SampleBeanConfig config;

	@Bean
	public SampleBean2 sampleBean2() {
		return new SampleBean2();
	}

	@Bean
	public SampleApplicationListener appListener() {
		return new SampleApplicationListener();
	}

}
