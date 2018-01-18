package com.mk.mkedu.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mk.mkedu.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>
{
    public User findByUserName(String username);

}