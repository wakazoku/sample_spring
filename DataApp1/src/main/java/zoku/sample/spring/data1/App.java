package zoku.sample.spring.data1;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

public class App {
	private static ApplicationContext context;
	private static EntityManager manager;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("classpath:/bean.xml");
		LocalContainerEntityManagerFactoryBean factory = context.getBean(LocalContainerEntityManagerFactoryBean.class);
		manager = factory.getNativeEntityManagerFactory().createEntityManager();

		MyPersonDataDao<MyPersonData> dao = new MyPersonDataDaoImpl<MyPersonData>(manager);

		List<MyPersonData> list2 = dao.findByField("name", "hanako");
		for (MyPersonData person : list2) {
			System.out.println("findByField: " + person);
		}

		MyPersonData jiro = new MyPersonData("jiro", "jiro@test.jp", 12);
		dao.addEntity(jiro);

		List<MyPersonData> list = dao.getAllEntity();
		for (MyPersonData person : list) {
			System.out.println("getAllEntity: " + person);
		}
	}

}
