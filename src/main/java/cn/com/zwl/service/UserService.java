package cn.com.zwl.service;

import cn.com.zwl.dao.UserRepositoty;
import cn.com.zwl.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Zwl
 * User业务逻辑
 */
@Service
public class UserService {
    @Autowired
    private UserRepositoty userRepositoty;

    public User findUserByName(String name){
        User user = null;
        try{
            user = userRepositoty.findByUserName(name);
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
