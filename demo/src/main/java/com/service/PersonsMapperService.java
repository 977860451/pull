package com.service;

import java.util.List;

import com.pojo.Persons;

public interface PersonsMapperService {
	public void saveUser(Persons user) throws Exception;

	public void updateUser(Persons user);

	public void deleteUser(String userId);

	public Persons queryUserById(String userId);

	public List<Persons> queryUserList(Persons user);

	public List<Persons> queryUserListPaged(Persons user, Integer page, Integer pageSize);

	public Persons queryUserByIdCustom(String userId);
	
	public void saveUserTransactional(Persons user);
}
