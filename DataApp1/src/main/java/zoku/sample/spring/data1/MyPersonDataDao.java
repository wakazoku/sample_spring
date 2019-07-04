package zoku.sample.spring.data1;

import java.util.List;

public interface MyPersonDataDao<T> {
	public List<T> getAllEntity();

	public List<T> findByField(String field, String find);

	public void addEntity(T entity);

	public void updateEntity(T entity);

	public void removeEntity(T data);

	public void removeEntity(Long id);


}
