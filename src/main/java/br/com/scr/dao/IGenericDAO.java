package br.com.scr.dao;

import java.util.List;

public interface IGenericDAO<T> {

		public List<T> findAll();

		public T findById(Long param);

		public void save(T t);

		public T update(T t);

		public void delete(Long param);

}