package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	// m�todo para inserir o obj no banco de dados
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	// m�todo para pegar o id no banco de dados 
	Department findById(Integer id);
	
	List<Department> findAll();
}
