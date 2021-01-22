package cn.com.zwl.dao;

import cn.com.zwl.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Zwl
 * User表操作接口
 */
@Repository
public interface UserRepositoty extends JpaRepository<User,Long> {

    @Query("select t from User t where t.name = :name")
    User findByUserName(@Param("name") String name);
}