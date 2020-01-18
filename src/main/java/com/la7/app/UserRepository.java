package com.la7.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.la7.app.io.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
	
}
