package dao;

import java.util.List;

public interface Dao<T> {
	
	void create(T e);
	void udpate(T e);
	void delete(T e);
	T findById(long id);
	List<T> findAll();
	

}
