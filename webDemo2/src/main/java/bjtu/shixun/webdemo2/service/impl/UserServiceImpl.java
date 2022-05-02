package bjtu.shixun.webdemo2.service.impl;

import bjtu.shixun.webdemo2.mapper.UserMapper;
import bjtu.shixun.webdemo2.pojo.User;
import bjtu.shixun.webdemo2.pojo.UserExample;
import bjtu.shixun.webdemo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <Description> UserServiceImpl
 *
 * @author 26802
 * @version 1.0
 * @ClassName UserServiceImpl
 * @taskId
 * @see bjtu.shixun.webdemo2.service.impl
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
       //需要你编写
        return null;
    }
}
