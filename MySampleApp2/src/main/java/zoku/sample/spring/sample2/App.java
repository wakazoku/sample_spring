package zoku.sample.spring.sample2;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext app;

	public static void main(String[] args) {
		app = new ClassPathXmlApplicationContext("classpath:/bean.xml");
		MyBean bean = (MyBean) app.getBean("bean1");

		bean.setMessage("Hello, How are you ?");
		MyBeanKeeper keeper = new MyBeanKeeper(bean, "taro@yamada", "hanako@flower");
		BeanWrapper wrapper = new BeanWrapperImpl(keeper);

		PropertyDescriptor[] descriptors = wrapper.getPropertyDescriptors();
		for (PropertyDescriptor descriptor : descriptors) {
			String name = descriptor.getName();
			Object value = wrapper.getPropertyValue(name);
			System.out.println(name + " : " + value);
		}

	}
}
