package stormfront.dao;

public interface DAO<T> {
	
	T findById(Long id);
	
	T save(T entity);

}
