package br.org.catolicasc.rh.dao;

import java.util.List;

public interface Dao<T> {

	
	public void save(T t);

	public void remove(T t);

	public List<T> findAll();

	public T findById(Long id);
	
	public List<T> pagedList(int ini, int max);
}
