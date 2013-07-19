package persistence;

import java.util.List;

public interface Dao<T, K> {

	void create(T e);
	void delete(T e);
	void update(T e);
	T findById(K id);
	List<T> findAll();	
	
}
