package zoku.spring.sample.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	private static ApplicationContext app;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		app = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		IMyBean<String> bean = (IMyBean<String>) app.getBean("bean1");
		bean.addData("Hello AOP World");
		bean.addData("this is sample with Config Class.");

		System.out.println(bean);
	}

}
