package zoku.sample.spring.websample1;

import org.springframework.context.ApplicationListener;

public class SampleEventListener implements ApplicationListener<SampleBeanEvent> {
	public void onApplicationEvent(SampleBeanEvent event) {
		System.out.println("SampleEvent is occured!!");
	}

}
