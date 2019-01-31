package com.xiyou3g.oauth2.dao;

import com.xiyou3g.oauth2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * @author zengshuaizhi@baidu.com
 */
@Repository
public interface IUserDao extends JpaRepository<User, Long> {

    @Query("FROM User user")
    Set<User> selectDistinctUser();
}
