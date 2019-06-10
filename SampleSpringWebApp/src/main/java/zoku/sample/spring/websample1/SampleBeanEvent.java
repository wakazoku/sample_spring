package zoku.sample.spring.websample1;

import org.springframework.context.ApplicationEvent;

public class SampleBeanEvent extends ApplicationEvent {
	private static final long serialVersionUID = 1L;

	public SampleBeanEvent(Object source) {
		super(source);
		System.out.println("create SampleBeanEvent!");
	}

}
