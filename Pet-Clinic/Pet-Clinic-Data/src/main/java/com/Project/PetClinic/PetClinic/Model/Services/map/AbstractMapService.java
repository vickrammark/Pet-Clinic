package com.Project.PetClinic.PetClinic.Model.Services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.Project.PetClinic.PetClinic.Model.BaseEntity;
import com.Project.PetClinic.PetClinic.Model.Owner;

public class AbstractMapService<T extends BaseEntity,ID extends Long> {

	public Map<Long,T>map=new HashMap<>();
	
	Set<T>findAll()
	{
		return new HashSet<>(map.values());
	}
	
	
	T findById(ID id)
	{
		return map.get(id);
	}
	
	T save(T object)
	{
		if(object!=null)
		{
			 if(object.getId()==null)
			 {
				 object.setId(getNextId());
			 }
				map.put(object.getId(), object);
				
		}
		return object;
	}
	
	void deleteById(ID id)
	{
		map.remove(id);
	}
	
	void delete(T object)
	{
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
	
	private Long getNextId()
	{
           return map.size()+1L;
	}
	
}



