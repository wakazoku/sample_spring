package zoku.sample.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	// ↓IOCコンテナ
	private static ApplicationContext app;

	public static void main(String[] args) {
		app = new AnnotationConfigApplicationContext(AutoSampleBeanConfig.class);
		SampleBeanInterface bean = app.getBean(SampleBeanInterface.class);
		System.out.println(bean);
	}

}
