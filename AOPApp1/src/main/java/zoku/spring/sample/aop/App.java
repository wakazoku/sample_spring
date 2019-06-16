package zoku.spring.sample.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	private static ApplicationContext app;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		app = new AnnotationConfigApplicationContext(MyBeanConfig.class);

		IMyBean bean1 = (IMyBean) app.getBean("bean1");
		bean1.addData("Hello AOP World");
		System.out.println(bean1);

		IMyBean bean2 = (IMyBean) app.getBean("bean2");
		bean2.addData("Hello AOP World2");
		System.out.println(bean2);

	}

}
