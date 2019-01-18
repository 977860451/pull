package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.PersonsMapper;
import com.pojo.Persons;
import com.service.PersonsMapperService;
@Service
public class PersonsMapperServiceImpl implements PersonsMapperService {
@Autowired
private PersonsMapper mapper;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)//开启事务
	public void saveUser(Persons user) throws Exception {
		// TODO Auto-generated method stub
		mapper.insert(user);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void updateUser(Persons user) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void deleteUser(String userId) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS)
	public Persons queryUserById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persons> queryUserList(Persons user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persons> queryUserListPaged(Persons user, Integer page, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persons queryUserByIdCustom(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUserTransactional(Persons user) {
		// TODO Auto-generated method stub

	}

}
