package com.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.demo.domain.User;

@Mapper
@Repository
public interface UserMapper {
	User selectUserByName(String name);
}

