package zoku.sample.spring.data1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class MyPersonDataDaoImpl<MyPersonData> implements MyPersonDataDao<MyPersonData> {
	private EntityManager manager = null;

	public MyPersonDataDaoImpl(EntityManager manager) {
		super();
		this.manager = manager;
	}

	@SuppressWarnings("unchecked")
	public List<MyPersonData> getAllEntity() {
		Query query = manager.createQuery("from MyPersonData");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<MyPersonData> findByField(String field, String find) {
		Query query = manager.createQuery("from MyPersonData where " + field + "='" + find + "'");
		return query.getResultList();
	}

	public void addEntity(Object entity) {
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();

		manager.persist(entity);
		manager.flush();

		transaction.commit();

	}

	public void updateEntity(Object entity) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public void removeEntity(Object data) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public void removeEntity(Long id) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
