package com.Project.PetClinic.PetClinic.Model.Services;

import java.util.Set;


public  interface CrudService<T,ID> {

	public Set<T>findAll();
	
	public T findById(ID id);
	
	public T save(T object);
	
	public void delete(T object);
	
	public void deleteById(ID id);
	
	
}
