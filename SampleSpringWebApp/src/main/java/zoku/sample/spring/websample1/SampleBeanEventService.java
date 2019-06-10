package zoku.sample.spring.websample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class SampleBeanEventService implements ApplicationEventPublisherAware {
	@Autowired
	private SampleBean samplebean;
	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
		System.out.println("setApplicationEventPublisher");

	}

	public void doService(String message) {
		System.out.println("doService");
		samplebean.addMessage(message);
		publisher.publishEvent(new SampleBeanEvent(this));
	}

}
