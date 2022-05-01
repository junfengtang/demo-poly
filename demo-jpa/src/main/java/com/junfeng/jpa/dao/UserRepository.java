package com.junfeng.jpa.dao;

import com.junfeng.jpa.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author junfeng
 * @Classname UserRepository
 * @Description user dao
 * @Date 2022-05-01
 * @Version V1.0
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
