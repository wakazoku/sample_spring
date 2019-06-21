package zoku.sample.spring.sample2;

import java.util.Properties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext app;
	private static Properties mybeanPrps;

	public static void main(String[] args) {
		app = new ClassPathXmlApplicationContext("classpath:/bean.xml");
		MyBean bean = (MyBean) app.getBean("bean1");

		mybeanPrps = (Properties) app.getBean("mybeanprops");
		String from = mybeanPrps.getProperty("keeper.from");
		String to = mybeanPrps.getProperty("keeper.to");
		MyBeanKeeper keeper = new MyBeanKeeper(bean, from, to);

		System.out.println(keeper);

	}
}
